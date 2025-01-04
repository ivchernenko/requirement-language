package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.Term;

public class PastRequirementPatternInstance extends Formula {
	private PastRequirementPattern pattern;
	private List<Term> cParams;
	private List<Formula> fmParams;
	
	public PastRequirementPatternInstance(PastRequirementPattern pattern, List<Term> cParams, List<Formula> fmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fmParams = fmParams;
	}
	
	public PastRequirementPattern getPattern() {
		return pattern;
	}

	public List<Term> getcParams() {
		return cParams;
	}

	public List<Formula> getFmParams() {
		return fmParams;
	}
	
	
}
