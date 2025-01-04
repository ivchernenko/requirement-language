package su.nsk.iae.rpl.invpatterngenerator;

public class BooleanFormula extends Formula {
	private BooleanOperator operator;
	private Formula left;
	private Formula right;
	
	public BooleanFormula(BooleanOperator operator, Formula left, Formula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	
	public Formula getLeft() {
		return left;
	}
	
	public Formula getRight() {
		return right;
	}
	
	public BooleanOperator getOperator() {
		return operator;
	}
	
	
	

}
