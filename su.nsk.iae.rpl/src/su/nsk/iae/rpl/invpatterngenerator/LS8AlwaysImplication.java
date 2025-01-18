package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS8AlwaysImplication implements LemmaPremise {
	private final UpdateStateVariable state;
	private final InnerExtraInvariantFormula left;
	private final InnerExtraInvariantFormula right;
	public LS8AlwaysImplication(UpdateStateVariable state, InnerExtraInvariantFormula left, InnerExtraInvariantFormula right) {
		super();
		this.state = state;
		this.left = left;
		this.right = right;
	}
	public UpdateStateVariable getState() {
		return state;
	}
	public InnerExtraInvariantFormula getLeft() {
		return left;
	}
	@Override
	public LemmaPremise replacePatterns(DerivedLemmaScheme LS) {
		return left.replacePatternsForImplication(LS);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(always_imp ").append(state).append(' ').append(left).append(' ').append(right).append(')')
				.toString();
	}
}
