package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.FunApplication;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryTerm;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ImplicationLemmaPremise implements LemmaPremise {
	static String HOL_IMPLICATION = "-->";
	private final FunctionApplication left;
	private final LemmaPremise right;
	public ImplicationLemmaPremise(FunctionApplication left, LemmaPremise right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionApplication getLeft() {
		return left;
	}
	public LemmaPremise getRight() {
		return right;
	}
	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return new ImplicationLemmaPremise(left, right.replacePatterns(initState));
	}
	@Override
	public LemmaPremise generateParticularLemmaPremise() {
		LemmaPremise simplifiedRight = right.generateParticularLemmaPremise();
		return new ImplicationLemmaPremise(left, simplifiedRight);
	}
	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		PrimaryTerm primTerm = (PrimaryTerm) this.left.convertToRPLTerm();
		FunApplication left = primTerm.getFunApp();
		LemmaPremiseFormula right = this.right.convertToEObject();
		LemmaPremiseFormula result = factory.createLemmaPremiseFormula();
		result.setLeft(left);
		result.setRight(right);
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(left).append(' ').append(HOL_IMPLICATION).append(' ').append(right);
		stringBuilder.append(')');
		return stringBuilder.toString();
	}
	
}
