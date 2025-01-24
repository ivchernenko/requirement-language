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

	default LemmaPremise replacePatternsForImplication(DerivedLemmaScheme LS, List<UpdateStateVariable> lambdaBound) {
		if (this.equalsToRequirementFormula())
			return BooleanLiteral.TRUE;
		else return replacePatternsForNotIdenticallyTrueImplication(LS, lambdaBound);
	}
	
	

	@Override
	InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution);

	@Override
	InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states);

	LemmaPremise replacePatternsForNotIdenticallyTrueImplication(DerivedLemmaScheme LS, List<UpdateStateVariable> lambdaBound);

	boolean equalsToRequirementFormula();

	List<String> getUsedPatternNames();

}
