package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

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
	public Term substrituteCParam(ConstantParameter param, Term value) {
		return new NegationTerm(term.substrituteCParam(param, value));
	}

	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		return new NegationTerm(term.substituteFunctionalParameter(param, value));
	}
	
}
