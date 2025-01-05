package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
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
	
	public Formula generateFormula(su.nsk.iae.rpl.rPL.Formula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public Formula generateFormula(ConjunctionFormula reqFormula) {
		Formula left = reqFormula.getLeft().generateFormula(this);
		Formula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public Formula generateFormula(PrimaryFormula reqFormula) {
		var patternInst = reqFormula.getPatternInst();
		if (patternInst != null) { // pattern instance
			var pattern = patternInst.getPattern();
			List<FormulaParameterValue> extraInvariantFmParams = new ArrayList<>();
			for (var fmParam : patternInst.getFmParams()) {
				var states = fmParam.getStates();
				Formula extraInvariantFmParam = fmParam
						.getFormula().generateFormula(this);
				FormulaParameterValue val = new 
						FormulaParameterValue(states, extraInvariantFmParam);
				extraInvariantFmParams.add(val);
			}
			Formula mainConj;
			if (pattern instanceof DerivedRequirementPattern derPattern) {
				mainConj = generatePatternInstance(
						derPattern.getExtraInvPattern(),
						patternInst.getCParams(),
						extraInvariantFmParams);						
			}
			else {
				PastRequirementPattern pastPattern = (PastRequirementPattern) 
						pattern;
				mainConj = generatePatternInstance(
						pastPattern.getExtraInvPattern(),
						patternInst.getCParams(),
						extraInvariantFmParams
						);
						
			}
		}
		else { // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		}
	}	
	
}
