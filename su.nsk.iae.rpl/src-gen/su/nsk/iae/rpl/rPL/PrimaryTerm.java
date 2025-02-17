/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getConst <em>Const</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getVariable <em>Variable</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getFunApp <em>Fun App</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getNestedTerm <em>Nested Term</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.rpl.rPL.RPLPackage#getPrimaryTerm()
 * @model
 * @generated
 */
public interface PrimaryTerm extends UnaryTerm
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(Constant)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getPrimaryTerm_Const()
   * @model containment="true"
   * @generated
   */
  Constant getConst();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(Constant value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getPrimaryTerm_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Fun App</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun App</em>' containment reference.
   * @see #setFunApp(FunApplication)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getPrimaryTerm_FunApp()
   * @model containment="true"
   * @generated
   */
  FunApplication getFunApp();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getFunApp <em>Fun App</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun App</em>' containment reference.
   * @see #getFunApp()
   * @generated
   */
  void setFunApp(FunApplication value);

  /**
   * Returns the value of the '<em><b>Nested Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Term</em>' containment reference.
   * @see #setNestedTerm(Term)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getPrimaryTerm_NestedTerm()
   * @model containment="true"
   * @generated
   */
  Term getNestedTerm();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.PrimaryTerm#getNestedTerm <em>Nested Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested Term</em>' containment reference.
   * @see #getNestedTerm()
   * @generated
   */
  void setNestedTerm(Term value);

} // PrimaryTerm
