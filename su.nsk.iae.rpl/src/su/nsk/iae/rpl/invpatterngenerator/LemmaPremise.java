  package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface LemmaPremise {
	default LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return this;
	}
	String generateProofScript(UpdateStateVariable initState, ProofScriptGenerator generator);
	
	LemmaPremise generateParticularLemmaPremise();
	LemmaPremiseFormula convertToEObject();

}
