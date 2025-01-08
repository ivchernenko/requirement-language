package su.nsk.iae.rpl.invpatterngenerator;

public abstract class Formula {
	int arity;
	
	abstract FormulaFactory createFactory();

}
