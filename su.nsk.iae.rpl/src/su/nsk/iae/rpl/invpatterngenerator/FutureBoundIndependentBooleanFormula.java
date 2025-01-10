package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

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
	@Override
	Formula lambdaAbstract(UpdateStateVariable variable, boolean finalState) {
		if (finalState) {
			InnerExtraInvariantFormula aLeft = (InnerExtraInvariantFormula) left.lambdaAbstract(variable, finalState);
			InnerExtraInvariantFormula aRight = (InnerExtraInvariantFormula) right.lambdaAbstract(variable, finalState);
			return new InnerBooleanFormula(operator, aLeft, aRight);
		}
		else return new StateLambdaAbstraction(this, List.of(variable));
	}

}
