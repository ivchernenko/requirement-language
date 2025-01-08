package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public class ExtendedInvariant {
	OuterExtraInvariantFormula mainConj;
	List<PastExtraInvariantPatternInstance> extraConjs;
	public ExtendedInvariant(OuterExtraInvariantFormula mainConj, List<PastExtraInvariantPatternInstance> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public OuterExtraInvariantFormula getMainConj() {
		return mainConj;
	}
	public List<PastExtraInvariantPatternInstance> getExtraConjs() {
		return extraConjs;
	}
}
