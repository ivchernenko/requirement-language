package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class NegationFormula implements PatternFreeInnerFormula  {
	PatternFreeInnerFormula formula;

	public PatternFreeInnerFormula getAtomic() {
		return formula;
	}

	public NegationFormula(PatternFreeInnerFormula formula) {
		super();
		this.formula = formula;
	}

	@Override
	public NegationFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		return new NegationFormula(formula.replaceStates(substitution));
	}

	@Override
	public NegationFormula applyToStates(List<UpdateStateVariable> states) {
		return new NegationFormula(formula.applyToStates(states));
	}

	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		return BooleanLiteral.TRUE;
	}

	@Override
	public boolean equalsToRequirementFormula() {
		return true;
	}

	@Override
	public List<String> getUsedPatternNames() {
		return new ArrayList<>();
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("(\\<not> ").append(formula).append(')')
				.toString();
	}

}
