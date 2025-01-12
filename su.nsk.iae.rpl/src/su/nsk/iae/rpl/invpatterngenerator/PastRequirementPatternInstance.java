package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.Term;
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

	@Override
	public List<OuterExtraInvariantFormula> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		List<OuterExtraInvariantFormula> extraConjList = new ArrayList<>();
		PastExtraInvariantPatternInstance pastEinv = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
				pattern.getExtraInvPattern(),
				cParams, fmParams, boolParam, fnParamList);
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
	
	
}
