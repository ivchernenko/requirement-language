package su.nsk.iae.rpl.invpatterngenerator;

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
}
