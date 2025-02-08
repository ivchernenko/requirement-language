package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class PatternGenerator {
	public static RequirementPattern generateRequirementPattern(DerivedRequirementPattern reqPattern) {
		List<ConstantParameter> cParams = reqPattern.getCParams();
		List<SimpleFormulaParameter> simpleFmParams = new ArrayList<>();
		simpleFmParams.addAll(reqPattern.getSimpleFmParams());
		List<RegularFormulaParameter> regFmParams = reqPattern.getFmParams();
		OuterRequirementFormulaGenerator generator = new OuterRequirementFormulaGenerator();
		OuterRequirementFormula definition = reqPattern.getDefinition().generateFormula(generator);
		return new RequirementPattern(reqPattern.getName(), cParams, simpleFmParams, regFmParams, definition);
	}
	
	public static ExtraInvariantPattern generateExtraInvariantPattern(DerivedRequirementPattern reqPattern) {
		List<ConstantParameter> cParams = reqPattern.getCParams();
		List<SimpleFormulaParameter> simpleFmParams = new ArrayList<>();
		simpleFmParams.addAll(reqPattern.getSimpleFmParams());
		List<RegularFormulaParameter> regFmParams = new ArrayList<>();
		Map<RegularFormulaParameter, RegularFormulaParameter> regParamMapping = new HashMap<>();
		for (RegularFormulaParameter original: reqPattern.getFmParams()) {
			RPLFactory factory = RPLFactoryImpl.init();
			RegularFormulaParameter renamed = factory.createRegularFormulaParameter();
			renamed.setName(original.getName() + "_1");
			regParamMapping.put(original, renamed);
			regFmParams.add(renamed);
		}
		OuterExtraInvariantFormulaGenerator generator = new OuterExtraInvariantFormulaGenerator(regParamMapping);
		OuterExtraInvariantFormula definition = reqPattern.getDefinition().generateFormula(generator);
		List<FunctionalParameter> fnParams = generator.getFnParamList().params;
		return new ExtraInvariantPattern(reqPattern.getName() + "_inv", cParams, fnParams, simpleFmParams, regFmParams, definition);
	}
}
