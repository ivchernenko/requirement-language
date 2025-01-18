package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ExtraInvariantPatternInstanceFactory {
	public static DerivedExtraInvariantPatternInstance generatePatternInstance(
			DerivedExtraInvariantPattern pattern, 
			List<Term> cParams,
			List<FormulaParameterValue> simpleFmParams,
			List<FormulaParameterValue> regFmParams,
			FunctionalParameterList fnParamList) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new DerivedExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams, 
				simpleFmParams,
				regFmParams);		
	}
	
	public static InnerExtraInvariantFormula generatePatternInstance(
			FutureExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> fmParams,
			UpdateStateVariable finState,
			UpdateStateVariable curState,
			FunctionalParameterList fnParamList
			) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new FutureExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams, 
				fmParams,
				finState,
				curState);	
	}
	
	public static PastExtraInvariantPatternInstance generatePatternInstance(
			PastExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> fmParams,
			FunctionalParameter boolParam,
			FunctionalParameterList fnParamList
			) {
		List<FunctionalParameter> original = pattern.getFnParams();
		List<FunctionalParameter> fnParams = fnParamList
				.renameAllFnParams(original);
		return new PastExtraInvariantPatternInstance(
				pattern, 
				cParams, 
				fnParams,
				fmParams,
				boolParam,
				null,
				false);	
	}
}
