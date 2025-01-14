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
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public abstract class LemmaPremiseInstanceCreator<T> {
	public T substituteParams(LemmaPremiseFormula premise, ParameterValueMap params) {
		FunApplication funApp = (FunApplication) premise.getLeft();
		Map<FunctionalParameter, FunctionalParameter> fnParams = params.getFnParams();
		FunctionalParameter fn = funApp.getFnParam();
		if (fnParams != null) {
			fn = fnParams.getOrDefault(fn, fn);
		}
		FunctionApplication left = new FunctionApplication(fn, funApp.getState());
		T right = premise.getRight().substitiuteParams(this, params);
		return implication(left, right);
	}
	
	public T substituteParams(DisjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		T left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		T right = premise.getRight().substitiuteParams(this, params);
		return booleanLemmaPremise(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public T substituteParams(ConjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		T left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		T right = premise.getRight().substitiuteParams(this, params);
		return booleanLemmaPremise(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public T substituteParams(PrimaryLemmaPremiseFormula premise, ParameterValueMap params) {
		if (premise.getAtomic() != null) {
			su.nsk.iae.rpl.rPL.NegationFormula negFormula = premise.getAtomic();
			return negation(negFormula, params);
		}
		else if (premise.getAlwaysImp() != null) {
			su.nsk.iae.rpl.rPL.AlwaysImplication alwaysImp = premise.getAlwaysImp();
			AtomicFormula originalLeft = alwaysImp.getLeft().getFormula().getRight();
			InnerExtraInvariantFormula instantiatedLeft = substituteParams(originalLeft, params);
			return alwaysImplication(alwaysImp.getState(), instantiatedLeft);
		}
		else if (premise.getInst() != null) {
			su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance patternInst = premise.getInst();
			return pastExtraInvariantPatternInstance(patternInst, params);
		}
		else // nested formula
			return premise.getNestedFormula().substitiuteParams(this, params);
		
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
	
	abstract T booleanLemmaPremise(BooleanOperator operator, T left, T right);
	abstract T implication(FunctionApplication left, T right);
	abstract T negation(su.nsk.iae.rpl.rPL.NegationFormula formula, ParameterValueMap params);
	abstract T alwaysImplication(UpdateStateVariable state, InnerExtraInvariantFormula left);
	abstract T pastExtraInvariantPatternInstance(su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance patternInst, ParameterValueMap params);
	
	
}
