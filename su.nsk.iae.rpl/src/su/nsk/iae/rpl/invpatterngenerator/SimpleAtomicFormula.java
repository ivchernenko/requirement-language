package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class SimpleAtomicFormula implements PatternFreeInnerFormula {
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
	public PatternFreeInnerFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		List<UpdateStateVariable> newStates = new ArrayList<>();
		for (int i = 0; i < states.size(); i++) {
			UpdateStateVariable s = states.get(i);
			s = substitution.getOrDefault(s,  s);
			newStates.add(s);
		}
		return new SimpleAtomicFormula(fmParam, newStates);
	}

	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		List<UpdateStateVariable> newStates = new ArrayList<>(this.states);
		newStates.addAll(states);
		return new SimpleAtomicFormula(fmParam, newStates);
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
		if (states == null || states.isEmpty())
			return fmParam.getName();
		else {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append('(').append(fmParam.getName());
			for (UpdateStateVariable state: states)
				stringBuilder.append(' ').append(state.getName());
			stringBuilder.append(')');
			return stringBuilder.toString();
		}
	}

	@Override
	public LemmaPremise generateParticularLemmaPremise(
			Map<RegularFormulaParameter, RegularFormulaParameter> paramMapping) {
		return this;
	}
	
	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		AtomicFormula atomic = factory.createAtomicFormula();
		atomic.setFmParam(fmParam);
		atomic.getStates().addAll(states);
		su.nsk.iae.rpl.rPL.NegationFormula negFormula = factory.createNegationFormula();
		negFormula.setRight(atomic);
		negFormula.setNeg(false);
		PrimaryLemmaPremiseFormula formula = factory.createPrimaryLemmaPremiseFormula();
		formula.setAtomic(negFormula);
		return formula;
	}
	@Override
	public PatternFreeInnerFormula negate() {
		return new NegationFormula(this);
	}
}
