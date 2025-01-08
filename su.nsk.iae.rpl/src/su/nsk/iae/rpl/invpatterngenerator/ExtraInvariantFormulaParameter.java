package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.RegularFormulaParameter;

public class ExtraInvariantFormulaParameter extends InnerExtraInvariantFormula {
	private final RegularFormulaParameter renamed;
	private final RegularFormulaParameter original;
	public ExtraInvariantFormulaParameter(RegularFormulaParameter renamed, RegularFormulaParameter original) {
		super();
		this.renamed = renamed;
		this.original = original;
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
