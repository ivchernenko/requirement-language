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
	
	@Override
	public InnerExtraInvariantFormula getLeft() {
		return (InnerExtraInvariantFormula) left;
	}
	
	@Override
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
	public LemmaPremise replacePatternsForImplication(Formula other, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		if (equalsToRequirementFormula())
			return BooleanLiteral.TRUE;
		BooleanLemmaPremise premise = (BooleanLemmaPremise) split(other, lambdaBound, state);
		premise = (BooleanLemmaPremise) premise.replacePatterns(state);
		return premise;
	}

	LemmaPremise split(Formula other, 
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
		LemmaPremise transformedLeft;
		LemmaPremise transformedRight;
		transformedLeft = createAlwaysImplication(
				(InnerExtraInvariantFormula) left, otherLeft, lambdaBound, state);
		transformedRight = createAlwaysImplication(
				(InnerExtraInvariantFormula) right, otherRight, lambdaBound, state);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, transformedLeft, transformedRight);
	}

	GeneralizedAlwaysImplication createAlwaysImplication(
			InnerExtraInvariantFormula left, Formula right, List<UpdateStateVariable> lambdaBound, 
			UpdateStateVariable state) {
		return new GeneralizedAlwaysImplication(
				state, new FormulaParameterValue(lambdaBound, left), new FormulaParameterValue(lambdaBound, right));

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
	public String generateProofScriptForNotIdenticallyTrueImplication(
			Formula right, List<UpdateStateVariable> lambdaBound, UpdateStateVariable state,
			ProofScriptGenerator generator) {
		return generator.generateForBooleanCombinationInImplication(this, right, lambdaBound, state);
	}

	@Override
	public boolean equalsToRequirementFormula() {
		return getLeft().equalsToRequirementFormula() && getRight().equalsToRequirementFormula();
	}
}
