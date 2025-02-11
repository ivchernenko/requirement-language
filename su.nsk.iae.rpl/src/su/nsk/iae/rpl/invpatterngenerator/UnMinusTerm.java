package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UnaryTerm;
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
	public Term substrituteCParam(Map<String, Term> values) {
		return new UnMinusTerm(term.substrituteCParam(values));
	}

	@Override
	public Term substituteFunctionalParameter(Map<String, FunctionalParameter> values) {
		return new UnMinusTerm(term.substituteFunctionalParameter(values));
	}

	@Override
	public PatternFreeInnerFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		Term newTerm = (Term) term.replaceStates(substitution);
		return new UnMinusTerm(newTerm);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(- ").append(term).append(')')
				.toString();
	}

	@Override
	su.nsk.iae.rpl.rPL.Term convertToRPLTerm() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		UnaryTerm term = factory.createUnaryTerm();
		su.nsk.iae.rpl.rPL.Term right = this.term.convertToRPLTerm();
		term.setRight(right);
		return term;
	}
}
