package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.DerivedLemmas;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class ExtraInvariantPattern {
	String name;
	List<ConstantParameter> cParams;
	List<FunctionalParameter> fnParams;
	List<SimpleFormulaParameter> simpleFmParams;
	List<RegularFormulaParameter> regFmParams;
	OuterExtraInvariantFormula definition;
	UpdateStateVariable state;
	public ExtraInvariantPattern(String einvPatternName, List<ConstantParameter> cParams, List<FunctionalParameter> fnParams,
			List<SimpleFormulaParameter> simpleFmParams, List<RegularFormulaParameter> regFmParams,
			OuterExtraInvariantFormula definition) {
		name = einvPatternName;
		this.cParams = cParams;
		this.fnParams = fnParams;
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
	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}
	public List<SimpleFormulaParameter> getSimpleFmParams() {
		return simpleFmParams;
	}
	public List<RegularFormulaParameter> getRegFmParams() {
		return regFmParams;
	}
	public OuterExtraInvariantFormula getDefinition() {
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
		for (FunctionalParameter fnParam: fnParams)
			stringBuilder.append(' ').append(fnParam.getName());
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
	
	public DerivedExtraInvariantPattern convertToEObject(Lemma L8, Lemma L9) {
		RPLFactory factory = RPLFactory.eINSTANCE;
		DerivedExtraInvariantPattern pattern = factory.createDerivedExtraInvariantPattern();
		pattern.setName(name);
		for (ConstantParameter cParam: cParams) {
			ConstantParameter newCParam  =  factory.createConstantParameter();
			newCParam.setName(cParam.getName());
			pattern.getCParams().add(newCParam);
		}
		for (FunctionalParameter fnParam: fnParams) {
			FunctionalParameter newFnParam  =  factory.createFunctionalParameter();
			newFnParam.setName(fnParam.getName());
			pattern.getFnParams().add(newFnParam);
		}
		for (SimpleFormulaParameter fmParam: simpleFmParams) {
			SimpleFormulaParameter newFmParam  =  factory.createSimpleFormulaParameter();
			newFmParam.setName(fmParam.getName());
			pattern.getSimpleFmParams().add(newFmParam);
		}
		for (RegularFormulaParameter fmParam: regFmParams) {
			RegularFormulaParameter newFmParam  =  factory.createRegularFormulaParameter();
			newFmParam.setName(fmParam.getName());
			pattern.getFmParams().add(newFmParam);
		}
		DerivedLemmas lemmas = factory.createDerivedLemmas();
		lemmas.setL8(L8);
		lemmas.setL9(L9);
		pattern.setLemmas(lemmas);
		return pattern;
	}
	
	public ExtraInvariantPattern generateParticularPattern(
			String particularPatternName,
			List<RegularFormulaParameter> reqParams) {
		RPLFactory factory = RPLFactory.eINSTANCE;
		DerivedExtraInvariantPattern pattern = factory.createDerivedExtraInvariantPattern();
		pattern.setName(name);
		List<FormulaParameterValue> simpleParamValues = new ArrayList<>();
		List<FormulaParameterValue> regParamValues = new ArrayList<>();
		List<SimpleFormulaParameter> particularParams = new ArrayList<>(simpleFmParams);
		for (SimpleFormulaParameter fmParam: simpleFmParams)
			simpleParamValues.add(new FormulaParameterValue(new ArrayList<>(),
					new Atomic(fmParam, new ArrayList<>())));
		UpdateStateVariable current = factory.createUpdateStateVariable();
		current.setName("s1");
		for (int i = 0; i < regFmParams.size(); i++) {
			RegularFormulaParameter fmParam = regFmParams.get(i);
			SimpleFormulaParameter sParam = factory.createSimpleFormulaParameter();
			sParam.setName(reqParams.get(i).getName());
			particularParams.add(sParam);
			regParamValues.add(new FormulaParameterValue(List.of(state, current),
					new Atomic(sParam, List.of(current))));
		}
		DerivedExtraInvariantPatternInstance patternInstance =  
				new DerivedExtraInvariantPatternInstance(pattern,
						cParams.stream().map(p -> new ConstParameter(p)).collect(Collectors.toList()),
						fnParams, simpleParamValues, regParamValues);
		ExtendedInvariant particularDefinition = new ExtendedInvariant(patternInstance, new ArrayList<>());
		return new ExtraInvariantPattern(particularPatternName, cParams, fnParams, particularParams, new ArrayList<>(),
				particularDefinition);
	}
}
