package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FinalStateLambdaAbstraction implements InnerExtraInvariantFormula {
	private final FutureBoundIndependentFormula formula;
	public FinalStateLambdaAbstraction(FutureBoundIndependentFormula formula) {
		super();
		this.formula = formula;
	}
	public FutureBoundIndependentFormula getFormula() {
		return formula;
	}

}
