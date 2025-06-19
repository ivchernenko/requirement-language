package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import su.nsk.iae.rpl.rPL.ConjunctionFormula;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.OuterRequirementPattern;
import su.nsk.iae.rpl.rPL.OuterRequirementPatternInstance;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.PatternFreeFormula;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.PrimaryFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.Term;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public abstract class OuterFormulaGenerator<T> {
	Map<String, DerivedRequirementPattern> generatedPatterns;
	
	public OuterFormulaGenerator(Map<String, DerivedRequirementPattern> generatedPatterns2) {
		generatedPatterns = generatedPatterns2;
	}
	
	public T generateFormula(su.nsk.iae.rpl.rPL.Formula reqFormula) {
		T left = reqFormula.getLeft().generateFormula(this);
		T right = reqFormula.getRight().generateFormula(this);
		return createBooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public T generateFormula(ConjunctionFormula reqFormula) {
		T left = reqFormula.getLeft().generateFormula(this);
		T right = reqFormula.getRight().generateFormula(this);
		return createBooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public T generateFormula(PrimaryFormula reqFormula) {
		OuterRequirementPatternInstance patternInst = reqFormula.getPatternInst();
		if (patternInst != null) { // pattern instance
			var pattern = patternInst.getPattern();
			List<FormulaParameterValue> simpleFmParams = new ArrayList<>();
			List<FormulaParameterValue> transformedFmParams = new ArrayList<>();
			InnerFormulaGenerator<?> generator = createInnerFormulaGenerator();
			for (PatternFreeFormulaParameterValue simpleParam: patternInst.getSimpleFmParams()) {
				PatternFreeFormula formula = simpleParam.getFormula();
				InnerExtraInvariantFormula extraInvFmParam = formula.generateFormula(generator);
				FormulaParameterValue val = new FormulaParameterValue(simpleParam.getStates(), extraInvFmParam);
				simpleFmParams.add(val);
			}
			for (var fmParam : patternInst.getFmParams()) {
				Formula transformedFmParam = fmParam
						.getFormula().generateFormula(generator);
				FormulaParameterValue val = new FormulaParameterValue(fmParam.getStates(), transformedFmParam);
				transformedFmParams.add(val);
			}
			TermConverter converter = new TermConverter();
			if (pattern instanceof DerivedRequirementPattern derPattern)
				return createPatternInstance(
						derPattern, 
						patternInst.getCParams().stream().map(t -> t.convert(converter)).collect(Collectors.toList()),
						simpleFmParams,
						transformedFmParams);
			else throw new UnsupportedOperationException("past requirement patterns are not supported on top level.");	
		}
		else { // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		}
	}
	
	abstract T createBooleanFormula(BooleanOperator operator, T left, T right);
	abstract InnerFormulaGenerator<?> createInnerFormulaGenerator();
	abstract T createPatternInstance(
			DerivedRequirementPattern pattern,
			List<su.nsk.iae.rpl.invpatterngenerator.Term> cParams,
			List<FormulaParameterValue> simpleFmParams,
			List<FormulaParameterValue> regFmParams);
}
