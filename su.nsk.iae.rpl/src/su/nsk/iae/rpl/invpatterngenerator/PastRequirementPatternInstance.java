package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PastLemmas;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class PastRequirementPatternInstance implements InnerExtraInvariantFormula, InnerRequirementFormula {
	private PastRequirementPattern pattern;
	private List<Term> cParams;
	private List<FormulaParameterValue> fmParams;
	private final UpdateStateVariable finState;
	private final PastExtraInvariantPatternInstance extraInv;
	
	public UpdateStateVariable getFinState() {
		return finState;
	}

	public UpdateStateVariable getCurState() {
		return curState;
	}

	private final UpdateStateVariable curState;

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
			List<FormulaParameterValue> fmParams, PastExtraInvariantPatternInstance extraInv,
			UpdateStateVariable finState, UpdateStateVariable curState) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fmParams = fmParams;
		this.finState = finState;
		this.curState = curState;
		this.extraInv = extraInv;
	}

	public PastRequirementPatternInstance(PastRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> fmParams, PastExtraInvariantPatternInstance extraInv) {
		this(pattern, cParams, fmParams, extraInv, null, null);
	}
	
	public PastRequirementPatternInstance(PastRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> fmParams) {
		this(pattern, cParams, fmParams, null);
	}

	@Override
	public List<PastExtraInvariantPatternInstance> generateExtraConjuncts() {
		List<PastExtraInvariantPatternInstance> extraConjList = new ArrayList<>();
		extraConjList.add(extraInv);
		for (var fmParamValue: fmParams)
			extraConjList.addAll(((InnerExtraInvariantFormula) fmParamValue.getFormula()).generateExtraConjuncts());
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
		return new PastRequirementPatternInstance(pattern, cParams, newFmParams, extraInv, newFinState, newCurState);
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
		return new PastRequirementPatternInstance(pattern, cParams, fmParams, extraInv, newFinState, newCurState);
	}

	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return generateLemmaPremiseInstance(initState).replacePatterns(initState);		
	}
	
	LemmaPremise generateLemmaPremiseInstance(UpdateStateVariable initState) {
		Lemma L = getL7();
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(L, cParams, extraInv.getFnParams(), new ArrayList<>(), fmParams, 
				new ArrayList<>(), initState, finState);
		return premise.substitiuteParams(instCreator, params);
	}
	
	Lemma getL7() {
		PastLemmas lemmas = pattern.getLemmas();
		Lemma L = null;
		if (lemmas != null)
			L = lemmas.getL7();
		if (L == null)
			L = pattern.getExtraInvPattern().getLemmas().getL7();
		return L;
	}

	@Override
	public LemmaPremise replacePatternsForImplication(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		LemmaPremise premiseInstance = replacePatternsForNotIdenticallyTrueImplicationStep(right, lambdaBound, state);
		return premiseInstance.replacePatterns(this.finState);
	}
	
	LemmaPremise replacePatternsForNotIdenticallyTrueImplicationStep(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		Lemma L = null;
		ParameterValueMap params;
		PastRequirementPatternInstance other = (PastRequirementPatternInstance) right;
		if (this.finState.getName().equals(other.finState.getName())) {
			L = getL5();
			params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, 
					other.getFmParams(), null, finState);
		}
		else {
			L = getL4();
			params = new ParameterValueMap(L, cParams, new ArrayList<>(), new ArrayList<>(), fmParams, 
					new ArrayList<>(), this.finState, other.finState);
		}
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		return premise.substitiuteParams(instCreator, params);
	}
	
	Lemma getLemmaForImplication(PastRequirementPatternInstance other) {
		if (this.finState.getName().equals(other.finState.getName()))
			return getL5();
		else
			return getL4();
	}
	
	Lemma getL4() {
		Lemma L = null;
		PastLemmas lemmas = pattern.getLemmas();
		if (lemmas != null)
			L = lemmas.getL4();
		if (L == null) {
			lemmas = pattern.getExtraInvPattern().getLemmas();
			if (lemmas != null)
				L = lemmas.getL4();
		}
		return L;
	}
	
	Lemma getL5() {
		Lemma L =null;
		PastLemmas lemmas = pattern.getLemmas();
		if (lemmas != null)
			L = lemmas.getL5();
		if (L == null) {
			lemmas = pattern.getExtraInvPattern().getLemmas();
			if (lemmas != null)
				L = lemmas.getL5();
		}
		return L;
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
		throw new InvalidTypeException();
	}

	@Override
	public LemmaPremiseFormula convertToEObject() {
		throw new InvalidTypeException();
	}

	public PastExtraInvariantPatternInstance getExtraInv() {
		return extraInv;
	}

	@Override
	public String generateProofScript(UpdateStateVariable initState, ProofScriptGenerator generator) {
		return generator.generateForPastRequirementPatternInstance(this, initState);
	}

	@Override
	public String generateProofScriptForNotIdenticallyTrueImplication(Formula right,
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state, ProofScriptGenerator generator) {
		return generator.generateForPastInImplication(this, (PastRequirementPatternInstance) right, lambdaBound, state);
	}
}
