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
	
	public OuterExtraInvariantFormula generateFormula(su.nsk.iae.rpl.rPL.Formula reqFormula) {
		OuterExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		OuterExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.DISJUNCTION, left, right);
	}
	
	public OuterExtraInvariantFormula generateFormula(ConjunctionFormula reqFormula) {
		OuterExtraInvariantFormula left = reqFormula.getLeft().generateFormula(this);
		OuterExtraInvariantFormula right = reqFormula.getRight().generateFormula(this);
		return new BooleanFormula(BooleanOperator.CONJUNCTION, left, right);
	}
	
	public OuterExtraInvariantFormula generateFormula(PrimaryFormula reqFormula) {
		var patternInst = reqFormula.getPatternInst();
		if (patternInst != null) { // pattern instance
			var pattern = patternInst.getPattern();
			List<FormulaParameterValue> extraInvariantFmParams = new ArrayList<>();
			InnerFormulaGenerator generator = new InnerFormulaGenerator(fnParamList);
			for (var fmParam : patternInst.getFmParams()) {
				var states = fmParam.getStates();
				Formula extraInvariantFmParam = fmParam
						.getFormula().generateFormula(generator);
				FormulaParameterValue val = new 
						FormulaParameterValue(states, extraInvariantFmParam);
				extraInvariantFmParams.add(val);
			}
			OuterExtraInvariantFormula mainConj = pattern.createOuterExtraInvPatternInstance(
					patternInst.getCParams(),
					extraInvariantFmParams,
					fnParamList
					);
					
		}
		else { // nested formula
			return reqFormula.getNestedFormula().generateFormula(this);
		}
	}	
	
}
