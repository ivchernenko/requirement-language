package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;

public class OuterExtraInvariantFormulaGenerator extends OuterFormulaGenerator<OuterExtraInvariantFormula> {
	FunctionalParameterList fnParamList = new FunctionalParameterList();

	public FunctionalParameterList getFnParamList() {
		return fnParamList;
	}

	Map<RegularFormulaParameter, RegularFormulaParameter> regParamMapping;
	
	@Override
	OuterExtraInvariantFormula createBooleanFormula(BooleanOperator operator, OuterExtraInvariantFormula left,
			OuterExtraInvariantFormula right) {
		return new OuterBooleanFormula(operator, left, right);
	}

	@Override
	InnerFormulaGenerator<?> createInnerFormulaGenerator() {
		return new InnerExtraInvariantFormulaGenerator(fnParamList, regParamMapping);
	}

	@Override
	OuterExtraInvariantFormula createPatternInstance(DerivedRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> simpleFmParams, List<FormulaParameterValue> regFmParams) {
		DerivedExtraInvariantPatternInstance mainConj = ExtraInvariantPatternInstanceFactory.generatePatternInstance(
				pattern.getExtraInvPattern(), cParams, simpleFmParams, regFmParams, fnParamList);
		List<PastExtraInvariantPatternInstance> extraConjs = new ArrayList<>();
		for (var fmParamValue: regFmParams)
			extraConjs.addAll(((InnerExtraInvariantFormula) fmParamValue.getFormula()).generateExtraConjuncts());
		return new ExtendedInvariant(mainConj, extraConjs);	
	}

	public OuterExtraInvariantFormulaGenerator(Map<RegularFormulaParameter, RegularFormulaParameter> regParamMapping) {
		super();
		this.fnParamList = new FunctionalParameterList();
		this.regParamMapping = regParamMapping;
	}
}
