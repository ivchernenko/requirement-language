/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.CompareTerm#getCompPred <em>Comp Pred</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.rpl.rPL.RPLPackage#getCompareTerm()
 * @model
 * @generated
 */
public interface CompareTerm extends EqTerm
{
  /**
   * Returns the value of the '<em><b>Comp Pred</b></em>' attribute.
   * The literals are from the enumeration {@link su.nsk.iae.rpl.rPL.CompPredicate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp Pred</em>' attribute.
   * @see su.nsk.iae.rpl.rPL.CompPredicate
   * @see #setCompPred(CompPredicate)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getCompareTerm_CompPred()
   * @model
   * @generated
   */
  CompPredicate getCompPred();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.CompareTerm#getCompPred <em>Comp Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp Pred</em>' attribute.
   * @see su.nsk.iae.rpl.rPL.CompPredicate
   * @see #getCompPred()
   * @generated
   */
  void setCompPred(CompPredicate value);

} // CompareTerm
