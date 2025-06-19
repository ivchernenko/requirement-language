package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public abstract class Term implements PatternFreeInnerFormula {
	public abstract Term substrituteCParam(Map<String, Term> values);
	public abstract Term substituteFunctionalParameter(Map<String, FunctionalParameter> values);
	
	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		return this;
	}
	@Override
	public LemmaPremise replacePatternsForImplication(Formula right, 
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state) {
		return BooleanLiteral.TRUE;
	}
	
	@Override
	public List<String> getUsedPatternNames() {
		return new ArrayList<>();
	}
	@Override
	public LemmaPremise generateParticularLemmaPremise() {
		return this;
	}
	
	abstract su.nsk.iae.rpl.rPL.Term convertToRPLTerm();
	
	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		su.nsk.iae.rpl.rPL.Term term = convertToRPLTerm();
		AtomicFormula atomic = factory.createAtomicFormula();
		atomic.setBoolTerm(term);
		su.nsk.iae.rpl.rPL.NegationFormula formula = factory.createNegationFormula();
		formula.setRight(atomic);
		formula.setNeg(false);
		PrimaryLemmaPremiseFormula premise = factory.createPrimaryLemmaPremiseFormula();
		premise.setAtomic(formula);
		return premise;
	}
	@Override
	public PatternFreeInnerFormula negate() {
		return new NegationFormula(this);
	}
	@Override
	public String generateProofScriptForNotIdenticallyTrueImplication(Formula right,
			List<UpdateStateVariable> lambdaBound, UpdateStateVariable state, ProofScriptGenerator generator) {
		return generator.generateForIdenticallyTrueImplication();
	}
	@Override
	public String generateProofScript(UpdateStateVariable initState, ProofScriptGenerator generator) {
		return generator.generateProofByAssumption();
	}
	@Override
	public String generateProofScriptForNegation(UpdateStateVariable initState, ProofScriptGenerator generator) {
		return generator.generateProofByAssumption();
	}
	@Override
	public boolean equalsToRequirementFormula() {
		return true;
	}
	
}
