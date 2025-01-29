package su.nsk.iae.rpl.generator;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import su.nsk.iae.rpl.RPLStandaloneSetup;
import su.nsk.iae.rpl.invpatterngenerator.ExtraInvariantPattern;
import su.nsk.iae.rpl.invpatterngenerator.PatternGenerator;
import su.nsk.iae.rpl.invpatterngenerator.RequirementPattern;
import su.nsk.iae.rpl.invpatterngenerator.LS8Lemma;
import su.nsk.iae.rpl.invpatterngenerator.LS9Lemma;
import su.nsk.iae.rpl.invpatterngenerator.LemmaPremise;
import su.nsk.iae.rpl.invpatterngenerator.OuterExtraInvariantFormula;
import su.nsk.iae.rpl.invpatterngenerator.OuterRequirementFormula;
import su.nsk.iae.rpl.invpatterngenerator.OuterRequirementFormulaGenerator;
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
			int index = fileName.indexOf('.');
			String name = fileName.substring(0, index);
			String outputFileName = name + "_Patterns";
			FileWriter writer = new FileWriter(outputFileName + ".thy");
			writer.write("theory " + outputFileName + " imports Patterns\n begin\n");
			for (Element element: elements) {
				if (element instanceof DerivedRequirementPattern pattern && pattern.getDefinition() != null) {
					RequirementPattern reqPattern = PatternGenerator.generateRequirementPattern(pattern);
					RequirementPattern particularReqPattern = reqPattern.generateParticularPattern(name + "_part");
					ExtraInvariantPattern einvPattern = PatternGenerator.generateExtraInvariantPattern(pattern);
					ExtraInvariantPattern particularEinvPattern =einvPattern.generateParticularPattern(name + "_part");
					writer.write(reqPattern.toString() + "\n\n");
					writer.write(particularReqPattern.toString() + "\n\n");
					writer.write(einvPattern.toString() + "\n\n");
					writer.write(particularEinvPattern.toString() + "\n\n");
					OuterRequirementFormula reqDef = reqPattern.getDefinition();
					OuterExtraInvariantFormula einvDef = einvPattern.getDefinition();
					RPLFactory factory = RPLFactoryImpl.init();
					UpdateStateVariable s = factory.createUpdateStateVariable();
					s.setName("s0");
					UpdateStateVariable sPrimed = factory.createUpdateStateVariable();
					sPrimed.setName("s");
					LemmaPremise L8Premise = einvDef.generateL8(s, sPrimed);
					LS8Lemma L8 = new LS8Lemma(
							einvPattern.getName() + "_saving_gen",
							einvPattern.getName(),
							einvPattern.getcParams(),
							einvPattern.getFnParams(),
							einvPattern.getSimpleFmParams(),
							einvPattern.getRegFmParams(),
							s,
							sPrimed,
							L8Premise);
					LemmaPremise L9Premise = einvDef.generateL9(reqDef, s);
					LS9Lemma L9 = new LS9Lemma(
							pattern.getName() + "einv_imp_req_gen",
							einvPattern.getName(),
							pattern.getName(),
							einvPattern.getcParams(),
							einvPattern.getFnParams(),
							einvPattern.getSimpleFmParams(),
							einvPattern.getRegFmParams(),
							pattern.getFmParams(),
							s,
							L9Premise);
					List<RegularFormulaParameter> einvVars = einvPattern.getRegFmParams();
					List<RegularFormulaParameter> reqVars = pattern.getFmParams();
					Map<RegularFormulaParameter, RegularFormulaParameter> paramMapping = new HashMap<>();
					for (int i = 0; i < einvVars.size(); i++)
						paramMapping.put(einvVars.get(i), reqVars.get(i));
					LemmaPremise particularL8Premise = L8Premise.generateParticularLemmaPremise(paramMapping);
					LS8Lemma particularL8 = new LS8Lemma(
							einvPattern.getName() + "_saving",
							particularEinvPattern.getName(),
							particularEinvPattern.getcParams(),
							particularEinvPattern.getFnParams(),
							particularEinvPattern.getSimpleFmParams(),
							particularEinvPattern.getRegFmParams(),
							s,
							sPrimed,
							particularL8Premise);
					LemmaPremise particularL9Premise = L9Premise.generateParticularLemmaPremise(paramMapping);
					LS9Lemma particularL9 = new LS9Lemma(
							pattern.getName() + "einv_imp_req",
							particularEinvPattern.getName(),
							particularReqPattern.getName(),
							particularEinvPattern.getcParams(),
							particularEinvPattern.getFnParams(),
							particularEinvPattern.getSimpleFmParams(),
							particularEinvPattern.getRegFmParams(),
							particularReqPattern.getRegFmParams(),
							s,
							particularL9Premise);
					writer.write("\n\n");
					writer.write(L8.toString());
					writer.write("\n\n");
					writer.write(L9.toString());
					writer.write("\n\n");
					writer.write(particularL8.toString());
					writer.write("\n\n");
					writer.write(particularL9.toString());
					writer.write("\n\n");
					writer.write("lemmas " + reqPattern.getName() + "_used_patterns = ");
					List<String> usedReqPatterns = reqPattern.getUsedPatternNames();
					for (String usedPattern: usedReqPatterns)
						writer.write(usedPattern + ' ');
					writer.write("\n\n");
					writer.write("lemmas " + einvPattern.getName() + "_used_patterns = ");
					List<String> usedEinvPatterns = einvPattern.getUsedPatternNames();
					for (String usedPattern: usedEinvPatterns)
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
			String ceiOutputFileName = "CommonExtraInv_Proofs";
			FileWriter ceiWriter = new FileWriter(ceiOutputFileName + ".thy");
			generateTheoryName(ceiWriter, ceiOutputFileName, "CommonExtraInv");
			generateInitVcProofForCommonExtraInvariant(ceiWriter);
			for (int i =2; i<= numVCs; i++)
				generateLoopPathForCommonExtraInvariant(ceiWriter, i, inputVars);
			ceiWriter.write("end\n");
			ceiWriter.close();
			for (Element element: elements) {
				if (element instanceof  ExtraInvariant einv) {
					String outputFileName = einv.getName() + "_Proofs";
					FileWriter writer = new FileWriter(outputFileName + ".thy");
					generateTheoryName(writer, outputFileName, einv.getName());
					generateInitVcProofForExtraInvariant(writer, einv.getName());
					for (int i =2; i<= numVCs; i++)
						generateLoopPathForExtraInvariant(writer, i, einv, inputVars);
					writer.write("end\n");
					writer.close();
				}
				else if (element instanceof  Requirement req) {
					String einv = req.getExtraIn();
					String outputFileName = req.getName() + "_Proofs";
					FileWriter writer = new FileWriter(outputFileName + ".thy");
					generateTheoryName(writer, outputFileName, req.getName());
					String extendedInv = req.getName() + "_extended_inv";
					generateInitVcProofForRequirement(writer, extendedInv, einv, req.getName());
					for (int i =2; i<= numVCs; i++)
						generateLoopPathForRequirement(writer, i, einv, req, extendedInv, inputVars);
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

	private void generateLoopPathForExtraInvariant(FileWriter writer, int i, ExtraInvariant einv, String inputVars) throws IOException {
		String name = einv.getName();
		writer.write("theorem extra" + i + ": \"VC" + i + ' ' + name + " env s0 " + inputVars + "\"\n");
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
	
	private void generateLoopPathForRequirement(FileWriter writer, int i, String einv, Requirement req,
			String extendedInvName, String inputVars) throws IOException {
		String name = extendedInvName;
		writer.write("theorem extendedInv" + i + ": \"VC" + i + ' ' + name + " env s0 " + inputVars + "\"\n");
		writer.write("unfolding VC" + i + "_def " + name + "_def" + req.getName() + "_def");
		Lemma L9 = req.getPattern().getLemmas().getL9();
		String proofScript = 
				"  apply(rule impI)\r\n"
				+ "  apply(rule context_conjI)\r\n"
				+ "  using extra" + i + " apply((auto simp add: VC" + i + "_def)[1];fastforce)\r\n"
				+ "  apply(rule conjI)\r\n"
				+ "   apply simp\r\n"
				+ "  apply(unfold " + einv + "_def commonExtraInv_def)\r\n"
				+ "  apply(erule conjE)+\r\n"
				+ "  apply(auto simp add: " + L9.getName() +")\r\n"
				+ "  done\r\n"
				+ "";
		writer.write(proofScript + "\n");		
	}
	
	private void generateLoopPathForCommonExtraInvariant(FileWriter writer, int i, String inputVars) throws IOException {
		writer.write("theorem cei" + i + ": \"VC" + i + "commonExtraInv env s0 " + inputVars + "\"\n");
		writer.write("unfolding VC" + i + "_def commonExtraInv_def");
		writer.write("by fastforce\n\n");
	}

	private void generateInitVcProofForExtraInvariant(FileWriter writer, String name) throws IOException {
		writer.write("theorem extra1: \"VC1 " + name + " s0\"");
		writer.write("unfolding VC1_def " + name + "_def " + name + "_used_patterns\n");
		writer.write("apply auto\n\n");
	}
	
	private void generateInitVcProofForRequirement(FileWriter writer, String extendedInvName, String extraInvName, 
			String reqName) throws IOException {
		writer.write("theorem extra1: \"VC1 " + extendedInvName + " s0\"");
		writer.write("unfolding VC1_def " + extendedInvName + "_def " + extraInvName + "_def " 
		+ reqName + "_def " + extraInvName + "_used_patterns" + reqName + "_used_patterns\n");
		writer.write("apply auto\n\n");
	}
	
	private void generateInitVcProofForCommonExtraInvariant(FileWriter writer) throws IOException {
		writer.write("theorem extra1: \"VC1 commonExtraInv s0\"");
		writer.write("unfolding VC1_def commonExtraInv_def");
		writer.write("apply auto\n\n");
	}
	
	private void generateTheoryName(FileWriter writer, String theoryName, String imports) throws IOException {
		writer.write("theory " + theoryName + " imports " + imports + "\n begin\n");
	}
}