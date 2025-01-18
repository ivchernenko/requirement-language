package su.nsk.iae.rpl.invpatterngenerator;

public class BooleanLemmaPremise implements LemmaPremise {
	private final BooleanOperator operator;
	private final LemmaPremise  left;
	private final LemmaPremise right;
	public BooleanLemmaPremise(BooleanOperator operator, LemmaPremise left, LemmaPremise right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public LemmaPremise getLeft() {
		return left;
	}
	public LemmaPremise getRight() {
		return right;
	}
	@Override
	public LemmaPremise replacePatterns(DerivedLemmaScheme LS) {
		LemmaPremise transformedLeft = left.replacePatterns(LS);
		LemmaPremise transformedRight = right.replacePatterns(LS);
		return new BooleanLemmaPremise(operator, transformedLeft, transformedRight);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append('(').append(left).append(' ').append(operator).append(' ').append(right).append(')')
				.toString();
	}
	
}
