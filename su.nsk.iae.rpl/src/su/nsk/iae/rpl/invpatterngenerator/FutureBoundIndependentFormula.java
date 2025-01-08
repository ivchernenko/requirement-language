package su.nsk.iae.rpl.invpatterngenerator;

public class FutureBoundIndependentFormula extends Formula {
	
	FutureBoundIndependentFormula() {
		arity = 1;
	}

	@Override
	FormulaFactory createFactory() {
		return new FutureBoundIndependentFormulaFactory();
	}

}
