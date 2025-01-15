package su.nsk.iae.rpl.invpatterngenerator;

public class NonTemporalFormulaFactory implements FormulaFactory {

	@Override
	public Formula createDisjunction(Formula left, Formula right) {
		LemmaPremise fbiLeft = (LemmaPremise) left;
		LemmaPremise fbiRight = (LemmaPremise) right;
		return new BooleanLemmaPremise(BooleanOperator.DISJUNCTION, fbiLeft, fbiRight);
	}

	@Override
	public Formula createConjunction(Formula left, Formula right) {
		LemmaPremise fbiLeft = (LemmaPremise) left;
		LemmaPremise fbiRight = (LemmaPremise) right;
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, fbiLeft, fbiRight);

	}

	@Override
	public Formula createNegation(Formula formula) {
		LemmaPremise ntFormula = (LemmaPremise) formula;
		return new NegationLemmaPremise(ntFormula);
	}

}
