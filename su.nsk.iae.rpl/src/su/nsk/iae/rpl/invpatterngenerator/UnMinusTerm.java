package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

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
	public Term substrituteCParam(ConstantParameter param, Term value) {
		return new UnMinusTerm(term.substrituteCParam(param, value));
	}

	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		return new UnMinus(term.substituteFunctionalParameter(param, value));
	}
	
}
