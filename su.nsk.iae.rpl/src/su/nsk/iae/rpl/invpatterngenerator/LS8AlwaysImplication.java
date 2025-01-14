package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS8AlwaysImplication implements LS8LemmaPremise {
	private final UpdateStateVariable state;
	private final InnerExtraInvariantFormula left;
	public LS8AlwaysImplication(UpdateStateVariable state, InnerExtraInvariantFormula left) {
		super();
		this.state = state;
		this.left = left;
	}
	public UpdateStateVariable getState() {
		return state;
	}
	public InnerExtraInvariantFormula getLeft() {
		return left;
	}
	@Override
	public LS8LemmaPremise replacePatterns() {
		return left.replacePatternsForImplicationL8();
	}
	

}
