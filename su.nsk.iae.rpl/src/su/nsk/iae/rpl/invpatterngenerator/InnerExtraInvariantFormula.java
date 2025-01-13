package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface InnerExtraInvariantFormula extends LS8LemmaPremise {
	default List<OuterExtraInvariantFormula> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		return new ArrayList<>();
	}

	InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution);
	InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states);

}
