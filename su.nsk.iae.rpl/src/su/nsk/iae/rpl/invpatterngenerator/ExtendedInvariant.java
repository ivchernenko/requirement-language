package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;

public class ExtendedInvariant extends OuterExtraInvariantFormula {
	DerivedExtraInvariantPatternInstance mainConj;
	List<OuterExtraInvariantFormula> extraConjs;
	public ExtendedInvariant(DerivedExtraInvariantPatternInstance mainConj, List<OuterExtraInvariantFormula> extraConjs) {
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
	@Override
	public LS8LemmaPremise generateL8() {
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L8 = pattern.getLemmas().getL8();
		
	}
	
	LS8LemmaPremise premiseInstanceForInv(Lemma L, DerivedExtraInvariantPatternInstance I) {
		LemmaPremiseFormula premise = L.getPrem();
	}
}
