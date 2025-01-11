package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Objects;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

public class ConstParameter extends Term {
	private final ConstantParameter param;

	public ConstParameter(ConstantParameter param) {
		super();
		this.param = param;
	}

	public ConstantParameter getParam() {
		return param;
	}

	@Override
	public Term substrituteCParam(ConstantParameter param, Term value) {
		if (this.param.equals(param))
			return value;
		else 
			return this;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (o.getClass() != getClass()) return false;
		ConstParameter other = (ConstParameter) o;
		return Objects.equals(param, other.param);
	}
	
	@Override
	public int hashCode() {
		return param.hashCode();
	}

	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		return this;
	}

}
