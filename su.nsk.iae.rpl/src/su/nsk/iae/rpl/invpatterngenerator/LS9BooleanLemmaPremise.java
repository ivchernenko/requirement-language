package su.nsk.iae.rpl.invpatterngenerator;

public class LS9BooleanLemmaPremise implements LS9LemmaPremise {
	private final BooleanOperator operator;
	private final LS9LemmaPremise  left;
	private final LS9LemmaPremise right;
	public LS9BooleanLemmaPremise(BooleanOperator operator, LS9LemmaPremise left, LS9LemmaPremise right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public LS9LemmaPremise getLeft() {
		return left;
	}
	public LS9LemmaPremise getRight() {
		return right;
	}
	@Override
	public LS9LemmaPremise replacePatterns() {
		LS9LemmaPremise transformedLeft = left.replacePatterns();
		LS9LemmaPremise transformedRight = right.replacePatterns();
		return new LS9BooleanLemmaPremise(operator, transformedLeft, transformedRight);
	}

}
