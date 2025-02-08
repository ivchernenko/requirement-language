package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanInnerRequirementFormula implements InnerRequirementFormula {
	private final BooleanOperator operator;
	private final InnerRequirementFormula left;
	private final InnerRequirementFormula right;
	public BooleanInnerRequirementFormula(BooleanOperator operator, InnerRequirementFormula left,
			InnerRequirementFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public InnerRequirementFormula getLeft() {
		return left;
	}
	public InnerRequirementFormula getRight() {
		return right;
	}
	@Override
	public InnerRequirementFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		InnerRequirementFormula transformedLeft = left.replaceStates(substitution);
		InnerRequirementFormula transformedRight = right.replaceStates(substitution);
		return new BooleanInnerRequirementFormula(operator, transformedLeft, transformedRight);
	}
	@Override
	public InnerRequirementFormula applyToStates(List<UpdateStateVariable> states) {
		InnerRequirementFormula transformedLeft = left.applyToStates(states);
		InnerRequirementFormula transformedRight = right.applyToStates(states);
		return new BooleanInnerRequirementFormula(operator, transformedLeft, transformedRight);
	}
	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = left.getUsedPatternNames();
		usedPatterns.addAll(right.getUsedPatternNames());
		return usedPatterns;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(left).append(' ').append(operator).append(' ').append(right)
		.append(')');
		return stringBuilder.toString();
	}

}
