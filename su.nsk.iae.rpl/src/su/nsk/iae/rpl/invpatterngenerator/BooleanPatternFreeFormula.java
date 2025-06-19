package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanPatternFreeFormula extends BooleanInnerExtraInvariantFormula implements PatternFreeInnerFormula {
	public BooleanPatternFreeFormula(BooleanOperator operator, PatternFreeInnerFormula left,
			PatternFreeInnerFormula right) {
		super(operator, left, right);
	}
	public PatternFreeInnerFormula getLeft() {
		return (PatternFreeInnerFormula) left;
	}
	public PatternFreeInnerFormula getRight() {
		return (PatternFreeInnerFormula) right;
	}
	@Override
	public LemmaPremise replacePatternsForImplication(Formula right,
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		return BooleanLiteral.TRUE;
	}
	
	@Override
	public PatternFreeInnerFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		PatternFreeInnerFormula transformedLeft = ((PatternFreeInnerFormula) left).replaceStates(substitution);
		PatternFreeInnerFormula transformedRight = ((PatternFreeInnerFormula) right).replaceStates(substitution);
		return new BooleanPatternFreeFormula(operator, transformedLeft, transformedRight);
	}
	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		PatternFreeInnerFormula transformedLeft = ((PatternFreeInnerFormula) left).applyToStates(states);
		PatternFreeInnerFormula transformedRight = ((PatternFreeInnerFormula) right).applyToStates(states);
		return new BooleanPatternFreeFormula(operator, transformedLeft, transformedRight);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(left).append(' ').append(operator).append(right).append(')');
		return stringBuilder.toString();
	}
	
	@Override
	public PatternFreeInnerFormula negate() {
		PatternFreeInnerFormula negatedLeft  = ((PatternFreeInnerFormula) left).negate();
		PatternFreeInnerFormula negatedRight = ((PatternFreeInnerFormula) right).negate();
		BooleanOperator operator = null;
		switch (this.operator) {
		case CONJUNCTION:
			operator = BooleanOperator.DISJUNCTION; break;
		case DISJUNCTION:
			operator = BooleanOperator.CONJUNCTION; break;
		default:
			break;
		}
		return new BooleanPatternFreeFormula(operator, negatedLeft, negatedRight);
	}
	
	@Override
	public String generateProofScriptForNegation(UpdateStateVariable initState, ProofScriptGenerator generator) {
		return generator.generateForNegatedBooleanFormula(initState, this);
	}
}
