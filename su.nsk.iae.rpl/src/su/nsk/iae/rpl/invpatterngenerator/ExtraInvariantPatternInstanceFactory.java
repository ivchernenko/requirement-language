package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Term;

public class ExtraInvariantPatternInstanceFactory {
	public static OuterExtraInvariantFormula generatePatternInstance(
			DerivedExtraInvariantPattern pattern, 
			List<Term> cParams,
			List<FormulaParameterValue> fmParams,
			FunctionalParameterList fnParamList) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new DerivedExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams, 
				fmParams);		
	}
	
	public static OuterExtraInvariantFormula generatePatternInstance(
			FutureExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> fmParams,
			FunctionalParameterList fnParamList
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
	
	public static OuterExtraInvariantFormula generatePatternInstance(
			PastExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> fmParams,
			FunctionalParameterList fnParamList
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
