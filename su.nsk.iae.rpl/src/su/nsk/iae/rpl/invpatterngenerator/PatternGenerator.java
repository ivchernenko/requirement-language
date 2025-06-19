package su.nsk.iae.rpl.invpatterngenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.Element;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class PatternGenerator {
	static Map<String, DerivedRequirementPattern> generatedPatterns = new HashMap<>();
	static List<Element> generatedASTElements;
	static IsabelleTheoryGenerator theoryGenerator;
	
	public static void setTheoryGenerator(IsabelleTheoryGenerator theoryGenerator) {
		PatternGenerator.theoryGenerator = theoryGenerator;
	}

	public static void setGeneratedASTElements(List<Element> generatedASTElements) {
		PatternGenerator.generatedASTElements = generatedASTElements;
	}

	public static RequirementPattern generateRequirementPattern(DerivedRequirementPattern reqPattern) {
		List<ConstantParameter> cParams = reqPattern.getCParams();
		List<SimpleFormulaParameter> simpleFmParams = new ArrayList<>();
		simpleFmParams.addAll(reqPattern.getSimpleFmParams());
		List<RegularFormulaParameter> regFmParams = reqPattern.getFmParams();
		OuterRequirementFormulaGenerator generator = new OuterRequirementFormulaGenerator(generatedPatterns);
		OuterRequirementFormula definition = reqPattern.getDefinition().generateFormula(generator);
		return new RequirementPattern(reqPattern.getName(), cParams, simpleFmParams, regFmParams, definition);
	}
	
	public static ExtraInvariantPattern generateExtraInvariantPattern(DerivedRequirementPattern reqPattern) {
		List<ConstantParameter> cParams = reqPattern.getCParams();
		List<SimpleFormulaParameter> simpleFmParams = new ArrayList<>();
		simpleFmParams.addAll(reqPattern.getSimpleFmParams());
		List<RegularFormulaParameter> regFmParams = new ArrayList<>();
		Map<RegularFormulaParameter, RegularFormulaParameter> regParamMapping = new HashMap<>();
		for (RegularFormulaParameter original: reqPattern.getFmParams()) {
			RPLFactory factory = RPLFactoryImpl.init();
			RegularFormulaParameter renamed = factory.createRegularFormulaParameter();
			renamed.setName(original.getName() + "_1");
			regParamMapping.put(original, renamed);
			regFmParams.add(renamed);
		}
		OuterExtraInvariantFormulaGenerator generator = new OuterExtraInvariantFormulaGenerator(generatedPatterns, regParamMapping);
		OuterExtraInvariantFormula definition = reqPattern.getDefinition().generateFormula(generator);
		List<FunctionalParameter> fnParams = generator.getFnParamList().params;
		return new ExtraInvariantPattern(reqPattern.getName() + "_inv", cParams, fnParams, simpleFmParams, regFmParams, definition);
	}
	
	public static void generatePatternsAndLemmas(
			DerivedRequirementPattern pattern) throws IOException {
		RequirementPattern reqPattern = generateRequirementPattern(pattern);
		RequirementPattern particularReqPattern = reqPattern
				.generateParticularPattern(reqPattern.getName() + "_part");
		ExtraInvariantPattern einvPattern = generateExtraInvariantPattern(pattern);
		ExtraInvariantPattern particularEinvPattern = einvPattern
				.generateParticularPattern(einvPattern.getName() + "_part", reqPattern.getRegFmParams());
		DerivedExtraInvariantPatternInstance partEinvPatternDef = 
				((ExtendedInvariant) particularEinvPattern.getDefinition()).getMainConj();
		DerivedRequirementPatternInstance partReqPatternDef = 
				(DerivedRequirementPatternInstance) particularReqPattern.getDefinition();
		theoryGenerator.addTheoryElement(reqPattern);
		theoryGenerator.addTheoryElement(particularReqPattern);
		theoryGenerator.addTheoryElement(einvPattern);
		theoryGenerator.addTheoryElement(particularEinvPattern);
		OuterRequirementFormula reqDef = reqPattern.getDefinition();
		OuterExtraInvariantFormula einvDef = einvPattern.getDefinition();
		RPLFactory factory = RPLFactory.eINSTANCE;
		UpdateStateVariable s = factory.createUpdateStateVariable();
		s.setName("s0");
		UpdateStateVariable sPrimed = factory.createUpdateStateVariable();
		sPrimed.setName("s");
		LemmaPremise L8Premise = einvDef.generateL8(s, sPrimed);
		StringBuilder L8Script = new StringBuilder();
		L8Script.append("unfolding " + einvPattern.getName() + "_def\n");
		L8Script.append(einvDef.generateProofScriptForL8(s, sPrimed, new ProofScriptGenerator()));
		L8Script.append("done");
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
		StringBuilder L9Script = new StringBuilder();
		L9Script.append("unfolding " + einvPattern.getName() + "_def " + reqPattern.getName() + "_def\n");
		L9Script.append(einvDef.generateProofScriptForL9(reqDef, s, new ProofScriptGenerator()));
		L9Script.append("done");
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
		theoryGenerator.addTheoryElement(L8);
		theoryGenerator.addTheoryElement(L8Script);
		theoryGenerator.addTheoryElement(L9);
		theoryGenerator.addTheoryElement(L9Script);
		theoryGenerator.addTheoryElement(particularL8);
		StringBuilder particularL8Script = new StringBuilder();
		particularL8Script.append("unfolding " + particularEinvPattern.getName() + "_def " 
		+ particularReqPattern.getName() + "_def\n");
		particularL8Script.append("apply(simp add: " + L8.getLemmaName() + " always_imp_refl)\n");
		particularL8Script.append("done");
		theoryGenerator.addTheoryElement(particularL8Script);
		theoryGenerator.addTheoryElement(particularL9);
		StringBuilder particularL9Script = new StringBuilder();
		particularL9Script.append("unfolding " + particularEinvPattern.getName() + "_def " 
				+ particularReqPattern.getName() + "_def\n");
		particularL9Script.append("apply(simp add: " + L9.getLemmaName() + " always_imp_refl)\n");
		particularL9Script.append("done\n\n");
		theoryGenerator.addTheoryElement(particularL9Script);
		StringBuilder reqPatternNames = new StringBuilder();
		reqPatternNames.append("lemmas " + reqPattern.getName() + "_used_patterns = " 
		+ reqPattern.getName() + "_def ");
		List<String> usedReqPatterns = reqPattern.getUsedPatternNames();
		for (String usedPattern: usedReqPatterns)
			reqPatternNames.append(usedPattern + ' ');
		theoryGenerator.addTheoryElement(reqPatternNames);
		StringBuilder einvPatternNames = new StringBuilder();
		einvPatternNames.append("lemmas " + einvPattern.getName() + "_used_patterns = "
		+ einvPattern.getName() + "_def ");
		List<String> usedEinvPatterns = einvPattern.getUsedPatternNames();
		for (String usedPattern: usedEinvPatterns)
			einvPatternNames.append(usedPattern + ' ');
		theoryGenerator.addTheoryElement(einvPatternNames);
		StringBuilder particularEinvPatternNames = new StringBuilder();
		particularEinvPatternNames.append("lemmas " + particularEinvPattern.getName() + "_used_patterns = ");
		particularEinvPatternNames.append(particularEinvPattern.getName() +"_def " + einvPattern.getName() + "_used_patterns");
		theoryGenerator.addTheoryElement(particularEinvPatternNames);
		StringBuilder particularReqPatternNames = new StringBuilder();
		particularReqPatternNames.append("lemmas " + particularReqPattern.getName() + "_used_patterns = ");
		particularReqPatternNames.append(particularReqPattern.getName() +"_def " + reqPattern.getName() + "_used_patterns");
		theoryGenerator.addTheoryElement(particularReqPatternNames);
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
		generatedPatterns.put(rplReqPattern.getName(), rplReqPattern);
		generatedASTElements.add(rplEinvPattern);
		generatedASTElements.add(rplParticularEinvPattern);
		generatedASTElements.add(rplReqPattern);
		generatedASTElements.add(rplParticularReqPattern);
	}
}
