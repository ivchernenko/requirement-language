package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public abstract class Term implements InnerExtraInvariantFormula {
	public abstract Term substrituteCParam(Map<ConstantParameter, Term> values);
	public abstract Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values);
	
	@Override
	public InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states) {
		return this;
	}
	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(DerivedLemmaScheme LS, List<UpdateStateVariable> lambdaBound) {
		return this;
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return true;
	}
	@Override
	public List<String> getUsedPatternNames() {
		return new ArrayList<>();
	}

}
