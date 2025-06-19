package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface InnerExtraInvariantFormula extends Formula, LemmaPremise {
	default List<PastExtraInvariantPatternInstance> generateExtraConjuncts() {
		return new ArrayList<>();
	}

	LemmaPremise replacePatternsForImplication(Formula right, List<UpdateStateVariable> lambdaBound, 
			UpdateStateVariable state);
	
	

	@Override
	InnerExtraInvariantFormula replaceStates(Map<String, UpdateStateVariable> substitution);

	@Override
	InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states);

	String generateProofScriptForNotIdenticallyTrueImplication(
			Formula right, List<UpdateStateVariable> lambdaBound, UpdateStateVariable state,
			ProofScriptGenerator generator);

	boolean equalsToRequirementFormula();

}
