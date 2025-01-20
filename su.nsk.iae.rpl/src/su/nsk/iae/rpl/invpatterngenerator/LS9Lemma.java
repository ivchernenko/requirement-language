package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS9Lemma extends DerivedLemma {
	public LS9Lemma(String extraInvPattern, String reqPattern, List<ConstantParameter> cVars, List<FunctionalParameter> fnVars,
			List<SimpleFormulaParameter> simpleFmVars, List<RegularFormulaParameter> einvFmVars, 
			List<RegularFormulaParameter> reqFmParams, UpdateStateVariable state, LemmaPremise premise) {
		super(extraInvPattern, cVars, fnVars, simpleFmVars, einvFmVars, premise);
		this.reqPattern = reqPattern;
		this.reqFmVars = reqFmParams;
		this.state = state;
	}
	String reqPattern;
	List<RegularFormulaParameter> reqFmVars;
	UpdateStateVariable state;
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("lemma ").append(extraInvPattern).append("_saving : \"\n")
		.append(generateExtraInvPatternInstance(state)).append(" \\<Longrightarrow>\n")
		.append("toEnvP ").append(state.getName()).append('\n')
		.append(premise).append('\n')
		.append(generateRequirementPatternInstance()).append("\"");
		return stringBuilder.toString();
	}
	
	String generateRequirementPatternInstance() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(reqPattern);
		for (ConstantParameter cVar: cVars)
			stringBuilder.append(' ').append(cVar.getName());
		for (SimpleFormulaParameter fmVar: simpleFmVars)
			stringBuilder.append(' ').append(fmVar.getName());
		for (RegularFormulaParameter fmVar: reqFmVars)
			stringBuilder.append(' ').append(fmVar.getName());
		stringBuilder.append(' ').append(state.getName());
		return stringBuilder.toString();
	}
	
}
