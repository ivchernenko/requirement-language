package su.nsk.iae.rpl.invpatterngenerator;

public class InnerExtraInvariantFormula extends Formula {
	
	public InnerExtraInvariantFormula() {
		arity = 2;
	}

	@Override
	FormulaFactory createFactory() {
		return new InnerFormulaFactory();
	}

}
