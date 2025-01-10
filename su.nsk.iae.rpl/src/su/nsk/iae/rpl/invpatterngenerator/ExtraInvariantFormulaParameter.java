package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;

import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ExtraInvariantFormulaParameter implements InnerExtraInvariantFormula {
	private final RegularFormulaParameter renamed;
	private final RegularFormulaParameter original;
	private final List<UpdateStateVariable> states;
	public List<UpdateStateVariable> getStates() {
		return states;
	}
	public ExtraInvariantFormulaParameter(
			RegularFormulaParameter renamed,
			RegularFormulaParameter original,
			List<UpdateStateVariable> states) {
		super();
		this.renamed = renamed;
		this.original = original;
		this.states = states;
	}
	public RegularFormulaParameter getRenamed() {
		return renamed;
	}
	public RegularFormulaParameter getOriginal() {
		return original;
	}
	
	public String getName() {
		return renamed.getName();
	}
	
	public String getOriginalName() {
		return original.getName();
	}

}
