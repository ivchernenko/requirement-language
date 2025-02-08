package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
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
	private List<ConstantParameter> cVars;
	List<FunctionalParameter> fnVars;
	List<SimpleFormulaParameter> simpleFmVars;
	List<RegularFormulaParameter> einvFmVars;
	LemmaPremise premise;
	
	static final  String META_IMPLICATION = "\\<Longrightarrow>";
	
	public DerivedLemma(String lemmaName, String extraInvPattern, List<ConstantParameter> cVars, List<FunctionalParameter> fnVars,
			List<SimpleFormulaParameter> simpleFmVars, List<RegularFormulaParameter> einvFmVars, LemmaPremise premise) {
		this.lemmaName = lemmaName;
		this.extraInvPattern = extraInvPattern;
		this.setcVars(cVars);
		this.fnVars = fnVars;
		this.simpleFmVars = simpleFmVars;
		this.einvFmVars = einvFmVars;
		this.premise = premise;
	}
	
	String generateExtraInvPatternInstance(UpdateStateVariable state) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(extraInvPattern).append(' ');
		for (ConstantParameter cVar: getcVars())
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
		for (ConstantParameter cVar: cVars) {
			ConstantParameter newCVar = factory.createConstantParameter();
			newCVar.setName(cVar.getName());
			lemma.getCVars().add(newCVar);
		}
		for (FunctionalParameter fnVar: fnVars) {
			FunctionalParameter newFnVar = factory.createFunctionalParameter();
			newFnVar.setName(fnVar.getName());
			lemma.getFnVars().add(newFnVar);
		}
		for (SimpleFormulaParameter fmVar: simpleFmVars) {
			SimpleFormulaParameter newFmVar = factory.createSimpleFormulaParameter();
			newFmVar.setName(fmVar.getName());
			lemma.getSimpleFmVars().add(newFmVar);
		}
		for (RegularFormulaParameter fmVar: einvFmVars) {
			RegularFormulaParameter newFmVar = factory.createRegularFormulaParameter();
			newFmVar.setName(fmVar.getName());
			lemma.getIfmVars().add(newFmVar);
		}
		lemma.setPrem(premise.convertToEObject());
		return lemma;
	}

	public List<ConstantParameter> getcVars() {
		return cVars;
	}

	public void setcVars(List<ConstantParameter> cVars) {
		this.cVars = cVars;
	}

}
