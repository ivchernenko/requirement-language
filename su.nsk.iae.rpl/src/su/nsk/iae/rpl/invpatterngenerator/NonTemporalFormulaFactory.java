package su.nsk.iae.rpl.invpatterngenerator;

public class NonTemporalFormulaFactory implements FormulaFactory {

	@Override
	public Formula createDisjunction(Formula left, Formula right) {
		NonTemporalFormula fbiLeft = (NonTemporalFormula) left;
		NonTemporalFormula fbiRight = (NonTemporalFormula) right;
		return new NonTemporalBooleanFormula(BooleanOperator.DISJUNCTION, fbiLeft, fbiRight);
	}

	@Override
	public Formula createConjunction(Formula left, Formula right) {
		NonTemporalFormula fbiLeft = (NonTemporalFormula) left;
		NonTemporalFormula fbiRight = (NonTemporalFormula) right;
		return new NonTemporalBooleanFormula(BooleanOperator.CONJUNCTION, fbiLeft, fbiRight);

	}

	@Override
	public Formula createNegation(Formula formula) {
		NonTemporalFormula ntFormula = (NonTemporalFormula) formula;
		return new NonTemporalNegationFormula(ntFormula);
	}

}
