package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.BasicRequirementPattern;
import su.nsk.iae.rpl.rPL.BasicRequirementPatternInstance;
import su.nsk.iae.rpl.rPL.ConjunctionInnerFormula;
import su.nsk.iae.rpl.rPL.ConjunctionPatternFreeFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
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
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class InnerFormulaGenerator {
	FunctionalParameterList fnParamList;
	Map<RegularFormulaParameter, ExtraInvariantFormulaParameter> regParamMapping;

	public InnerFormulaGenerator(FunctionalParameterList fnParamList,
			Map<RegularFormulaParameter, ExtraInvariantFormulaParameter> regParams) {
		super();
		this.fnParamList = fnParamList;
		regParamMapping = regParams;
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
			atomicFormula = generateNonNegativeAtomicFormula(atomic);
			if (! neg) {
				return atomicFormula;
			}
			else
				return new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicFormula);
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
			List<su.nsk.iae.rpl.invpatterngenerator.Term> cParams = new ArrayList<>();
			TermConverter converter = new TermConverter();
			for (var p: patternInst.getCParams()) {
				cParams.add(p.convert(converter));
			}
			InnerExtraInvariantFormula extraInvPatternInst;
			if (pattern instanceof FutureRequirementPattern futurePattern) {
				extraInvPatternInst = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
						futurePattern.getExtraInvPattern(),
						cParams,
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
				extraInvPatternInst = new PastRequirementPatternInstance(pastPattern, cParams,
						transformedFmParams, newParam, patternInst.getFinState(), patternInst.getCurState());
			}
			return extraInvPatternInst;
		}	
		else // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
	}
	
	public InnerExtraInvariantFormula generatePatternFreeFormula(PatternFreeFormula reqFormula) {
		InnerExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		InnerExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new InnerBooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public InnerExtraInvariantFormula generatePatternFreeFormula(ConjunctionPatternFreeFormula reqFormula) {
		InnerExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		InnerExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new InnerBooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public InnerExtraInvariantFormula generatePatternFreeFormula(PrimaryPatternFreeFormula reqFormula) {
		su.nsk.iae.rpl.rPL.NegationFormula negFormula = reqFormula.getAtomic();
		if (negFormula != null) {
			InnerExtraInvariantFormula atomicFormula = generateNonNegativeAtomicFormula(negFormula.getRight());
			if (negFormula.isNeg())
				return new su.nsk.iae.rpl.invpatterngenerator.NegationFormula(atomicFormula);
			else return atomicFormula;
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
				return regParamMapping.get(original).applyToStates(atomic.getStates());
			} else {
				SimpleFormulaParameter simpleFmParam = (SimpleFormulaParameter) fmParam;
				SimpleAtomicFormula A = new SimpleAtomicFormula(simpleFmParam, atomic.getStates());
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
}
