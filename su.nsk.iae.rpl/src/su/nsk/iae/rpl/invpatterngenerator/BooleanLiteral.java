package su.nsk.iae.rpl.invpatterngenerator;

public class BooleanLiteral implements InnerExtraInvariantFormula, FutureBoundIndependentFormula {
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
}
