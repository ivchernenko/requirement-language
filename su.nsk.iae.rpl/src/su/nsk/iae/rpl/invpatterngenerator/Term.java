package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

public abstract class Term implements InnerExtraInvariantFormula {
	public abstract Term substrituteCParam(Map<ConstantParameter, Term> values);
	public abstract Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values);

}
