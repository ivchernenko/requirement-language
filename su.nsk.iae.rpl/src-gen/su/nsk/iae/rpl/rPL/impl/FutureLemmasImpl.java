/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import su.nsk.iae.rpl.rPL.FutureLemmas;
import su.nsk.iae.rpl.rPL.Lemma;
import su.nsk.iae.rpl.rPL.RPLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Future Lemmas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.FutureLemmasImpl#getL1 <em>L1</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.FutureLemmasImpl#getL2 <em>L2</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.FutureLemmasImpl#getL3 <em>L3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FutureLemmasImpl extends MinimalEObjectImpl.Container implements FutureLemmas
{
  /**
   * The cached value of the '{@link #getL1() <em>L1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL1()
   * @generated
   * @ordered
   */
  protected Lemma l1;

  /**
   * The cached value of the '{@link #getL2() <em>L2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL2()
   * @generated
   * @ordered
   */
  protected Lemma l2;

  /**
   * The cached value of the '{@link #getL3() <em>L3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL3()
   * @generated
   * @ordered
   */
  protected Lemma l3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FutureLemmasImpl()
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
    return RPLPackage.Literals.FUTURE_LEMMAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lemma getL1()
  {
    return l1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL1(Lemma newL1, NotificationChain msgs)
  {
    Lemma oldL1 = l1;
    l1 = newL1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPLPackage.FUTURE_LEMMAS__L1, oldL1, newL1);
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
  public void setL1(Lemma newL1)
  {
    if (newL1 != l1)
    {
      NotificationChain msgs = null;
      if (l1 != null)
        msgs = ((InternalEObject)l1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPLPackage.FUTURE_LEMMAS__L1, null, msgs);
      if (newL1 != null)
        msgs = ((InternalEObject)newL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPLPackage.FUTURE_LEMMAS__L1, null, msgs);
      msgs = basicSetL1(newL1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.FUTURE_LEMMAS__L1, newL1, newL1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lemma getL2()
  {
    return l2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL2(Lemma newL2, NotificationChain msgs)
  {
    Lemma oldL2 = l2;
    l2 = newL2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPLPackage.FUTURE_LEMMAS__L2, oldL2, newL2);
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
  public void setL2(Lemma newL2)
  {
    if (newL2 != l2)
    {
      NotificationChain msgs = null;
      if (l2 != null)
        msgs = ((InternalEObject)l2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPLPackage.FUTURE_LEMMAS__L2, null, msgs);
      if (newL2 != null)
        msgs = ((InternalEObject)newL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPLPackage.FUTURE_LEMMAS__L2, null, msgs);
      msgs = basicSetL2(newL2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.FUTURE_LEMMAS__L2, newL2, newL2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lemma getL3()
  {
    return l3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL3(Lemma newL3, NotificationChain msgs)
  {
    Lemma oldL3 = l3;
    l3 = newL3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPLPackage.FUTURE_LEMMAS__L3, oldL3, newL3);
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
  public void setL3(Lemma newL3)
  {
    if (newL3 != l3)
    {
      NotificationChain msgs = null;
      if (l3 != null)
        msgs = ((InternalEObject)l3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPLPackage.FUTURE_LEMMAS__L3, null, msgs);
      if (newL3 != null)
        msgs = ((InternalEObject)newL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPLPackage.FUTURE_LEMMAS__L3, null, msgs);
      msgs = basicSetL3(newL3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.FUTURE_LEMMAS__L3, newL3, newL3));
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
      case RPLPackage.FUTURE_LEMMAS__L1:
        return basicSetL1(null, msgs);
      case RPLPackage.FUTURE_LEMMAS__L2:
        return basicSetL2(null, msgs);
      case RPLPackage.FUTURE_LEMMAS__L3:
        return basicSetL3(null, msgs);
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
      case RPLPackage.FUTURE_LEMMAS__L1:
        return getL1();
      case RPLPackage.FUTURE_LEMMAS__L2:
        return getL2();
      case RPLPackage.FUTURE_LEMMAS__L3:
        return getL3();
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
      case RPLPackage.FUTURE_LEMMAS__L1:
        setL1((Lemma)newValue);
        return;
      case RPLPackage.FUTURE_LEMMAS__L2:
        setL2((Lemma)newValue);
        return;
      case RPLPackage.FUTURE_LEMMAS__L3:
        setL3((Lemma)newValue);
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
      case RPLPackage.FUTURE_LEMMAS__L1:
        setL1((Lemma)null);
        return;
      case RPLPackage.FUTURE_LEMMAS__L2:
        setL2((Lemma)null);
        return;
      case RPLPackage.FUTURE_LEMMAS__L3:
        setL3((Lemma)null);
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
      case RPLPackage.FUTURE_LEMMAS__L1:
        return l1 != null;
      case RPLPackage.FUTURE_LEMMAS__L2:
        return l2 != null;
      case RPLPackage.FUTURE_LEMMAS__L3:
        return l3 != null;
    }
    return super.eIsSet(featureID);
  }

} //FutureLemmasImpl