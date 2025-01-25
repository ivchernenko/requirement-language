package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanLiteral extends Term implements PatternFreeInnerFormula {
	private final boolean value;
	
	 private BooleanLiteral(boolean value) {
		 this.value = value;
	 }
	 
	 public static BooleanLiteral TRUE = new BooleanLiteral(true);
	 public static BooleanLiteral FALSE = new BooleanLiteral(false);
	 
	 public static BooleanLiteral valueOf(String value) {
		 boolean isTrue = Boolean.parseBoolean(value.toLowerCase());
		 if (isTrue) return TRUE;
		 else return FALSE;
	 }

	@Override
	public Term substrituteCParam(Map<ConstantParameter, Term> value) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		return this;
	}

	@Override
	public PatternFreeInnerFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		return this;
	}

	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		return this;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o==this) return true;
		if (o == null) return false;
		if (o.getClass() != this.getClass()) return false;
		BooleanLiteral other = (BooleanLiteral) o;
		return this.value == other.value;
	}
	
	@Override
	public int hashCode() {
		return value ? 1 : 0;
	}

	@Override
	public boolean equalsToRequirementFormula() {
		return true;
	}
	
	@Override
	public String toString() {
		return value ? "True" : "False";
	}
}
