package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface InnerExtraInvariantFormula extends Formula, LemmaPremise {
	default List<Implication> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		return new ArrayList<>();
	}

	default LemmaPremise replacePatternsForImplication(Formula right, List<UpdateStateVariable> lambdaBound, 
			UpdateStateVariable state) {
		if (this.equalsToRequirementFormula())
			return BooleanLiteral.TRUE;
		else return replacePatternsForNotIdenticallyTrueImplication(right, lambdaBound, state);
	}
	
	

	@Override
	InnerExtraInvariantFormula replaceStates(Map<String, UpdateStateVariable> substitution);

	@Override
	InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states);

	LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula right, List<UpdateStateVariable> lambdaBound,
			UpdateStateVariable state);

	boolean equalsToRequirementFormula();

}
