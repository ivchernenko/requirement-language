package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.NegationFormula;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS9LemmaPremiseInstanceCreator extends LemmaPremiseInstanceCreator<LS9LemmaPremise> {

	@Override
	LS9LemmaPremise booleanLemmaPremise(BooleanOperator operator, LS9LemmaPremise left, LS9LemmaPremise right) {
		return new LS9BooleanLemmaPremise(operator, left, right);
	}

	@Override
	LS9LemmaPremise implication(FunctionApplication left, LS9LemmaPremise right) {
		return new LS9ImplicationLemmaPremise(left, right);
	}

	@Override
	LS9LemmaPremise negation(NegationFormula formula, ParameterValueMap params) {
		Term atomicInstance = substituteParamsToConstantFormula(formula.getRight(), params);
		if (formula.isNeg())
			return new NegationTerm(atomicInstance);
		else
			return atomicInstance;
	}

	@Override
	LS9LemmaPremise alwaysImplication(UpdateStateVariable state, InnerExtraInvariantFormula left) {
		return new LS9AlwaysImplication(state, left);
	}

	@Override
	LS9LemmaPremise pastExtraInvariantPatternInstance(PastExtraInvariantPatternInstance patternInst,
			ParameterValueMap params) {
		return null;
	}

	

}
