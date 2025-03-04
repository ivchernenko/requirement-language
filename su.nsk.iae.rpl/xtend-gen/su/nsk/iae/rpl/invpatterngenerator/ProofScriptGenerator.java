package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.eclipse.xtend2.lib.StringConcatenation;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

@SuppressWarnings("all")
public class ProofScriptGenerator {
  private int premisesNumber;

  private static final String BASE_PREMISES_NAME = "prems";

  private static final String ALWAYS_IMP_REFL_RULE = "always_imp_refl";

  private static final String ALWAYS_CONJ_RULE = "always_conj_rule";

  private static final String ALWAYS_DISJ_RULE = "always_disj_rule";

  private static final String DE_MORGAN_CONJ = "de_Morgan_conj";

  private static final String DE_MORGAN_DISJ = "de_Morgan_disj";

  private static final String DOUBLE_NEGATION_RULE = "cnf.clause2raw_not_not";

  public String generateForOuterConjunction(final OuterExtraInvariantFormula left, final OuterExtraInvariantFormula right, final UpdateStateVariable initState, final UpdateStateVariable finalState) {
    this.premisesNumber++;
    final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("subgoal premises ");
    _builder.append(premisesName);
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule conjI)");
    _builder.newLine();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,2,4))[1]");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScriptForL8 = left.generateProofScriptForL8(initState, finalState, this);
    _builder.append(_generateProofScriptForL8, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,3,5))");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScriptForL8_1 = right.generateProofScriptForL8(initState, finalState, this);
    _builder.append(_generateProofScriptForL8_1, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("done");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateForOuterDisjunction(final OuterExtraInvariantFormula left, final OuterExtraInvariantFormula right, final UpdateStateVariable initState, final UpdateStateVariable finalState) {
    this.premisesNumber++;
    final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("subgoal premises ");
    _builder.append(premisesName);
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,2)");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(erule disjE)");
    _builder.newLine();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(3)");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule disjI1)");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScriptForL8 = left.generateProofScriptForL8(initState, finalState, this);
    _builder.append(_generateProofScriptForL8, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(4)");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule disjI2)");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScriptForL8_1 = right.generateProofScriptForL8(initState, finalState, this);
    _builder.append(_generateProofScriptForL8_1, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("done");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateForOuterConjunction(final OuterExtraInvariantFormula left, final OuterExtraInvariantFormula right, final OuterRequirementFormula reqLeft, final OuterRequirementFormula reqRight, final UpdateStateVariable state) {
    this.premisesNumber++;
    final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("subgoal premises ");
    _builder.append(premisesName);
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule conjI)");
    _builder.newLine();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,2,4))[1]");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScriptForL9 = left.generateProofScriptForL9(reqLeft, state, this);
    _builder.append(_generateProofScriptForL9, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,3,5))");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScriptForL9_1 = right.generateProofScriptForL9(reqRight, state, this);
    _builder.append(_generateProofScriptForL9_1, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("done");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateForOuterDisjunction(final OuterExtraInvariantFormula left, final OuterExtraInvariantFormula right, final OuterRequirementFormula reqLeft, final OuterRequirementFormula reqRight, final UpdateStateVariable state) {
    this.premisesNumber++;
    final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("subgoal premises ");
    _builder.append(premisesName);
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,2)");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(erule disjE)");
    _builder.newLine();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(3)");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule disjI1)");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScriptForL9 = left.generateProofScriptForL9(reqLeft, state, this);
    _builder.append(_generateProofScriptForL9, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(4)");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule disjI2)");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScriptForL9_1 = right.generateProofScriptForL9(reqRight, state, this);
    _builder.append(_generateProofScriptForL9_1, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("done");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateForExtendedInvariant(final ExtendedInvariant extraInv, final UpdateStateVariable initState, final UpdateStateVariable finalState) {
    final List<PastExtraInvariantPatternInstance> extraConjs = extraInv.getExtraConjs();
    final ListIterator<PastExtraInvariantPatternInstance> iter = extraConjs.listIterator(extraConjs.size());
    final StringBuilder script = new StringBuilder();
    final ArrayList<String> premisesNames = new ArrayList<String>();
    while (iter.hasPrevious()) {
      {
        this.premisesNumber++;
        final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
        final PastExtraInvariantPatternInstance extraConj = iter.previous();
        extraConj.setName((premisesName + "(3)"));
        premisesNames.add(premisesName);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("apply(erule conjE)");
        _builder.newLine();
        _builder.append("apply(erule conjE)");
        _builder.newLine();
        _builder.append("subgoal premises ");
        _builder.append(premisesName);
        _builder.newLineIfNotEmpty();
        _builder.append("apply(rule conjI)");
        _builder.newLine();
        _builder.append("apply(insert ");
        _builder.append(premisesName);
        _builder.append("(1,2,4))[1]");
        _builder.newLineIfNotEmpty();
        script.append(_builder);
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule ");
    String _name = extraInv.getMainConj().getPattern().getLemmas().getL8().getName();
    _builder.append(_name);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = extraInv.generateL8PremiseInstance(initState, finalState).generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    script.append(_builder);
    for (final PastExtraInvariantPatternInstance extraConj : extraConjs) {
      {
        int _size = premisesNames.size();
        int _minus = (_size - 1);
        final String premisesName = premisesNames.remove(_minus);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("apply(insert ");
        _builder_1.append(premisesName);
        _builder_1.append("(1,3,5)");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("apply(erule ");
        String _name_1 = extraConj.getPattern().getLemmas().getL6().getName();
        _builder_1.append(_name_1, "  ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("apply simp");
        _builder_1.newLine();
        _builder_1.append("  ");
        String _generateProofScript_1 = extraConj.generateLemmaPremiseInstance(initState).generateProofScript(initState, this);
        _builder_1.append(_generateProofScript_1, "  ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("done");
        _builder_1.newLine();
        script.append(_builder_1);
      }
    }
    return script.toString();
  }

  public String generateForDerivedRequirementPatternInstance(final ExtendedInvariant extraInvFormula, final DerivedRequirementPatternInstance reqFormula, final UpdateStateVariable state) {
    final List<PastExtraInvariantPatternInstance> extraConjs = extraInvFormula.getExtraConjs();
    this.premisesNumber++;
    final String premises1 = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    this.premisesNumber++;
    final String premises2 = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = extraConjs.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("subgoal premises ");
        _builder.append(premises1);
        _builder.newLineIfNotEmpty();
        _builder.append("apply(insert ");
        _builder.append(premises1);
        _builder.append("(1,2))");
        _builder.newLineIfNotEmpty();
        {
          int _size_1 = extraConjs.size();
          boolean _greaterThan_1 = (_size_1 > 1);
          if (_greaterThan_1) {
            _builder.append("apply(simp only: conj_assoc)");
            _builder.newLine();
          }
        }
        _builder.append("apply(erule conjE)");
        _builder.newLine();
        _builder.append("subgoal premises ");
        _builder.append(premises2);
        _builder.newLineIfNotEmpty();
        _builder.append("apply(insert ");
        _builder.append(premises2);
        _builder.append("(1,2) ");
        _builder.append(premises1);
        _builder.append("(3))");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("apply(erule ");
    String _name = reqFormula.getL9().getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = extraInvFormula.generateL9PremiseInstance(reqFormula, state).generateProofScript(null, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    {
      int _size_2 = extraConjs.size();
      boolean _greaterThan_2 = (_size_2 > 0);
      if (_greaterThan_2) {
        _builder.append("done");
        _builder.newLine();
        _builder.append("done");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }

  public String generateForLemmaPremiseConjunction(final LemmaPremise left, final LemmaPremise right, final UpdateStateVariable initState) {
    this.premisesNumber++;
    final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule conjE)");
    _builder.newLine();
    _builder.append("subgoal premises ");
    _builder.append(premisesName);
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule conjI)");
    _builder.newLine();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,2))[1]");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScript = left.generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,3))");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScript_1 = right.generateProofScript(initState, this);
    _builder.append(_generateProofScript_1, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("done");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateForLemmaPremiseDisjunction(final LemmaPremise left, final LemmaPremise right, final UpdateStateVariable initState) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(erule disjE)");
    _builder.newLine();
    _builder.append("apply(rule disjI1)");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = left.generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("apply(rule disjI2)");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript_1 = right.generateProofScript(initState, this);
    _builder.append(_generateProofScript_1, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForFutureExtraInvariantPatternInstance(final FutureExtraInvariantPatternInstance patternInst, final UpdateStateVariable initState) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    String _name = patternInst.getPattern().getLemmas().getL2().getName();
    _builder.append(_name);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = patternInst.generateLemmaPremiseInstance().generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForPastRequirementPatternInstance(final PastRequirementPatternInstance patternInst, final UpdateStateVariable initState) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    String _name = patternInst.getL7().getName();
    _builder.append(_name);
    _builder.append("[OF ");
    String _name_1 = patternInst.getExtraInv().getName();
    _builder.append(_name_1);
    _builder.append("])");
    _builder.newLineIfNotEmpty();
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = patternInst.generateLemmaPremiseInstance(initState).generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForImplication(final ImplicationLemmaPremise implication, final UpdateStateVariable initState) {
    this.premisesNumber++;
    final String premisesName = (ProofScriptGenerator.BASE_PREMISES_NAME + Integer.valueOf(this.premisesNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule impI)");
    _builder.newLine();
    _builder.append("apply(rule impE)");
    _builder.newLine();
    _builder.append("apply assumption");
    _builder.newLine();
    _builder.append("subgoal premises ");
    _builder.append(premisesName);
    _builder.newLineIfNotEmpty();
    _builder.append("apply(insert ");
    _builder.append(premisesName);
    _builder.append("(1,3))");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScript = implication.getRight().generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("done");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateForIdenticallyTrueImplication() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    _builder.append(ProofScriptGenerator.ALWAYS_IMP_REFL_RULE);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForBooleanCombinationInImplication(final BooleanInnerExtraInvariantFormula left, final Formula right, final List<UpdateStateVariable> lambdaBound, final UpdateStateVariable state) {
    String _switchResult = null;
    BooleanOperator _operator = left.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case CONJUNCTION:
          _switchResult = ProofScriptGenerator.ALWAYS_CONJ_RULE;
          break;
        case DISJUNCTION:
          _switchResult = ProofScriptGenerator.ALWAYS_DISJ_RULE;
          break;
        default:
          break;
      }
    }
    final String rule = _switchResult;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    _builder.append(rule);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = left.split(right, lambdaBound, state).generateProofScript(state, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForFutureInImplication(final FutureExtraInvariantPatternInstance left, final Formula right, final List<UpdateStateVariable> lambdaBound, final UpdateStateVariable state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    String _name = left.getLemmaForImplication(right).getName();
    _builder.append(_name);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = left.replacePatternsForNotIdenticallyTrueImplicationStep(right, lambdaBound, state).generateProofScript(state, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForPastInImplication(final PastRequirementPatternInstance left, final PastRequirementPatternInstance right, final List<UpdateStateVariable> lambdaBound, final UpdateStateVariable state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    String _name = left.getLemmaForImplication(right).getName();
    _builder.append(_name);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("apply simp");
    _builder.newLine();
    _builder.append("  ");
    String _generateProofScript = left.replacePatternsForNotIdenticallyTrueImplicationStep(right, lambdaBound, state).generateProofScript(state, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForNegatedBooleanFormula(final UpdateStateVariable initState, final BooleanPatternFreeFormula formula) {
    String _switchResult = null;
    BooleanOperator _operator = formula.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case CONJUNCTION:
          _switchResult = ProofScriptGenerator.DE_MORGAN_CONJ;
          break;
        case DISJUNCTION:
          _switchResult = ProofScriptGenerator.DE_MORGAN_DISJ;
          break;
        default:
          _switchResult = null;
          break;
      }
    } else {
      _switchResult = null;
    }
    final String deMorgansLow = _switchResult;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(subst (1) ");
    _builder.append(deMorgansLow);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScript = formula.negate().generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateForDoubleNegation(final UpdateStateVariable initState, final PatternFreeInnerFormula formula) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply(rule ");
    _builder.append(ProofScriptGenerator.DOUBLE_NEGATION_RULE);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _generateProofScript = formula.generateProofScript(initState, this);
    _builder.append(_generateProofScript, "  ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateProofByAssumption() {
    return "apply assumption";
  }
}
