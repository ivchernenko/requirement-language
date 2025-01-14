package su.nsk.iae.rpl.invpatterngenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ExtendedInvariant extends OuterExtraInvariantFormula {
	DerivedExtraInvariantPatternInstance mainConj;
	List<Implication> extraConjs;
	public ExtendedInvariant(DerivedExtraInvariantPatternInstance mainConj, List<Implication> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public OuterExtraInvariantFormula getMainConj() {
		return mainConj;
	}
	public List<OuterExtraInvariantFormula> getExtraConjs() {
		return extraConjs;
	}
	@Override
	public LS8LemmaPremise generateL8() {
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L8 = pattern.getLemmas().getL8();
		LemmaPremiseFormula premise = L8.getPrem();
		LS8LemmaPremiseInstanceCreator instCreator = new LS8LemmaPremiseInstanceCreator();
		ParameterValueMap params = createParameterMap(mainConj, L8);
		LS8LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		UpdateStateVariable finalState = L8.getFinalState();
		for (var conjunct: extraConjs) {
			FunctionApplication left = new FunctionApplication(conjunct.getLeft(), finalState);
			PastExtraInvariantPatternInstance right = conjunct.getRight().setState(finalState);
			LS8ImplicationLemmaPremise extraConj = new LS8ImplicationLemmaPremise(left, right);
			premiseInstance = new LS8BooleanLemmaPremise(BooleanOperator.CONJUNCTION, premiseInstance, extraConj);
		}
		return premiseInstance.replacePatterns();
	}

	static ParameterValueMap createParameterMap(DerivedExtraInvariantPatternInstance mainConj, Lemma lemma) {
		List<Term> cParamValues = mainConj.getcParams();
		List<FunctionalParameter> fnParamValues = mainConj.getFnParams();
		List<PatternFreeFormulaParameterValue> simpleFmParamValues = mainConj.getSimpleFmParams();
		List<FormulaParameterValue> regFmParamValues = mainConj.getRegFmParams();
		List<ConstantParameter> cVars = lemma.getCVars();
		List<FunctionalParameter> fnVars = lemma.getFnVars();
		List<SimpleFormulaParameter> simpleFmVars = lemma.getSimpleFmVars();
		List<RegularFormulaParameter> regFmVars = lemma.getIfmVars();
		Map<ConstantParameter, Term> cParams = new HashMap<>();
		for (int i = 0; i < cVars.size(); i++)
			cParams.put(cVars.get(i), cParamValues.get(i));
		Map<FunctionalParameter, FunctionalParameter> fnParams = new HashMap<>();
		for (int i = 0; i < fnVars.size(); i++)
			fnParams.put(fnVars.get(i), fnParamValues.get(i));
		Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams = new HashMap<>();
		for (int i = 0; i< simpleFmVars.size(); i++)
			simpleFmParams.put(simpleFmVars.get(i), simpleFmParamValues.get(i));
		Map<RegularFormulaParameter, FormulaParameterValue> regFmParams = new HashMap<>();
		for (int i = 0; i < regFmVars.size(); i++)
			regFmParams.put(regFmVars.get(i), regFmParamValues.get(i));
		return new ParameterValueMap(cParams, fnParams, simpleFmParams, regFmParams, null);
	}
	@Override
	public LS9LemmaPremise generateL9() {
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L9 = pattern.getLemmas().getL9();
		LemmaPremiseFormula premise = L9.getPrem();
		LS9LemmaPremiseInstanceCreator instCreator = new LS9LemmaPremiseInstanceCreator();
		ParameterValueMap params = createParameterMap(mainConj, L9);
		LS9LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		return premiseInstance.replacePatterns();
	}
}
