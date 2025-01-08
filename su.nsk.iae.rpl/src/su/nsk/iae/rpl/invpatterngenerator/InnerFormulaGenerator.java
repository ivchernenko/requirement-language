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
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
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
		else if (left instanceof NonTemporalFormula ntLeft) {
			NonTemporalFormula ntRight = (NonTemporalFormula) right;
			return new NonTemporalBooleanFormula(
					BooleanOperator.DISJUNCTION,
					ntLeft,
					ntRight);
		}
		else throw new InvalidTypeException();
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
		else if (left instanceof NonTemporalFormula ntLeft) {
			NonTemporalFormula ntRight =  (NonTemporalFormula) right;
			return new NonTemporalBooleanFormula(
					BooleanOperator.CONJUNCTION,
					ntLeft,
					ntRight);
		}
		else throw new InvalidTypeException();
	}
	
	public Formula generateInnerFormula(PrimaryInnerFormula reqFormula) {
		if (reqFormula.getAtomic() != null) { // atomic formula or its negation
			NegationFormula negFormula = reqFormula.getAtomic();
			boolean neg = negFormula.isNeg();
			su.nsk.iae.rpl.rPL.AtomicFormula atomic = negFormula.getRight();
			FormulaParameter fmParam = atomic.getFmParam();
			if (fmParam != null) {
				if (fmParam instanceof RegularFormulaParameter original) {
					RPLFactory factory = RPLFactoryImpl.init();
					RegularFormulaParameter renamed = factory.createRegularFormulaParameter();
					renamed.setName(original.getName() + "'");
					ExtraInvariantFormulaParameter A = 
							new ExtraInvariantFormulaParameter(renamed, original);
					Formula atomicFormula = A;
					if (atomic.getStates().size() > 0) {
						FutureBoundedFormula As = new FutureBoundedFormula(
								A,
								atomic.getStates().get(0));
						atomicFormula = As;
						if (atomic.getStates().size() > 1) {
							FormulaApplicationToCurrent Ass1 = 
									new FormulaApplicationToCurrent(
											As,
											atomic.getStates().get(1));
							atomicFormula = Ass1;
						}
					}
					return atomicFormula;
				}
			}
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
