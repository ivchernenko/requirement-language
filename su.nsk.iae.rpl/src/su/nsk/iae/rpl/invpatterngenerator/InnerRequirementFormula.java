package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface InnerRequirementFormula extends Formula {

	@Override
	InnerRequirementFormula replaceStates(Map<String, UpdateStateVariable> substitution);

	@Override
	InnerRequirementFormula applyToStates(List<UpdateStateVariable> states);

}
