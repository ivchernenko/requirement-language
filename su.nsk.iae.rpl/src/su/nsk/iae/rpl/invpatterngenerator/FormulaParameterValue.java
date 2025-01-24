package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FormulaParameterValue {
	List<UpdateStateVariable> states;
	Formula formula;
	public FormulaParameterValue(
			List<UpdateStateVariable> states,
			Formula formula) {
		super();
		this.states = states;
		this.formula = formula;
	}
	public List<UpdateStateVariable> getStates() {
		return states;
	}
	public Formula getFormula() {
		return formula;
	}
	
	@Override
	public String toString() {
		if (states == null || states.isEmpty())
			return formula.toString();
		else {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("(\\<lambda> ");
			for (UpdateStateVariable state: states)
				stringBuilder.append(state.getName()).append(' ');
			stringBuilder.append(". ");
			stringBuilder.append(formula).append(')');
			return stringBuilder.toString();
		}
	}
}
