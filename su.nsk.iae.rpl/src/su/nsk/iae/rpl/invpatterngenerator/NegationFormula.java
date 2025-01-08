package su.nsk.iae.rpl.invpatterngenerator;

public class NegationFormula extends FutureBoundIndependentFormula  {
	FutureBoundIndependentFormula formula;

	public FutureBoundIndependentFormula getAtomic() {
		return formula;
	}

	public NegationFormula(FutureBoundIndependentFormula formula) {
		super();
		this.formula = formula;
	}

}
