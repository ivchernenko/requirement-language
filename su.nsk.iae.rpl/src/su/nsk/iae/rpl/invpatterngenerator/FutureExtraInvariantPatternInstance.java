package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Term;

public class FutureExtraInvariantPatternInstance extends Formula {
	private FutureExtraInvariantPattern pattern;
	private List<Term> cParams;
	private List<FunctionalParameter> fnParams;
	private List<FormulaParameterValue> fmParams;
	
	public FutureExtraInvariantPatternInstance(FutureExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.fmParams = fmParams;
	}
	
	public FutureExtraInvariantPattern getPattern() {
		return pattern;
	}
	
	public List<Term> getcParams() {
		return cParams;
	}
	
	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}
	
	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}
	
}
