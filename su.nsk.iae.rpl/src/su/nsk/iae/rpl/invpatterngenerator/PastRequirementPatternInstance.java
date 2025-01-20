package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class PastRequirementPatternInstance implements InnerExtraInvariantFormula {
	private PastRequirementPattern pattern;
	private List<Term> cParams;
	private List<FormulaParameterValue> fmParams;
	private FunctionalParameter boolParam;
	private final UpdateStateVariable finState;
	public UpdateStateVariable getFinState() {
		return finState;
	}

	public UpdateStateVariable getCurState() {
		return curState;
	}

	private final UpdateStateVariable curState;
	
	
	
	public FunctionalParameter getBoolParam() {
		return boolParam;
	}
	
	public PastRequirementPattern getPattern() {
		return pattern;
	}

	public List<Term> getcParams() {
		return cParams;
	}

	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}

	public PastRequirementPatternInstance(PastRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> fmParams, FunctionalParameter boolParam, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fmParams = fmParams;
		this.boolParam = boolParam;
		this.finState = finState;
		this.curState = curState;
	}
	
	public PastRequirementPatternInstance(PastRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> fmParams, FunctionalParameter boolParam) {
		this(pattern, cParams, fmParams, boolParam, null, null);
	}

	@Override
	public List<Implication> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		List<Implication> extraConjList = new ArrayList<>();
		List<FormulaParameterValue> extraConjFmParams;
		if (curState != null) {
			extraConjFmParams = new ArrayList<>();
			for (FormulaParameterValue fmParam: fmParams) {
				InnerExtraInvariantFormula formula = fmParam.getFormula();
				Map<UpdateStateVariable, UpdateStateVariable> substitution = new HashMap<>();
				substitution.put(curState, finState);
				InnerExtraInvariantFormula extraConjFormula = formula.replaceStates(substitution);
				extraConjFmParams.add(new FormulaParameterValue(fmParam.getStates(), extraConjFormula));
			}
		}
		else
			extraConjFmParams = fmParams;
		PastExtraInvariantPatternInstance pastEinv = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
				pattern.getExtraInvPattern(),
				cParams, extraConjFmParams, boolParam, fnParamList);
		Implication extraConj = new Implication(boolParam, pastEinv);
		extraConjList.add(extraConj);
		for (var fmParamValue: fmParams)
			extraConjList.addAll(fmParamValue.getFormula().generateExtraConjuncts(fnParamList));
		return extraConjList;
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		UpdateStateVariable newFinState = substitution.getOrDefault(finState, finState);
		UpdateStateVariable newCurState = substitution.getOrDefault(curState, curState);
		List<FormulaParameterValue> newFmParams = new ArrayList<>();
		for (FormulaParameterValue fm: fmParams) {
			InnerExtraInvariantFormula formula = fm.getFormula();
			InnerExtraInvariantFormula newFormula = formula.replaceStates(substitution);
			newFmParams.add(new FormulaParameterValue(fm.getStates(), newFormula));
		}
		return new PastRequirementPatternInstance(pattern, cParams, newFmParams, boolParam, newFinState, newCurState);
	}

	@Override
	public InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states) {
		UpdateStateVariable newFinState = finState;
		UpdateStateVariable newCurState = curState;
		if (states.size() == 0)
			return this;
		if (finState == null) {
			newFinState = states.get(0);
			if (states.size() > 1)
				newCurState = states.get(1);
		}
		else
			newCurState = states.get(0);
		return new PastRequirementPatternInstance(pattern, cParams, fmParams, boolParam, newFinState, newCurState);
	}

	@Override
	public LemmaPremise replacePatterns(DerivedLemmaScheme LS) {
		Lemma L = pattern.getLemmas().getL7();
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, boolParam);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, LS, params);
		return premiseInstance.replacePatterns(LS);		
	}

	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(DerivedLemmaScheme LS, List<UpdateStateVariable> lambdaBound) {
		Lemma L;
		if (LS == DerivedLemmaScheme.LS8)
			L = pattern.getLemmas().getL4();
		else
			L = pattern.getLemmas().getL5();
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, boolParam);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, LS, params);
		return premiseInstance.replacePatterns(LS);
	}

	@Override
	public boolean equalsToRequirementFormula() {
		boolean equal = true;
		for (FormulaParameterValue fmParam: fmParams) {
			InnerExtraInvariantFormula formula = fmParam.getFormula();
			equal = equal && formula.equalsToRequirementFormula();
		}
		return equal;
	}

	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = new ArrayList<>();
		usedPatterns.add(pattern.getName());
		for (FormulaParameterValue param: fmParams) {
			InnerExtraInvariantFormula formula = param.getFormula();
			usedPatterns.addAll(formula.getUsedPatternNames());
		}
		return usedPatterns;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(pattern.getName());
		for (Term cParam: cParams)
			stringBuilder.append(' ').append(cParam);
		for (FormulaParameterValue fmParam: fmParams)
			stringBuilder.append(' ').append(fmParam);
		if (finState != null)
			stringBuilder.append(' ').append(finState.getName());
		if (curState != null)
			stringBuilder.append(' ').append(curState.getName());
		stringBuilder.append(')');
		return stringBuilder.toString();
	}
}
