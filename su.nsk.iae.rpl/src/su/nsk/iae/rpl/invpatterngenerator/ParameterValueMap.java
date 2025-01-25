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

public class ParameterValueMap {
	final Map<ConstantParameter, Term> cParams;
	final Map<FunctionalParameter, FunctionalParameter> fnParams;
	final Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams;
	final Map<RegularFormulaParameter, FormulaParameterValue> regFmParams;
	final FunctionalParameter boolParam;
	public ParameterValueMap(Map<ConstantParameter, Term> cParams,
			Map<FunctionalParameter, FunctionalParameter> fnParams,
			Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams,
			Map<RegularFormulaParameter, FormulaParameterValue> regFmParams,
			FunctionalParameter boolParam) {
		super();
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = regFmParams;
		this.boolParam = boolParam;
	}
	
	 ParameterValueMap(
			Lemma lemma,
			List<Term> cParamValues,
			List<FunctionalParameter> fnParamValues,
			List<FormulaParameterValue> simpleFmParamValues,
			List<FormulaParameterValue> einvFmParamValues,
			List<FormulaParameterValue> reqFmParamValues,
			FunctionalParameter boolParam) {
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
		for (int i = 0; i < einvFmVars.size(); i++)
			regFmParams.put(einvFmVars.get(i), einvFmParamValues.get(i));
		for (int i = 0; i < reqFmVars.size(); i++)
			regFmParams.put(reqFmVars.get(i), reqFmParamValues.get(i));
		this.boolParam = boolParam;
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
	public Map<RegularFormulaParameter, FormulaParameterValue> getRegFmParams() {
		return regFmParams;
	}
	public FunctionalParameter getBoolParam() {
		return boolParam;
	}
}
