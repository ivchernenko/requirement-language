package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface InnerExtraInvariantFormula extends LemmaPremise {
	default List<Implication> generateExtraConjuncts(FunctionalParameterList fnParamList) {
		return new ArrayList<>();
	}

	InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution);
	InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states);

	default LemmaPremise replacePatternsForImplication(DerivedLemmaScheme LS) {
		if (this.equalsToRequirementFormula())
			return BooleanLiteral.TRUE;
		else return replacePatternsForNotIdenticallyTrueImplication(LS);
	}

	LemmaPremise replacePatternsForNotIdenticallyTrueImplication(DerivedLemmaScheme LS);

	boolean equalsToRequirementFormula();

	List<String> getUsedPatternNames();

}
