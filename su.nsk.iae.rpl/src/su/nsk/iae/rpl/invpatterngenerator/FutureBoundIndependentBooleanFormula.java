package su.nsk.iae.rpl.invpatterngenerator;

public class FutureBoundIndependentBooleanFormula extends 
FutureBoundIndependentFormula {
	private final BooleanOperator operator;
	private final FutureBoundIndependentFormula left;
	private final FutureBoundIndependentFormula right;
	public FutureBoundIndependentBooleanFormula(BooleanOperator operator, FutureBoundIndependentFormula left,
			FutureBoundIndependentFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public FutureBoundIndependentFormula getLeft() {
		return left;
	}
	public FutureBoundIndependentFormula getRight() {
		return right;
	}

}
