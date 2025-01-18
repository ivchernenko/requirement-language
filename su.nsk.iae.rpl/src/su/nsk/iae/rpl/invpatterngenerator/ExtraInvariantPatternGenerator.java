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

public class ExtraInvariantPatternGenerator {
	public static ExtraInvariantPattern generateExtraInvariantPattern(DerivedRequirementPattern reqPattern) {
		List<ConstantParameter> cParams = reqPattern.getCParams();
		List<SimpleFormulaParameter> simpleFmParams = reqPattern.getSimpleFmParam();
		List<RegularFormulaParameter> regFmParams = new ArrayList<>();
		Map<RegularFormulaParameter, ExtraInvariantFormulaParameter> regParamMapping = new HashMap<>();
		for (RegularFormulaParameter original: reqPattern.getFmParams()) {
			RPLFactory factory = RPLFactoryImpl.init();
			RegularFormulaParameter renamed = factory.createRegularFormulaParameter();
			renamed.setName(original.getName() + "'");
			ExtraInvariantFormulaParameter einvParam = new ExtraInvariantFormulaParameter(renamed, original);
			regParamMapping.put(original, einvParam);
			regFmParams.add(renamed);
		}
		OuterFormulaGenerator generator = new OuterFormulaGenerator(regParamMapping);
		OuterExtraInvariantFormula definition = reqPattern.getDefinition().generateFormula(generator);
		List<FunctionalParameter> fnParams = generator.getFnParamList().params;
		return new ExtraInvariantPattern(cParams, fnParams, simpleFmParams, regFmParams, definition);
	}
}
