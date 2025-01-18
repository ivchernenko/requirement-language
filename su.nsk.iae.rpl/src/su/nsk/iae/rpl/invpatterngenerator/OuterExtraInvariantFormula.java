package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public abstract class OuterExtraInvariantFormula {
	public abstract LemmaPremise generateL8();
	public abstract LemmaPremise generateL9();
	protected abstract List<String> getUsedPatternNames();
	
	public abstract String convertToString(UpdateStateVariable finalState);
	
}
