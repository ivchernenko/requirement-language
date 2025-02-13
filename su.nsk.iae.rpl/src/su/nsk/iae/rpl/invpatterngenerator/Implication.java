package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class Implication {
	FunctionalParameter left;
	PastExtraInvariantPatternInstance right;
	public Implication(FunctionalParameter left, PastExtraInvariantPatternInstance right) {
		super();
		this.left = left;
		this.right = right;
	}
	public FunctionalParameter getLeft() {
		return left;
	}
	public PastExtraInvariantPatternInstance getRight() {
		return right;
	}
	public String convertToString(UpdateStateVariable finalState) {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append('(').append(left.getName()).append(' ').append(finalState.getName()).append(" --> ")
		.append(right.setState(finalState, false)).append(')')
		.toString();
	}	
}
