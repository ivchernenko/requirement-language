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
import su.nsk.iae.rpl.invpatterngenerator.DerivedExtraInvariantPatternInstance;
import su.nsk.iae.rpl.invpatterngenerator.DerivedRequirementPatternInstance;
import su.nsk.iae.rpl.invpatterngenerator.ExtendedInvariant;
import su.nsk.iae.rpl.invpatterngenerator.ExtraInvariantPattern;
import su.nsk.iae.rpl.invpatterngenerator.ImportedTheory;
import su.nsk.iae.rpl.invpatterngenerator.IsabelleTheoryGenerator;
import su.nsk.iae.rpl.invpatterngenerator.PatternGenerator;
import su.nsk.iae.rpl.invpatterngenerator.ProofScriptGenerator;
import su.nsk.iae.rpl.invpatterngenerator.RequirementPattern;
import su.nsk.iae.rpl.invpatterngenerator.LS8Lemma;
import su.nsk.iae.rpl.invpatterngenerator.LS9Lemma;
import su.nsk.iae.rpl.invpatterngenerator.LemmaPremise;
import su.nsk.iae.rpl.invpatterngenerator.LemmaPremiseInstanceCreator;
import su.nsk.iae.rpl.invpatterngenerator.OuterExtraInvariantFormula;
import su.nsk.iae.rpl.invpatterngenerator.OuterRequirementFormula;
import su.nsk.iae.rpl.invpatterngenerator.OuterRequirementFormulaGenerator;
import su.nsk.iae.rpl.invpatterngenerator.ParameterValueMap;
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
			int index = fileName.indexOf('.');
			String name = fileName.substring(0, index);
			String outputFileName = name + "_Patterns";
			RPLFactory factory = RPLFactory.eINSTANCE;
			Model genModel = factory.createModel();
			List<Import> imports = genModel.getImports();
			IsabelleTheoryGenerator theoryGenerator = new IsabelleTheoryGenerator(outputFileName);
			for (Import importElement: model.getImports()) {
				Import importCopy = factory.createImport();
				String importURI = importElement.getImportURI();
				importCopy.setImportURI(importElement.getImportURI());
				imports.add(importCopy);
				String theoryName = importURI.substring(0, importURI.lastIndexOf('.'));
				String session = importElement.getSession();
				theoryGenerator.addImportedTheory(new ImportedTheory(session, theoryName));
			}
			List<Element> genElements = genModel.getElements();
			PatternGenerator.setGeneratedASTElements(genElements);
			PatternGenerator.setTheoryGenerator(theoryGenerator);
			for (Element element: elements) {
				if (element instanceof DerivedRequirementPattern pattern && pattern.getDefinition() != null) {
					PatternGenerator.generatePatternsAndLemmas(pattern);
				}				
			}
			theoryGenerator.generateTheory();
			URI genUri = URI.createFileURI(outputFileName + ".rpl");
			Resource genResource = set.createResource(genUri);
			genResource.getContents().add(genModel);
			genResource.save(new HashMap<>());
		}
		catch (Exception e) {
			System.out.println(resource.getErrors());
			e.printStackTrace();
		}
		System.out.println("Code generation finished.");
	}
	
	protected void generateScripts(String fileName, int numVCs, String inputVars) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		URI uri = URI.createFileURI(fileName);
		Resource resource = set.getResource(uri, true);
		int index = fileName.lastIndexOf('.');
		String importedTheory = fileName.substring(0, index);
		try {
			Model model = (Model) resource.getContents().get(0);
			List<Element> elements = model.getElements();
			String ceiOutputFileName = "CommonExtraInv_Proofs";
			FileWriter ceiWriter = new FileWriter(ceiOutputFileName + ".thy");
			generateTheoryName(ceiWriter, ceiOutputFileName, List.of("CommonExtraInv"));
			generateInitVcProofForCommonExtraInvariant(ceiWriter);
			for (int i =2; i<= numVCs; i++)
				generateLoopPathForCommonExtraInvariant(ceiWriter, i, inputVars);
			ceiWriter.write("end\n");
			ceiWriter.close();
			for (Element element: elements) {
				if (element instanceof  ExtraInvariant einv) {
					String outputFileName = einv.getName() + "_Proofs";
					FileWriter writer = new FileWriter(outputFileName + ".thy");
					generateTheoryName(writer, outputFileName, List.of(importedTheory + " CommonExtraInv_Proofs"));
					generateInitVcProofForExtraInvariant(writer, einv);
					for (int i =2; i<= numVCs; i++)
						generateLoopPathForExtraInvariant(writer, i, einv, inputVars);
					writer.write("end\n");
					writer.close();
				}
				else if (element instanceof  Requirement req) {
					ExtraInvariant einv = req.getExtraInv();
					String outputFileName = req.getName() + "_Proofs";
					FileWriter writer = new FileWriter(outputFileName + ".thy");
					generateTheoryName(writer, outputFileName, List.of(req.getExtraInv().getName() + "_Proofs"));
					writer.write(generateExtendedInvDefinition(req));
					writer.write("\n\n");
					String extendedInv = req.getName() + "_extended_inv";
					generateInitVcProofForRequirement(writer, extendedInv, req);
					for (int i =2; i<= numVCs; i++)
						generateLoopPathForRequirement(writer, i, einv.getName(), req, extendedInv, inputVars);
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
				+ "    using cei" + i + " apply((auto simp add: VC" + i + "_def)[1];fastforce)\r\n"
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
		writer.write("unfolding VC" + i + "_def " + name + "_def " + req.getName() + "_def");
		Lemma L9 = null;
		DerivedLemmas lemmas = req.getPattern().getLemmas();
		if (lemmas != null) 
			L9 = lemmas.getL9();
		if (L9 == null)
			L9 = req.getPattern().getExtraInvPattern().getLemmas().getL9();
		String proofScript = 
				"  apply(rule impI)\r\n"
				+ "  apply(rule context_conjI)\r\n"
				+ "  using extra" + i + " apply((auto simp add: VC" + i + "_def)[1];fastforce)\r\n"
				+ "  apply(rule conjI)\r\n"
				+ "   apply simp\r\n"
				+ "  apply(unfold " + einv + "_def commonExtraInv_def)\r\n"
				+ "  apply(erule conjE)+\r\n"
				+ "  apply(erule " + L9.getName() + ")"
				+ "  apply(auto split: if_splits)\r\n"
				+ "  done\r\n"
				+ "";
		writer.write(proofScript + "\n");		
	}
	
	private void generateLoopPathForCommonExtraInvariant(FileWriter writer, int i, String inputVars) throws IOException {
		writer.write("theorem cei" + i + ": \"VC" + i + " commonExtraInv env s0 " + inputVars + "\"\n");
		writer.write("unfolding VC" + i + "_def commonExtraInv_def\n");
		writer.write("by force\n\n");
	}

	private void generateInitVcProofForExtraInvariant(FileWriter writer, ExtraInvariant einv) throws IOException {
		writer.write("theorem extra1: \"VC1 " + einv.getName() + " s0\"\n");
		writer.write("unfolding VC1_def " + einv.getName() + "_def " 
		+ einv.getPattern().getName() + "_used_patterns commonExtraInv_def\n");
		writer.write("by auto\n\n");
	}
	
	private void generateInitVcProofForRequirement(FileWriter writer, String extendedInvName, Requirement requirement) throws IOException {
		ExtraInvariant einv = requirement.getExtraInv();
		writer.write("theorem extra1: \"VC1 " + extendedInvName + " s0\"\n");
		writer.write("unfolding VC1_def " + extendedInvName + "_def " + requirement.getExtraInv().getName() + "_def " 
		+ requirement.getName() + "_def " + einv.getPattern().getName() + "_used_patterns " 
				+ requirement.getPattern().getName() + "_used_patterns commonExtraInv_def\n");
		writer.write("by auto\n\n");
	}
	
	private void generateInitVcProofForCommonExtraInvariant(FileWriter writer) throws IOException {
		writer.write("theorem cei1: \"VC1 commonExtraInv s0\"\n");
		writer.write("unfolding VC1_def commonExtraInv_def\n");
		writer.write("by auto\n\n");
	}
	
	private void generateTheoryName(FileWriter writer, String theoryName, List<String> imports) throws IOException {
		writer.write("theory " + theoryName + " imports ");
		for (String theory: imports)
			writer.write(theory + ' ');
		writer.write("\nbegin\n");
	}
	
	private String generateExtendedInvDefinition(Requirement requirement) {
		StringBuilder stringBuilder = new StringBuilder();
		String extendedInv = requirement.getName() + "_extended_inv";
		stringBuilder.append("definition ").append(extendedInv).append(" where \"").append(extendedInv)
		.append(" s \\<equiv> ").append(requirement.getExtraInv().getName()).append(" s \\<and> ")
		.append(requirement.getName()).append(" s\"");
		return stringBuilder.toString();	
	}
}