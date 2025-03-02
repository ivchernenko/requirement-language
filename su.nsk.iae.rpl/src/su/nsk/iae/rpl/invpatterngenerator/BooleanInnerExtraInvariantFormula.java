package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanInnerExtraInvariantFormula extends BooleanLemmaPremise implements InnerExtraInvariantFormula {
	
	public BooleanInnerExtraInvariantFormula(BooleanOperator operator, InnerExtraInvariantFormula left,
			InnerExtraInvariantFormula right) {
		super(operator, left, right);
	}
	public BooleanOperator getOperator() {
		return operator;
	}
	public InnerExtraInvariantFormula getLeft() {
		return (InnerExtraInvariantFormula) left;
	}
	public InnerExtraInvariantFormula getRight() {
		return (InnerExtraInvariantFormula) right;
	}
	@Override
	public List<PastExtraInvariantPatternInstance> generateExtraConjuncts() {
		List<PastExtraInvariantPatternInstance> extraConjs = ((InnerExtraInvariantFormula) left).generateExtraConjuncts();
		extraConjs.addAll(((InnerExtraInvariantFormula) right).generateExtraConjuncts());
		return extraConjs;
	}
	@Override
	public InnerExtraInvariantFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		InnerExtraInvariantFormula rLeft = ((InnerExtraInvariantFormula) left).replaceStates(substitution);
		InnerExtraInvariantFormula rRight = ((InnerExtraInvariantFormula) right).replaceStates(substitution);
		return new BooleanInnerExtraInvariantFormula(operator, rLeft, rRight);
	}
	@Override
	public InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states) {
		InnerExtraInvariantFormula aLeft = ((InnerExtraInvariantFormula) left).applyToStates(states);
		InnerExtraInvariantFormula aRight = ((InnerExtraInvariantFormula) right).applyToStates(states);
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
		LemmaPremise transformedLeft = ((InnerExtraInvariantFormula) left).replacePatternsForImplication(otherLeft, lambdaBound, state);
		LemmaPremise transformedRight = ((InnerExtraInvariantFormula) right).replacePatternsForImplication(otherRight, lambdaBound, state);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, transformedLeft, transformedRight);
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return ((InnerExtraInvariantFormula) left).equalsToRequirementFormula() 
				&& ((InnerExtraInvariantFormula) right).equalsToRequirementFormula();
	}
	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		LemmaPremise transformedLeft = left.replacePatterns(initState);
		LemmaPremise transformedRight = right.replacePatterns(initState);
		return new BooleanLemmaPremise(operator, transformedLeft, transformedRight);
	}
	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = ((Formula) left).getUsedPatternNames();
		usedPatterns.addAll(((Formula) right).getUsedPatternNames());
		return usedPatterns;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append('(').append(left).append(' ').append(operator).append(' ').append(right).append(')')
				.toString();
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
}
