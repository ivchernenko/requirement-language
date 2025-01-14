package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.FunctionalParameter;

public class Implication extends OuterExtraInvariantFormula {
	FunctionalParameter left;
	PastExtraInvariantPatternInstance right;
	public Implication(FunctionalParameter left, PastExtraInvariantPatternInstance right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionalParameter getLeft() {
		return left;
	}
	public PastExtraInvariantPatternInstance getRight() {
		return right;
	}
	
	
}
