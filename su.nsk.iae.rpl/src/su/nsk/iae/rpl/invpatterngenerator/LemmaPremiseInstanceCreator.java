package su.nsk.iae.rpl.invpatterngenerator;

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
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LemmaPremiseInstanceCreator {
	LemmaPremise substituteParams(LemmaPremiseFormula premise, ParameterValueMap params) {
		FunApplication funApp = (FunApplication) premise.getLeft();
		Map<FunctionalParameter, FunctionalParameter> fnParams = params.getFnParams();
		FunctionalParameter fn = funApp.getFnParam();
		if (fnParams != null) {
			fn = fnParams.getOrDefault(fn, fn);
		}
		FunctionApplication left = new FunctionApplication(fn, funApp.getState());
		LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new ImplicationLemmaPremise(left, right);
	}
	
	LemmaPremise substituteParams(DisjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new BooleanLemmaPremise(BooleanOperator.DISJUNCTION, left, right);
	}
	
	LemmaPremise substituteParams(ConjunctionLemmaPremiseFormula premise, ParameterValueMap params) {
		LemmaPremise left = ((LemmaPremiseFormula) premise.getLeft()).substitiuteParams(this, params);
		LemmaPremise right = premise.getRight().substitiuteParams(this, params);
		return new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, left, right);
	}
	
	LemmaPremise substituteParams(PrimaryLemmaPremiseFormula premise, ParameterValueMap params) {
		if (premise.getAtomic() != null) {
			su.nsk.iae.rpl.rPL.NegationFormula negFormula = premise.getAtomic();
			return substituteParams(negFormula, params)
		}
		else if (premise.getAlwaysImp() != null) {
			su.nsk.iae.rpl.rPL.AlwaysImplication alwaysImp = premise.getAlwaysImp();
			
		}
		
	}
	
	LemmaPremise substituteParams(su.nsk.iae.rpl.rPL.NegationFormula negFormula, ParameterValueMap params) {
		InnerExtraInvariantFormula atomicFormula;
		boolean neg = negFormula.isNeg();
		AtomicFormula atomic = negFormula.getRight();
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
		if (neg)
			return new NegationFormula(atomicFormula);
		else
			return atomicFormula;
	}

}
