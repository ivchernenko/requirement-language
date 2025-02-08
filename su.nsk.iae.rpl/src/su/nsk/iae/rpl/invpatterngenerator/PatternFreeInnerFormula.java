package su.nsk.iae.rpl.invpatterngenerator;

import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public interface PatternFreeInnerFormula extends InnerRequirementFormula, InnerExtraInvariantFormula {

	@Override
	PatternFreeInnerFormula replaceStates(Map<String, UpdateStateVariable> substitution);

	@Override
	PatternFreeInnerFormula applyToStates(List<UpdateStateVariable> states);
	
	PatternFreeInnerFormula negate();
}
