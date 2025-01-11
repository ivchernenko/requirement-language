package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

public class NumericConstant extends Term {
	private final Number number;

	public NumericConstant(Number number) {
		super();
		this.number = number;
	}

	public Number getNumber() {
		return number;
	}

	@Override
	public Term substrituteCParam(ConstantParameter param, Term value) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		return this;
	}
}
