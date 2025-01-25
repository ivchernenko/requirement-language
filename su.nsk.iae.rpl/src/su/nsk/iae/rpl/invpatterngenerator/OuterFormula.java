package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface OuterFormula {
	String convertToString(UpdateStateVariable state);
	List<String> getUsedPatternNames();

}
