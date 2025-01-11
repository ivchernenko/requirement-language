package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

public class CompoundTerm extends Term {
	private final Operator operator;
	private final Term left;
	private final Term right;
	public CompoundTerm(Operator operator, Term left, Term right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public Operator getOperator() {
		return operator;
	}
	public Term getLeft() {
		return left;
	}
	public Term getRight() {
		return right;
	}
	@Override
	public Term substrituteCParam(ConstantParameter param, Term value) {
		return new CompoundTerm(operator, left.substrituteCParam(param, value), right.substrituteCParam(param, value));
	}
	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		return new CompoundTerm(
				operator,
				left.substituteFunctionalParameter(param, value),
				right.substituteFunctionalParameter(param, value));
	}
	

}
