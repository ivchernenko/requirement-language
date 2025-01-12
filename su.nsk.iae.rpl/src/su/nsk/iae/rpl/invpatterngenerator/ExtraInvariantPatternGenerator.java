package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConjunctionFormula;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.PrimaryFormula;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.Term;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class ExtraInvariantPatternGenerator {
	private FunctionalParameterList fnParamList = new FunctionalParameterList();
	
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
		var patternInst = reqFormula.getPatternInst();
		if (patternInst != null) { // pattern instance
			var pattern = patternInst.getPattern();
			List<FormulaParameterValue> transformedFmParams = new ArrayList<>();
			InnerFormulaGenerator generator = new InnerFormulaGenerator(fnParamList);
			for (var fmParam : patternInst.getFmParams()) {
				InnerExtraInvariantFormula extraInvFmParam = fmParam
						.getFormula().generateFormula(generator);
				FormulaParameterValue val = new FormulaParameterValue(fmParam.getStates(), extraInvFmParam);
				transformedFmParams.add(val);
			}
			OuterExtraInvariantFormula mainConj;
			if (pattern instanceof DerivedRequirementPattern derivedPattern)
				mainConj = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
						derivedPattern.getExtraInvPattern(), 
						patternInst.getCParams(),
						patternInst.getSimpleFmParams(),
						transformedFmParams,
						fnParamList);
			else {
				PastRequirementPattern pastPattern = (PastRequirementPattern) pattern;
				mainConj = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
						pastPattern.getExtraInvPattern(), 
						patternInst.getCParams(),
						transformedFmParams,
						null,
						fnParamList);
			}
			List<OuterExtraInvariantFormula> extraConjs = new ArrayList<>();
			for (var fmParamValue: transformedFmParams)
				extraConjs.addAll(fmParamValue.getFormula().generateExtraConjuncts(fnParamList));
			return new ExtendedInvariant(mainConj, extraConjs);		
		}
		else { // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		}
	}	
	
}
