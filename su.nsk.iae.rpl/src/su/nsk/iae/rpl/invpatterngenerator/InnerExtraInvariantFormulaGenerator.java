package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FutureRequirementPattern;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class InnerExtraInvariantFormulaGenerator extends InnerFormulaGenerator<InnerExtraInvariantFormula> {
	FunctionalParameterList fnParamList;
	Map<RegularFormulaParameter, RegularFormulaParameter> regParamMapping;

	public InnerExtraInvariantFormulaGenerator(FunctionalParameterList fnParamList,
			Map<RegularFormulaParameter, RegularFormulaParameter> regParams) {
		this.fnParamList =fnParamList;
		this.regParamMapping = regParams;
	}

	@Override
	InnerExtraInvariantFormula createBooleanFormula(BooleanOperator operator, InnerExtraInvariantFormula left,
			InnerExtraInvariantFormula right) {
		return new BooleanInnerExtraInvariantFormula(operator, left, right);
	}

	@Override
	InnerExtraInvariantFormula createFuturePatternInstance(FutureRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> transformedFmParams, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		return ExtraInvariantPatternInstanceFactory.generatePatternInstance(
				pattern.getExtraInvPattern(),
				cParams,
				transformedFmParams,
				finState,
				curState,
				fnParamList);
	}

	@Override
	InnerExtraInvariantFormula createPastPatternInstance(PastRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> transformedFmParams, UpdateStateVariable finState,
			UpdateStateVariable curState) {
		List<FormulaParameterValue> extraConjFmParams;
		if (curState != null) {
			extraConjFmParams = new ArrayList<>();
			for (FormulaParameterValue fmParam: transformedFmParams) {
				InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) fmParam.getFormula();
				Map<String, UpdateStateVariable> substitution = new HashMap<>();
				substitution.put(curState.getName(), finState);
				InnerExtraInvariantFormula extraConjFormula = formula.replaceStates(substitution);
				extraConjFmParams.add(new FormulaParameterValue(fmParam.getStates(), extraConjFormula));
			}
		}
		else
			extraConjFmParams = transformedFmParams;
		PastExtraInvariantPatternInstance extraInv = 
				ExtraInvariantPatternInstanceFactory.generatePatternInstance(
						pattern.getExtraInvPattern(), cParams, extraConjFmParams, fnParamList);
		return new PastRequirementPatternInstance(
				pattern,
				cParams,
				transformedFmParams,
				extraInv,
				finState,
				curState);
	}

	@Override
	RegularFormulaParameter getCorrespondingFormulaParameter(RegularFormulaParameter original) {
		return regParamMapping.get(original);
	}

}
