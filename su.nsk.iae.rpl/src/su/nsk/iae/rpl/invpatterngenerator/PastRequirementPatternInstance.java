package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PastLemmas;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class PastRequirementPatternInstance implements InnerExtraInvariantFormula, InnerRequirementFormula {
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
				InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) fmParam.getFormula();
				Map<String, UpdateStateVariable> substitution = new HashMap<>();
				substitution.put(curState.getName(), finState);
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
			extraConjList.addAll(((InnerExtraInvariantFormula) fmParamValue.getFormula()).generateExtraConjuncts(fnParamList));
		return extraConjList;
	}

	@Override
	public PastRequirementPatternInstance replaceStates(Map<String, UpdateStateVariable> substitution) {
		UpdateStateVariable newFinState = finState == null? null: substitution.getOrDefault(finState.getName(), finState);
		UpdateStateVariable newCurState = curState== null? null: substitution.getOrDefault(curState.getName(), curState);
		List<FormulaParameterValue> newFmParams = new ArrayList<>();
		for (FormulaParameterValue fm: fmParams) {
			Formula formula = fm.getFormula();
			Formula newFormula = formula.replaceStates(substitution);
			newFmParams.add(new FormulaParameterValue(fm.getStates(), newFormula));
		}
		return new PastRequirementPatternInstance(pattern, cParams, newFmParams, boolParam, newFinState, newCurState);
	}

	@Override
	public PastRequirementPatternInstance applyToStates(List<UpdateStateVariable> states) {
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
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		PastLemmas lemmas = pattern.getLemmas();
		Lemma L = null;
		if (lemmas != null)
			L = lemmas.getL7();
		if (L == null)
			L = pattern.getExtraInvPattern().getLemmas().getL7();
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, 
				new ArrayList<>(), boolParam, initState, finState);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		return premiseInstance.replacePatterns(initState);		
	}

	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		Lemma L = null;
		ParameterValueMap params;
		PastRequirementPatternInstance other = (PastRequirementPatternInstance) right;

		if (this.finState.getName().equals(other.finState.getName())) {
			PastLemmas lemmas = pattern.getLemmas();
			if (lemmas != null)
				L = lemmas.getL5();
			if (L == null) {
				lemmas = pattern.getExtraInvPattern().getLemmas();
				if (lemmas != null)
					L = lemmas.getL5();
			}
			params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, 
					other.getFmParams(), boolParam, null, finState);
		}
		else {
			PastLemmas lemmas = pattern.getLemmas();
			if (lemmas != null)
				L = lemmas.getL4();
			if (L == null) {
				lemmas = pattern.getExtraInvPattern().getLemmas();
				if (lemmas != null)
					L = lemmas.getL4();
			}
			params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, 
					new ArrayList<>(), boolParam, this.finState, other.finState);
		}
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
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
			Formula formula = param.getFormula();
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

	@Override
	public LemmaPremise generateParticularLemmaPremise() {
		List<FormulaParameterValue> simplifiedFmParams = new ArrayList<>();
		for (FormulaParameterValue fmParam: fmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) fmParam.getFormula();
			InnerExtraInvariantFormula simplifiedFormula = (InnerExtraInvariantFormula) 
					formula.generateParticularLemmaPremise();
			simplifiedFmParams.add(new FormulaParameterValue(fmParam.getStates(), simplifiedFormula));
		}
		return new PastRequirementPatternInstance(pattern, cParams, simplifiedFmParams, boolParam, finState,
				curState);
	}

	@Override
	public LemmaPremiseFormula convertToEObject() {
		throw new InvalidTypeException();
	}
}
