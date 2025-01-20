package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.AddTerm;
import su.nsk.iae.rpl.rPL.CompareTerm;
import su.nsk.iae.rpl.rPL.ConjunctionTerm;
import su.nsk.iae.rpl.rPL.Constant;
import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.EqPredicate;
import su.nsk.iae.rpl.rPL.EqTerm;
import su.nsk.iae.rpl.rPL.FunApplication;
import su.nsk.iae.rpl.rPL.IntegerLiteral;
import su.nsk.iae.rpl.rPL.MulTerm;
import su.nsk.iae.rpl.rPL.NumericLiteral;
import su.nsk.iae.rpl.rPL.PowerTerm;
import su.nsk.iae.rpl.rPL.PrimaryTerm;
import su.nsk.iae.rpl.rPL.RealLiteral;
import su.nsk.iae.rpl.rPL.UnaryTerm;
import su.nsk.iae.rpl.rPL.Variable;


public class TermConverter {
	public Term convertTerm(su.nsk.iae.rpl.rPL.Term term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		return new CompoundTerm(Operator.OR, left, right);
	}

	public Term convertTerm(ConjunctionTerm term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		return new CompoundTerm(Operator.AND, left, right);
	}

	public Term convertTerm(su.nsk.iae.rpl.rPL.NegationTerm term) {
		return new NegationTerm(term.getRight().convert(this));
	}

	public Term convertTerm(EqTerm term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		Operator operator;
		if (term.getEqPred() == EqPredicate.EQ)
			operator = Operator.EQ;
		else
			operator = Operator.NEQ;
		return new CompoundTerm(operator, left, right);
	}

	public Term convertTerm(CompareTerm term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		Operator operator = null;
		switch (term.getCompPred()) {
		case LESS: operator = Operator.LESS; break;
		case GREATER: operator = Operator.GREATER; break;
		case LESS_EQ: operator = Operator.LEQ; break;
		case GREATER_EQ: operator = Operator.GEQ; break;
		}
		return new CompoundTerm(operator, left, right);
	}

	public Term convertTerm(AddTerm term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		Operator operator = null;
		switch (term.getAddOp()) {
		case PLUS: operator = Operator.PLUS; break;
		case BMINUS: operator = Operator.MINUS; break;
		}
		return new CompoundTerm(operator, left, right);
	}

	public Term convertTerm(MulTerm term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		Operator operator = null;
		switch (term.getMulOp()) {
		case MUL: operator = Operator.MUL; break;
		case DIV: operator = Operator.DIV; break;
		case MOD: operator = Operator.MOD; break;
		}
		return new CompoundTerm(operator, left, right);
	}

	public Term convertTerm(PowerTerm term) {
		Term left = term.getLeft().convert(this);
		Term right = term.getRight().convert(this);
		return new CompoundTerm(Operator.POW, left, right);
	}

	public Term convertTerm(UnaryTerm term) {
		return new UnMinusTerm(term.getRight().convert(this));
	}

	public Term convertTerm(PrimaryTerm term) {
		if (term.getConst() != null) {
			Constant c = term.getConst();
			if (c.getBool() != null)
				return BooleanLiteral.valueOf(c.getBool());
			else if (c.getNum() != null) {
				Number numConst;
				NumericLiteral literal = c.getNum();
				if (literal instanceof IntegerLiteral intLiteral) {
					numConst = Long.parseLong(intLiteral.getValue());
				}
				else {
					RealLiteral realLiteral = (RealLiteral) literal;
					numConst = Double.parseDouble(realLiteral.getValue());
				}
				return new NumericConstant(numConst);
			}
		}
		else if (term.getVariable() != null && term.getState() == null) {
			Variable variable = term.getVariable();
			if (variable instanceof ConstantParameter constParam)
				return new ConstParameter(constParam);
		}
		else if (term.getFunApp() != null) {
			FunApplication funApp = term.getFunApp();
			return new FunctionApplication(funApp.getFnParam(), funApp.getState());
		}
		else if (term.getNestedTerm() != null)
			return term.getNestedTerm().convert(this);
		return null;
	}
}


