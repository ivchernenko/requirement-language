package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class NegationTerm extends Term {
	private final Term term;

	public NegationTerm(Term term) {
		super();
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public Term substrituteCParam(Map<ConstantParameter, Term> values) {
		return new NegationTerm(term.substrituteCParam(values));
	}

	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		return new NegationTerm(term.substituteFunctionalParameter(values));
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		Term newTerm = (Term) term.replaceStates(substitution);
		return new NegationTerm(newTerm);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(\\<not> ").append(term).append(')')
				.toString();
	}
	
}
