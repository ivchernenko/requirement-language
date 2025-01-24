package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FutureRequirementPattern;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FutureRequirementPatternInstance implements InnerRequirementFormula {
	private final FutureRequirementPattern pattern;
	private final List<Term> cParams;
	private final List<FormulaParameterValue> fmParams;
	private final UpdateStateVariable finState;
	private final UpdateStateVariable curState;
	public FutureRequirementPatternInstance(FutureRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> fmParams, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fmParams = fmParams;
		this.finState = finState;
		this.curState = curState;
	}
	public FutureRequirementPattern getPattern() {
		return pattern;
	}
	public List<Term> getcParams() {
		return cParams;
	}
	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}
	public UpdateStateVariable getFinState() {
		return finState;
	}
	public UpdateStateVariable getCurState() {
		return curState;
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
	public InnerRequirementFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		UpdateStateVariable newFinState = substitution.getOrDefault(finState, finState);
		UpdateStateVariable newCurState = substitution.getOrDefault(curState, curState);
		List<FormulaParameterValue> newFmParams = new ArrayList<>();
		for (FormulaParameterValue fm: fmParams) {
			Formula formula = fm.getFormula();
			Formula newFormula = formula.replaceStates(substitution);
			newFmParams.add(new FormulaParameterValue(fm.getStates(), newFormula));
		}
		return new FutureRequirementPatternInstance(pattern, cParams, newFmParams, newFinState, newCurState);
	
	}
	@Override
	public InnerRequirementFormula applyToStates(List<UpdateStateVariable> states) {
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
		return new FutureRequirementPatternInstance(pattern, cParams, fmParams, newFinState, newCurState);
	
	}
}
