package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public class InnerBooleanFormula implements InnerExtraInvariantFormula {
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
	@Override
	public List<OuterExtraInvariantFormula> generateExtraConjuncts() {
		List<OuterExtraInvariantFormula> extraConjs = left.generateExtraConjuncts();
		extraConjs.addAll(right.generateExtraConjuncts());
		return extraConjs;
	}
	

}
