package su.nsk.iae.rpl.invpatterngenerator;

public class LS8BooleanLemmaPremise implements LS8LemmaPremise {
	private final BooleanOperator operator;
	private final LS8LemmaPremise  left;
	private final LS8LemmaPremise right;
	public LS8BooleanLemmaPremise(BooleanOperator operator, LS8LemmaPremise left, LS8LemmaPremise right) {
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
