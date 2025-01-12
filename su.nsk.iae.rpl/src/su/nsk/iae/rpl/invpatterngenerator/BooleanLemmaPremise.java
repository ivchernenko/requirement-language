package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanLemmaPremise implements LemmaPremise {
	private final BooleanOperator operator;
	private final LemmaPremise  left;
	private final LemmaPremise right;
	public BooleanLemmaPremise(BooleanOperator operator, LemmaPremise left, LemmaPremise right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public LS8LemmaPremise getLeft() {
		return left;
	}
	public LS8LemmaPremise getRight() {
		return right;
	}
	
}
