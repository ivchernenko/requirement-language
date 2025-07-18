package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanLemmaPremise implements LemmaPremise {
	final BooleanOperator operator;
	final LemmaPremise  left;
	final LemmaPremise right;
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
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		LemmaPremise transformedLeft = left.replacePatterns(initState);
		LemmaPremise transformedRight = right.replacePatterns(initState);
		return new BooleanLemmaPremise(operator, transformedLeft, transformedRight);
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
		case DISJUNCTION: 
			premise = factory.createDisjunctionLemmaPremiseFormula(); 
			if (! (eLeft instanceof ConjunctionLemmaPremiseFormula)) {
				PrimaryLemmaPremiseFormula primaryFormula = factory.createPrimaryLemmaPremiseFormula();
				primaryFormula.setNestedFormula(eLeft);
				eLeft = primaryFormula;
			}
			if (! (eRight instanceof DisjunctionLemmaPremiseFormula)) {
				PrimaryLemmaPremiseFormula primaryFormula = factory.createPrimaryLemmaPremiseFormula();
				primaryFormula.setNestedFormula(eRight);
				eRight = primaryFormula;
			}
			break;
		case CONJUNCTION: 
			premise = factory.createConjunctionLemmaPremiseFormula(); 
			if (! (eLeft instanceof PrimaryLemmaPremiseFormula)) {
				PrimaryLemmaPremiseFormula primaryFormula = factory.createPrimaryLemmaPremiseFormula();
				primaryFormula.setNestedFormula(eLeft);
				eLeft = primaryFormula;
			}
			if (! (eRight instanceof ConjunctionLemmaPremiseFormula)) {
				PrimaryLemmaPremiseFormula primaryFormula = factory.createPrimaryLemmaPremiseFormula();
				primaryFormula.setNestedFormula(eRight);
				eRight = primaryFormula;
			}
			break;
		}
		premise.setLeft(eLeft);
		premise.setRight(eRight);
		return premise;
	}
	@Override
	public String generateProofScript(UpdateStateVariable initState, ProofScriptGenerator generator) {
		switch (operator) {
		case CONJUNCTION:
			return generator.generateForLemmaPremiseConjunction(left, right, initState);
		case DISJUNCTION:
			return generator.generateForLemmaPremiseDisjunction(left, right, initState);
		default:
			return "";
		}
	}
}
