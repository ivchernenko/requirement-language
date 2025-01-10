package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Term;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FutureExtraInvariantPatternInstance implements InnerExtraInvariantFormula {
	private FutureExtraInvariantPattern pattern;
	private List<Term> cParams;
	private List<FunctionalParameter> fnParams;
	private List<FormulaParameterValue> fmParams;
	private final UpdateStateVariable finState;
	private final UpdateStateVariable curState;
	
	public UpdateStateVariable getFinState() {
		return finState;
	}

	public UpdateStateVariable getCurState() {
		return curState;
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

	public FutureExtraInvariantPatternInstance(FutureExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.fmParams = fmParams;
		this.finState = finState;
		this.curState = curState;
	}

	@Override
	public List<OuterExtraInvariantFormula> generateExtraConjuncts() {
		List<OuterExtraInvariantFormula> extraConjs = new ArrayList<>();
		for (FormulaParameterValue fmParamValue: fmParams)
			extraConjs.addAll(fmParamValue.getFormula().generateExtraConjuncts());
		return extraConjs;
	}
	
	
}
