package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class AtomicFormula extends Formula {
	FormulaParameter fmParam;
	List<UpdateStateVariable> states;
	
	public AtomicFormula(FormulaParameter fmParam, List<UpdateStateVariable> states) {
		super();
		this.fmParam = fmParam;
		this.states = states;
	}

	public FormulaParameter getFmParam() {
		return fmParam;
	}

	public List<UpdateStateVariable> getStates() {
		return states;
	}
	
	
}
