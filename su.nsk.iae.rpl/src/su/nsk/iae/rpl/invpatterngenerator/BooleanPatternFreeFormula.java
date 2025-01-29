package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanPatternFreeFormula implements PatternFreeInnerFormula {
	private final BooleanOperator operator;
	private final PatternFreeInnerFormula left;
	private final PatternFreeInnerFormula right;
	public BooleanPatternFreeFormula(BooleanOperator operator, PatternFreeInnerFormula left,
			PatternFreeInnerFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public PatternFreeInnerFormula getLeft() {
		return left;
	}
	public PatternFreeInnerFormula getRight() {
		return right;
	}
	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula right,
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		return BooleanLiteral.TRUE;
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return true;
	}
	@Override
	public List<String> getUsedPatternNames() {
		return new ArrayList<>();
	}
	@Override
	public PatternFreeInnerFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		PatternFreeInnerFormula transformedLeft = left.replaceStates(substitution);
		PatternFreeInnerFormula transformedRight = right.replaceStates(substitution);
		return new BooleanPatternFreeFormula(operator, transformedLeft, transformedRight);
	}
	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		PatternFreeInnerFormula transformedLeft = left.applyToStates(states);
		PatternFreeInnerFormula transformedRight = right.applyToStates(states);
		return new BooleanPatternFreeFormula(operator, transformedLeft, transformedRight);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(left).append(' ').append(operator).append(right).append(')');
		return stringBuilder.toString();
	}
	
	@Override
	public LemmaPremise generateParticularLemmaPremise(
			Map<RegularFormulaParameter, RegularFormulaParameter> paramMapping) {
		LemmaPremise simplifiedLeft = left.generateParticularLemmaPremise(paramMapping);
		LemmaPremise simplifiedRight = right.generateParticularLemmaPremise(paramMapping);
		if (simplifiedLeft.equals(BooleanLiteral.TRUE) || simplifiedLeft instanceof GeneralizedAlwaysImplication)
			if (operator == BooleanOperator.CONJUNCTION)
				return simplifiedRight;
			else return BooleanLiteral.TRUE;
		if (simplifiedRight.equals(BooleanLiteral.TRUE) || simplifiedRight instanceof GeneralizedAlwaysImplication)
			if (operator == BooleanOperator.CONJUNCTION)
				return simplifiedLeft;
			else return BooleanLiteral.TRUE;
		return new BooleanLemmaPremise(operator, simplifiedLeft, simplifiedRight);
	}
}
