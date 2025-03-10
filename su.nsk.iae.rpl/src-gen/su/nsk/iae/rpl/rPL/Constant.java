/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.Constant#getNum <em>Num</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.Constant#getBool <em>Bool</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.rpl.rPL.RPLPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends EObject
{
  /**
   * Returns the value of the '<em><b>Num</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' containment reference.
   * @see #setNum(NumericLiteral)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getConstant_Num()
   * @model containment="true"
   * @generated
   */
  NumericLiteral getNum();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.Constant#getNum <em>Num</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' containment reference.
   * @see #getNum()
   * @generated
   */
  void setNum(NumericLiteral value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #setBool(String)
   * @see su.nsk.iae.rpl.rPL.RPLPackage#getConstant_Bool()
   * @model
   * @generated
   */
  String getBool();

  /**
   * Sets the value of the '{@link su.nsk.iae.rpl.rPL.Constant#getBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #getBool()
   * @generated
   */
  void setBool(String value);

} // Constant
