package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

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
	public Term substrituteCParam(Map<ConstantParameter, Term> values) {
		return new CompoundTerm(operator, left.substrituteCParam(values), right.substrituteCParam(values));
	}
	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		return new CompoundTerm(
				operator,
				left.substituteFunctionalParameter(values),
				right.substituteFunctionalParameter(values));
	}
	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		Term newLeft = (Term) left.replaceStates(substitution);
		Term newRight = (Term) right.replaceStates(substitution);
		return new CompoundTerm(operator, newLeft, newRight);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append('(').append(left).append(' ').append(operator).append(' ').append(right).append(')')
				.toString();
	}
}
