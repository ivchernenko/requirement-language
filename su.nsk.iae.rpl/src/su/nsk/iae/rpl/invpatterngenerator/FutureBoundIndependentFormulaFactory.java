package su.nsk.iae.rpl.invpatterngenerator;

public class FutureBoundIndependentFormulaFactory implements FormulaFactory {

	@Override
	public Formula createDisjunction(Formula left, Formula right) {
		FutureBoundIndependentFormula fbiLeft = (FutureBoundIndependentFormula) left;
		FutureBoundIndependentFormula fbiRight = (FutureBoundIndependentFormula) right;
		return new FutureBoundIndependentBooleanFormula(BooleanOperator.DISJUNCTION, fbiLeft, fbiRight);
	}

	@Override
	public Formula createConjunction(Formula left, Formula right) {
		FutureBoundIndependentFormula fbiLeft = (FutureBoundIndependentFormula) left;
		FutureBoundIndependentFormula fbiRight = (FutureBoundIndependentFormula) right;
		return new FutureBoundIndependentBooleanFormula(BooleanOperator.CONJUNCTION, fbiLeft, fbiRight);
	}

	@Override
	public Formula createNegation(Formula formula) {
		FutureBoundIndependentFormula fbiFormula = (FutureBoundIndependentFormula) formula;
		return new NegationFormula(fbiFormula);
	}

}
