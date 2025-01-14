package su.nsk.iae.rpl.invpatterngenerator;

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
		return new LS8BooleanLemmaPremise(operator, lpLeft, lpRight);
	}

	@Override
	public LS9LemmaPremise generateL9() {
		LS9LemmaPremise lpLeft = left.generateL9();
		LS9LemmaPremise lpRight = right.generateL9();
		return new LS9BooleanLemmaPremise(operator, lpLeft, lpRight);
	}
	
	
	

}
