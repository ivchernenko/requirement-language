package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class AlwaysImplication implements LemmaPremise {
	private final UpdateStateVariable state;
	private final InnerExtraInvariantFormula left;
	public AlwaysImplication(UpdateStateVariable state, InnerExtraInvariantFormula left) {
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
	

}
