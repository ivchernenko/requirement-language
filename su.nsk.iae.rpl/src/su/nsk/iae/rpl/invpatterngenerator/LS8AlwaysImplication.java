package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS8AlwaysImplication implements LemmaPremise {
	private final UpdateStateVariable state;
	private final FormulaParameterValue left;
	private final FormulaParameterValue right;
	public LS8AlwaysImplication(UpdateStateVariable state, FormulaParameterValue left, FormulaParameterValue right) {
		super();
		this.state = state;
		this.left = left;
		this.right = right;
	}
	public UpdateStateVariable getState() {
		return state;
	}
	public FormulaParameterValue getLeft() {
		return left;
	}
	@Override
	public LemmaPremise replacePatterns(DerivedLemmaScheme LS) {
		return left.getFormula().replacePatternsForImplication(LS, left.getStates());
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(always_imp ").append(state).append(' ').append(left).append(' ').append(right).append(')')
				.toString();
	}
}
