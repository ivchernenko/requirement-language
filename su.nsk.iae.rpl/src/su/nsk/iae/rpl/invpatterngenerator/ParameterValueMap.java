package su.nsk.iae.rpl.invpatterngenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ParameterValueMap {
	final Map<ConstantParameter, Term> cParams;
	final Map<FunctionalParameter, FunctionalParameter> fnParams;
	final Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams;
	final Map<String, FormulaParameterValue> regFmParams;
	final FunctionalParameter boolParam;
	final Map<UpdateStateVariable, UpdateStateVariable> stateSubstitution;
	public Map<UpdateStateVariable, UpdateStateVariable> getStateSubstitution() {
		return stateSubstitution;
	}

	public ParameterValueMap(Map<ConstantParameter, Term> cParams,
			Map<FunctionalParameter, FunctionalParameter> fnParams,
			Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams,
			Map<String, FormulaParameterValue> regFmParams,
			FunctionalParameter boolParam,
			Map<UpdateStateVariable, UpdateStateVariable> stateSubstitution) {
		super();
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = regFmParams;
		this.boolParam = boolParam;
		this.stateSubstitution = stateSubstitution;
	}
	
	public  ParameterValueMap(
			Lemma lemma,
			List<Term> cParamValues,
			List<FunctionalParameter> fnParamValues,
			List<FormulaParameterValue> simpleFmParamValues,
			List<FormulaParameterValue> einvFmParamValues,
			List<FormulaParameterValue> reqFmParamValues,
			FunctionalParameter boolParam,
			UpdateStateVariable initState,
			UpdateStateVariable finState) {
		List<ConstantParameter> cVars = lemma.getCVars();
		List<FunctionalParameter> fnVars = lemma.getFnVars();
		List<SimpleFormulaParameter> simpleFmVars = lemma.getSimpleFmVars();
		List<RegularFormulaParameter> einvFmVars = lemma.getIfmVars();
		List<RegularFormulaParameter> reqFmVars = lemma.getRfmVars();
		cParams = new HashMap<>();
		for (int i = 0; i < cVars.size(); i++)
			cParams.put(cVars.get(i), cParamValues.get(i));
		fnParams = new HashMap<>();
		for (int i = 0; i < fnVars.size(); i++)
			fnParams.put(fnVars.get(i), fnParamValues.get(i));
		simpleFmParams = new HashMap<>();
		for (int i = 0; i< simpleFmVars.size(); i++)
			simpleFmParams.put(simpleFmVars.get(i), simpleFmParamValues.get(i));
		regFmParams = new HashMap<>();
		for (int i = 0; i < einvFmVars.size(); i++) {
			regFmParams.put(einvFmVars.get(i).getName(), einvFmParamValues.get(i));
		}
		for (int i = 0; i < reqFmVars.size(); i++)
			regFmParams.put(reqFmVars.get(i).getName(), reqFmParamValues.get(i));
		this.boolParam = boolParam;
		stateSubstitution = new HashMap<>();
		stateSubstitution.put(lemma.getInitState(), initState);
		stateSubstitution.put(lemma.getFinalState(), finState);
	}
	
	public Map<ConstantParameter, Term> getcParams() {
		return cParams;
	}
	public Map<FunctionalParameter, FunctionalParameter> getFnParams() {
		return fnParams;
	}
	public Map<SimpleFormulaParameter, FormulaParameterValue> getSimpleFmParams() {
		return simpleFmParams;
	}
	public Map<String, FormulaParameterValue> getRegFmParams() {
		return regFmParams;
	}
	public FunctionalParameter getBoolParam() {
		return boolParam;
	}
	
	
}
