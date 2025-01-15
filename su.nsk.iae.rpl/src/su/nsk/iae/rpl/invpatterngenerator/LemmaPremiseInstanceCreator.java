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

public class LemmaPremiseInstanceCreator {
	public LemmaPremise substituteParams(LemmaPremiseFormula premise, DerivedLemmaScheme LS,  ParameterValueMap params) {
		FunApplication funApp = (FunApplication) premise.getLeft();
		Map<FunctionalParameter, FunctionalParameter> fnParams = params.getFnParams();
		FunctionalParameter fn = funApp.getFnParam();
		if (fnParams != null) {
			fn = fnParams.getOrDefault(fn, fn);
		}
		FunctionApplication left = new FunctionApplication(fn, funApp.getState());
		LemmaPremise right = premise.getRight().substitiuteParams(this, LS,  params);
		return new ImplicationLemmaPremise(left, right);
	}
	
	public LemmaPremise substituteParams(DisjunctionLemmaPremiseFormula premise, DerivedLemmaScheme LS, ParameterValueMap params) {
		LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, LS, params);
		LemmaPremise right = premise.getRight().substitiuteParams(this, LS, params);
		return new BooleanLemmaPremise(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public LemmaPremise substituteParams(ConjunctionLemmaPremiseFormula premise, DerivedLemmaScheme LS, ParameterValueMap params) {
		LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, LS, params);
		LemmaPremise right = premise.getRight().substitiuteParams(this, LS, params);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public LemmaPremise substituteParams(PrimaryLemmaPremiseFormula premise, DerivedLemmaScheme LS,  ParameterValueMap params) {
		if (premise.getAtomic() != null) {
			su.nsk.iae.rpl.rPL.NegationFormula negFormula = premise.getAtomic();
			return negation(negFormula, params);
		}
		else if (premise.getAlwaysImp() != null) {
			su.nsk.iae.rpl.rPL.AlwaysImplication alwaysImp = premise.getAlwaysImp();
			AtomicFormula originalLeft = alwaysImp.getLeft().getFormula().getRight();
			InnerExtraInvariantFormula instantiatedLeft = substituteParams(originalLeft, params);
			if (LS == DerivedLemmaScheme.LS8)
				return new LS8AlwaysImplication(alwaysImp.getState(), instantiatedLeft);
			else
				return new LS9AlwaysImplication(alwaysImp.getState(), instantiatedLeft);
		}
		else if (premise.getInst() != null) {
			su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance patternInst = premise.getInst();
			return pastExtraInvariantPatternInstance(patternInst, params);
		}
		else // nested formula
			return premise.getNestedFormula().substitiuteParams(this, LS, params);
		
	}
	
	InnerExtraInvariantFormula substituteParams(AtomicFormula atomic, ParameterValueMap params) {
		InnerExtraInvariantFormula atomicFormula;
		if (atomic.getFmParam() != null) { // formula parameter
			FormulaParameter fmParam = atomic.getFmParam();
			FormulaParameterValue value;
			if (fmParam instanceof SimpleFormulaParameter simpleParam) {
				Map<SimpleFormulaParameter, FormulaParameterValue> fmParams = params.getSimpleFmParams();
				value = fmParams.get(simpleParam);					
			}
			else { // regular parameter
				RegularFormulaParameter regParam = (RegularFormulaParameter) fmParam;
				Map<RegularFormulaParameter, FormulaParameterValue> fmParams = params.getRegFmParams();
				value = fmParams.get(regParam);
			}
			List<UpdateStateVariable> lambdaBound = value.getStates();
			List<UpdateStateVariable> args = atomic.getStates();
			InnerExtraInvariantFormula formula = value.getFormula();
			int i;
			Map<UpdateStateVariable, UpdateStateVariable> substitution = new HashMap<>();
			for (i = 0; i < lambdaBound.size(); i++) {
				if (i >= args.size())
					throw new InvalidTypeException();
				substitution.put(lambdaBound.get(i), args.get(i));
				
			}
			formula = formula.replaceStates(substitution);
			atomicFormula = formula.applyToStates(args.subList(i, args.size()));
		}
		else // boolean literal or boolean term
			atomicFormula = substituteParamsToConstantFormula(atomic, params);
		return atomicFormula;
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
	
	LemmaPremise negation(NegationFormula formula, ParameterValueMap params) {
		AtomicFormula atomic = formula.getRight();
		InnerExtraInvariantFormula atomicPremise = substituteParams(atomic, params);
		if (formula.isNeg())
			return new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicPremise);
		else 
			return atomicPremise;
	}
	
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
				patternInst.getState(),
				false);
	}	
	
}
