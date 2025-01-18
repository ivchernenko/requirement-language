package su.nsk.iae.rpl.invpatterngenerator;

public enum Operator {
	PLUS("+"), MINUS("-"), MUL("*"), DIV("div"), MOD("mod"), POW("^"),  LESS("<"), GREATER(">"), LEQ("<="), GEQ(">="), 
	AND("\\<and>"), OR("\\<or>"), EQ("="), NEQ("\\<noteq>");
	
	private String stringRep;
	
	Operator(String stringRep) {
		this.stringRep = stringRep;
	}
	
	@Override
	public String toString() {
		return stringRep;
	}
}
