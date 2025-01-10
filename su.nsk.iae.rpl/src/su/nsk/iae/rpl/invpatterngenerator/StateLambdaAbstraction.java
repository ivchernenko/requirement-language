package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class StateLambdaAbstraction extends Formula {
	
	private final Formula formula;
	private final List<UpdateStateVariable> states;

	@Override
	FormulaFactory createFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Formula lambdaAbstract(UpdateStateVariable variable, boolean finalState) {
		List<UpdateStateVariable> newStates = new ArrayList<>(states);
		newStates.addFirst(variable);
		return new StateLambdaAbstraction(formula, newStates);
	}

	public StateLambdaAbstraction(Formula formula, List<UpdateStateVariable> states) {
		super();
		this.formula = formula;
		this.states = states;
	}

	public Formula getFormula() {
		return formula;
	}

	public List<UpdateStateVariable> getStates() {
		return states;
	}

}
