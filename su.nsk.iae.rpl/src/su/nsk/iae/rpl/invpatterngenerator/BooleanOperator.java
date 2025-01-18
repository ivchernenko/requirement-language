package su.nsk.iae.rpl.invpatterngenerator;

public enum BooleanOperator {
	CONJUNCTION {
		@Override
		public String toString() {
			return "\\<and>";
		}
	}, DISJUNCTION {
		@Override
		public String toString() {
			return "\\<or>";
		}
	};
}
