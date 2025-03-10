/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import su.nsk.iae.rpl.rPL.AtomicFormula;
import su.nsk.iae.rpl.rPL.FormulaParameter;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.Term;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.AtomicFormulaImpl#getBoolLiteral <em>Bool Literal</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.AtomicFormulaImpl#getBoolTerm <em>Bool Term</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.AtomicFormulaImpl#getFmParam <em>Fm Param</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.AtomicFormulaImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicFormulaImpl extends MinimalEObjectImpl.Container implements AtomicFormula
{
  /**
   * The default value of the '{@link #getBoolLiteral() <em>Bool Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolLiteral()
   * @generated
   * @ordered
   */
  protected static final String BOOL_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolLiteral() <em>Bool Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolLiteral()
   * @generated
   * @ordered
   */
  protected String boolLiteral = BOOL_LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getBoolTerm() <em>Bool Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolTerm()
   * @generated
   * @ordered
   */
  protected Term boolTerm;

  /**
   * The cached value of the '{@link #getFmParam() <em>Fm Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFmParam()
   * @generated
   * @ordered
   */
  protected FormulaParameter fmParam;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<UpdateStateVariable> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicFormulaImpl()
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
    return RPLPackage.Literals.ATOMIC_FORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolLiteral()
  {
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolLiteral(String newBoolLiteral)
  {
    String oldBoolLiteral = boolLiteral;
    boolLiteral = newBoolLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.ATOMIC_FORMULA__BOOL_LITERAL, oldBoolLiteral, boolLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Term getBoolTerm()
  {
    return boolTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoolTerm(Term newBoolTerm, NotificationChain msgs)
  {
    Term oldBoolTerm = boolTerm;
    boolTerm = newBoolTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPLPackage.ATOMIC_FORMULA__BOOL_TERM, oldBoolTerm, newBoolTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolTerm(Term newBoolTerm)
  {
    if (newBoolTerm != boolTerm)
    {
      NotificationChain msgs = null;
      if (boolTerm != null)
        msgs = ((InternalEObject)boolTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPLPackage.ATOMIC_FORMULA__BOOL_TERM, null, msgs);
      if (newBoolTerm != null)
        msgs = ((InternalEObject)newBoolTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPLPackage.ATOMIC_FORMULA__BOOL_TERM, null, msgs);
      msgs = basicSetBoolTerm(newBoolTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.ATOMIC_FORMULA__BOOL_TERM, newBoolTerm, newBoolTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormulaParameter getFmParam()
  {
    if (fmParam != null && fmParam.eIsProxy())
    {
      InternalEObject oldFmParam = (InternalEObject)fmParam;
      fmParam = (FormulaParameter)eResolveProxy(oldFmParam);
      if (fmParam != oldFmParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPLPackage.ATOMIC_FORMULA__FM_PARAM, oldFmParam, fmParam));
      }
    }
    return fmParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaParameter basicGetFmParam()
  {
    return fmParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFmParam(FormulaParameter newFmParam)
  {
    FormulaParameter oldFmParam = fmParam;
    fmParam = newFmParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.ATOMIC_FORMULA__FM_PARAM, oldFmParam, fmParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UpdateStateVariable> getStates()
  {
    if (states == null)
    {
      states = new EObjectResolvingEList<UpdateStateVariable>(UpdateStateVariable.class, this, RPLPackage.ATOMIC_FORMULA__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RPLPackage.ATOMIC_FORMULA__BOOL_TERM:
        return basicSetBoolTerm(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RPLPackage.ATOMIC_FORMULA__BOOL_LITERAL:
        return getBoolLiteral();
      case RPLPackage.ATOMIC_FORMULA__BOOL_TERM:
        return getBoolTerm();
      case RPLPackage.ATOMIC_FORMULA__FM_PARAM:
        if (resolve) return getFmParam();
        return basicGetFmParam();
      case RPLPackage.ATOMIC_FORMULA__STATES:
        return getStates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPLPackage.ATOMIC_FORMULA__BOOL_LITERAL:
        setBoolLiteral((String)newValue);
        return;
      case RPLPackage.ATOMIC_FORMULA__BOOL_TERM:
        setBoolTerm((Term)newValue);
        return;
      case RPLPackage.ATOMIC_FORMULA__FM_PARAM:
        setFmParam((FormulaParameter)newValue);
        return;
      case RPLPackage.ATOMIC_FORMULA__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends UpdateStateVariable>)newValue);
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
      case RPLPackage.ATOMIC_FORMULA__BOOL_LITERAL:
        setBoolLiteral(BOOL_LITERAL_EDEFAULT);
        return;
      case RPLPackage.ATOMIC_FORMULA__BOOL_TERM:
        setBoolTerm((Term)null);
        return;
      case RPLPackage.ATOMIC_FORMULA__FM_PARAM:
        setFmParam((FormulaParameter)null);
        return;
      case RPLPackage.ATOMIC_FORMULA__STATES:
        getStates().clear();
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
      case RPLPackage.ATOMIC_FORMULA__BOOL_LITERAL:
        return BOOL_LITERAL_EDEFAULT == null ? boolLiteral != null : !BOOL_LITERAL_EDEFAULT.equals(boolLiteral);
      case RPLPackage.ATOMIC_FORMULA__BOOL_TERM:
        return boolTerm != null;
      case RPLPackage.ATOMIC_FORMULA__FM_PARAM:
        return fmParam != null;
      case RPLPackage.ATOMIC_FORMULA__STATES:
        return states != null && !states.isEmpty();
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
    result.append(" (boolLiteral: ");
    result.append(boolLiteral);
    result.append(')');
    return result.toString();
  }

} //AtomicFormulaImpl
