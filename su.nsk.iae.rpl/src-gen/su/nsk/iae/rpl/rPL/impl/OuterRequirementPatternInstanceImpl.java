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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import su.nsk.iae.rpl.rPL.FormulaParameterValue;
import su.nsk.iae.rpl.rPL.OuterRequirementPattern;
import su.nsk.iae.rpl.rPL.OuterRequirementPatternInstance;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outer Requirement Pattern Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.OuterRequirementPatternInstanceImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.OuterRequirementPatternInstanceImpl#getCParams <em>CParams</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.OuterRequirementPatternInstanceImpl#getSimpleFmParams <em>Simple Fm Params</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.OuterRequirementPatternInstanceImpl#getFmParams <em>Fm Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OuterRequirementPatternInstanceImpl extends MinimalEObjectImpl.Container implements OuterRequirementPatternInstance
{
  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected OuterRequirementPattern pattern;

  /**
   * The cached value of the '{@link #getCParams() <em>CParams</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCParams()
   * @generated
   * @ordered
   */
  protected EList<Term> cParams;

  /**
   * The cached value of the '{@link #getSimpleFmParams() <em>Simple Fm Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleFmParams()
   * @generated
   * @ordered
   */
  protected EList<PatternFreeFormulaParameterValue> simpleFmParams;

  /**
   * The cached value of the '{@link #getFmParams() <em>Fm Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFmParams()
   * @generated
   * @ordered
   */
  protected EList<FormulaParameterValue> fmParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OuterRequirementPatternInstanceImpl()
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
    return RPLPackage.Literals.OUTER_REQUIREMENT_PATTERN_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OuterRequirementPattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (OuterRequirementPattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OuterRequirementPattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPattern(OuterRequirementPattern newPattern)
  {
    OuterRequirementPattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Term> getCParams()
  {
    if (cParams == null)
    {
      cParams = new EObjectContainmentEList<Term>(Term.class, this, RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__CPARAMS);
    }
    return cParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PatternFreeFormulaParameterValue> getSimpleFmParams()
  {
    if (simpleFmParams == null)
    {
      simpleFmParams = new EObjectContainmentEList<PatternFreeFormulaParameterValue>(PatternFreeFormulaParameterValue.class, this, RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__SIMPLE_FM_PARAMS);
    }
    return simpleFmParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FormulaParameterValue> getFmParams()
  {
    if (fmParams == null)
    {
      fmParams = new EObjectContainmentEList<FormulaParameterValue>(FormulaParameterValue.class, this, RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__FM_PARAMS);
    }
    return fmParams;
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
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__CPARAMS:
        return ((InternalEList<?>)getCParams()).basicRemove(otherEnd, msgs);
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__SIMPLE_FM_PARAMS:
        return ((InternalEList<?>)getSimpleFmParams()).basicRemove(otherEnd, msgs);
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__FM_PARAMS:
        return ((InternalEList<?>)getFmParams()).basicRemove(otherEnd, msgs);
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
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__CPARAMS:
        return getCParams();
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__SIMPLE_FM_PARAMS:
        return getSimpleFmParams();
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__FM_PARAMS:
        return getFmParams();
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
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__PATTERN:
        setPattern((OuterRequirementPattern)newValue);
        return;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__CPARAMS:
        getCParams().clear();
        getCParams().addAll((Collection<? extends Term>)newValue);
        return;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__SIMPLE_FM_PARAMS:
        getSimpleFmParams().clear();
        getSimpleFmParams().addAll((Collection<? extends PatternFreeFormulaParameterValue>)newValue);
        return;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__FM_PARAMS:
        getFmParams().clear();
        getFmParams().addAll((Collection<? extends FormulaParameterValue>)newValue);
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
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__PATTERN:
        setPattern((OuterRequirementPattern)null);
        return;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__CPARAMS:
        getCParams().clear();
        return;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__SIMPLE_FM_PARAMS:
        getSimpleFmParams().clear();
        return;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__FM_PARAMS:
        getFmParams().clear();
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
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__PATTERN:
        return pattern != null;
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__CPARAMS:
        return cParams != null && !cParams.isEmpty();
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__SIMPLE_FM_PARAMS:
        return simpleFmParams != null && !simpleFmParams.isEmpty();
      case RPLPackage.OUTER_REQUIREMENT_PATTERN_INSTANCE__FM_PARAMS:
        return fmParams != null && !fmParams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OuterRequirementPatternInstanceImpl
