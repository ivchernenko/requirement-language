package su.nsk.iae.rpl.invpatterngenerator

import su.nsk.iae.rpl.rPL.UpdateStateVariable
import java.util.ListIterator
import java.util.ArrayList
import su.nsk.iae.rpl.rPL.PastExtraInvariantPattern

class ProofScriptGenerator {
	int premisesNumber;
	static final String BASE_PREMISES_NAME = "prems";
	
	def String generateForOuterConjunction(
		OuterExtraInvariantFormula left, OuterExtraInvariantFormula right, UpdateStateVariable initState, UpdateStateVariable finalState
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
			apply(insert «premisesName»(1,2,4)[1]
			''');
		}
		script.append('''
		apply(erule «extraInv.getMainConj().getPattern().getLemmas().getL8().getName()»)
		  apply simp
		  «extraInv.generateL8PremiseInstance(initState, finalState).generateProofScript(this)»
		''');
		for (PastExtraInvariantPatternInstance extraConj: extraConjs) {
			val premisesName = premisesNames.remove(premisesNames.size() -1);
			script.append('''
			apply(insert «premisesName»(1,3,5)
			  apply(erule «extraConj.getPattern().getLemmas().getL6().getName()»
			  apply simp
			  «extraConj.generateLemmaPremiseInstance(initState).generateProofScript(this)»
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
		apply(erule «reqFormula.getL9().getName()»
		apply simp
		  «extraInvFormula.generateL9PremiseInstance(reqFormula, state).generateProofScript(this)»
		«IF extraConjs.size() > 0»
		done
		done
		«ENDIF»
		'''		
	}
	
	def String generateForLemmaPremiseConjunction(LemmaPremise left, LemmaPremise right) {
		premisesNumber++;
		val premisesName = BASE_PREMISES_NAME + premisesNumber;
		return '''
		apply(erule conjE)
		apply(erule conjE)
		subgoal premises «premisesName»
		apply(rule conjI)
		apply(insert «premisesName»(1,2)[1]
		  «left.generateProofScript(this)»
		apply(insert «premisesName»(1,3)
		  «right.generateProofScript(this)»
		done
		'''
	}
	
	def String generateForLemmaPremiseDisjunction(LemmaPremise left, LemmaPremise right) {
		return '''
		apply(erule disjE)
		apply(rule disjI1)
		  «left.generateProofScript(this)»
		apply(rule disjI2)
		  «right.generateProofScript(this)»
		'''
	}
	
	def generateForFutureExtraInvariantPatternInstance(FutureExtraInvariantPatternInstance patternInst) {
		return '''
		apply(rule «patternInst.getPattern().getLemmas().getL2().getName()»)
		apply simp
		  «patternInst.generateLemmaPremiseInstance().generateProofScript(this)»
		'''
	}
}