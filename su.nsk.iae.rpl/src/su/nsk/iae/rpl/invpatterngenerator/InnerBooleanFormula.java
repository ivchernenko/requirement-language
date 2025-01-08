package su.nsk.iae.rpl.invpatterngenerator;

public class InnerBooleanFormula extends InnerExtraInvariantFormula {
	private final BooleanOperator operator;
	private final InnerExtraInvariantFormula left;
	private final InnerExtraInvariantFormula right;
	public InnerBooleanFormula(BooleanOperator operator, InnerExtraInvariantFormula left,
			InnerExtraInvariantFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public InnerExtraInvariantFormula getLeft() {
		return left;
	}
	public InnerExtraInvariantFormula getRight() {
		return right;
	}
	

}
