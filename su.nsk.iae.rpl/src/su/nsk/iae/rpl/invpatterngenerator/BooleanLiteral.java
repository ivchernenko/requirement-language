package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.Constant;
import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryLemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PrimaryTerm;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class BooleanLiteral extends Term implements PatternFreeInnerFormula {
	private final boolean value;
	
	 private BooleanLiteral(boolean value) {
		 this.value = value;
	 }
	 
	 public static BooleanLiteral TRUE = new BooleanLiteral(true);
	 public static BooleanLiteral FALSE = new BooleanLiteral(false);
	 
	 public static BooleanLiteral valueOf(String value) {
		 boolean isTrue = Boolean.parseBoolean(value.toLowerCase());
		 if (isTrue) return TRUE;
		 else return FALSE;
	 }

	@Override
	public Term substrituteCParam(Map<String, Term> value) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(Map<String, FunctionalParameter> values) {
		return this;
	}

	@Override
	public PatternFreeInnerFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		return this;
	}

	@Override
	public PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states) {
		return this;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o==this) return true;
		if (o == null) return false;
		if (o.getClass() != this.getClass()) return false;
		BooleanLiteral other = (BooleanLiteral) o;
		return this.value == other.value;
	}
	
	@Override
	public int hashCode() {
		return value ? 1 : 0;
	}

	@Override
	public boolean equalsToRequirementFormula() {
		return true;
	}
	
	@Override
	public String toString() {
		return value ? "True" : "False";
	}

	@Override
	public LemmaPremiseFormula convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		AtomicFormula atomic = factory.createAtomicFormula();
		atomic.setBoolLiteral(capitalize(String.valueOf(value)));
		su.nsk.iae.rpl.rPL.NegationFormula formula = factory.createNegationFormula();
		formula.setRight(atomic);
		formula.setNeg(false);
		PrimaryLemmaPremiseFormula premise = factory.createPrimaryLemmaPremiseFormula();
		premise.setAtomic(formula);
		return premise;
	}
	
	private String capitalize(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	@Override
	su.nsk.iae.rpl.rPL.Term convertToRPLTerm() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		Constant constant = factory.createConstant();
		constant.setBool(capitalize(String.valueOf(value)));
		PrimaryTerm term = factory.createPrimaryTerm();
		term.setConst(constant);
		return term;
	}

	@Override
	public PatternFreeInnerFormula negate() {
		return new NegationFormula(this);
	}
}
