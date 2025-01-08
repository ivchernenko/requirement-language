package su.nsk.iae.rpl.invpatterngenerator;

public class NegationFormula extends OuterExtraInvariantFormula {
	AtomicFormula atomic;

	public AtomicFormula getAtomic() {
		return atomic;
	}

	public NegationFormula(AtomicFormula atomic) {
		super();
		this.atomic = atomic;
	}

}
