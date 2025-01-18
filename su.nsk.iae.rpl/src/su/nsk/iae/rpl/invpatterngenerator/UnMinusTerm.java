package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class UnMinusTerm extends Term {
	private final Term term;

	public UnMinusTerm(Term term) {
		super();
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public Term substrituteCParam(Map<ConstantParameter, Term> values) {
		return new UnMinusTerm(term.substrituteCParam(values));
	}

	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		return new UnMinusTerm(term.substituteFunctionalParameter(values));
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		Term newTerm = (Term) term.replaceStates(substitution);
		return new UnMinusTerm(newTerm);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(- ").append(term).append(')')
				.toString();
	}
	
}
