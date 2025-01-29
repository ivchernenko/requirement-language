package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanInnerExtraInvariantFormula implements InnerExtraInvariantFormula {
	private final BooleanOperator operator;
	private final InnerExtraInvariantFormula left;
	private final InnerExtraInvariantFormula right;
	public BooleanInnerExtraInvariantFormula(BooleanOperator operator, InnerExtraInvariantFormula left,
			InnerExtraInvariantFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public InnerExtraInvariantFormula getLeft() {
		return left;
	}
	public InnerExtraInvariantFormula getRight() {
		return right;
	}
	@Override
	public List<Implication> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		List<Implication> extraConjs = left.generateExtraConjuncts(fnParamList);
		extraConjs.addAll(right.generateExtraConjuncts(fnParamList));
		return extraConjs;
	}
	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		InnerExtraInvariantFormula rLeft = left.replaceStates(substitution);
		InnerExtraInvariantFormula rRight = right.replaceStates(substitution);
		return new BooleanInnerExtraInvariantFormula(operator, rLeft, rRight);
	}
	@Override
	public InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states) {
		InnerExtraInvariantFormula aLeft = left.applyToStates(states);
		InnerExtraInvariantFormula aRight = right.applyToStates(states);
		return new BooleanInnerExtraInvariantFormula(operator, aLeft, aRight);
	}
	
	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula other, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		Formula otherLeft;
		Formula otherRight;
		if (other instanceof BooleanInnerExtraInvariantFormula bOther) {
			otherLeft = bOther.getLeft();
			otherRight = bOther.getRight();
		}
		else {
			BooleanInnerRequirementFormula bOther = (BooleanInnerRequirementFormula) other;
			otherLeft = bOther.getLeft();
			otherRight = bOther.getRight();
		}
		LemmaPremise transformedLeft = left.replacePatternsForImplication(otherLeft, lambdaBound, state);
		LemmaPremise transformedRight = right.replacePatternsForImplication(otherRight, lambdaBound, state);
		return new BooleanLemmaPremise(operator, transformedLeft, transformedRight);
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return left.equalsToRequirementFormula() && right.equalsToRequirementFormula();
	}
	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		LemmaPremise transformedLeft = left.replacePatterns(initState);
		LemmaPremise transformedRight = right.replacePatterns(initState);
		return new BooleanLemmaPremise(operator, transformedLeft, transformedRight);
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
		return stringBuilder.append('(').append(left).append(' ').append(operator).append(' ').append(right).append(')')
				.toString();
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
