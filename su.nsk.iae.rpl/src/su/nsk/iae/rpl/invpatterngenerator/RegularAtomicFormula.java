package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class RegularAtomicFormula implements PatternFreeInnerFormula {
	private final RegularFormulaParameter renamed;
	private final RegularFormulaParameter original;
	private final List<UpdateStateVariable> states;
	public List<UpdateStateVariable> getStates() {
		return states;
	}
	public RegularAtomicFormula(
			RegularFormulaParameter renamed,
			RegularFormulaParameter original,
			List<UpdateStateVariable> states) {
		super();
		this.renamed = renamed;
		this.original = original;
		this.states = states;
	}
	
	public RegularAtomicFormula(
			RegularFormulaParameter renamed,
			RegularFormulaParameter original) {
		super();
		this.renamed = renamed;
		this.original = original;
		this.states = new ArrayList<>();
	}
	
	public RegularFormulaParameter getRenamed() {
		return renamed;
	}
	public RegularFormulaParameter getOriginal() {
		return original;
	}
	
	public String getName() {
		return renamed.getName();
	}
	
	public String getOriginalName() {
		return original.getName();
	}
	@Override
	public PatternFreeInnerFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		List<UpdateStateVariable> newStates = new ArrayList<>();
		for (int i = 0; i < states.size(); i++) {
			UpdateStateVariable s = states.get(i);
			s = substitution.getOrDefault(s,  s);
			newStates.add(s);
		}
		return new RegularAtomicFormula(renamed, original, newStates);
	}
	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		List<UpdateStateVariable> newStates = new ArrayList<>(this.states);
		newStates.addAll(states);
		return new RegularAtomicFormula(renamed, original, newStates);
	}
	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		return new GeneralizedAlwaysImplication(
				state,
				new FormulaParameterValue(lambdaBound, this),
				new FormulaParameterValue(lambdaBound, right));
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return false;
	}
	@Override
	public List<String> getUsedPatternNames() {
		return new ArrayList<>();
	}
	
	@Override
	public String toString() {
		if (states == null || states.isEmpty())
			return renamed.getName();
		else {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append('(').append(renamed.getName());
			for (UpdateStateVariable state: states)
				stringBuilder.append(' ').append(state.getName());
			stringBuilder.append(')');
			return stringBuilder.toString();
		}
	}
	@Override
	public LemmaPremise generateParticularLemmaPremise(
			Map<RegularFormulaParameter, RegularFormulaParameter> paramMapping) {
		return new RegularAtomicFormula(paramMapping.get(renamed), original, states);
	}

}
