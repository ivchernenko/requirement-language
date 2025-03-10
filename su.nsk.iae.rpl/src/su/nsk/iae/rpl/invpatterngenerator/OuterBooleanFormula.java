package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class OuterBooleanFormula implements OuterExtraInvariantFormula  {
	private BooleanOperator operator;
	private OuterExtraInvariantFormula left;
	private OuterExtraInvariantFormula right;
	
	public OuterBooleanFormula(BooleanOperator operator, OuterExtraInvariantFormula left, OuterExtraInvariantFormula right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	
	public OuterExtraInvariantFormula getLeft() {
		return left;
	}
	
	public OuterExtraInvariantFormula getRight() {
		return right;
	}
	
	public BooleanOperator getOperator() {
		return operator;
	}

	@Override
	public LemmaPremise generateL8(UpdateStateVariable initState, UpdateStateVariable finalState) {
		LemmaPremise lpLeft = left.generateL8(initState, finalState);
		LemmaPremise lpRight = right.generateL8(initState, finalState);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, lpLeft, lpRight);
	}

	@Override
	public LemmaPremise generateL9(OuterRequirementFormula reqFormula, UpdateStateVariable state) {
		BooleanOuterRequirementFormula other = (BooleanOuterRequirementFormula) reqFormula;
		OuterRequirementFormula otherLeft = other.getLeft();
		OuterRequirementFormula otherRight = other.getRight();
		LemmaPremise lpLeft = left.generateL9(otherLeft, state);
		LemmaPremise lpRight = right.generateL9(otherRight, state);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, lpLeft, lpRight);
	}

	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = left.getUsedPatternNames();
		usedPatterns.addAll(right.getUsedPatternNames());
		return usedPatterns;		
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("(");
		String operatorRep = null;
		switch (operator) {
		case DISJUNCTION: operatorRep = "\\<or>"; break;
		case CONJUNCTION: operatorRep = "\\<and>"; break;
		}
		return stringBuilder
		.append(left.toString())
		.append(" " + operatorRep + " ")
		.append(right.toString())
		.append(")")
		.toString();
	}

	@Override
	public String convertToString(UpdateStateVariable finalState) {
		StringBuilder stringBuilder = new StringBuilder("(");
		String operatorRep = null;
		switch (operator) {
		case DISJUNCTION: operatorRep = "\\<or>"; break;
		case CONJUNCTION: operatorRep = "\\<and>"; break;
		}
		return stringBuilder
		.append(left.convertToString(finalState))
		.append(" " + operatorRep + " ")
		.append(right.convertToString(finalState))
		.append(")")
		.toString();
	}

	@Override
	public String generateProofScriptForL8(UpdateStateVariable initState, UpdateStateVariable finalState,
			ProofScriptGenerator generator) {
		switch (operator) {
		case CONJUNCTION:
			return generator.generateForOuterConjunction(left, right, initState, finalState);
		case DISJUNCTION:
			return generator.generateForOuterDisjunction(left, right, initState, finalState);
			default: return "";
		}
	}

	@Override
	public String generateProofScriptForL9(OuterRequirementFormula reqFormula, UpdateStateVariable state,
			ProofScriptGenerator generator) {
		BooleanOuterRequirementFormula other = (BooleanOuterRequirementFormula) reqFormula;
		switch (operator) {
		case CONJUNCTION:
			return generator.generateForOuterConjunction(left, right, other.getLeft(), other.getRight(), state);
		case DISJUNCTION:
			return generator.generateForOuterDisjunction(left, right, other.getLeft(), other.getRight(), state);
			default: return "";
		}
	}
}
