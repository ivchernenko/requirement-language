package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class LS9Lemma extends DerivedLemma {
	public LS9Lemma(String lemmaName, String extraInvPattern, String reqPattern, List<ConstantParameter> cVars, List<FunctionalParameter> fnVars,
			List<SimpleFormulaParameter> simpleFmVars, List<RegularFormulaParameter> einvFmVars, 
			List<RegularFormulaParameter> reqFmParams, UpdateStateVariable state, LemmaPremise premise) {
		super(lemmaName, extraInvPattern, cVars, fnVars, simpleFmVars, einvFmVars, premise);
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
		stringBuilder.append("lemma ").append(lemmaName).append(": \"\n")
		.append(generateExtraInvPatternInstance(state)).append(' ').append(META_IMPLICATION).append('\n')
		.append("toEnvP ").append(state.getName()).append(' ').append(META_IMPLICATION).append('\n')
		.append(premise).append(' ').append(META_IMPLICATION).append('\n')
		.append(generateRequirementPatternInstance()).append("\"");
		return stringBuilder.toString();
	}
	
	String generateRequirementPatternInstance() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(reqPattern);
		for (ConstantParameter cVar: getcVars())
			stringBuilder.append(' ').append(cVar.getName());
		for (SimpleFormulaParameter fmVar: simpleFmVars)
			stringBuilder.append(' ').append(fmVar.getName());
		for (RegularFormulaParameter fmVar: reqFmVars)
			stringBuilder.append(' ').append(fmVar.getName());
		stringBuilder.append(' ').append(state.getName());
		return stringBuilder.toString();
	}

	@Override
	public Lemma convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		Lemma lemma = super.convertToEObject();
		for (RegularFormulaParameter fmVar: reqFmVars) {
			RegularFormulaParameter newFmVar = factory.createRegularFormulaParameter();
			newFmVar.setName(fmVar.getName());
			lemma.getRfmVars().add(newFmVar);
		}
		lemma.setFinalState(state);
		return lemma;
	}
	
	
}
