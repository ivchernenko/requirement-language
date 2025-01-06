package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConjunctionInnerFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.InnerFormula;
import su.nsk.iae.rpl.rPL.NegationFormula;
import su.nsk.iae.rpl.rPL.PrimaryInnerFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class InnerFormulaGenerator {
	FunctionalParameterList fnParamList;

	public InnerFormulaGenerator(FunctionalParameterList fnParamList) {
		super();
		this.fnParamList = fnParamList;
	}
	
	public Formula generateInnerFormula(InnerFormula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public Formula generateInnerFormula(ConjunctionInnerFormula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public Formula generateInnerFormula(PrimaryInnerFormula reqFormula) {
		if (reqFormula.getAtomic() != null) { // atomic formula or its negation
			NegationFormula negFormula = reqFormula.getAtomic();
			boolean neg = negFormula.isNeg();
			su.nsk.iae.rpl.rPL.AtomicFormula atomic = negFormula.getRight();
			if (! neg && atomic.getFmParam() != null) {
				FormulaParameter original = atomic.getFmParam();
				RPLFactory factory = RPLFactoryImpl.init();
				FormulaParameter renamed = factory.createFormulaParameter();
				renamed.setName(original.getName() + "'");
				su.nsk.iae.rpl.rPL.AtomicFormula renamedAtomic = factory.createAtomicFormula();
				renamedAtomic.setFmParam(renamed);
				renamedAtomic.getStates().addAll(atomic.getStates());
			}
		}
	}
}
