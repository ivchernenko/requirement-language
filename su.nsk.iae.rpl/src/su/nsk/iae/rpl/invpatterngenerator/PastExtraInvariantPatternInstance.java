package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class PastExtraInvariantPatternInstance {
	private PastExtraInvariantPattern pattern;
	private List<Term> cParams;
	private List<FunctionalParameter> fnParams;
	private List<FormulaParameterValue> fmParams;
	private final UpdateStateVariable state;
	private final boolean finState;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UpdateStateVariable getState() {
		return state;
	}

	public PastExtraInvariantPatternInstance(PastExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams, FunctionalParameter boolParam) {
		this(pattern, cParams, fnParams, fmParams, null, false);
	}

	public PastExtraInvariantPatternInstance(PastExtraInvariantPattern pattern, List<Term> cParams,
			List<FunctionalParameter> fnParams, List<FormulaParameterValue> fmParams,
			UpdateStateVariable state, boolean finState) {
		this.pattern = pattern;
		this.cParams = cParams;
		this.fnParams = fnParams;
		this.fmParams = fmParams;
		this.state = state;
		this.finState = finState;
	}

	PastExtraInvariantPatternInstance setState(UpdateStateVariable state, boolean finState) {
		return new PastExtraInvariantPatternInstance(pattern, cParams, fnParams, fmParams, state, finState);
	}

	public PastExtraInvariantPattern getPattern() {
		return pattern;
	}

	public List<Term> getcParams() {
		return cParams;
	}

	public List<FunctionalParameter> getFnParams() {
		return fnParams;
	}
	public void setFnParams(List<FunctionalParameter> fnParams) {
		this.fnParams = fnParams;
	}
	public List<FormulaParameterValue> getFmParams() {
		return fmParams;
	}

	public boolean isFinal() {
		return finState;
	}

	public LemmaPremise replacePatterns(UpdateStateVariable initState) {
		return generateLemmaPremiseInstance(initState).replacePatterns(initState);
	}
	
	LemmaPremise generateLemmaPremiseInstance(UpdateStateVariable initState) {
		Lemma L = pattern.getLemmas().getL6();
		LemmaPremiseFormula premise = L.getPrem();
		LemmaPremiseInstanceCreator instCreator = new LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(L, cParams, fnParams, new ArrayList<>(), fmParams, 
				new ArrayList<>(), initState, state);
		return premise.substitiuteParams(instCreator, params);
	}

	public Collection<? extends String> getUsedPatternNames() {
		List<String> usedPatterns = new ArrayList<>();
		usedPatterns.add(pattern.getName() + "_def");
		for (FormulaParameterValue param: fmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) param.getFormula();
			usedPatterns.addAll(formula.getUsedPatternNames());
		}
		return usedPatterns;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('(').append(pattern.getName());
		for (Term cParam: cParams)
			stringBuilder.append(' ').append(cParam);
		for (FunctionalParameter fnParam: fnParams)
			stringBuilder.append(' ').append(fnParam.getName());
		for (FormulaParameterValue fmParam: fmParams)
			stringBuilder.append(' ').append(fmParam);
		if (state != null)
			stringBuilder.append(' ').append(state.getName());
		stringBuilder.append(')');
		return stringBuilder.toString();
	}
/*
	public LemmaPremise generateParticularLemmaPremise() {
		List<FormulaParameterValue> simplifiedFmParams = new ArrayList<>();
		for (FormulaParameterValue fmParam: fmParams) {
			InnerExtraInvariantFormula formula = (InnerExtraInvariantFormula) fmParam.getFormula();
			InnerExtraInvariantFormula simplifiedFormula = (InnerExtraInvariantFormula)
					formula.generateParticularLemmaPremise();
			simplifiedFmParams.add(new FormulaParameterValue(fmParam.getStates(), simplifiedFormula));
		}
		return new PastExtraInvariantPatternInstance(pattern, cParams, fnParams, simplifiedFmParams, state,
				finState);
	}
*/

}
