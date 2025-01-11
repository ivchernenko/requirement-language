package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;

public abstract class Term {
	public abstract Term substrituteCParam(ConstantParameter param, Term value);
	public abstract Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value);

}
