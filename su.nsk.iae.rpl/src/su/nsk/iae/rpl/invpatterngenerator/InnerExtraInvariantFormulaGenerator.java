package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.FutureRequirementPattern;
import su.nsk.iae.rpl.rPL.PastRequirementPattern;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class InnerExtraInvariantFormulaGenerator extends InnerFormulaGenerator<InnerExtraInvariantFormula> {

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
		RPLFactory factory = RPLFactoryImpl.init();
		FunctionalParameter newParam = factory.createFunctionalParameter();
		newParam.setName("b");
		newParam = fnParamList.renemeAndAddFnParam(newParam);
		return new PastRequirementPatternInstance(
				pattern,
				cParams,
				transformedFmParams,
				newParam,
				finState,
				curState);
	}

}
