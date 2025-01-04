package su.nsk.iae.rpl.invpatterngenerator;

public class Implication extends Formula {
	FunctionApplication left;
	Formula right;
	public Implication(FunctionApplication left, Formula right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionApplication getLeft() {
		return left;
	}
	public Formula getRight() {
		return right;
	}
	
	
}
