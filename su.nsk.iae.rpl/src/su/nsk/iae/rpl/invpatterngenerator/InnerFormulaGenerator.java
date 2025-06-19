package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.BasicRequirementPattern;
import su.nsk.iae.rpl.rPL.BasicRequirementPatternInstance;
import su.nsk.iae.rpl.rPL.ConjunctionInnerFormula;
import su.nsk.iae.rpl.rPL.ConjunctionPatternFreeFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.FutureRequirementPattern;
import su.nsk.iae.rpl.rPL.InnerFormula;
import su.nsk.iae.rpl.rPL.NegationFormula;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.PatternFreeFormula;
import su.nsk.iae.rpl.rPL.PrimaryInnerFormula;
import su.nsk.iae.rpl.rPL.PrimaryPatternFreeFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public abstract class InnerFormulaGenerator<T extends Formula> {

	public T generateInnerFormula(InnerFormula reqFormula) {
		T left = reqFormula.getLeft().generateFormula(this);
		T right = reqFormula.getRight().generateFormula(this);
		return createBooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}

	public T generateInnerFormula(ConjunctionInnerFormula reqFormula) {
		T left = reqFormula.getLeft().generateFormula(this);
		T right = reqFormula.getRight().generateFormula(this);
		return createBooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}

	public T generateInnerFormula(PrimaryInnerFormula reqFormula) {
		PatternFreeInnerFormula atomicFormula;
		if (reqFormula.getAtomic() != null) { // atomic formula or its negation
			NegationFormula negFormula = reqFormula.getAtomic();
			boolean neg = negFormula.isNeg();
			su.nsk.iae.rpl.rPL.AtomicFormula atomic = negFormula.getRight();
			atomicFormula = generateNonNegativeAtomicFormula(atomic);
			if (! neg) {
				return (T) atomicFormula;
			}
			else
				return (T) new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicFormula);
		} else if (reqFormula.getPatternInst() != null) { // pattern instance
			BasicRequirementPatternInstance patternInst = reqFormula.getPatternInst();
			BasicRequirementPattern pattern = patternInst.getPattern();
			List<FormulaParameterValue> transformedFmParams = new ArrayList<>();
			for (su.nsk.iae.rpl.rPL.FormulaParameterValue fmParam : patternInst.getFmParams()) {
				InnerFormula formula = fmParam.getFormula();
				T extraInvFormula = formula.generateFormula(this);
				FormulaParameterValue val = new FormulaParameterValue(fmParam.getStates(), extraInvFormula);
				transformedFmParams.add(val);
			}
			List<su.nsk.iae.rpl.invpatterngenerator.Term> cParams = new ArrayList<>();
			TermConverter converter = new TermConverter();
			for (var p: patternInst.getCParams()) {
				cParams.add(p.convert(converter));
			}
			T generatedPatternInst;
			if (pattern instanceof FutureRequirementPattern futurePattern) {
				generatedPatternInst = createFuturePatternInstance(
						futurePattern,
						cParams,
						transformedFmParams,
						patternInst.getFinState(),
						patternInst.getCurState());
			} else {
				PastRequirementPattern pastPattern = (PastRequirementPattern) pattern;
				generatedPatternInst = createPastPatternInstance(pastPattern, cParams,
						transformedFmParams, patternInst.getFinState(), patternInst.getCurState());
			}
			return generatedPatternInst;
		}	
		else // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
	}
	
	public PatternFreeInnerFormula generatePatternFreeFormula(PatternFreeFormula reqFormula) {
		PatternFreeInnerFormula left = reqFormula.getLeft().generateFormula(this);
		PatternFreeInnerFormula right = reqFormula.getRight().generateFormula(this);
		return new BooleanPatternFreeFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public PatternFreeInnerFormula generatePatternFreeFormula(ConjunctionPatternFreeFormula reqFormula) {
		PatternFreeInnerFormula left = reqFormula.getLeft().generateFormula(this);
		PatternFreeInnerFormula right = reqFormula.getRight().generateFormula(this);
		return new BooleanPatternFreeFormula(BooleanOperator.CONJUNCTION, left, right);
	}

	public PatternFreeInnerFormula generatePatternFreeFormula(PrimaryPatternFreeFormula reqFormula) {
		su.nsk.iae.rpl.rPL.NegationFormula negFormula = reqFormula.getAtomic();
		if (negFormula != null) {
			PatternFreeInnerFormula atomicFormula = generateNonNegativeAtomicFormula(negFormula.getRight());
			if (negFormula.isNeg())
				return new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicFormula);
			else return atomicFormula;
		}
		else // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		
	}

	PatternFreeInnerFormula generateNonNegativeAtomicFormula(AtomicFormula atomic) {
		FormulaParameter fmParam = atomic.getFmParam();
		if (fmParam != null) {
			if (fmParam instanceof RegularFormulaParameter original) {
				RPLFactory factory = RPLFactoryImpl.init();
				RegularFormulaParameter renamed = factory.createRegularFormulaParameter();
				renamed.setName(original.getName() + "'");
				return new Atomic(getCorrespondingFormulaParameter(original), atomic.getStates());
			} else {
				SimpleFormulaParameter simpleFmParam = (SimpleFormulaParameter) fmParam;
				Atomic A = new Atomic(simpleFmParam, atomic.getStates());
				return A;
			}
		} else {
			String boolLiteral = atomic.getBoolLiteral();
			if (boolLiteral != null) {
				return BooleanLiteral.valueOf(boolLiteral);
			} else // boolean term
				throw new UnsupportedOperationException("boolean term are unsupported.");
		}

	}
	
	abstract T createBooleanFormula(BooleanOperator operator, T left, T right);
	abstract T createFuturePatternInstance(
			FutureRequirementPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> transformedFmParams,
			UpdateStateVariable finState,
			UpdateStateVariable curStae);
	
	abstract T createPastPatternInstance(
			PastRequirementPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> transformedFmParams,
			UpdateStateVariable finState,
			UpdateStateVariable curStae);
	
	abstract RegularFormulaParameter getCorrespondingFormulaParameter(RegularFormulaParameter original);
}
