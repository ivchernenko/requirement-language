package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

public class ExtendedInvariant extends OuterExtraInvariantFormula {
	OuterExtraInvariantFormula mainConj;
	List<OuterExtraInvariantFormula> extraConjs;
	public ExtendedInvariant(OuterExtraInvariantFormula mainConj, List<OuterExtraInvariantFormula> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public OuterExtraInvariantFormula getMainConj() {
		return mainConj;
	}
	public List<OuterExtraInvariantFormula> getExtraConjs() {
		return extraConjs;
	}
}
