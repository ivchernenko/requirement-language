package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class SimpleAtomicFormula implements FutureBoundIndependentFormula {
	private final SimpleFormulaParameter fmParam;
	private final List<UpdateStateVariable> states;
	
	public String getName() {
		return fmParam.getName();
	}

	public SimpleAtomicFormula(SimpleFormulaParameter fmParam, List<UpdateStateVariable> states) {
		super();
		this.fmParam = fmParam;
		this.states = states;
	}

	public SimpleFormulaParameter getFmParam() {
		return fmParam;
	}

	public List<UpdateStateVariable> getStates() {
		return states;
	}
}
