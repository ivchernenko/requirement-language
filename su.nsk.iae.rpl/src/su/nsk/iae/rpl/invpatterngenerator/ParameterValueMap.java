package su.nsk.iae.rpl.invpatterngenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ParameterValueMap {
	final Map<String, Term> cParams;
	final Map<String, FunctionalParameter> fnParams;
	final Map<String, FormulaParameterValue> simpleFmParams;
	final Map<String, FormulaParameterValue> regFmParams;
	final Map<String, UpdateStateVariable> stateSubstitution;
	public Map<String, UpdateStateVariable> getStateSubstitution() {
		return stateSubstitution;
	}

	public ParameterValueMap(Map<String, Term> cParams,
			Map<String, FunctionalParameter> fnParams,
			Map<String, FormulaParameterValue> simpleFmParams,
			Map<String, FormulaParameterValue> regFmParams,
			Map<String, UpdateStateVariable> stateSubstitution) {
		super();
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = regFmParams;
		for (var subst : stateSubstitution.entrySet()) {
			if (subst.getValue() == null)
				throw new NullPointerException("state cannot be replaced by null");
		}
		this.stateSubstitution = stateSubstitution;
	}

	public  ParameterValueMap(
			Lemma lemma,
			List<Term> cParamValues,
			List<FunctionalParameter> fnParamValues,
			List<FormulaParameterValue> simpleFmParamValues,
			List<FormulaParameterValue> einvFmParamValues,
			List<FormulaParameterValue> reqFmParamValues,
			UpdateStateVariable initState,
			UpdateStateVariable finState) {
		List<ConstantParameter> cVars = lemma.getCVars();
		List<FunctionalParameter> fnVars = lemma.getFnVars();
		List<SimpleFormulaParameter> simpleFmVars = lemma.getSimpleFmVars();
		List<RegularFormulaParameter> einvFmVars = lemma.getIfmVars();
		List<RegularFormulaParameter> reqFmVars = lemma.getRfmVars();
		cParams = new HashMap<>();
		for (int i = 0; i < cVars.size(); i++)
			cParams.put(cVars.get(i).getName(), cParamValues.get(i));
		fnParams = new HashMap<>();
		if (fnParamValues.isEmpty())
			for (int i = 0; i < fnVars.size(); i++)
				fnParams.put(fnVars.get(i).getName(), fnVars.get(i));
		else
			for (int i = 0; i < fnVars.size(); i++)
				fnParams.put(fnVars.get(i).getName(), fnParamValues.get(i));
		simpleFmParams = new HashMap<>();
		for (int i = 0; i< simpleFmVars.size(); i++)
			simpleFmParams.put(simpleFmVars.get(i).getName(), simpleFmParamValues.get(i));
		regFmParams = new HashMap<>();
		for (int i = 0; i < einvFmVars.size(); i++) {
			regFmParams.put(einvFmVars.get(i).getName(), einvFmParamValues.get(i));
		}
		for (int i = 0; i < reqFmVars.size(); i++)
			regFmParams.put(reqFmVars.get(i).getName(), reqFmParamValues.get(i));
		stateSubstitution = new HashMap<>();
		UpdateStateVariable lemmaInitState = lemma.getInitState();
		if (lemmaInitState != null)
			stateSubstitution.put(lemmaInitState.getName(), initState);
		stateSubstitution.put(lemma.getFinalState().getName(), finState);
		for (var subst : stateSubstitution.entrySet()) {
			if (subst.getValue() == null)
				throw new NullPointerException("state cannot be replaced by null");
		}
	}

	public Map<String, Term> getcParams() {
		return cParams;
	}
	public Map<String, FunctionalParameter> getFnParams() {
		return fnParams;
	}
	public Map<String, FormulaParameterValue> getSimpleFmParams() {
		return simpleFmParams;
	}
	public Map<String, FormulaParameterValue> getRegFmParams() {
		return regFmParams;
	}
}
