package su.nsk.iae.rpl.invpatterngenerator;

public class InnerFormulaFactory implements FormulaFactory {

	@Override
	public Formula createDisjunction(Formula left, Formula right) {
		InnerExtraInvariantFormula iLeft = (InnerExtraInvariantFormula) left;
		InnerExtraInvariantFormula iRight = (InnerExtraInvariantFormula) right;
		return new InnerBooleanFormula(BooleanOperator.DISJUNCTION, iLeft, iRight);
	}

	@Override
	public Formula createConjunction(Formula left, Formula right) {
		InnerExtraInvariantFormula iLeft = (InnerExtraInvariantFormula) left;
		InnerExtraInvariantFormula iRight = (InnerExtraInvariantFormula) right;
		return new InnerBooleanFormula(BooleanOperator.CONJUNCTION, iLeft, iRight);
	}

	@Override
	public Formula createNegation(Formula formula) {
		return null;
	}

}
