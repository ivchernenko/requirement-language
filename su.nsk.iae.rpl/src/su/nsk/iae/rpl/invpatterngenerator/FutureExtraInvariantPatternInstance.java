package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FutureExtraInvariantPatternInstance implements InnerExtraInvariantFormula {
	private FutureExtraInvariantPattern pattern;
	private List<Term> cParams;
	private List<FunctionalParameter> fnParams;
	private List<FormulaParameterValue> fmParams;
	private final UpdateStateVariable finState;
	private final UpdateStateVariable curState;
	
	public UpdateStateVariable getFinState() {
		return finState;
	}

	public UpdateStateVariable getCurState() {
		return curState;
	}

	public FutureExtraInvariantPattern getPattern() {
		return pattern;
	}
	
	public List<Term> getcParams() {
		return cParams;
	}
	
	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}
	
	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}

	public FutureExtraInvariantPatternInstance(FutureExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.fmParams = fmParams;
		this.finState = finState;
		this.curState = curState;
	}

	@Override
	public List<PastExtraInvariantPatternInstance> generateExtraConjuncts() {
		List<PastExtraInvariantPatternInstance> extraConjs = new ArrayList<>();
		for (FormulaParameterValue fmParamValue: fmParams)
			extraConjs.addAll(((InnerExtraInvariantFormula) fmParamValue.getFormula()).generateExtraConjuncts());
		return extraConjs;
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		UpdateStateVariable newFinState = substitution.getOrDefault(finState.getName(), finState);
		UpdateStateVariable newCurState = substitution.getOrDefault(curState.getName(), curState);
		List<FormulaParameterValue> newFmParams = new ArrayList<>();
		for (FormulaParameterValue fm: fmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) fm.getFormula();
			InnerExtraInvariantFormula newFormula = formula.replaceStates(substitution);
			newFmParams.add(new FormulaParameterValue(fm.getStates(), newFormula));
		}
		return new FutureExtraInvariantPatternInstance(pattern, cParams, fnParams, newFmParams, newFinState, newCurState);
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
		return new FutureExtraInvariantPatternInstance(pattern, cParams, fnParams, fmParams, newFinState, newCurState);
	}

	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		Lemma L = pattern.getLemmas().getL2();
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(L, cParams, fnParams, new ArrayList<>(), fmParams,
				new ArrayList<>(), null, finState);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		return premiseInstance.replacePatterns(initState);
	}

	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		Lemma L;
		ParameterValueMap params;
		if (right instanceof FutureExtraInvariantPatternInstance fiRight) {
			L = pattern.getLemmas().getL1();
			params = new ParameterValueMap(L, cParams, fnParams, new ArrayList<>(), fmParams, new ArrayList<>(),
					this.finState, fiRight.finState);
		}
		else {
			FutureRequirementPatternInstance frRight = (FutureRequirementPatternInstance) right;
			L = pattern.getLemmas().getL3();
			if (L == null)
				L = frRight.getPattern().getLessas().getL3();
			params = new ParameterValueMap(L, cParams, fnParams, new ArrayList<>(), fmParams, frRight.getFmParams(), 
					null, finState);
		}
		LemmaPremiseFormula premise = L.getPrem();	
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		return premiseInstance.replacePatterns(this.finState);
	}

	@Override
	public boolean equalsToRequirementFormula() {
		return false;
	}

	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = new ArrayList<>();
		usedPatterns.add(pattern.getName() + "_def");
		for (FormulaParameterValue param: fmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) param.getFormula();
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
		for (FunctionalParameter fnParam: fnParams)
			stringBuilder.append(' ').append(fnParam.getName());
		for (FormulaParameterValue fmParam: fmParams)
			stringBuilder.append(' ').append(fmParam);
		if (finState != null)
			stringBuilder.append(' ').append(finState.getName());
		if (curState != null)
			stringBuilder.append(' ').append(curState.getName());
		stringBuilder.append(')');
		return stringBuilder.toString();
	}

	@Override
	public LemmaPremise generateParticularLemmaPremise() {
		List<FormulaParameterValue> simplifiedFmParams = new ArrayList<>();
		for (FormulaParameterValue fmParam: fmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) fmParam.getFormula();
			InnerExtraInvariantFormula simplifiedFormula = (InnerExtraInvariantFormula) 
					formula.generateParticularLemmaPremise();
			simplifiedFmParams.add(new FormulaParameterValue(fmParam.getStates(), simplifiedFormula));
		}
		return new FutureExtraInvariantPatternInstance(pattern, cParams, fnParams, simplifiedFmParams, finState, curState);
	}

	@Override
	public LemmaPremiseFormula convertToEObject() {
		throw new InvalidTypeException();
	}
}
