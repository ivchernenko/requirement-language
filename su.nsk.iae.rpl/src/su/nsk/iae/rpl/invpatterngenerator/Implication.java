package su.nsk.iae.rpl.invpatterngenerator;

public class Implication extends OuterExtraInvariantFormula {
	FunctionApplication left;
	OuterExtraInvariantFormula right;
	public Implication(FunctionApplication left, OuterExtraInvariantFormula right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionApplication getLeft() {
		return left;
	}
	public OuterExtraInvariantFormula getRight() {
		return right;
	}
	
	
}
