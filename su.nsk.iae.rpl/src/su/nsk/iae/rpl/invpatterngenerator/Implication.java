package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.FunctionalParameter;

public class Implication extends OuterExtraInvariantFormula {
	FunctionalParameter left;
	OuterExtraInvariantFormula right;
	public Implication(FunctionalParameter left, OuterExtraInvariantFormula right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionalParameter getLeft() {
		return left;
	}
	public OuterExtraInvariantFormula getRight() {
		return right;
	}
	
	
}
