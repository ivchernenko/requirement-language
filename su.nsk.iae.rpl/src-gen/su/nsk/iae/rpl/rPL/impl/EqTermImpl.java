/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.rpl.rPL.EqPredicate;
import su.nsk.iae.rpl.rPL.EqTerm;
import su.nsk.iae.rpl.rPL.RPLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.EqTermImpl#getEqPred <em>Eq Pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqTermImpl extends NegationTermImpl implements EqTerm
{
  /**
   * The default value of the '{@link #getEqPred() <em>Eq Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqPred()
   * @generated
   * @ordered
   */
  protected static final EqPredicate EQ_PRED_EDEFAULT = EqPredicate.EQ;

  /**
   * The cached value of the '{@link #getEqPred() <em>Eq Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqPred()
   * @generated
   * @ordered
   */
  protected EqPredicate eqPred = EQ_PRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EqTermImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RPLPackage.Literals.EQ_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqPredicate getEqPred()
  {
    return eqPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEqPred(EqPredicate newEqPred)
  {
    EqPredicate oldEqPred = eqPred;
    eqPred = newEqPred == null ? EQ_PRED_EDEFAULT : newEqPred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.EQ_TERM__EQ_PRED, oldEqPred, eqPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RPLPackage.EQ_TERM__EQ_PRED:
        return getEqPred();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPLPackage.EQ_TERM__EQ_PRED:
        setEqPred((EqPredicate)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RPLPackage.EQ_TERM__EQ_PRED:
        setEqPred(EQ_PRED_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RPLPackage.EQ_TERM__EQ_PRED:
        return eqPred != EQ_PRED_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (eqPred: ");
    result.append(eqPred);
    result.append(')');
    return result.toString();
  }

} //EqTermImpl