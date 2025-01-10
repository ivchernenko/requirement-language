package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class CurrentStateLambdaAbstraction extends FutureBoundIndependentFormula {
	private final UpdateStateVariable state;
	private final NonTemporalFormula formula;
	public CurrentStateLambdaAbstraction(NonTemporalFormula formula, UpdateStateVariable state) {
		super();
		this.state = state;
		this.formula = formula;
	}
	public UpdateStateVariable getState() {
		return state;
	}
	public NonTemporalFormula getFormula() {
		return formula;
	}
	@Override
	Formula lambdaAbstract(UpdateStateVariable variable, boolean finalState) {
		if (finalState)
			return new FinalStateLambdaAbstraction(this, variable);
		else
			return new StateLambdaAbstraction(this, List.of(variable));
	}

}
