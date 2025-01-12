package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;

public class ParameterValueMap {
	final Map<ConstantParameter, Term> cParams;
	final Map<FunctionalParameter, FunctionalParameter> fnParams;
	final Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams;
	final Map<RegularFormulaParameter, FormulaParameterValue> regFmParams;
	public ParameterValueMap(Map<ConstantParameter, Term> cParams,
			Map<FunctionalParameter, FunctionalParameter> fnParams,
			Map<SimpleFormulaParameter, FormulaParameterValue> simpleFmParams,
			Map<RegularFormulaParameter, FormulaParameterValue> regFmParams) {
		super();
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = regFmParams;
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
	
	

}
