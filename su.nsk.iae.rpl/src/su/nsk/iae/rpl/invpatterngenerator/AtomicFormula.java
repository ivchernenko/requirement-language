package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class AtomicFormula extends OuterExtraInvariantFormula {
	su.nsk.iae.rpl.rPL.AtomicFormula formula;

	public AtomicFormula(su.nsk.iae.rpl.rPL.AtomicFormula formula) {
		super();
		this.formula = formula;
	}

	public su.nsk.iae.rpl.rPL.AtomicFormula getFormula() {
		return formula;
	}
	
	
	
	
}
