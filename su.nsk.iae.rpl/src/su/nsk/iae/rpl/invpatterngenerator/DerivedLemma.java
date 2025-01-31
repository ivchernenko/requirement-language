package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class DerivedLemma {
	String lemmaName;
	String extraInvPattern;
	List<ConstantParameter> cVars;
	List<FunctionalParameter> fnVars;
	List<SimpleFormulaParameter> simpleFmVars;
	List<RegularFormulaParameter> einvFmVars;
	LemmaPremise premise;
	
	public DerivedLemma(String lemmaName, String extraInvPattern, List<ConstantParameter> cVars, List<FunctionalParameter> fnVars,
			List<SimpleFormulaParameter> simpleFmVars, List<RegularFormulaParameter> einvFmVars, LemmaPremise premise) {
		this.lemmaName = lemmaName;
		this.extraInvPattern = extraInvPattern;
		this.cVars = cVars;
		this.fnVars = fnVars;
		this.simpleFmVars = simpleFmVars;
		this.einvFmVars = einvFmVars;
		this.premise = premise;
	}
	
	String generateExtraInvPatternInstance(UpdateStateVariable state) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(extraInvPattern).append(' ');
		for (ConstantParameter cVar: cVars)
			stringBuilder.append(cVar.getName()).append(' ');
		for (FunctionalParameter fnVar: fnVars)
			stringBuilder.append(fnVar.getName()).append(' ');
		for (SimpleFormulaParameter simpleFmVar: simpleFmVars)
			stringBuilder.append(simpleFmVar.getName()).append(' ');
		for (RegularFormulaParameter einvFmVar: einvFmVars)
			stringBuilder.append(einvFmVar.getName()).append(' ');
		stringBuilder.append(state.getName());
		return stringBuilder.toString();
	}
	
	public Lemma convertToEObject() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		Lemma lemma = factory.createLemma();
		lemma.setName(lemmaName);
		lemma.getCVars().addAll(cVars);
		lemma.getFnVars().addAll(fnVars);
		lemma.getSimpleFmVars().addAll(simpleFmVars);
		lemma.getIfmVars().addAll(einvFmVars);
		lemma.setPrem(premise.convertToEObject());
		return lemma;
	}

}
