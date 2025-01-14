package su.nsk.iae.rpl.invpatterngenerator;

public class LS8ImplicationLemmaPremise implements LS8LemmaPremise {
	private final FunctionApplication left;
	private final LS8LemmaPremise right;
	public LS8ImplicationLemmaPremise(FunctionApplication left, LS8LemmaPremise right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionApplication getLeft() {
		return left;
	}
	public LS8LemmaPremise getRight() {
		return right;
	}
}
