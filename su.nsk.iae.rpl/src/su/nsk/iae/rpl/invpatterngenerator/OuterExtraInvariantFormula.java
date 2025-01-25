package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface OuterExtraInvariantFormula extends OuterFormula {
	public abstract LemmaPremise generateL8();
	public abstract LemmaPremise generateL9(OuterRequirementFormula reqFormula);
	
	
	public abstract String convertToString(UpdateStateVariable finalState);
	
}
