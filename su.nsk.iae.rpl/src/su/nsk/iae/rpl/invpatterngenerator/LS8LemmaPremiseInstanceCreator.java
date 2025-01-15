package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.ConjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.FunApplication;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.NegationFormula;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS8LemmaPremiseInstanceCreator extends LemmaPremiseInstanceCreator<LemmaPremise> {

	@Override
	LemmaPremise booleanLemmaPremise(BooleanOperator operator, LemmaPremise left, LemmaPremise right) {
		return new BooleanLemmaPremise(operator, left, right);
	}

	@Override
	LemmaPremise implication(FunctionApplication left, LemmaPremise right) {
		return new ImplicationLemmaPremise(left, right);
	}

	@Override
	LemmaPremise negation(NegationFormula formula, ParameterValueMap params) {
		AtomicFormula atomic = formula.getRight();
		InnerExtraInvariantFormula atomicPremise = substituteParams(atomic, params);
		if (formula.isNeg())
			return new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicPremise);
		else 
			return atomicPremise;
	}

	@Override
	LemmaPremise alwaysImplication(UpdateStateVariable state, InnerExtraInvariantFormula left) {
		return new su.nsk.iae.rpl.invpatterngenerator.LS8AlwaysImplication(state, left);
	}

	@Override
	LemmaPremise pastExtraInvariantPatternInstance(PastExtraInvariantPatternInstance patternInst,
			ParameterValueMap params) {
		List<Term> cParams = new ArrayList<>();
		Map<ConstantParameter, Term> cParamValues = params.getcParams();
		for (ConstantParameter cParam: patternInst.getCParams()) {
			Term value = cParamValues.get(cParam);
			cParams.add(value);
		}
		List<FunctionalParameter> fnParams = new ArrayList<>();
		Map<FunctionalParameter, FunctionalParameter> fnParamValues = params.getFnParams();
		for (FunctionalParameter fnParam: patternInst.getFnParams()) {
			FunctionalParameter value = fnParamValues.get(fnParam);
			fnParams.add(value);
		}
		List<FormulaParameterValue> fmParams = new ArrayList<>();
		Map<RegularFormulaParameter, FormulaParameterValue> fmParamValues = params.getRegFmParams();
		for (RegularFormulaParameter fmParam: patternInst.getFmParams()) {
			FormulaParameterValue value = fmParamValues.get(fmParam);
			fmParams.add(value);
		}
		FunctionalParameter boolParam = params.getBoolParam();
		return new su.nsk.iae.rpl.invpatterngenerator.PastExtraInvariantPatternInstance(
				patternInst.getPattern(),
				cParams,
				fnParams,
				fmParams,
				boolParam,
				patternInst.getState());
	}	
}
