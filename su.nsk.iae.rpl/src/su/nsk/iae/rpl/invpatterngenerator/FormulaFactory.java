package su.nsk.iae.rpl.invpatterngenerator;

public interface FormulaFactory {
	Formula createDisjunction(Formula left, Formula right);
	Formula createConjunction(Formula left, Formula right);
	Formula createNegation(Formula formula);

}
