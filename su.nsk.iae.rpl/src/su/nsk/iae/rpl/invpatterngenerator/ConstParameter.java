package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;
import java.util.Objects;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PrimaryTerm;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

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
	public Term substrituteCParam(Map<String, Term> values) {
		for (var paramValuePair: values.entrySet()) {
			if (param.getName().equals(paramValuePair.getKey()))
				return paramValuePair.getValue();
		}
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
	public Term substituteFunctionalParameter(Map<String, FunctionalParameter> values) {
		return this;
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		return this;
	}
	
	@Override
	public String toString() {
		return param.getName();
	}

	@Override
	su.nsk.iae.rpl.rPL.Term convertToRPLTerm() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		PrimaryTerm term = factory.createPrimaryTerm();
		term.setVariable(param);
		return term;
	}

}
