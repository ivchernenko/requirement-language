package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS8Lemma extends DerivedLemma {
	public LS8Lemma(String extraInvPattern, List<ConstantParameter> cVars, List<FunctionalParameter> fnVars,
			List<SimpleFormulaParameter> simpleFmVars, List<RegularFormulaParameter> einvFmVars, UpdateStateVariable initState, 
			UpdateStateVariable finalState, LemmaPremise premise) {
		super(extraInvPattern, cVars, fnVars, simpleFmVars, einvFmVars, premise);
		this.initState = initState;
		this.finalState = finalState;
	}

	UpdateStateVariable initState;
	UpdateStateVariable finalState;
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("lemma ").append(extraInvPattern).append("_saving : \"\n")
		.append(generateExtraInvPatternInstance(initState)).append(" \\<Longrightarrow>\n")
		.append("consecutive ").append(initState).append(' ').append(finalState).append('\n')
		.append(premise).append('\n')
		.append(generateExtraInvPatternInstance(finalState)).append("\"");
		return stringBuilder.toString();
	}
	

}
