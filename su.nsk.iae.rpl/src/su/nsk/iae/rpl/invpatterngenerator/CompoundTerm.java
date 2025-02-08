package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.AddOperator;
import su.nsk.iae.rpl.rPL.AddTerm;
import su.nsk.iae.rpl.rPL.CompPredicate;
import su.nsk.iae.rpl.rPL.CompareTerm;
import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.EqPredicate;
import su.nsk.iae.rpl.rPL.EqTerm;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.MulOperator;
import su.nsk.iae.rpl.rPL.MulTerm;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class CompoundTerm extends Term {
	private final Operator operator;
	private final Term left;
	private final Term right;
	public CompoundTerm(Operator operator, Term left, Term right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	public Operator getOperator() {
		return operator;
	}
	public Term getLeft() {
		return left;
	}
	public Term getRight() {
		return right;
	}
	@Override
	public Term substrituteCParam(Map<String, Term> values) {
		return new CompoundTerm(operator, left.substrituteCParam(values), right.substrituteCParam(values));
	}
	@Override
	public Term substituteFunctionalParameter(Map<String, FunctionalParameter> values) {
		return new CompoundTerm(
				operator,
				left.substituteFunctionalParameter(values),
				right.substituteFunctionalParameter(values));
	}
	@Override
	public InnerExtraInvariantFormula replaceStates(Map<String, UpdateStateVariable> substitution) {
		Term newLeft = (Term) left.replaceStates(substitution);
		Term newRight = (Term) right.replaceStates(substitution);
		return new CompoundTerm(operator, newLeft, newRight);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append('(').append(left).append(' ').append(operator).append(' ').append(right).append(')')
				.toString();
	}
	@Override
	su.nsk.iae.rpl.rPL.Term convertToRPLTerm() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		su.nsk.iae.rpl.rPL.Term eLeft = left.convertToRPLTerm();
		su.nsk.iae.rpl.rPL.Term eRight = right.convertToRPLTerm();
		su.nsk.iae.rpl.rPL.Term term = null;
		switch (operator) {
		case AND:
			term = factory.createAddTerm(); break;
		case DIV:
			MulTerm divTerm = factory.createMulTerm(); divTerm.setMulOp(MulOperator.DIV); term = divTerm;  break;
		case EQ:
			EqTerm eqTerm = factory.createEqTerm(); eqTerm.setEqPred(EqPredicate.EQ); term = eqTerm; break;
		case GEQ:
			CompareTerm geqTerm = factory.createCompareTerm();  geqTerm.setCompPred(CompPredicate.GREATER_EQ); 
			term = geqTerm; break;
		case GREATER:
			CompareTerm gTerm = factory.createCompareTerm();  gTerm.setCompPred(CompPredicate.GREATER); 
			term = gTerm; break;
		case LEQ:
			CompareTerm leqTerm = factory.createCompareTerm();  leqTerm.setCompPred(CompPredicate.LESS_EQ); 
			term = leqTerm; break;
		case LESS:
			CompareTerm lTerm = factory.createCompareTerm();  lTerm.setCompPred(CompPredicate.LESS); 
			term = lTerm; break;
		case MINUS:
			AddTerm minusTerm = factory.createAddTerm();  minusTerm.setAddOp(AddOperator.BMINUS); 
			term = minusTerm; break;
		case MOD:
			MulTerm modTerm = factory.createMulTerm();  modTerm.setMulOp(MulOperator.MOD);
			term = modTerm; break;
		case MUL:
			MulTerm mulTerm = factory.createMulTerm();  mulTerm.setMulOp(MulOperator.MUL);
			term = mulTerm; break;
		case NEQ:
			EqTerm neqTerm = factory.createEqTerm(); neqTerm.setEqPred(EqPredicate.NOT_EQ); term = neqTerm; break;
		case OR:
			term = factory.createTerm(); break;
		case PLUS:
			AddTerm plusTerm = factory.createAddTerm();  plusTerm.setAddOp(AddOperator.PLUS); 
			term = plusTerm; break;
		case POW:
			term = factory.createPowerTerm(); break;
		default:
			break;
		}
		term.setLeft(eLeft);
		term.setRight(eRight);
		return term;
	}
}
