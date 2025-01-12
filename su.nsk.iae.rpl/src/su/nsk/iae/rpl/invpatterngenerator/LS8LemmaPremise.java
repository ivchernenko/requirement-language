package su.nsk.iae.rpl.invpatterngenerator;

public abstract class LS8LemmaPremise extends Formula {
	LS8LemmaPremise() {
		arity =0;
	}

	@Override
	FormulaFactory createFactory() {
		return new NonTemporalFormulaFactory();
	}

}
