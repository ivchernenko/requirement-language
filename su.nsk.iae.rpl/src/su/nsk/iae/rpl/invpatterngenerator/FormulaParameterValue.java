package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FormulaParameterValue {
	List<UpdateStateVariable> states;
	InnerExtraInvariantFormula formula;
	public FormulaParameterValue(
			List<UpdateStateVariable> states,
			InnerExtraInvariantFormula formula) {
		super();
		this.states = states;
		this.formula = formula;
	}
	public List<UpdateStateVariable> getStates() {
		return states;
	}
	public OuterExtraInvariantFormula getFormula() {
		return formula;
	}
}
