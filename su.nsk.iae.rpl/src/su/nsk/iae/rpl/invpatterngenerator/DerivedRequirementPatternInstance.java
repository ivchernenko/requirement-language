package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;

import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class DerivedRequirementPatternInstance implements OuterRequirementFormula {
	private final DerivedRequirementPattern pattern;
	private final List<Term> cParams;
	private final List<FormulaParameterValue> simpleFmParams;
	private final List<FormulaParameterValue> regFmParams;
	public DerivedRequirementPatternInstance(DerivedRequirementPattern pattern, List<Term> cParams,
			List<FormulaParameterValue> simpleFmParams, List<FormulaParameterValue> regFmParams) {
		super();
		this.pattern = pattern;
		this.cParams = cParams;
		this.simpleFmParams = simpleFmParams;
		this.regFmParams = regFmParams;
	}
	public DerivedRequirementPattern getPattern() {
		return pattern;
	}
	public List<Term> getcParams() {
		return cParams;
	}
	public List<FormulaParameterValue> getSimpleFmParams() {
		return simpleFmParams;
	}
	public List<FormulaParameterValue> getRegFmParams() {
		return regFmParams;
	}
	@Override
	public String convertToString(UpdateStateVariable state) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(pattern.getName());
		for (Term cParam: cParams)
			stringBuilder.append(' ').append(cParam);
		for (FormulaParameterValue fmParam: simpleFmParams)
			stringBuilder.append(' ').append(fmParam);
		for (FormulaParameterValue fmParam: regFmParams)
			stringBuilder.append(' ').append(fmParam);
		stringBuilder.append(' ').append(state.getName()).append(')');
		return stringBuilder.toString();
	}
	@Override
	public List<String> getUsedPatternNames() {
		List<String> usedPatterns = new ArrayList<>();
		usedPatterns.add(pattern.getName());
		for (FormulaParameterValue fmParam: regFmParams)
			usedPatterns.addAll(fmParam.getFormula().getUsedPatternNames());
		return usedPatterns;
	}
	
}
