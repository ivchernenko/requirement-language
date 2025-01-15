package su.nsk.iae.rpl.invpatterngenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.LemmaPremiseFormula;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

public class ExtendedInvariant extends OuterExtraInvariantFormula {
	DerivedExtraInvariantPatternInstance mainConj;
	List<Implication> extraConjs;
	public ExtendedInvariant(DerivedExtraInvariantPatternInstance mainConj, List<Implication> extraConjs) {
		super();
		this.mainConj = mainConj;
		this.extraConjs = extraConjs;
	}
	public OuterExtraInvariantFormula getMainConj() {
		return mainConj;
	}
	public List<OuterExtraInvariantFormula> getExtraConjs() {
		return extraConjs;
	}
	@Override
	public LemmaPremise generateL8() {
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L8 = pattern.getLemmas().getL8();
		LemmaPremiseFormula premise = L8.getPrem();
		LS8LemmaPremiseInstanceCreator instCreator = new LS8LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(
				L8,
				mainConj.getcParams(),
				mainConj.getFnParams(),
				mainConj.getSimpleFmParams(),
				mainConj.getRegFmParams(),
				null);
		LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		UpdateStateVariable finalState = L8.getFinalState();
		for (var conjunct: extraConjs) {
			FunctionApplication left = new FunctionApplication(conjunct.getLeft(), finalState);
			PastExtraInvariantPatternInstance right = conjunct.getRight().setState(finalState);
			ImplicationLemmaPremise extraConj = new ImplicationLemmaPremise(left, right);
			premiseInstance = new BooleanLemmaPremise(BooleanOperator.CONJUNCTION, premiseInstance, extraConj);
		}
		return premiseInstance.replacePatterns();
	}


	@Override
	public LS9LemmaPremise generateL9() {
		DerivedExtraInvariantPattern pattern = mainConj.getPattern();
		Lemma L9 = pattern.getLemmas().getL9();
		LemmaPremiseFormula premise = L9.getPrem();
		LS9LemmaPremiseInstanceCreator instCreator = new LS9LemmaPremiseInstanceCreator();
		ParameterValueMap params = new ParameterValueMap(
				L9,
				mainConj.getcParams(),
				mainConj.getFnParams(),
				mainConj.getSimpleFmParams(),
				mainConj.getRegFmParams(),
				null);
		LS9LemmaPremise premiseInstance = premise.substitiuteParams(instCreator, params);
		return premiseInstance.replacePatterns();
	}
}
