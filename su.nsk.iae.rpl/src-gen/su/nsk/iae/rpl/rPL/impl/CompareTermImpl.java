/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.rpl.invpatterngenerator.Term;
import su.nsk.iae.rpl.invpatterngenerator.TermConverter;
import su.nsk.iae.rpl.rPL.CompPredicate;
import su.nsk.iae.rpl.rPL.CompareTerm;
import su.nsk.iae.rpl.rPL.RPLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.CompareTermImpl#getCompPred <em>Comp Pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompareTermImpl extends EqTermImpl implements CompareTerm
{
  /**
   * The default value of the '{@link #getCompPred() <em>Comp Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompPred()
   * @generated
   * @ordered
   */
  protected static final CompPredicate COMP_PRED_EDEFAULT = CompPredicate.LESS;

  /**
   * The cached value of the '{@link #getCompPred() <em>Comp Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompPred()
   * @generated
   * @ordered
   */
  protected CompPredicate compPred = COMP_PRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompareTermImpl()
  {
    super();
  }

  @Override
public Term convert(TermConverter converter) {
	return converter.convertTerm(this);
}

/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RPLPackage.Literals.COMPARE_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompPredicate getCompPred()
  {
    return compPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCompPred(CompPredicate newCompPred)
  {
    CompPredicate oldCompPred = compPred;
    compPred = newCompPred == null ? COMP_PRED_EDEFAULT : newCompPred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.COMPARE_TERM__COMP_PRED, oldCompPred, compPred));
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
      case RPLPackage.COMPARE_TERM__COMP_PRED:
        return getCompPred();
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
      case RPLPackage.COMPARE_TERM__COMP_PRED:
        setCompPred((CompPredicate)newValue);
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
      case RPLPackage.COMPARE_TERM__COMP_PRED:
        setCompPred(COMP_PRED_EDEFAULT);
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
      case RPLPackage.COMPARE_TERM__COMP_PRED:
        return compPred != COMP_PRED_EDEFAULT;
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
    result.append(" (compPred: ");
    result.append(compPred);
    result.append(')');
    return result.toString();
  }

} //CompareTermImpl
