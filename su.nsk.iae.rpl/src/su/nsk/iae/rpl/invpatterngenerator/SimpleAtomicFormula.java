package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class SimpleAtomicFormula implements InnerExtraInvariantFormula {
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

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		List<UpdateStateVariable> newStates = new ArrayList<>();
		for (int i = 0; i < states.size(); i++) {
			UpdateStateVariable s = states.get(i);
			s = substitution.getOrDefault(s,  s);
			newStates.add(s);
		}
		return new SimpleAtomicFormula(fmParam, newStates);
	}

	@Override
	public InnerExtraInvariantFormula applyToStates(List<UpdateStateVariable> states) {
		List<UpdateStateVariable> newStates = new ArrayList<>(this.states);
		newStates.addAll(states);
		return new SimpleAtomicFormula(fmParam, newStates);
	}

	@Override
	public LemmaPremise replacePatternsForNotIdenticallyTrueImplication(DerivedLemmaScheme LS) {
		return this;
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
		if (states == null || states.isEmpty())
			return fmParam.getName();
		else {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append('(').append(fmParam.getName());
			for (UpdateStateVariable state: states)
				stringBuilder.append(' ').append(state);
			stringBuilder.append(')');
			return stringBuilder.toString();
		}
	}
}
