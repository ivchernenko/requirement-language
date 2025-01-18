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

public class OuterFormulaGenerator {
	private FunctionalParameterList fnParamList = new FunctionalParameterList();
	public FunctionalParameterList getFnParamList() {
		return fnParamList;
	}

	private Map<RegularFormulaParameter, ExtraInvariantFormulaParameter> regParamMapping;
	
	public OuterFormulaGenerator(Map<RegularFormulaParameter, ExtraInvariantFormulaParameter> regParams) {
		regParamMapping = regParams;
	}
	
	public OuterExtraInvariantFormula generateFormula(su.nsk.iae.rpl.rPL.Formula reqFormula) {
		OuterExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		OuterExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new OuterBooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public OuterExtraInvariantFormula generateFormula(ConjunctionFormula reqFormula) {
		OuterExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		OuterExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new OuterBooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public OuterExtraInvariantFormula generateFormula(PrimaryFormula reqFormula) {
		OuterRequirementPatternInstance patternInst = reqFormula.getPatternInst();
		if (patternInst != null) { // pattern instance
			var pattern = patternInst.getPattern();
			List<FormulaParameterValue> simpleFmParams = new ArrayList<>();
			List<FormulaParameterValue> transformedFmParams = new ArrayList<>();
			InnerFormulaGenerator generator = new InnerFormulaGenerator(fnParamList, regParamMapping);
			for (PatternFreeFormulaParameterValue simpleParam: patternInst.getSimpleFmParams()) {
				PatternFreeFormula formula = simpleParam.getFormula();
				InnerExtraInvariantFormula extraInvFmParam = formula.generateFormula(generator);
				FormulaParameterValue val = new FormulaParameterValue(simpleParam.getStates(), extraInvFmParam);
				simpleFmParams.add(val);
			}
			for (var fmParam : patternInst.getFmParams()) {
				InnerExtraInvariantFormula extraInvFmParam = fmParam
						.getFormula().generateFormula(generator);
				FormulaParameterValue val = new FormulaParameterValue(fmParam.getStates(), extraInvFmParam);
				transformedFmParams.add(val);
			}
			DerivedExtraInvariantPatternInstance mainConj = null;
			TermConverter converter = new TermConverter();
			if (pattern instanceof DerivedRequirementPattern derivedPattern)
				mainConj = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
						derivedPattern.getExtraInvPattern(), 
						patternInst.getCParams().stream().map(t -> t.convert(converter)).collect(Collectors.toList()),
						simpleFmParams,
						transformedFmParams,
						fnParamList);
			List<Implication> extraConjs = new ArrayList<>();
			for (var fmParamValue: transformedFmParams)
				extraConjs.addAll(fmParamValue.getFormula().generateExtraConjuncts(fnParamList));
			return new ExtendedInvariant(mainConj, extraConjs);		
		}
		else { // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		}
	}	
	
}
