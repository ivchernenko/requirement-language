package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class NonTemporalBooleanFormula extends NonTemporalFormula {
	private final BooleanOperator operator;
	private final NonTemporalFormula  left;
	private final NonTemporalFormula right;
	public NonTemporalBooleanFormula(BooleanOperator operator, NonTemporalFormula left, NonTemporalFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public NonTemporalFormula getLeft() {
		return left;
	}
	public NonTemporalFormula getRight() {
		return right;
	}
	@Override
	Formula lambdaAbstract(UpdateStateVariable variable, boolean finalState) {
		FutureBoundIndependentFormula aLeft = (FutureBoundIndependentFormula) 
				left.lambdaAbstract(variable, finalState);
		FutureBoundIndependentFormula aRight = (FutureBoundIndependentFormula) right.lambdaAbstract(variable, finalState);
		return new FutureBoundIndependentBooleanFormula(operator, aLeft, aRight);
	}
	
}
