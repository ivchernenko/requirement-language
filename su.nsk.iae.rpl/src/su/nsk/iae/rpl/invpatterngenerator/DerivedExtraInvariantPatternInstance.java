package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;

public class DerivedExtraInvariantPatternInstance extends OuterExtraInvariantFormula {
	private final DerivedExtraInvariantPattern pattern;
	private final List<Term> cParams;
	private final List<FunctionalParameter> fnParams;
	private final List<PatternFreeFormulaParameterValue> simpleFmParams;
	private List<FormulaParameterValue> regFmParams;
	
	public DerivedExtraInvariantPatternInstance(
			DerivedExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FunctionalParameter> fnParams,
			List<PatternFreeFormulaParameterValue> simpleFmParams,
			List<FormulaParameterValue> fmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = fmParams;
	}

	public List<FormulaParameterValue> getRegFmParams() {
		return regFmParams;
	}

	public void setRegFmParams(List<FormulaParameterValue> regFmParams) {
		this.regFmParams = regFmParams;
	}

	public DerivedExtraInvariantPattern getPattern() {
		return pattern;
	}

	public List<Term> getcParams() {
		return cParams;
	}

	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}

	public List<PatternFreeFormulaParameterValue> getSimpleFmParams() {
		return simpleFmParams;
	}
	

}
