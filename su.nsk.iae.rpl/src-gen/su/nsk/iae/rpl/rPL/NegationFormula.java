/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.NegationFormula#isNeg <em>Neg</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.NegationFormula#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.rpl.rPL.RPLPackage#getNegationFormula()
 * @model
 * @generated
 */
public interface NegationFormula extends EObject
{
  /**
   * Returns the value of the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neg</em>' attribute.
   * @see #setNeg(boolean)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getNegationFormula_Neg()
   * @model
   * @generated
   */
  boolean isNeg();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.NegationFormula#isNeg <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neg</em>' attribute.
   * @see #isNeg()
   * @generated
   */
  void setNeg(boolean value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AtomicFormula)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getNegationFormula_Right()
   * @model containment="true"
   * @generated
   */
  AtomicFormula getRight();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.NegationFormula#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AtomicFormula value);

} // NegationFormula
