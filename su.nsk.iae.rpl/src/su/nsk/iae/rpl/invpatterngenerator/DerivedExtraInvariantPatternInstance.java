package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class DerivedExtraInvariantPatternInstance {
	private final DerivedExtraInvariantPattern pattern;
	private final List<Term> cParams;
	private final List<FunctionalParameter> fnParams;
	private final List<FormulaParameterValue> simpleFmParams;
	private List<FormulaParameterValue> regFmParams;
	
	public DerivedExtraInvariantPatternInstance(
			DerivedExtraInvariantPattern pattern,
			List<Term> cParams,
			List<FunctionalParameter> fnParams,
			List<FormulaParameterValue> simpleFmParams,
			List<FormulaParameterValue> fmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = fmParams;
	}

	public List<FormulaParameterValue> getRegFmParams() {
		return regFmParams;
	}

	public void setRegFmParams(List<FormulaParameterValue> regFmParams) {
		this.regFmParams = regFmParams;
	}

	public DerivedExtraInvariantPattern getPattern() {
		return pattern;
	}

	public List<Term> getcParams() {
		return cParams;
	}

	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}

	public List<FormulaParameterValue> getSimpleFmParams() {
		return simpleFmParams;
	}

	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = new ArrayList<>();
		usedPatterns.add(pattern.getName());
		for (FormulaParameterValue param: regFmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) param.getFormula();
			usedPatterns.addAll(formula.getUsedPatternNames());
		}
		return usedPatterns;
	}

	public String convertToString(UpdateStateVariable finalState) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(pattern.getName());
		for (Term cParam: cParams)
			stringBuilder.append(' ').append(cParam);
		for (FunctionalParameter fnParam: fnParams)
			stringBuilder.append(' ').append(fnParam.getName());
		for (FormulaParameterValue fmParam: simpleFmParams)
			stringBuilder.append(' ').append(fmParam.toString());
		for (FormulaParameterValue fmParam: regFmParams)
			stringBuilder.append(' ').append(fmParam.toString());
		stringBuilder.append(' ').append(finalState.getName()).append(')');
		return stringBuilder.toString();
	}
}
