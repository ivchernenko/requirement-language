package su.nsk.iae.rpl.invpatterngenerator;

public class NonTemporalNegationFormula extends NonTemporalFormula {
	private final NonTemporalFormula formula;

	public NonTemporalNegationFormula(NonTemporalFormula formula) {
		super();
		this.formula = formula;
	}

	public NonTemporalFormula getFormula() {
		return formula;
	}
}
