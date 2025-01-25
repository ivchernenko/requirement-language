package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class RequirementPattern {
	String name;
	List<ConstantParameter> cParams;
	List<SimpleFormulaParameter> simpleFmParams;
	List<RegularFormulaParameter> regFmParams;
	OuterRequirementFormula definition;
	UpdateStateVariable state;
	public RequirementPattern(String reqPatternName, List<ConstantParameter> cParams, 
			List<SimpleFormulaParameter> simpleFmParams, List<RegularFormulaParameter> regFmParams,
			OuterRequirementFormula definition) {
		name = reqPatternName;
		this.cParams = cParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = regFmParams;
		this.definition = definition;
		RPLFactory factory = RPLFactoryImpl.init();
		state = factory.createUpdateStateVariable();
		state.setName("s");
	}
	
	public String getName() {
		return name;
	}
	public List<ConstantParameter> getcParams() {
		return cParams;
	}

	public List<SimpleFormulaParameter> getSimpleFmParams() {
		return simpleFmParams;
	}
	public List<RegularFormulaParameter> getRegFmParams() {
		return regFmParams;
	}
	public OuterRequirementFormula getDefinition() {
		return definition;
	}
	
	public List<String> getUsedPatternNames() {
		return definition.getUsedPatternNames();
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("definition ").append(name).append(" where \"").append(name);
		for (ConstantParameter cParam: cParams)
			stringBuilder.append(' ').append(cParam.getName());
		for (SimpleFormulaParameter fmParam: simpleFmParams)
			stringBuilder.append(' ').append(fmParam.getName());
		for (RegularFormulaParameter fmParam: regFmParams)
			stringBuilder.append(' ').append(fmParam.getName());
		stringBuilder.append(' ').append(state.getName());
		stringBuilder.append(" \\<equiv> ")
		.append(definition.convertToString(state))
		.append('\"');
		return stringBuilder.toString();
	}

}
