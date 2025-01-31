package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.Constant;
import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.NumericLiteral;
import su.nsk.iae.rpl.rPL.PrimaryTerm;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class NumericConstant extends Term {
	private final Number number;

	public NumericConstant(Number number) {
		super();
		this.number = number;
	}

	public Number getNumber() {
		return number;
	}

	@Override
	public Term substrituteCParam(Map<ConstantParameter, Term> values) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		return this;
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		return this;
	}
	
	@Override
	public String toString() {
		return number.toString();
	}

	@Override
	su.nsk.iae.rpl.rPL.Term convertToRPLTerm() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		NumericLiteral numLiteral = factory.createNumericLiteral();
		numLiteral.setValue(number.toString());
		Constant constant = factory.createConstant();
		constant.setNum(numLiteral);
		PrimaryTerm term = factory.createPrimaryTerm();
		term.setConst(constant);
		return term;
	}

	
}
