package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.BasicRequirementPattern;
import su.nsk.iae.rpl.rPL.BasicRequirementPatternInstance;
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
		if (left instanceof InnerExtraInvariantFormula iLeft) {
			InnerExtraInvariantFormula iRight = (InnerExtraInvariantFormula) right;
			return new InnerBooleanFormula(
					BooleanOperator.DISJUNCTION,
					iLeft,
					iRight);
		}
		else if (left instanceof FutureBoundIndependentFormula fbiLeft) {
			FutureBoundIndependentFormula fbiRight = 
					(FutureBoundIndependentFormula) right;
			return new FutureBoundIndependentBooleanFormula(
					BooleanOperator.DISJUNCTION,
					fbiLeft,
					fbiRight);
		}
	}
	
	public Formula generateInnerFormula(ConjunctionInnerFormula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		if (left instanceof InnerExtraInvariantFormula iLeft) {
			InnerExtraInvariantFormula iRight = (InnerExtraInvariantFormula) right;
			return new InnerBooleanFormula(
					BooleanOperator.CONJUNCTION,
					iLeft,
					iRight);					
		}
		else if (left instanceof FutureBoundIndependentFormula fbiLeft) {
			FutureBoundIndependentFormula fbiRight =
					(FutureBoundIndependentFormula) right;
			return new FutureBoundIndependentBooleanFormula(
					BooleanOperator.CONJUNCTION,
					fbiLeft,
					fbiRight);
		}
	}
	
	public InnerExtraInvariantFormula generateInnerFormula(PrimaryInnerFormula reqFormula) {
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
				renamedAtomic.getStates().clear();
				renamedAtomic.getStates().addAll(atomic.getStates());
				atomic = renamedAtomic;
			}
			AtomicFormula atomicFormula = new AtomicFormula(atomic);
			if (neg)
				return new su.nsk.iae.rpl.invpatterngenerator
						.NegationFormula(atomicFormula);
			else
				return atomicFormula;
		}
		else if (reqFormula.getPatternInst() != null) { // pattern instance
			BasicRequirementPatternInstance patternInst = reqFormula.getPatternInst();
			BasicRequirementPattern pattern = patternInst.getPattern();
			List<FormulaParameterValue> transformedFmParams = new ArrayList<>();
			for (var fmParam: patternInst.getFmParams()) {
				InnerFormula formula = fmParam.getFormula();
				OuterExtraInvariantFormula extraInvFormula = formula.generateFormula(this);
				FormulaParameterValue value = new FormulaParameterValue(
						fmParam.getStates(), 
						extraInvFormula);
				transformedFmParams.add(value);
			}
			return pattern.createBasicPatternInstanceForExtraInv(
					patternInst.getCParams(),
					transformedFmParams,
					fnParamList);
					
		}
		else // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
	}
}
