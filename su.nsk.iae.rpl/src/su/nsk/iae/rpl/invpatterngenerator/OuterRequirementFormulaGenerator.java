package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;

public class OuterRequirementFormulaGenerator extends OuterFormulaGenerator<OuterRequirementFormula> {
	public OuterRequirementFormulaGenerator(Map<String, DerivedRequirementPattern> generatedPatterns) {
		super(generatedPatterns);
	}

	@Override
	OuterRequirementFormula createBooleanFormula(BooleanOperator operator, OuterRequirementFormula left,
			OuterRequirementFormula right) {
		return new BooleanOuterRequirementFormula(operator, left, right);
	}

	@Override
	InnerFormulaGenerator<?> createInnerFormulaGenerator() {
		return new InnerRequirementFormulaGenerator();
	}

	@Override
	OuterRequirementFormula createPatternInstance(DerivedRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> simpleFmParams, List<FormulaParameterValue> regFmParams) {
		if (pattern.getExtraInvPattern() == null)
			pattern = generatedPatterns.get(pattern.getName());
		return new DerivedRequirementPatternInstance(pattern, cParams, simpleFmParams, regFmParams);
	}
}
