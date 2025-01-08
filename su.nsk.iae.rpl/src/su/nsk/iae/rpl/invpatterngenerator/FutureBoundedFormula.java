package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FutureBoundedFormula extends FutureBoundIndependentFormula {
	InnerExtraInvariantFormula formula;
	UpdateStateVariable state;
	public FutureBoundedFormula(InnerExtraInvariantFormula formula, UpdateStateVariable state) {
		super();
		this.formula = formula;
		this.state = state;
	}
	public InnerExtraInvariantFormula getFormula() {
		return formula;
	}
	public UpdateStateVariable getState() {
		return state;
	}

}
