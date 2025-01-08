package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public interface FormulaRequiringExtraConjuncts {
	List<OuterExtraInvariantFormula> generateExtraConjunct(FunctionalParameterList fnParamList);

}
