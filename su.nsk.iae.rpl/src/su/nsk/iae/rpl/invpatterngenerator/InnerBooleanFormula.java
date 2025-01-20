package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class InnerBooleanFormula implements InnerExtraInvariantFormula {
	private final BooleanOperator operator;
	private final InnerExtraInvariantFormula left;
	private final InnerExtraInvariantFormula right;
	public InnerBooleanFormula(BooleanOperator operator, InnerExtraInvariantFormula left,
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
		return new InnerBooleanFormula(operator, rLeft, rRight);
	}
	@Override
	public InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states) {
		InnerExtraInvariantFormula aLeft = left.applyToStates(states);
		InnerExtraInvariantFormula aRight = right.applyToStates(states);
		return new InnerBooleanFormula(operator, aLeft, aRight);
	}
	
	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(DerivedLemmaScheme LS, List<UpdateStateVariable> lambdaBound) {
		LemmaPremise transformedLeft = left.replacePatternsForImplication(LS, lambdaBound);
		LemmaPremise transformedRight = right.replacePatternsForImplication(LS, lambdaBound);
		return new BooleanLemmaPremise(operator, transformedLeft, transformedRight);
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return left.equalsToRequirementFormula() && right.equalsToRequirementFormula();
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

}
