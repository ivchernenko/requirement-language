package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ImplicationLemmaPremise implements LemmaPremise {
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
	public LemmaPremise generateParticularLemmaPremise(
			Map<RegularFormulaParameter, RegularFormulaParameter> paramMapping) {
		LemmaPremise simplifiedRight = right.generateParticularLemmaPremise(paramMapping);
		return new ImplicationLemmaPremise(left, right);
	}
	
}
