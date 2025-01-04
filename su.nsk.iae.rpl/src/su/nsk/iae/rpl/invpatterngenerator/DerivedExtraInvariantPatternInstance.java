package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Term;

public class DerivedExtraInvariantPatternInstance extends Formula {
	private DerivedExtraInvariantPattern pattern;
	private List<Term> cParams;
	private List<FunctionalParameter> fnParams;
	private List<FormulaParameterValue> fmParams;
	public DerivedExtraInvariantPatternInstance(DerivedExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.fmParams = fmParams;
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
	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}
	

}
