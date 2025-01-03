/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.EqTerm#getEqPred <em>Eq Pred</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.rpl.rPL.RPLPackage#getEqTerm()
 * @model
 * @generated
 */
public interface EqTerm extends NegationTerm
{
  /**
   * Returns the value of the '<em><b>Eq Pred</b></em>' attribute.
   * The literals are from the enumeration {@link su.nsk.iae.rpl.rPL.EqPredicate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eq Pred</em>' attribute.
   * @see su.nsk.iae.rpl.rPL.EqPredicate
   * @see #setEqPred(EqPredicate)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getEqTerm_EqPred()
   * @model
   * @generated
   */
  EqPredicate getEqPred();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.EqTerm#getEqPred <em>Eq Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eq Pred</em>' attribute.
   * @see su.nsk.iae.rpl.rPL.EqPredicate
   * @see #getEqPred()
   * @generated
   */
  void setEqPred(EqPredicate value);

} // EqTerm
