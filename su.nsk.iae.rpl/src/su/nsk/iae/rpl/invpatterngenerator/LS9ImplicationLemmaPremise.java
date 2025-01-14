package su.nsk.iae.rpl.invpatterngenerator;

public class LS9ImplicationLemmaPremise implements LS9LemmaPremise {
	private final FunctionApplication left;
	private final LS9LemmaPremise right;
	public LS9ImplicationLemmaPremise(FunctionApplication left, LS9LemmaPremise right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionApplication getLeft() {
		return left;
	}
	public LS9LemmaPremise getRight() {
		return right;
	}
}
