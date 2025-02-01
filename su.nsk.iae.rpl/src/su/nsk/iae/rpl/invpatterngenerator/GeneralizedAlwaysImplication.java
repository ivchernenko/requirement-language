package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.AlwaysImplication;
import su.nsk.iae.rpl.rPL.AlwaysImplicationParameterValue;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class GeneralizedAlwaysImplication implements LemmaPremise {
	private final UpdateStateVariable state;
	private final FormulaParameterValue left;
	private final FormulaParameterValue right;
	public GeneralizedAlwaysImplication(UpdateStateVariable state, FormulaParameterValue left, FormulaParameterValue right) {
		super();
		this.state = state;
		this.left = left;
		this.right = right;
	}
	public UpdateStateVariable getState() {
		return state;
	}
	public FormulaParameterValue getLeft() {
		return left;
	}
	@Override
	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return ((InnerExtraInvariantFormula) left.getFormula()).replacePatternsForImplication(right.getFormula(), 
				left.getStates(), state);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(always_imp ").append(state.getName()).append(' ').append(left).append(' ').append(right).append(')')
				.toString();
	}
	@Override
	public LemmaPremise generateParticularLemmaPremise(
			Map<RegularFormulaParameter, RegularFormulaParameter> paramMapping) {
		return BooleanLiteral.TRUE;
	}
	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		AlwaysImplication alwaysImp = factory.createAlwaysImplication();
		alwaysImp.setState(state);
		InnerExtraInvariantFormula left = (InnerExtraInvariantFormula) this.left.getFormula();
		InnerExtraInvariantFormula right = (InnerExtraInvariantFormula) this.right.getFormula();
		AlwaysImplicationParameterValue leftValue = factory.createAlwaysImplicationParameterValue();
		PrimaryLemmaPremiseFormula leftFormula = (PrimaryLemmaPremiseFormula) left.convertToEObject();
		leftValue.setFormula(leftFormula.getAtomic());
		leftValue.setState(state);
		AlwaysImplicationParameterValue rightValue = factory.createAlwaysImplicationParameterValue();
		PrimaryLemmaPremiseFormula rightFormula = (PrimaryLemmaPremiseFormula) right.convertToEObject();
		leftValue.setFormula(rightFormula.getAtomic());
		rightValue.setState(state);
		alwaysImp.setLeft(leftValue);
		alwaysImp.setRight(rightValue);
		PrimaryLemmaPremiseFormula result = factory.createPrimaryLemmaPremiseFormula();
		result.setAlwaysImp(alwaysImp);
		return result;
	}
}
