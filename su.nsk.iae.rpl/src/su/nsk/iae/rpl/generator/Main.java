package su.nsk.iae.rpl.generator;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import su.nsk.iae.rpl.RPLStandaloneSetup;
import su.nsk.iae.rpl.invpatterngenerator.ExtraInvariantPattern;
import su.nsk.iae.rpl.invpatterngenerator.ExtraInvariantPatternGenerator;
import su.nsk.iae.rpl.invpatterngenerator.LS8Lemma;
import su.nsk.iae.rpl.invpatterngenerator.LS9Lemma;
import su.nsk.iae.rpl.invpatterngenerator.LemmaPremise;
import su.nsk.iae.rpl.invpatterngenerator.OuterExtraInvariantFormula;
import su.nsk.iae.rpl.rPL.*;
import su.nsk.iae.rpl.rPL.impl.InnerFormulaImpl;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class Main {
	
	static String FILE_EXTENSION = ".rpl";

	public static void main(String[] args) {
		Injector injector = new RPLStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		String fileName = null;
		boolean patternGen = false;
		boolean scriptGen = false;
		for (int i = 0; i < args.length; i++) {
			if (args[i].endsWith(FILE_EXTENSION))
				fileName = args[i];
			else if (args[i].equals("-p"))
				patternGen = true;
			else if (args[i].equals("-s"));
		}
		if (fileName == null) {
			System.err.println("input file is not specified.");
			System.exit(1);
		}
		if (patternGen)
			main.generatePatternsAndLemmas(fileName);
		else {
			Scanner scanner = new Scanner(System.in);
			int numVCs = scanner.nextInt();
			String inputVars = scanner.nextLine();
			scanner.close();
			main.generateScripts(fileName, numVCs, inputVars);
		}
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	protected void generatePatternsAndLemmas(String fileName) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		URI uri = URI.createFileURI(fileName);
		Resource resource = set.getResource(uri, true);
		try {
			Model model = (Model) resource.getContents().get(0);
			List<Element> elements = model.getElements();
			System.out.println(fileName);
			String[] nameExt = fileName.split(".");
			int index = fileName.indexOf('.');
			String name = fileName.substring(0, index);
			String outputFileName = name + "_Patterns";
			FileWriter writer = new FileWriter(outputFileName + ".thy");
			writer.write("theory " + outputFileName + " imports Patterns\n begin\n");
			for (Element element: elements) {
				if (element instanceof DerivedRequirementPattern pattern && pattern.getDefinition() != null) {
					ExtraInvariantPattern einvPattern = ExtraInvariantPatternGenerator.generateExtraInvariantPattern(pattern);
					writer.write(einvPattern.toString() + "\n");
					OuterExtraInvariantFormula einvDef = einvPattern.getDefinition();
					LemmaPremise L8Premise = einvDef.generateL8();
					RPLFactory factory = RPLFactoryImpl.init();
					UpdateStateVariable s = factory.createUpdateStateVariable();
					s.setName("s0");
					UpdateStateVariable sPrimed = factory.createUpdateStateVariable();
					sPrimed.setName("s");
					System.out.println("generate L8");
					LS8Lemma L8 = new LS8Lemma(
							einvPattern.getName(),
							einvPattern.getcParams(),
							einvPattern.getFnParams(),
							einvPattern.getSimpleFmParams(),
							einvPattern.getRegFmParams(),
							s,
							sPrimed,
							L8Premise);
					System.out.println("generate L9");
					LemmaPremise L9Premise = einvDef.generateL9();
					LS9Lemma L9 = new LS9Lemma(
							einvPattern.getName(),
							pattern.getName(),
							einvPattern.getcParams(),
							einvPattern.getFnParams(),
							einvPattern.getSimpleFmParams(),
							einvPattern.getRegFmParams(),
							pattern.getFmParams(),
							s,
							L9Premise);
					writer.write("\n\n");
					writer.write(L8.toString());
					writer.write("\n\n");
					writer.write(L9.toString());
					writer.write("\n\n");
					writer.write("lemmas " + einvPattern.getName() + "_used_patterns = ");
					List<String> usedPatterns = einvPattern.getUsedPatternNames();
					for (String usedPattern: usedPatterns)
						writer.write(usedPattern + ' ');
					writer.write("\n\n");
				}
			}
			writer.write("end\n");
			writer.close();			
		}
		catch (Exception e) {			
			e.printStackTrace();
			 System.out.println(resource.getErrors());
		}
		System.out.println("Code generation finished.");
	}
	
	protected void generateScripts(String fileName, int numVCs, String inputVars) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		URI uri = URI.createFileURI(fileName);
		Resource resource = set.getResource(uri, true);
		try {
			Model model = (Model) resource.getContents().get(0);
			List<Element> elements = model.getElements();
			for (Element element: elements) {
				if (element instanceof  ExtraInvariant einv) {
					String outputFileName = einv.getName() + "_Proofs";
					FileWriter writer = new FileWriter(outputFileName + ".thy");
					generateTheoryName(writer, outputFileName, einv.getName());
					generateInitVcProof(writer, einv.getName());
					for (int i =2; i<= numVCs; i++)
						generateLoopPath(writer, i, einv, inputVars);
					writer.write("end\n");
					writer.close();
				}
			}		
		}
		catch (Exception e) {			
			e.printStackTrace();
			 System.out.println(resource.getErrors());
		}

		System.out.println("Code generation finished.");
	}

	private void generateLoopPath(FileWriter writer, int i, ExtraInvariant einv, String inputVars) throws IOException {
		String name = einv.getName();
		writer.write("theorem extra1: \"VC" + i + ' ' + name + " env s0 " + inputVars + "\"\n");
		writer.write("unfolding VC" + i + "_def " + name + "_def\n");
		String proofScript = 
				" apply(rule impI)\r\n"
				+ "  apply(rule conjI)\r\n"
				+ "    using cei apply((auto simp add: VC_def)[1];fastforce)\r\n"
				+ "  apply(unfold commonExtraInv_def)\r\n"
				+ "  apply(erule conjE)+\r\n"
				+ "  apply(erule " + einv.getPattern().getLemmas().getL8().getName() + ")\r\n"
				+ "   apply(auto split: if_splits)\r\n"
				+ "  done\r\n";
		writer.write(proofScript + "\n");		
	}

	private void generateInitVcProof(FileWriter writer, String name) throws IOException {
		writer.write("theorem extra1: \"VC1 " + name + " s0\"");
		writer.write("unfolding VC1_def " + name + "_def " + name + "_used_patterns\n");
		writer.write("apply auto\n\n");
	}
	
	private void generateTheoryName(FileWriter writer, String theoryName, String imports) throws IOException {
		writer.write("theory " + theoryName + " imports " + imports + "\n begin\n");
	}
	
	
}