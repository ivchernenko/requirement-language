package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public class ExtendedInvariant {
	Formula mainConj;
	List<PastExtraInvariantPatternInstance> extraConjs;
	public ExtendedInvariant(Formula mainConj, List<PastExtraInvariantPatternInstance> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public Formula getMainConj() {
		return mainConj;
	}
	public List<PastExtraInvariantPatternInstance> getExtraConjs() {
		return extraConjs;
	}
}
