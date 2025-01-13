package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;

public interface LemmaPremiseInstanceCreator<T> {
	T substituteParams(LemmaPremiseFormula premise, ParameterValueMap params);
	T substituteParams(DisjunctionLemmaPremiseFormula premise, ParameterValueMap params);
	T substituteParams(ConjunctionLemmaPremiseFormula premise, ParameterValueMap params);
	T substituteParams(PrimaryLemmaPremiseFormula premise, ParameterValueMap params);
	
}
