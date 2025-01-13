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

public class LS8LemmaPremiseInstanceCreator implements LemmaPremiseInstanceCreator<LS8LemmaPremise> {
	@Override
	public LS8LemmaPremise substituteParams(LemmaPremiseFormula premise, ParameterValueMap params) {
		FunApplication funApp = (FunApplication) premise.getLeft();
		Map<FunctionalParameter, FunctionalParameter> fnParams = params.getFnParams();
		FunctionalParameter fn = funApp.getFnParam();
		if (fnParams != null) {
			fn = fnParams.getOrDefault(fn, fn);
		}
		FunctionApplication left = new FunctionApplication(fn, funApp.getState());
		LS8LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new ImplicationLemmaPremise(left, right);
	}
	
	@Override
	public LS8LemmaPremise substituteParams(DisjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		LS8LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		LS8LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new LS8BooleanLemmaPremise(BooleanOperator.DISJUNCTION, left, right);
	}
	
	@Override
	public LS8LemmaPremise substituteParams(ConjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		LS8LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		LS8LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new LS8BooleanLemmaPremise(BooleanOperator.CONJUNCTION, left, right);
	}
	
	@Override
	public LS8LemmaPremise substituteParams(PrimaryLemmaPremiseFormula premise, ParameterValueMap params) {
		if (premise.getAtomic() != null) {
			su.nsk.iae.rpl.rPL.NegationFormula negFormula = premise.getAtomic();
			boolean neg = negFormula.isNeg();
			AtomicFormula originalAtomic = negFormula.getRight();
			InnerExtraInvariantFormula atomic = substituteParams(originalAtomic, params);
			if (neg)
				return new NegationFormula(atomic);
			else
				return atomic;
		}
		else if (premise.getAlwaysImp() != null) {
			su.nsk.iae.rpl.rPL.AlwaysImplication alwaysImp = premise.getAlwaysImp();
			AtomicFormula originalLeft = alwaysImp.getLeft().getFormula().getRight();
			InnerExtraInvariantFormula instantiatedLeft = substituteParams(originalLeft, params);
			return new AlwaysImplication(alwaysImp.getState(), instantiatedLeft);
		}
		else if (premise.getInst() != null) {
			su.nsk.iae.rpl.rPL.PastExtraInvariantPatternInstance patternInst = premise.getInst();
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
			return new PastExtraInvariantPatternInstance(
					patternInst.getPattern(),
					cParams,
					fnParams,
					fmParams,
					boolParam,
					patternInst.getState());
		}
		else // nested formula
			return premise.getNestedFormula().substitiuteParams(this, params);
		
	}
	
	InnerExtraInvariantFormula substituteParams(AtomicFormula atomic, ParameterValueMap params) {
		InnerExtraInvariantFormula atomicFormula;
		if (atomic.getBoolLiteral() != null)
			atomicFormula = BooleanLiteral.valueOf(atomic.getBoolLiteral());
		else if (atomic.getBoolTerm() != null) {
			su.nsk.iae.rpl.rPL.Term boolTerm = atomic.getBoolTerm();
			TermConverter converter = new TermConverter();
			atomicFormula = boolTerm.convert(converter).substrituteCParam(params.getcParams())
					.substituteFunctionalParameter(params.getFnParams());
		}
		else { // formula parameter
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
		return atomicFormula;
	}
}
