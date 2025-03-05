package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ExtendedInvariant implements OuterExtraInvariantFormula {
	DerivedExtraInvariantPatternInstance mainConj;
	List<PastExtraInvariantPatternInstance> extraConjs;
	public ExtendedInvariant(DerivedExtraInvariantPatternInstance mainConj, 
			List<PastExtraInvariantPatternInstance> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public DerivedExtraInvariantPatternInstance getMainConj() {
		return mainConj;
	}
	public List<PastExtraInvariantPatternInstance> getExtraConjs() {
		return extraConjs;
	}
	@Override
	public LemmaPremise generateL8(UpdateStateVariable initState, UpdateStateVariable finalState) {
		LemmaPremise premiseInstance = generateL8PremiseInstance(initState, finalState);
		for (var conjunct: extraConjs) {
			PastExtraInvariantPatternInstance premiseConj = conjunct.setState(finalState, true);
			premiseInstance = new BooleanLemmaPremise(
					BooleanOperator.CONJUNCTION, premiseInstance, premiseConj.replacePatterns(initState));
		}
		return premiseInstance.replacePatterns(initState);
	}
	
	LemmaPremise generateL8PremiseInstance(UpdateStateVariable initState, UpdateStateVariable finalState) {
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L8 = pattern.getLemmas().getL8();
		LemmaPremiseFormula premise = L8.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(
				L8,
				mainConj.getcParams(),
				mainConj.getFnParams(),
				mainConj.getSimpleFmParams(),
				mainConj.getRegFmParams(),
				new ArrayList<>(),
				initState,
				finalState);
		return premise.substitiuteParams(instCreator, params);
	}

	@Override
	public LemmaPremise generateL9(OuterRequirementFormula reqFormula, UpdateStateVariable state) {
		LemmaPremise premiseInstance = generateL9PremiseInstance(reqFormula, state);
		return premiseInstance.replacePatterns(null);
	}
	
	LemmaPremise generateL9PremiseInstance(OuterRequirementFormula reqFormula, UpdateStateVariable state) {
		DerivedRequirementPatternInstance reqPatternInst = (DerivedRequirementPatternInstance) reqFormula;
		Lemma L9 = reqPatternInst.getL9();
		LemmaPremiseFormula premise = L9.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(
				L9,
				mainConj.getcParams(),
				mainConj.getFnParams(),
				mainConj.getSimpleFmParams(),
				mainConj.getRegFmParams(),
				reqPatternInst.getRegFmParams(),
				null,
				state);
		return premise.substitiuteParams(instCreator, params);
	}
	
	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = mainConj.getUsedPatternNames();
		for (PastExtraInvariantPatternInstance extraConj: extraConjs) {
			usedPatterns.addAll(extraConj.getUsedPatternNames());
		}
		return usedPatterns;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < extraConjs.size(); i++)
			stringBuilder.append("(");
		stringBuilder.append(mainConj.toString());
		for (PastExtraInvariantPatternInstance extraConj: extraConjs) {
			stringBuilder.append(" " + BooleanOperator.CONJUNCTION.toString() + " ")
			.append(extraConj.toString())
			.append(")");
		}
		return stringBuilder.toString();
	}
	@Override
	public String convertToString(UpdateStateVariable finalState) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < extraConjs.size(); i++)
			stringBuilder.append('(');
		stringBuilder.append(mainConj.convertToString(finalState));
		for (PastExtraInvariantPatternInstance extraConj: extraConjs) 
			stringBuilder.append(" " + BooleanOperator.CONJUNCTION.toString() + " ")
			.append(extraConj.setState(finalState, false))
			.append(')');
		return stringBuilder.toString();
	}
	@Override
	public String generateProofScriptForL8(UpdateStateVariable initState, UpdateStateVariable finalState,
			ProofScriptGenerator generator) {
		return generator.generateForExtendedInvariant(this, initState, finalState);
	}
	@Override
	public String generateProofScriptForL9(OuterRequirementFormula reqFormula, UpdateStateVariable state,
			ProofScriptGenerator generator) {
		DerivedRequirementPatternInstance other = (DerivedRequirementPatternInstance) reqFormula;
		return generator.generateForDerivedRequirementPatternInstance(this, other, state);
	}
}
