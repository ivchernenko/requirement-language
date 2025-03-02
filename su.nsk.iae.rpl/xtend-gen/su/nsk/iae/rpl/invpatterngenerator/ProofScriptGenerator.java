package su.nsk.iae.rpl.invpatterngenerator;

import org.eclipse.xtend2.lib.StringConcatenation;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

@SuppressWarnings("all")
public class ProofScriptGenerator {
  private int premisesNumber;

  private static final String BASE_PREMISES_NAME = "prems";

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
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable");
  }

  public String generateForDerivedRequirementPatternInstance(final ExtendedInvariant extraInvFormula, final DerivedRequirementPatternInstance reqFormula, final UpdateStateVariable state) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable");
  }

  public String generateForLemmaPremiseConjunction(final LemmaPremise left, final LemmaPremise right) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable");
  }

  public String generateForLemmaPremiseDisjunction(final LemmaPremise left, final LemmaPremise right) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable");
  }

  public String generateForFutureExtraInvariantPatternInstance(final FutureExtraInvariantPatternInstance patternInst) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method generateProofScript(UpdateStateVariable, ProofScriptGenerator) is not applicable for the arguments (ProofScriptGenerator)"
      + "\nType mismatch: cannot convert from ProofScriptGenerator to UpdateStateVariable");
  }
}
