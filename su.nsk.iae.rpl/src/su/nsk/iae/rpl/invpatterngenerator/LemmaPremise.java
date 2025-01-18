package su.nsk.iae.rpl.invpatterngenerator;

public interface LemmaPremise {

	default LemmaPremise replacePatterns(DerivedLemmaScheme LS) {
		return this;
	}

}
