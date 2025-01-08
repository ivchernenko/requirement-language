package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public class BooleanFormula extends OuterExtraInvariantFormula  {
	private BooleanOperator operator;
	private OuterExtraInvariantFormula left;
	private OuterExtraInvariantFormula right;
	
	public BooleanFormula(BooleanOperator operator, OuterExtraInvariantFormula left, OuterExtraInvariantFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	
	public OuterExtraInvariantFormula getLeft() {
		return left;
	}
	
	public OuterExtraInvariantFormula getRight() {
		return right;
	}
	
	public BooleanOperator getOperator() {
		return operator;
	}
	
	
	

}
