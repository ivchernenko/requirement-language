package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.Term;
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
	public List<OuterExtraInvariantFormula> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		List<OuterExtraInvariantFormula> extraConjs = new ArrayList<>();
		for (FormulaParameterValue fmParamValue: fmParams)
			extraConjs.addAll(fmParamValue.getFormula().generateExtraConjuncts(fnParamList));
		return extraConjs;
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
	public LS8LemmaPremise replacePatterns() {
		Lemma L = pattern.getLemmas().getL2();
		LemmaPremiseFormula premise = L.getPrem();
		LS8LemmaPremiseInstanceCreator instCreator = new LS8LemmaPremiseInstanceCreator();
		
	}
	
	
}
