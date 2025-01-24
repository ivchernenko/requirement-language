package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanOuterRequirementFormula implements OuterRequirementFormula {
	private final BooleanOperator operator;
	private final OuterRequirementFormula left;
	private final OuterRequirementFormula right;
	public BooleanOuterRequirementFormula(BooleanOperator operator, OuterRequirementFormula left,
			OuterRequirementFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public OuterRequirementFormula getLeft() {
		return left;
	}
	public OuterRequirementFormula getRight() {
		return right;
	}
	@Override
	public String convertToString(UpdateStateVariable state) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(left.convertToString(state)).append(' ').append(operator)
		.append(right.convertToString(state)).append(')');
		return stringBuilder.toString();
	}
	
	
}
