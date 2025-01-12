package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

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
	public Term substrituteCParam(Map<ConstantParameter, Term> values) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		return this;
	}

	
}
