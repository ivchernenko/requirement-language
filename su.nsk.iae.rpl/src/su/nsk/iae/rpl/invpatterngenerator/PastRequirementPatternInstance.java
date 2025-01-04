package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.Term;

public class PastRequirementPatternInstance extends Formula {
	private PastRequirementPattern pattern;
	private List<Term> cParams;
	private List<FormulaParameterValue> fmParams;
	private FunctionalParameter boolParam;
	
	public PastRequirementPatternInstance(
			PastRequirementPattern pattern,
			List<Term> cParams, 
			List<FormulaParameterValue> fmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fmParams = fmParams;
	}
	
	public FunctionalParameter getBoolParam() {
		return boolParam;
	}

	public void setBoolParam(FunctionalParameter boolParam) {
		this.boolParam = boolParam;
	}
	
	public PastRequirementPattern getPattern() {
		return pattern;
	}

	public List<Term> getcParams() {
		return cParams;
	}

	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}
	
	
}
