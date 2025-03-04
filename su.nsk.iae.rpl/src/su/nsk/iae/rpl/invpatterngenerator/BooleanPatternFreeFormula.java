package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
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
	public LemmaPremise generateParticularLemmaPremise() {
		LemmaPremise simplifiedLeft = left.generateParticularLemmaPremise();
		LemmaPremise simplifiedRight = right.generateParticularLemmaPremise();
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
	
	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		LemmaPremiseFormula eLeft = left.convertToEObject();
		LemmaPremiseFormula eRight = right.convertToEObject();
		DisjunctionLemmaPremiseFormula premise = null;
		switch (operator) {
		case DISJUNCTION: premise = factory.createDisjunctionLemmaPremiseFormula(); break;
		case CONJUNCTION: premise = factory.createConjunctionLemmaPremiseFormula(); break;
		}
		premise.setLeft(eLeft);
		premise.setRight(eRight);
		return premise;
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
