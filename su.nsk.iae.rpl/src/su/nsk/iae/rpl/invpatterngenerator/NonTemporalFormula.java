package su.nsk.iae.rpl.invpatterngenerator;

public class NonTemporalFormula extends Formula {
	NonTemporalFormula() {
		arity =0;
	}

	@Override
	FormulaFactory createFactory() {
		return new NonTemporalFormulaFactory();
	}

}
