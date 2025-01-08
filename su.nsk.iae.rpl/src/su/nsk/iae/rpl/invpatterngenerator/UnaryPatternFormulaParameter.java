package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;

public class UnaryPatternFormulaParameter extends FutureBoundIndependentFormula {
	SimpleFormulaParameter fmParam;
	
	public String getName() {
		return fmParam.getName();
	}
}
