package su.nsk.iae.rpl.invpatterngenerator;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
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
	public Term substrituteCParam(ConstantParameter param, Term value) {
		return this;
	}

	@Override
	public Term substituteFunctionalParameter(FunctionalParameter param, FunctionalParameter value) {
		if (this.fnParam.equals(param))
			return new FunctionApplication(value, state);
		else return this;
	}
}
