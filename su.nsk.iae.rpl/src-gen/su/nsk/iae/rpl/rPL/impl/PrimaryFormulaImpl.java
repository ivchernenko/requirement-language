/**
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.rPL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.rpl.rPL.Formula;
import su.nsk.iae.rpl.rPL.PrimaryFormula;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.RequirementPatternInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.PrimaryFormulaImpl#getPatternInst <em>Pattern Inst</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.PrimaryFormulaImpl#getNestedFormula <em>Nested Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryFormulaImpl extends ConjunctionFormulaImpl implements PrimaryFormula
{
  /**
   * The cached value of the '{@link #getPatternInst() <em>Pattern Inst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternInst()
   * @generated
   * @ordered
   */
  protected RequirementPatternInstance patternInst;

  /**
   * The cached value of the '{@link #getNestedFormula() <em>Nested Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedFormula()
   * @generated
   * @ordered
   */
  protected Formula nestedFormula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryFormulaImpl()
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
    return RPLPackage.Literals.PRIMARY_FORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RequirementPatternInstance getPatternInst()
  {
    return patternInst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternInst(RequirementPatternInstance newPatternInst, NotificationChain msgs)
  {
    RequirementPatternInstance oldPatternInst = patternInst;
    patternInst = newPatternInst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPLPackage.PRIMARY_FORMULA__PATTERN_INST, oldPatternInst, newPatternInst);
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
  public void setPatternInst(RequirementPatternInstance newPatternInst)
  {
    if (newPatternInst != patternInst)
    {
      NotificationChain msgs = null;
      if (patternInst != null)
        msgs = ((InternalEObject)patternInst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPLPackage.PRIMARY_FORMULA__PATTERN_INST, null, msgs);
      if (newPatternInst != null)
        msgs = ((InternalEObject)newPatternInst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPLPackage.PRIMARY_FORMULA__PATTERN_INST, null, msgs);
      msgs = basicSetPatternInst(newPatternInst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.PRIMARY_FORMULA__PATTERN_INST, newPatternInst, newPatternInst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Formula getNestedFormula()
  {
    return nestedFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestedFormula(Formula newNestedFormula, NotificationChain msgs)
  {
    Formula oldNestedFormula = nestedFormula;
    nestedFormula = newNestedFormula;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA, oldNestedFormula, newNestedFormula);
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
  public void setNestedFormula(Formula newNestedFormula)
  {
    if (newNestedFormula != nestedFormula)
    {
      NotificationChain msgs = null;
      if (nestedFormula != null)
        msgs = ((InternalEObject)nestedFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA, null, msgs);
      if (newNestedFormula != null)
        msgs = ((InternalEObject)newNestedFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA, null, msgs);
      msgs = basicSetNestedFormula(newNestedFormula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA, newNestedFormula, newNestedFormula));
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
      case RPLPackage.PRIMARY_FORMULA__PATTERN_INST:
        return basicSetPatternInst(null, msgs);
      case RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA:
        return basicSetNestedFormula(null, msgs);
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
      case RPLPackage.PRIMARY_FORMULA__PATTERN_INST:
        return getPatternInst();
      case RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA:
        return getNestedFormula();
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
      case RPLPackage.PRIMARY_FORMULA__PATTERN_INST:
        setPatternInst((RequirementPatternInstance)newValue);
        return;
      case RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA:
        setNestedFormula((Formula)newValue);
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
      case RPLPackage.PRIMARY_FORMULA__PATTERN_INST:
        setPatternInst((RequirementPatternInstance)null);
        return;
      case RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA:
        setNestedFormula((Formula)null);
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
      case RPLPackage.PRIMARY_FORMULA__PATTERN_INST:
        return patternInst != null;
      case RPLPackage.PRIMARY_FORMULA__NESTED_FORMULA:
        return nestedFormula != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryFormulaImpl