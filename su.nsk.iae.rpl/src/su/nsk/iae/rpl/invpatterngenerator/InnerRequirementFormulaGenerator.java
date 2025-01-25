package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FutureRequirementPattern;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class InnerRequirementFormulaGenerator extends InnerFormulaGenerator<InnerRequirementFormula> {

	@Override
	InnerRequirementFormula createBooleanFormula(BooleanOperator operator, InnerRequirementFormula left, InnerRequirementFormula right) {
		return new BooleanInnerRequirementFormula(operator, left, right);
	}

	@Override
	InnerRequirementFormula createFuturePatternInstance(FutureRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> transformedFmParams,
			UpdateStateVariable finState, UpdateStateVariable curState) {
		return new FutureRequirementPatternInstance(pattern, cParams, transformedFmParams, finState, curState);
	}

	@Override
	InnerRequirementFormula createPastPatternInstance(
			PastRequirementPattern pattern,
			List<Term> cParams,
			List<FormulaParameterValue> transformedFmParams,
			UpdateStateVariable finState, UpdateStateVariable curState) {
		return new PastRequirementPatternInstance(pattern, cParams, transformedFmParams, null, finState, curState);
	}

	@Override
	RegularFormulaParameter getCorrespondingFormulaParameter(RegularFormulaParameter original) {
		return original;
	}

}
