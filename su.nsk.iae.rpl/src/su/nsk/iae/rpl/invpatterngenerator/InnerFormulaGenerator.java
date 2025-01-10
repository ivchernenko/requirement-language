package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.BasicRequirementPattern;
import su.nsk.iae.rpl.rPL.BasicRequirementPatternInstance;
import su.nsk.iae.rpl.rPL.ConjunctionInnerFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureRequirementPattern;
import su.nsk.iae.rpl.rPL.InnerFormula;
import su.nsk.iae.rpl.rPL.NegationFormula;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.PrimaryInnerFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class InnerFormulaGenerator {
	FunctionalParameterList fnParamList;

	public InnerFormulaGenerator(FunctionalParameterList fnParamList) {
		super();
		this.fnParamList = fnParamList;
	}

	public InnerExtraInvariantFormula generateInnerFormula(InnerFormula reqFormula) {
		InnerExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		InnerExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new InnerBooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}

	public InnerExtraInvariantFormula generateInnerFormula(ConjunctionInnerFormula reqFormula) {
		InnerExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		InnerExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new InnerBooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}

	public InnerExtraInvariantFormula generateInnerFormula(PrimaryInnerFormula reqFormula) {
		InnerExtraInvariantFormula atomicFormula;
		if (reqFormula.getAtomic() != null) { // atomic formula or its negation
			NegationFormula negFormula = reqFormula.getAtomic();
			boolean neg = negFormula.isNeg();
			su.nsk.iae.rpl.rPL.AtomicFormula atomic = negFormula.getRight();
			FormulaParameter fmParam = atomic.getFmParam();
			if (! neg) {
				return generateNonNegativeAtomicFormula(atomic);
			}
			else
				return new FinalStateLambdaAbstraction(generateNegativeAtomicFormula(atomic));
		} else if (reqFormula.getPatternInst() != null) { // pattern instance
			BasicRequirementPatternInstance patternInst = reqFormula.getPatternInst();
			BasicRequirementPattern pattern = patternInst.getPattern();
			List<FormulaParameterValue> transformedFmParams = new ArrayList<>();
			for (su.nsk.iae.rpl.rPL.FormulaParameterValue fmParam : patternInst.getFmParams()) {
				InnerFormula formula = fmParam.getFormula();
				InnerExtraInvariantFormula extraInvFormula = formula.generateFormula(this);
				FormulaParameterValue val = new FormulaParameterValue(fmParam.getStates(), extraInvFormula);
				transformedFmParams.add(val);
			}
			InnerExtraInvariantFormula extraInvPatternInst;
			if (pattern instanceof FutureRequirementPattern futurePattern) {
				extraInvPatternInst = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
						futurePattern.getExtraInvPattern(),
						patternInst.getCParams(),
						transformedFmParams,
						patternInst.getFinState(),
						patternInst.getCurState(),
						fnParamList);
			} else {
				PastRequirementPattern pastPattern = (PastRequirementPattern) pattern;
				RPLFactory factory = RPLFactoryImpl.init();
				FunctionalParameter newParam = factory.createFunctionalParameter();
				newParam.setName("b");
				newParam = fnParamList.renemeAndAddFnParam(newParam);
				extraInvPatternInst = new PastRequirementPatternInstance(pastPattern, patternInst.getCParams(),
						transformedFmParams, newParam, patternInst.getFinState(), patternInst.getCurState());
			}
			return extraInvPatternInst;
		}	
		else // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
	}

	InnerExtraInvariantFormula generateNonNegativeAtomicFormula(AtomicFormula atomic) {
		FormulaParameter fmParam = atomic.getFmParam();
		if (fmParam != null) {
			if (fmParam instanceof RegularFormulaParameter original) {
				RPLFactory factory = RPLFactoryImpl.init();
				RegularFormulaParameter renamed = factory.createRegularFormulaParameter();
				renamed.setName(original.getName() + "'");
				return new ExtraInvariantFormulaParameter(renamed, original, atomic.getStates());
			} else {
				SimpleFormulaParameter simpleFmParam = (SimpleFormulaParameter) fmParam;
				SimpleAtomicFormula A = new SimpleAtomicFormula(simpleFmParam, atomic.getStates());
				return new FinalStateLambdaAbstraction(A);
			}
		} else {
			String boolLiteral = atomic.getBoolLiteral();
			if (boolLiteral != null) {
				return BooleanLiteral.valueOf(boolLiteral);
			} else // boolean term
				throw new UnsupportedOperationException("boolean term are unsupported.");
		}

	}

	FutureBoundIndependentFormula generateNegativeAtomicFormula(AtomicFormula atomic) {
		FutureBoundIndependentFormula atomicFormula;
		SimpleFormulaParameter fmParam = (SimpleFormulaParameter) atomic.getFmParam();
		if (fmParam != null) {
			atomicFormula = new SimpleAtomicFormula(fmParam, atomic.getStates());
		}
		else {
			String boolLiteral = atomic.getBoolLiteral();
			if (boolLiteral != null) {
				atomicFormula = BooleanLiteral.valueOf(boolLiteral);
			}
			else // boolean term
				throw new UnsupportedOperationException("Boolean terms are not supported.");
		}
		return new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicFormula);
	}
}
