package su.nsk.iae.rpl.invpatterngenerator;

import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunApplication;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.PrimaryTerm;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class FunctionApplication extends Term {
	FunctionalParameter fnParam;
	UpdateStateVariable state;
	
	public FunctionApplication(FunctionalParameter fnParam, UpdateStateVariable state) {
		super();
		this.fnParam = fnParam;
		this.state = state;
	}
	
	public FunctionalParameter getFnParam() {
		return fnParam;
	}

	public UpdateStateVariable getState() {
		return state;
	}

	@Override
	public Term substrituteCParam(Map<ConstantParameter, Term> value) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(Map<FunctionalParameter, FunctionalParameter> values) {
		for (var paramValuePair: values.entrySet())
			if (fnParam.equals(paramValuePair.getKey()))
				return new FunctionApplication(paramValuePair.getValue(), state);
		return this;
	}

	@Override
	public InnerExtraInvariantFormula replaceStates(Map<UpdateStateVariable, UpdateStateVariable> substitution) {
		UpdateStateVariable newState = substitution.getOrDefault(state, state);
		return new FunctionApplication(fnParam, newState);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append('(').append(fnParam.getName()).append(' ').append(state.getName()).append(')')
				.toString();
	}

	@Override
	su.nsk.iae.rpl.rPL.Term convertToRPLTerm() {
		RPLFactory factory = RPLFactory.eINSTANCE;
		FunApplication funApp = factory.createFunApplication();
		funApp.setFnParam(fnParam);
		funApp.setState(state);
		PrimaryTerm term = factory.createPrimaryTerm();
		term.setFunApp(funApp);
		return term;
	}
}
