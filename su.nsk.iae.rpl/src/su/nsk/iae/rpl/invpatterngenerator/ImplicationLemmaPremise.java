package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ImplicationLemmaPremise implements LemmaPremise {
	private final FunctionApplication left;
	private final LemmaPremise right;
	public ImplicationLemmaPremise(FunctionApplication left, LemmaPremise right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionApplication getLeft() {
		return left;
	}
	public LemmaPremise getRight() {
		return right;
	}
	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return new ImplicationLemmaPremise(left, right.replacePatterns(initState));
	}
	
}
