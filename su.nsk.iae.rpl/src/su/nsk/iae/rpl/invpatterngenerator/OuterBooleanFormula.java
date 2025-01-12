package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public class OuterBooleanFormula extends OuterExtraInvariantFormula  {
	private BooleanOperator operator;
	private OuterExtraInvariantFormula left;
	private OuterExtraInvariantFormula right;
	
	public OuterBooleanFormula(BooleanOperator operator, OuterExtraInvariantFormula left, OuterExtraInvariantFormula right) {
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

	@Override
	public LS8LemmaPremise generateL8() {
		LS8LemmaPremise lpLeft = left.generateL8();
		LS8LemmaPremise lpRight = right.generateL8();
		return new BooleanLS8LemmaPremise(operator, lpLeft, lpRight);
	}
	
	
	

}
