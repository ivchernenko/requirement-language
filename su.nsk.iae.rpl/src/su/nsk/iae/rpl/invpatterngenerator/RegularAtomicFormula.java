package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.AtomicFormulaImpl;
import su.nsk.iae.rpl.rPL.impl.UpdateStateVariableImpl;

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
	public PatternFreeInnerFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		List<UpdateStateVariable> newStates = new ArrayList<>();
		for (int i = 0; i < states.size(); i++) {
			UpdateStateVariable s = states.get(i);
			s = substitution.getOrDefault(s.getName(),  s);
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
	public LemmaPremise generateParticularLemmaPremise() {
		return this;
	}
	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		AtomicFormulaImpl atomic = (AtomicFormulaImpl) factory.createAtomicFormula();
		atomic.setFmParam(renamed);
		List<UpdateStateVariable> rStates = atomic.getStates();
		//atomic.eSet(RPLPackage.ATOMIC_FORMULA__STATES, states);
		for (UpdateStateVariable s: states) {
			UpdateStateVariableImpl newS = (UpdateStateVariableImpl) factory.createUpdateStateVariable();
			newS.setName(s.getName());
			rStates.add(newS);
		}
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
	@Override
	public String generateProofScriptForNotIdenticallyTrueImplication(Formula right,
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state, ProofScriptGenerator generator) {
		return generator.generateProofByAssumption();
	}
	@Override
	public String generateProofScript(UpdateStateVariable initState, ProofScriptGenerator generator) {
		return generator.generateProofByAssumption();
	}
	@Override
	public String generateProofScriptForNegation(UpdateStateVariable initState, ProofScriptGenerator generator) {
		return generator.generateProofByAssumption();
	}

}
