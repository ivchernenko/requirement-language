package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FormulaApplicationToCurrent extends LemmaPremise {
	private final FutureBoundIndependentFormula formula;
	private final UpdateStateVariable state;
	public FormulaApplicationToCurrent(FutureBoundIndependentFormula formula, UpdateStateVariable state) {
		super();
		this.formula = formula;
		this.state = state;
	}
	public FutureBoundIndependentFormula getFormula() {
		return formula;
	}
	public UpdateStateVariable getState() {
		return state;
	}
	@Override
	Formula lambdaAbstract(UpdateStateVariable variable, boolean finalState) {
		return new CurrentStateLambdaAbstraction(this, variable);
	}

}
