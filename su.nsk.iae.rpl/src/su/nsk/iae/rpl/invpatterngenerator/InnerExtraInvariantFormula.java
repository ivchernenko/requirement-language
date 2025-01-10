package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

public interface InnerExtraInvariantFormula {
	default List<OuterExtraInvariantFormula> generateExtraConjuncts() {
		return new ArrayList<>();
	}

}
