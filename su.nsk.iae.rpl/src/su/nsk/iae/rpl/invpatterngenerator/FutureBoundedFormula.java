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
	@Override
	Formula lambdaAbstract(UpdateStateVariable variable, boolean finalState) {
		if (state.equals(variable))
			return formula; // eta conversion
		else if (finalState)
			return new FinalStateLambdaAbstraction(this, variable);
		else
			return new StateLambdaAbstraction(this, List.of(variable));
	}

}
