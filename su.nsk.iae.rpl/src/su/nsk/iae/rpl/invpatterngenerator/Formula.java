package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface Formula {
	Formula replaceStates(Map<String, UpdateStateVariable> substitution);
	Formula applyToStates(List<UpdateStateVariable> states);
	List<String> getUsedPatternNames();
}
