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
	public ExtraInvariantPattern(String reqPatternName, List<ConstantParameter> cParams, List<FunctionalParameter> fnParams,
			List<SimpleFormulaParameter> simpleFmParams, List<RegularFormulaParameter> regFmParams,
			OuterExtraInvariantFormula definition) {
		name = reqPatternName + "_inv";
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
		pattern.getCParams().addAll(cParams);
		pattern.getFnParams().addAll(fnParams);
		pattern.getSimpleFmParams().addAll(simpleFmParams);
		pattern.getFmParams().addAll(regFmParams);
		DerivedLemmas lemmas = factory.createDerivedLemmas();
		lemmas.setL8(L8);
		lemmas.setL9(L9);
		pattern.setLemmas(lemmas);
		return pattern;
	}
	
	public ExtraInvariantPattern generateParticularPattern(String particularPatternName) {
		RPLFactory factory = RPLFactory.eINSTANCE;
		DerivedExtraInvariantPattern pattern = factory.createDerivedExtraInvariantPattern();
		pattern.setName(name);
		List<FormulaParameterValue> simpleParamValues = new ArrayList<>();
		List<SimpleFormulaParameter> particularParams = new ArrayList<>(simpleFmParams);
		for (SimpleFormulaParameter fmParam: simpleFmParams)
			simpleParamValues.add(new FormulaParameterValue(new ArrayList<>(),
					new SimpleAtomicFormula(fmParam, new ArrayList<>())));
		UpdateStateVariable current = factory.createUpdateStateVariable();
		current.setName("s1");
		for (RegularFormulaParameter fmParam: regFmParams) {
			SimpleFormulaParameter sParam = factory.createSimpleFormulaParameter();
			sParam.setName(fmParam.getName());
			particularParams.add(sParam);
			simpleParamValues.add(new FormulaParameterValue(List.of(state, current),
					new SimpleAtomicFormula(sParam, List.of(current))));
		}
		DerivedExtraInvariantPatternInstance patternInstance =  
				new DerivedExtraInvariantPatternInstance(pattern,
						cParams.stream().map(p -> new ConstParameter(p)).collect(Collectors.toList()),
						fnParams, simpleParamValues, new ArrayList<>());
		ExtendedInvariant particularDefinition = new ExtendedInvariant(patternInstance, new ArrayList<>());
		return new ExtraInvariantPattern(particularPatternName, cParams, fnParams, particularParams, new ArrayList<>(),
				particularDefinition);
	}
}
