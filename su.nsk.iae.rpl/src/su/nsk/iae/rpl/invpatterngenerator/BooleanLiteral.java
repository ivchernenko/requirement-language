package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

public class BooleanLiteral extends Term implements InnerExtraInvariantFormula, FutureBoundIndependentFormula {
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
	public Term substrituteCParam(ConstantParameter param, Term value) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		return this;
	}
}
