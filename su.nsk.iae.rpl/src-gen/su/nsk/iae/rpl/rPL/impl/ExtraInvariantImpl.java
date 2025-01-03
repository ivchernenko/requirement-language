/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.rpl.rPL.DerivedExtraInvariantPattern;
import su.nsk.iae.rpl.rPL.ExtraInvariant;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.ExtraInvariantImpl#getName <em>Name</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.ExtraInvariantImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.ExtraInvariantImpl#getReqName <em>Req Name</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.ExtraInvariantImpl#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtraInvariantImpl extends ElementImpl implements ExtraInvariant
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected DerivedExtraInvariantPattern pattern;

  /**
   * The default value of the '{@link #getReqName() <em>Req Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqName()
   * @generated
   * @ordered
   */
  protected static final String REQ_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReqName() <em>Req Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqName()
   * @generated
   * @ordered
   */
  protected String reqName = REQ_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getReq() <em>Req</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq()
   * @generated
   * @ordered
   */
  protected Requirement req;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtraInvariantImpl()
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
    return RPLPackage.Literals.EXTRA_INVARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.EXTRA_INVARIANT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DerivedExtraInvariantPattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (DerivedExtraInvariantPattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPLPackage.EXTRA_INVARIANT__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedExtraInvariantPattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPattern(DerivedExtraInvariantPattern newPattern)
  {
    DerivedExtraInvariantPattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.EXTRA_INVARIANT__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReqName()
  {
    return reqName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReqName(String newReqName)
  {
    String oldReqName = reqName;
    reqName = newReqName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.EXTRA_INVARIANT__REQ_NAME, oldReqName, reqName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement getReq()
  {
    if (req != null && req.eIsProxy())
    {
      InternalEObject oldReq = (InternalEObject)req;
      req = (Requirement)eResolveProxy(oldReq);
      if (req != oldReq)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPLPackage.EXTRA_INVARIANT__REQ, oldReq, req));
      }
    }
    return req;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement basicGetReq()
  {
    return req;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReq(Requirement newReq)
  {
    Requirement oldReq = req;
    req = newReq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.EXTRA_INVARIANT__REQ, oldReq, req));
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
      case RPLPackage.EXTRA_INVARIANT__NAME:
        return getName();
      case RPLPackage.EXTRA_INVARIANT__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case RPLPackage.EXTRA_INVARIANT__REQ_NAME:
        return getReqName();
      case RPLPackage.EXTRA_INVARIANT__REQ:
        if (resolve) return getReq();
        return basicGetReq();
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
      case RPLPackage.EXTRA_INVARIANT__NAME:
        setName((String)newValue);
        return;
      case RPLPackage.EXTRA_INVARIANT__PATTERN:
        setPattern((DerivedExtraInvariantPattern)newValue);
        return;
      case RPLPackage.EXTRA_INVARIANT__REQ_NAME:
        setReqName((String)newValue);
        return;
      case RPLPackage.EXTRA_INVARIANT__REQ:
        setReq((Requirement)newValue);
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
      case RPLPackage.EXTRA_INVARIANT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RPLPackage.EXTRA_INVARIANT__PATTERN:
        setPattern((DerivedExtraInvariantPattern)null);
        return;
      case RPLPackage.EXTRA_INVARIANT__REQ_NAME:
        setReqName(REQ_NAME_EDEFAULT);
        return;
      case RPLPackage.EXTRA_INVARIANT__REQ:
        setReq((Requirement)null);
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
      case RPLPackage.EXTRA_INVARIANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RPLPackage.EXTRA_INVARIANT__PATTERN:
        return pattern != null;
      case RPLPackage.EXTRA_INVARIANT__REQ_NAME:
        return REQ_NAME_EDEFAULT == null ? reqName != null : !REQ_NAME_EDEFAULT.equals(reqName);
      case RPLPackage.EXTRA_INVARIANT__REQ:
        return req != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", reqName: ");
    result.append(reqName);
    result.append(')');
    return result.toString();
  }

} //ExtraInvariantImpl
