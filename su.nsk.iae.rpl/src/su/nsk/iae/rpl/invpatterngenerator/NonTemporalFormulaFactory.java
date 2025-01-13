package su.nsk.iae.rpl.invpatterngenerator;

public class NonTemporalFormulaFactory implements FormulaFactory {

	@Override
	public Formula createDisjunction(Formula left, Formula right) {
		LS8LemmaPremise fbiLeft = (LS8LemmaPremise) left;
		LS8LemmaPremise fbiRight = (LS8LemmaPremise) right;
		return new LS8BooleanLemmaPremise(BooleanOperator.DISJUNCTION, fbiLeft, fbiRight);
	}

	@Override
	public Formula createConjunction(Formula left, Formula right) {
		LS8LemmaPremise fbiLeft = (LS8LemmaPremise) left;
		LS8LemmaPremise fbiRight = (LS8LemmaPremise) right;
		return new LS8BooleanLemmaPremise(BooleanOperator.CONJUNCTION, fbiLeft, fbiRight);

	}

	@Override
	public Formula createNegation(Formula formula) {
		LS8LemmaPremise ntFormula = (LS8LemmaPremise) formula;
		return new NegationLemmaPremise(ntFormula);
	}

}
