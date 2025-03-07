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
			FileWriter writer = new FileWriter(outputFileName + ".thy");
			RPLFactory factory = RPLFactory.eINSTANCE;
			Model genModel = factory.createModel();
			List<Import> imports = genModel.getImports();
			List<String> importedTheories = new ArrayList<>();
			for (Import importElement: model.getImports()) {
				Import importCopy = factory.createImport();
				String importURI = importElement.getImportURI();
				importCopy.setImportURI(importElement.getImportURI());
				imports.add(importCopy);
				String throryName = importURI.substring(0, importURI.lastIndexOf('.'));
				importedTheories.add(throryName);
			}
			generateTheoryName(writer,  outputFileName,  importedTheories);
			List<Element> genElements = genModel.getElements();
			for (Element element: elements) {
				if (element instanceof DerivedRequirementPattern pattern && pattern.getDefinition() != null) {
					RequirementPattern reqPattern = PatternGenerator.generateRequirementPattern(pattern);
					RequirementPattern particularReqPattern = reqPattern
							.generateParticularPattern(reqPattern.getName() + "_part");
					ExtraInvariantPattern einvPattern = PatternGenerator.generateExtraInvariantPattern(pattern);
					ExtraInvariantPattern particularEinvPattern =einvPattern
							.generateParticularPattern(einvPattern.getName() + "_part", reqPattern.getRegFmParams());
					DerivedExtraInvariantPatternInstance partEinvPatternDef = 
							((ExtendedInvariant) particularEinvPattern.getDefinition()).getMainConj();
					DerivedRequirementPatternInstance partReqPatternDef = 
							(DerivedRequirementPatternInstance) particularReqPattern.getDefinition();
					writer.write(reqPattern.toString() + "\n\n");
					writer.write(particularReqPattern.toString() + "\n\n");
					writer.write(einvPattern.toString() + "\n\n");
					writer.write(particularEinvPattern.toString() + "\n\n");
					OuterRequirementFormula reqDef = reqPattern.getDefinition();
					OuterExtraInvariantFormula einvDef = einvPattern.getDefinition();
					UpdateStateVariable s = factory.createUpdateStateVariable();
					s.setName("s0");
					UpdateStateVariable sPrimed = factory.createUpdateStateVariable();
					sPrimed.setName("s");
					LemmaPremise L8Premise = einvDef.generateL8(s, sPrimed);
					String L8Script = einvDef.generateProofScriptForL8(s, sPrimed, new ProofScriptGenerator());
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
					s = factory.createUpdateStateVariable();
					s.setName("s0");
					sPrimed = factory.createUpdateStateVariable();
					sPrimed.setName("s");
					LemmaPremise L9Premise = einvDef.generateL9(reqDef, s);
					String L9Script = einvDef.generateProofScriptForL9(reqDef, s, new ProofScriptGenerator());
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
					s = factory.createUpdateStateVariable();
					s.setName("s0");
					sPrimed = factory.createUpdateStateVariable();
					sPrimed.setName("s");
					ParameterValueMap L8Params = new ParameterValueMap(
							L8.convertToEObject(),
							partEinvPatternDef.getcParams(),
							partEinvPatternDef.getFnParams(),
							partEinvPatternDef.getSimpleFmParams(),
							partEinvPatternDef.getRegFmParams(),
							new ArrayList<>(),
							s,
							sPrimed
							);
					LemmaPremiseInstanceCreator creator = new LemmaPremiseInstanceCreator();
					LemmaPremise particularL8Premise = L8Premise.convertToEObject()
							.substitiuteParams(creator, L8Params).generateParticularLemmaPremise();
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
					s = factory.createUpdateStateVariable();
					s.setName("s0");
					sPrimed = factory.createUpdateStateVariable();
					sPrimed.setName("s");
					ParameterValueMap L9Params = new ParameterValueMap(
							L9.convertToEObject(),
							partEinvPatternDef.getcParams(),
							partEinvPatternDef.getFnParams(),
							partEinvPatternDef.getSimpleFmParams(),
							partEinvPatternDef.getRegFmParams(),
							partReqPatternDef.getRegFmParams(),
							s,
							sPrimed
							);
					LemmaPremise particularL9Premise = 
							L9Premise.convertToEObject().substitiuteParams(creator, L9Params).generateParticularLemmaPremise();
					LS9Lemma particularL9 = new LS9Lemma(
							pattern.getName() + "einv_imp_req",
							particularEinvPattern.getName(),
							particularReqPattern.getName(),
							particularEinvPattern.getcParams(),
							particularEinvPattern.getFnParams(),
							particularEinvPattern.getSimpleFmParams(),
							particularEinvPattern.getRegFmParams(),
							particularReqPattern.getRegFmParams(),
							sPrimed,
							particularL9Premise);
					writer.write(L8.toString() + "\n");
					writer.write("unfolding " + einvPattern.getName() + "_def\n");
					writer.write(L8Script);
					writer.write("done");
					writer.write("\n\n");
					writer.write(L9.toString());
					writer.write("unfolding " + einvPattern.getName() + "_def " + reqPattern.getName() + "_def\n");
					writer.write(L9Script);
					writer.write("done");
					writer.write("\n\n");
					writer.write(particularL8.toString());
					writer.write("unfolding " + particularEinvPattern.getName() + "_def " 
					+ particularReqPattern.getName() + "_def\n");
					writer.write("apply(simp add: " + L8.getLemmaName() + " always_imp_refl)\n");
					writer.write("done");
					writer.write("\n\n");
					writer.write(particularL9.toString());
					writer.write("unfolding " + particularEinvPattern.getName() + "_def " 
							+ particularReqPattern.getName() + "_def\n");
					writer.write("apply(simp add: " + L9.getLemmaName() + " always_imp_refl)\n");
					writer.write("done");
					writer.write("\n\n");
					writer.write("lemmas " + reqPattern.getName() + "_used_patterns = " 
					+ reqPattern.getName() + "_def ");
					List<String> usedReqPatterns = reqPattern.getUsedPatternNames();
					for (String usedPattern: usedReqPatterns)
						writer.write(usedPattern + ' ');
					writer.write("\n\n");
					writer.write("lemmas " + einvPattern.getName() + "_used_patterns = "
					+ einvPattern.getName() + "_def ");
					List<String> usedEinvPatterns = einvPattern.getUsedPatternNames();
					for (String usedPattern: usedEinvPatterns)
						writer.write(usedPattern + ' ');
					writer.write("\n\n");
					writer.write("lemmas " + particularEinvPattern.getName() + "_used_patterns = ");
					writer.write(particularEinvPattern.getName() +"_def " + einvPattern.getName() + "_used_patterns");
					writer.write("\n\n");
					writer.write("lemmas " + particularReqPattern.getName() + "_used_patterns = ");
					writer.write(particularReqPattern.getName() +"_def " + reqPattern.getName() + "_used_patterns");
					writer.write("\n\n");
					//saving generated patterns and lemmas in the requirement pattern language
					Lemma rplL8 = L8.convertToEObject();
					Lemma rplL9 = L9.convertToEObject();
					Lemma rplParticularL8 = particularL8.convertToEObject();
					Lemma rplParticularL9 = particularL9.convertToEObject();
					DerivedExtraInvariantPattern rplEinvPattern = einvPattern.convertToEObject(rplL8, rplL9);
					DerivedExtraInvariantPattern rplParticularEinvPattern = particularEinvPattern
							.convertToEObject(rplParticularL8, rplParticularL9);
					DerivedRequirementPattern rplReqPattern = reqPattern.convertToEObject(rplEinvPattern);
					DerivedRequirementPattern rplParticularReqPattern = particularReqPattern
							.convertToEObject(rplParticularEinvPattern);
					genElements.add(rplEinvPattern);
					genElements.add(rplParticularEinvPattern);
					genElements.add(rplReqPattern);
					genElements.add(rplParticularReqPattern);
				}				
			}
			writer.write("end\n");
			writer.close();
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
				+ "  apply(auto intro: " + L9.getName() +")\r\n"
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