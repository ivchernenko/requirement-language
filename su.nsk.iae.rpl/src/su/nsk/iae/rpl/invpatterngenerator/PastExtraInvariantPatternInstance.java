package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class PastExtraInvariantPatternInstance implements LS8LemmaPremise {
	private PastExtraInvariantPattern pattern;
	private List<Term> cParams;
	private List<FunctionalParameter> fnParams;
	private List<FormulaParameterValue> fmParams;
	private FunctionalParameter boolParam;
	private final UpdateStateVariable state;
	
	public UpdateStateVariable getState() {
		return state;
	}

	public PastExtraInvariantPatternInstance(PastExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams, FunctionalParameter boolParam) {
		this(pattern, cParams, fnParams, fmParams, boolParam, null);
	}
	
	public PastExtraInvariantPatternInstance(PastExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams, FunctionalParameter boolParam,
			UpdateStateVariable state) {
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.fmParams = fmParams;
		this.boolParam = boolParam;
		this.state = state;
	}
	
	public FunctionalParameter getBoolParam() {
		return boolParam;
	}
	public void setBoolParam(FunctionalParameter boolParam) {
		this.boolParam = boolParam;
	}

	public PastExtraInvariantPattern getPattern() {
		return pattern;
	}
	
	public List<Term> getcParams() {
		return cParams;
	}
	
	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}
	public void setFnParams(List<FunctionalParameter> fnParams) {
		this.fnParams = fnParams;
	}
	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}
	
}
