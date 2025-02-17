package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ExtendedInvariant implements OuterExtraInvariantFormula {
	DerivedExtraInvariantPatternInstance mainConj;
	List<Implication> extraConjs;
	public ExtendedInvariant(DerivedExtraInvariantPatternInstance mainConj, List<Implication> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public DerivedExtraInvariantPatternInstance getMainConj() {
		return mainConj;
	}
	public List<Implication> getExtraConjs() {
		return extraConjs;
	}
	@Override
	public LemmaPremise generateL8(UpdateStateVariable initState, UpdateStateVariable finalState) {
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
				null,
				initState,
				finalState);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		for (var conjunct: extraConjs) {
			FunctionApplication left = new FunctionApplication(conjunct.getLeft(), finalState);
			PastExtraInvariantPatternInstance right = conjunct.getRight().setState(finalState, true);
			ImplicationLemmaPremise extraConj = new ImplicationLemmaPremise(left, right);
			premiseInstance = new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, premiseInstance, extraConj);
		}
		return premiseInstance.replacePatterns(initState);
	}

	@Override
	public LemmaPremise generateL9(OuterRequirementFormula reqFormula, UpdateStateVariable state) {
		DerivedRequirementPatternInstance reqPatternInst = (DerivedRequirementPatternInstance) reqFormula;
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L9 = pattern.getLemmas().getL9();
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
				null,
				state);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		return premiseInstance.replacePatterns(null);
	}
	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = mainConj.getUsedPatternNames();
		for (Implication extraConj: extraConjs) {
			usedPatterns.addAll(extraConj.getRight().getUsedPatternNames());
		}
		return usedPatterns;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < extraConjs.size(); i++)
			stringBuilder.append("(");
		stringBuilder.append(mainConj.toString());
		for (Implication extraConj: extraConjs) {
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
		for (Implication extraConj: extraConjs) 
			stringBuilder.append(" " + BooleanOperator.CONJUNCTION.toString() + " ")
			.append(extraConj.convertToString(finalState))
			.append(')');
		return stringBuilder.toString();
	}
}
