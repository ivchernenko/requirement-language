package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConjunctionFormula;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PrimaryFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.Term;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class ExtraInvariantPatternGenerator {
	private FunctionalParameterList fnParamList = new FunctionalParameterList();
	
	public Formula generateFormula(su.nsk.iae.rpl.rPL.Formula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public Formula generateFormula(ConjunctionFormula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public Formula generateFormula(PrimaryFormula reqFormula) {
		var patternInst = reqFormula.getPatternInst();
		if (patternInst != null) { // pattern instance
			var pattern = patternInst.getPattern();
			List<FormulaParameterValue> extraInvariantFmParams = new ArrayList<>();
			for (var fmParam : patternInst.getFmParams()) {
				var states = fmParam.getStates();
				Formula extraInvariantFmParam = fmParam
						.getFormula().generateFormula(this);
				extraInvariantFmParams
				.add(new FormulaParameterValue(states, extraInvariantFmParam));
			}
			return pattern.generateExtraInvariantPatternInstance(
					patternInst.getCParams(), 
					extraInvariantFmParams,
					this
					);
		}
		else { // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		}
	}
	
	Formula generatePatternInstance(
			DerivedExtraInvariantPattern pattern, 
			List<Term> cParams,
			List<FormulaParameterValue> fmParams) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new DerivedExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams, 
				fmParams);		
	}
	
	Formula generatePatternInstance(
			FutureExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> fmParams
			) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new FutureExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams, 
				fmParams);	
	}
	
	Formula generatePatternInstance(
			PastExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> fmParams
			) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new PastExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams, 
				fmParams);	
	}
	
	
}

class FunctionalParameterList {
	Map<String, Integer> paramNameCounter = new HashMap<>();
	List<FunctionalParameter> params;
	
	FunctionalParameter renemeAndAddFnParam(FunctionalParameter fnParam) {
		String name = fnParam.getName();
		Integer number = paramNameCounter.get(name);
		int n;
		if (number == null)
			n = 0;
		else n = number + 1;
		paramNameCounter.put(name,  n);
		RPLFactory factory = RPLFactoryImpl.init();
		FunctionalParameter renamed = factory.createFunctionalParameter();
		renamed.setName(name + '_' + n);
		params.add(renamed);
		return renamed;
	}
	
	List<FunctionalParameter> renameAllFnParams(List<FunctionalParameter> original) {
		List<FunctionalParameter> renamedFnParams = new ArrayList<>();
		for (FunctionalParameter fnParam: original) {
			FunctionalParameter renamed = renemeAndAddFnParam(fnParam);
			renamedFnParams.add(renamed);
		}
		return renamedFnParams;
	}
}
