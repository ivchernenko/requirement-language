package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface OuterExtraInvariantFormula extends OuterFormula {
	LemmaPremise generateL8(UpdateStateVariable initState, UpdateStateVariable finalState);
	LemmaPremise generateL9(OuterRequirementFormula reqFormula, UpdateStateVariable state);
	String generateProofScriptForL8(
			UpdateStateVariable initState, UpdateStateVariable finalState, ProofScriptGenerator generator);
	String generateProofScriptForL9(
			OuterRequirementFormula reqFormula, UpdateStateVariable state, ProofScriptGenerator generator);
	
	
	public abstract String convertToString(UpdateStateVariable finalState);
	
}
