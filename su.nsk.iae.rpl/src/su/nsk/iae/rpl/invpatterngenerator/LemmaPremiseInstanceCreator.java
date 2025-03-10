package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.ConjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.DisjunctionLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.FunApplication;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.NegationFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LemmaPremiseInstanceCreator {
	public LemmaPremise substituteParams(LemmaPremiseFormula premise,  ParameterValueMap params) {
		FunApplication funApp = (FunApplication) premise.getLeft();
		Map<String, FunctionalParameter> fnParams = params.getFnParams();
		FunctionalParameter fn = funApp.getFnParam();
		if (fnParams != null) {
			fn = fnParams.getOrDefault(fn.getName(), fn);
		}
		FunctionApplication left = (FunctionApplication) new FunctionApplication(fn, funApp.getState())
				.replaceStates(params.getStateSubstitution());
		LemmaPremise right = premise.getRight().substitiuteParams(this,  params);
		return new ImplicationLemmaPremise(left, right);
	}

	public LemmaPremise substituteParams(DisjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new BooleanLemmaPremise(BooleanOperator.DISJUNCTION, left, right);
	}

	public LemmaPremise substituteParams(ConjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, left, right);
	}

	public LemmaPremise substituteParams(PrimaryLemmaPremiseFormula premise,  ParameterValueMap params) {
		if (premise.getAtomic() != null) {
			su.nsk.iae.rpl.rPL.NegationFormula negFormula = premise.getAtomic();
			FormulaParameterValue atomicPremise = negation(negFormula, params);
			List<UpdateStateVariable> lambdaBound = atomicPremise.getStates();
			if (lambdaBound == null || lambdaBound.isEmpty())
				return ((InnerExtraInvariantFormula) atomicPremise.getFormula());
			else {
				throw new InvalidTypeException();
			}
		}
		else if (premise.getAlwaysImp() != null) {
			su.nsk.iae.rpl.rPL.AlwaysImplication alwaysImp = premise.getAlwaysImp();
			AtomicFormula originalLeft = alwaysImp.getLeft().getFormula().getRight();
			FormulaParameterValue instantiatedLeft = substituteParams(originalLeft, params);
			AtomicFormula originalRight = alwaysImp.getRight().getFormula().getRight();
			FormulaParameterValue instantiatedRight = substituteParams(originalRight, params);
			UpdateStateVariable state = alwaysImp.getState();
			state = params.getStateSubstitution().getOrDefault(state.getName(), state);
			return new GeneralizedAlwaysImplication(state, instantiatedLeft, instantiatedRight);
		}
		else if (premise.getInst() != null) {
			throw new InvalidTypeException();
			//su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance patternInst = premise.getInst();
			//return pastExtraInvariantPatternInstance(patternInst, params);
		}
		else // nested formula
			return premise.getNestedFormula().substitiuteParams(this, params);

	}

	FormulaParameterValue substituteParams(AtomicFormula atomic, ParameterValueMap params) {
		Formula atomicFormula;
		List<UpdateStateVariable> resultLambdaBound = new ArrayList<>();
		if (atomic.getFmParam() != null) { // formula parameter
			FormulaParameter fmParam = atomic.getFmParam();
			FormulaParameterValue value;
			if (fmParam instanceof SimpleFormulaParameter simpleParam) {
				Map<String, FormulaParameterValue> fmParams = params.getSimpleFmParams();
				value = fmParams.get(simpleParam.getName());					
			}
			else { // regular parameter
				RegularFormulaParameter regParam = (RegularFormulaParameter) fmParam;
				Map<String, FormulaParameterValue> fmParams = params.getRegFmParams();
				value = fmParams.get(regParam.getName());
			}
			List<UpdateStateVariable> lambdaBound = value.getStates();
			List<UpdateStateVariable> args = atomic.getStates();
			Formula formula = value.getFormula();
			int i;
			Map<String, UpdateStateVariable> substitution = new HashMap<>();
			for (i = 0; i < lambdaBound.size(); i++) {
				if (i >= args.size())
					resultLambdaBound.add(lambdaBound.get(i));
				else substitution.put(lambdaBound.get(i).getName(), args.get(i));

			}
			formula = formula.replaceStates(substitution);
			if (i <= args.size())
				atomicFormula = formula.applyToStates(args.subList(i, args.size()));
			else
				atomicFormula = formula;
		}
		else // boolean literal or boolean term
			atomicFormula = substituteParamsToConstantFormula(atomic, params);
		return new FormulaParameterValue(resultLambdaBound, atomicFormula.replaceStates(params.getStateSubstitution()));
	}

	Term substituteParamsToConstantFormula(AtomicFormula atomic, ParameterValueMap params) {
		if (atomic.getBoolLiteral() != null)
			return BooleanLiteral.valueOf(atomic.getBoolLiteral());
		else if (atomic.getBoolTerm() != null) {
			su.nsk.iae.rpl.rPL.Term boolTerm = atomic.getBoolTerm();
			TermConverter converter = new TermConverter();
			return boolTerm.convert(converter).substrituteCParam(params.getcParams())
					.substituteFunctionalParameter(params.getFnParams());
		}
		return null;
	}

	FormulaParameterValue negation(NegationFormula formula, ParameterValueMap params) {
		AtomicFormula atomic = formula.getRight();
		FormulaParameterValue atomicPremise = substituteParams(atomic, params);
		Formula nonNegativeFormula = atomicPremise.getFormula();
		Formula resultFormula;
		if (formula.isNeg()) {
			PatternFreeInnerFormula pfNonNegativeFormula = (PatternFreeInnerFormula) nonNegativeFormula;
			resultFormula = pfNonNegativeFormula.negate();
			return new FormulaParameterValue(atomicPremise.getStates(), resultFormula);
		}
		else 
			return atomicPremise;
	}
/*
	LemmaPremise pastExtraInvariantPatternInstance(PastExtraInvariantPatternInstance patternInst,
			ParameterValueMap params) {
		List<Term> cParams = new ArrayList<>();
		Map<String, Term> cParamValues = params.getcParams();
		for (ConstantParameter cParam: patternInst.getCParams()) {
			Term value = cParamValues.get(cParam.getName());
			cParams.add(value);
		}
		List<FunctionalParameter> fnParams = new ArrayList<>();
		Map<String, FunctionalParameter> fnParamValues = params.getFnParams();
		for (FunctionalParameter fnParam: patternInst.getFnParams()) {
			FunctionalParameter value = fnParamValues.get(fnParam.getName());
			fnParams.add(value);
		}
		List<FormulaParameterValue> fmParams = new ArrayList<>();
		Map<String, FormulaParameterValue> fmParamValues = params.getRegFmParams();
		for (RegularFormulaParameter fmParam: patternInst.getFmParams()) {
			FormulaParameterValue value = fmParamValues.get(fmParam.getName());
			fmParams.add(value);
		}
		return new su.nsk.iae.rpl.invpatterngenerator.PastExtraInvariantPatternInstance(
				patternInst.getPattern(),
				cParams,
				fnParams,
				fmParams,
				params.getStateSubstitution().get(patternInst.getState().getName()),
				false);
	}	*/
}
