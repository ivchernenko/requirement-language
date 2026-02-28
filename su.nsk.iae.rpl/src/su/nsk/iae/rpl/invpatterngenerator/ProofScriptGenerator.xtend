package su.nsk.iae.rpl.invpatterngenerator

import su.nsk.iae.rpl.rPL.UpdateStateVariable
import java.util.ListIterator
import java.util.ArrayList
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern
import java.util.List

class ProofScriptGenerator {
	int premisesNumber;
	static final String BASE_PREMISES_NAME = "prems";
	static final String ALWAYS_IMP_REFL_RULE = "always_imp_refl";
	static final String ALWAYS_CONJ_RULE = "always_conj_rule";
	static final String ALWAYS_DISJ_RULE = "always_disj_rule";
	static final String DE_MORGAN_CONJ = "de_Morgan_conj";
	static final String DE_MORGAN_DISJ = "de_Morgan_disj";
	static final String DOUBLE_NEGATION_RULE = "cnf.clause2raw_not_not";
	
	def String generateForOuterConjunction(
		OuterExtraInvariantFormula left, OuterExtraInvariantFormula right, UpdateStateVariable initState,
		 UpdateStateVariable finalState
	) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(erule conjE)
		apply(erule conjE)
		subgoal premises «premisesName»
		apply(rule conjI)
		apply(insert «premisesName»(1,2,4))[1]
		  «left.generateProofScriptForL8(initState, finalState, this)»
		apply(insert «premisesName»(1,3,5))
		  «right.generateProofScriptForL8(initState, finalState, this)»
		done
		'''
	}
	
	def String generateForOuterDisjunction(
		OuterExtraInvariantFormula left, OuterExtraInvariantFormula right, UpdateStateVariable initState, UpdateStateVariable finalState
	) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(erule conjE)
		subgoal premises «premisesName»
		apply(insert «premisesName»(1,2)
		apply(erule disjE)
		apply(insert «premisesName»(3)
		apply(rule disjI1)
		  «left.generateProofScriptForL8(initState, finalState, this)»
		apply(insert «premisesName»(4)
		apply(rule disjI2)
		  «right.generateProofScriptForL8(initState, finalState, this)»
		done
		'''
	}
	
	def String generateForOuterConjunction(
		OuterExtraInvariantFormula left, OuterExtraInvariantFormula right, OuterRequirementFormula reqLeft,
		OuterRequirementFormula reqRight, UpdateStateVariable state
	) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(erule conjE)
		apply(erule conjE)
		subgoal premises «premisesName»
		apply(rule conjI)
		apply(insert «premisesName»(1,2,4))[1]
		  «left.generateProofScriptForL9(reqLeft, state, this)»
		apply(insert «premisesName»(1,3,5))
		  «right.generateProofScriptForL9(reqRight, state, this)»
		done
		'''
	}
	
	def String generateForOuterDisjunction(
		OuterExtraInvariantFormula left, OuterExtraInvariantFormula right, OuterRequirementFormula reqLeft,
		OuterRequirementFormula reqRight, UpdateStateVariable state
	) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(erule conjE)
		subgoal premises «premisesName»
		apply(insert «premisesName»(1,2)
		apply(erule disjE)
		apply(insert «premisesName»(3)
		apply(rule disjI1)
		  «left.generateProofScriptForL9(reqLeft, state, this)»
		apply(insert «premisesName»(4)
		apply(rule disjI2)
		  «right.generateProofScriptForL9(reqRight, state, this)»
		done
		'''
	}
	
	def String generateForExtendedInvariant(
		ExtendedInvariant extraInv, UpdateStateVariable initState, UpdateStateVariable finalState
	) {
		val extraConjs = extraInv.getExtraConjs();
		val iter = extraConjs.listIterator(extraConjs.size());
		val script = new StringBuilder();
		val premisesNames = new ArrayList();
		while (iter.hasPrevious()) {
			premisesNumber++;
			val premisesName = BASE_PREMISES_NAME + premisesNumber;
			val extraConj = iter.previous();
			extraConj.setName(premisesName + "(3)");
			premisesNames.add(premisesName);
			script.append('''
			apply(erule conjE)
			apply(erule conjE)
			subgoal premises «premisesName»
			apply(rule conjI)
			apply(insert «premisesName»(1,2,4))[1]
			''');
		}
		script.append('''
		apply(erule «extraInv.getMainConj().getPattern().getLemmas().getL8().getName()»)
		  apply simp
		  «extraInv.generateL8PremiseInstance(initState, finalState).generateProofScript(initState, this)»
		''');
		for (PastExtraInvariantPatternInstance extraConj: extraConjs) {
			var premisesName = premisesNames.remove(premisesNames.size() -1);
			var premiseConj = extraConj.setState(finalState, true);
			script.append('''
			apply(insert «premisesName»(1,3,5))
			  apply(erule «extraConj.getPattern().getLemmas().getL6().getName()»)
			  apply simp
			  «premiseConj.generateLemmaPremiseInstance(initState).generateProofScript(initState, this)»
			done
			''')
		}
		return script.toString();
	}
	
	def String generateForDerivedRequirementPatternInstance(
		ExtendedInvariant extraInvFormula, DerivedRequirementPatternInstance reqFormula, UpdateStateVariable state
	) {
		val extraConjs = extraInvFormula.getExtraConjs();
		premisesNumber++;
		val premises1 = BASE_PREMISES_NAME + premisesNumber;
		premisesNumber++;
		val premises2 = BASE_PREMISES_NAME + premisesNumber;
		return '''
		«IF extraConjs.size() > 0»
		subgoal premises «premises1»
		apply(insert «premises1»(1,2))
		«IF extraConjs.size() > 1»
		apply(simp only: conj_assoc)
		«ENDIF»
		apply(erule conjE)
		subgoal premises «premises2»
		apply(insert «premises2»(1,2) «premises1»(3))
		«ENDIF»
		apply(erule «reqFormula.getL9().getName()»)
		apply simp
		  «extraInvFormula.generateL9PremiseInstance(reqFormula, state).generateProofScript(null, this)»
		«IF extraConjs.size() > 0»
		done
		done
		«ENDIF»
		'''		
	}
	
	def String generateForLemmaPremiseConjunction(LemmaPremise left, LemmaPremise right, UpdateStateVariable initState) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(erule conjE)
		subgoal premises «premisesName»
		apply(rule conjI)
		apply(insert «premisesName»(1,2))[1]
		  «left.generateProofScript(initState, this)»
		apply(insert «premisesName»(1,3))
		  «right.generateProofScript(initState, this)»
		done
		'''
	}
	
	def String generateForLemmaPremiseDisjunction(LemmaPremise left, LemmaPremise right, UpdateStateVariable initState) {
		return '''
		apply(erule disjE)
		apply(rule disjI1)
		  «left.generateProofScript(initState, this)»
		apply(rule disjI2)
		  «right.generateProofScript(initState, this)»
		'''
	}
	
	def generateForFutureExtraInvariantPatternInstance(FutureExtraInvariantPatternInstance patternInst, UpdateStateVariable initState) {
		return '''
		apply(rule «patternInst.getPattern().getLemmas().getL2().getName()»)
		apply simp
		  «patternInst.generateLemmaPremiseInstance().generateProofScript(initState, this)»
		'''
	}
	
	def String generateForPastRequirementPatternInstance(PastRequirementPatternInstance patternInst, UpdateStateVariable initState) {
		return '''
		apply(rule «patternInst.getL7().getName()»[OF «patternInst.getExtraInv().getName()»])
		apply simp
		  «patternInst.generateLemmaPremiseInstance(initState).generateProofScript(initState, this)»
		'''
	}
	
	def String generateForImplication(ImplicationLemmaPremise implication, UpdateStateVariable initState) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(rule impI)
		apply(erule impE)
		apply assumption
		subgoal premises «premisesName»
		apply(insert «premisesName»(1,3))
		  «implication.getRight().generateProofScript(initState, this)»
		done
		'''
	}
	
	def String generateForIdenticallyTrueImplication() {
		return '''
		apply(rule «ALWAYS_IMP_REFL_RULE»)
		'''
	}
	
	def String generateForBooleanCombinationInImplication(
		BooleanInnerExtraInvariantFormula left, Formula right, List<UpdateStateVariable> lambdaBound, 
		UpdateStateVariable state
	) {
		val rule = switch (left.getOperator()) {
			case BooleanOperator.CONJUNCTION:
			ALWAYS_CONJ_RULE
			case BooleanOperator.DISJUNCTION:
			ALWAYS_DISJ_RULE			
		};
		return '''
		apply(rule «rule»)
		apply simp
		  «left.split(right, lambdaBound, state).generateProofScript(state, this)»
		'''
	}
	
	def String generateForFutureInImplication(
		FutureExtraInvariantPatternInstance left, Formula right, List<UpdateStateVariable> lambdaBound, 
		UpdateStateVariable state
	) {
		return '''
		apply(rule «left.getLemmaForImplication(right).getName()»)
		apply simp
		  «left.replacePatternsForNotIdenticallyTrueImplicationStep(right, lambdaBound, state)
		  .generateProofScript(state, this)»
		'''
	}
	
	def String generateForPastInImplication(
		PastRequirementPatternInstance left, PastRequirementPatternInstance right, List<UpdateStateVariable> lambdaBound, 
		UpdateStateVariable state
	) {
		return '''
		apply(rule «left.getLemmaForImplication(right).getName()»)
		apply simp
		  «left.replacePatternsForNotIdenticallyTrueImplicationStep(right, lambdaBound, state)
		  .generateProofScript(state, this)»
		'''
	}
	
	def String generateForNegatedBooleanFormula(UpdateStateVariable initState, BooleanPatternFreeFormula formula) {
		var deMorgansLow = "";
		var dualOperator = null as BooleanOperator;
		switch (formula.getOperator()) {
			case BooleanOperator.CONJUNCTION: {
				deMorgansLow = DE_MORGAN_CONJ
				dualOperator = BooleanOperator.DISJUNCTION;
			}
			case BooleanOperator.DISJUNCTION: {
				deMorgansLow = DE_MORGAN_DISJ
				dualOperator = BooleanOperator.CONJUNCTION;
			}			
		}
		val negatedFormula = new BooleanPatternFreeFormula(
			dualOperator, 
			new NegationFormula(formula.getLeft()), 
			new NegationFormula(formula.getLeft())
		)
		return '''
		apply(subst (1) «deMorgansLow»)
		  «negatedFormula.generateProofScript(initState, this)»
		'''
	}
	
	def String generateForDoubleNegation(UpdateStateVariable initState, PatternFreeInnerFormula formula) {
		return '''
		apply(rule «DOUBLE_NEGATION_RULE»)
		  «formula.generateProofScript(initState, this)»
		'''
	}
	
	def String generateProofByAssumption() {
		return "apply simp"
	}
}