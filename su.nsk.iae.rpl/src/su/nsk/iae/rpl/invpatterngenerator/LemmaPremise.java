package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface LemmaPremise {

	default LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return this;
	}

}
