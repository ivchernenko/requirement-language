package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.Term;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class PastRequirementPatternInstance implements InnerExtraInvariantFormula {
	private PastRequirementPattern pattern;
	private List<Term> cParams;
	private List<FormulaParameterValue> fmParams;
	private FunctionalParameter boolParam;
	private final UpdateStateVariable finState;
	public UpdateStateVariable getFinState() {
		return finState;
	}

	public UpdateStateVariable getCurState() {
		return curState;
	}

	private final UpdateStateVariable curState;
	
	
	
	public FunctionalParameter getBoolParam() {
		return boolParam;
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

	public PastRequirementPatternInstance(PastRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> fmParams, FunctionalParameter boolParam, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fmParams = fmParams;
		this.boolParam = boolParam;
		this.finState = finState;
		this.curState = curState;
	}
	
	
}
