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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import su.nsk.iae.rpl.rPL.DerivedRequirementPattern;
import su.nsk.iae.rpl.rPL.PatternFreeFormulaParameterValue;
import su.nsk.iae.rpl.rPL.RPLPackage;
import su.nsk.iae.rpl.rPL.Requirement;
import su.nsk.iae.rpl.rPL.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.RequirementImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.RequirementImpl#getCParams <em>CParams</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.RequirementImpl#getFmParams <em>Fm Params</em>}</li>
 *   <li>{@link su.nsk.iae.rpl.rPL.impl.RequirementImpl#getExtraIn <em>Extra In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends ElementImpl implements Requirement
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
  protected DerivedRequirementPattern pattern;

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
   * The cached value of the '{@link #getFmParams() <em>Fm Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFmParams()
   * @generated
   * @ordered
   */
  protected EList<PatternFreeFormulaParameterValue> fmParams;

  /**
   * The default value of the '{@link #getExtraIn() <em>Extra In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraIn()
   * @generated
   * @ordered
   */
  protected static final String EXTRA_IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtraIn() <em>Extra In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraIn()
   * @generated
   * @ordered
   */
  protected String extraIn = EXTRA_IN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementImpl()
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
    return RPLPackage.Literals.REQUIREMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.REQUIREMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DerivedRequirementPattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (DerivedRequirementPattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPLPackage.REQUIREMENT__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedRequirementPattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPattern(DerivedRequirementPattern newPattern)
  {
    DerivedRequirementPattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.REQUIREMENT__PATTERN, oldPattern, pattern));
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
      cParams = new EObjectContainmentEList<Term>(Term.class, this, RPLPackage.REQUIREMENT__CPARAMS);
    }
    return cParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PatternFreeFormulaParameterValue> getFmParams()
  {
    if (fmParams == null)
    {
      fmParams = new EObjectContainmentEList<PatternFreeFormulaParameterValue>(PatternFreeFormulaParameterValue.class, this, RPLPackage.REQUIREMENT__FM_PARAMS);
    }
    return fmParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExtraIn()
  {
    return extraIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtraIn(String newExtraIn)
  {
    String oldExtraIn = extraIn;
    extraIn = newExtraIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPLPackage.REQUIREMENT__EXTRA_IN, oldExtraIn, extraIn));
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
      case RPLPackage.REQUIREMENT__CPARAMS:
        return ((InternalEList<?>)getCParams()).basicRemove(otherEnd, msgs);
      case RPLPackage.REQUIREMENT__FM_PARAMS:
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
      case RPLPackage.REQUIREMENT__NAME:
        return getName();
      case RPLPackage.REQUIREMENT__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case RPLPackage.REQUIREMENT__CPARAMS:
        return getCParams();
      case RPLPackage.REQUIREMENT__FM_PARAMS:
        return getFmParams();
      case RPLPackage.REQUIREMENT__EXTRA_IN:
        return getExtraIn();
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
      case RPLPackage.REQUIREMENT__NAME:
        setName((String)newValue);
        return;
      case RPLPackage.REQUIREMENT__PATTERN:
        setPattern((DerivedRequirementPattern)newValue);
        return;
      case RPLPackage.REQUIREMENT__CPARAMS:
        getCParams().clear();
        getCParams().addAll((Collection<? extends Term>)newValue);
        return;
      case RPLPackage.REQUIREMENT__FM_PARAMS:
        getFmParams().clear();
        getFmParams().addAll((Collection<? extends PatternFreeFormulaParameterValue>)newValue);
        return;
      case RPLPackage.REQUIREMENT__EXTRA_IN:
        setExtraIn((String)newValue);
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
      case RPLPackage.REQUIREMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RPLPackage.REQUIREMENT__PATTERN:
        setPattern((DerivedRequirementPattern)null);
        return;
      case RPLPackage.REQUIREMENT__CPARAMS:
        getCParams().clear();
        return;
      case RPLPackage.REQUIREMENT__FM_PARAMS:
        getFmParams().clear();
        return;
      case RPLPackage.REQUIREMENT__EXTRA_IN:
        setExtraIn(EXTRA_IN_EDEFAULT);
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
      case RPLPackage.REQUIREMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RPLPackage.REQUIREMENT__PATTERN:
        return pattern != null;
      case RPLPackage.REQUIREMENT__CPARAMS:
        return cParams != null && !cParams.isEmpty();
      case RPLPackage.REQUIREMENT__FM_PARAMS:
        return fmParams != null && !fmParams.isEmpty();
      case RPLPackage.REQUIREMENT__EXTRA_IN:
        return EXTRA_IN_EDEFAULT == null ? extraIn != null : !EXTRA_IN_EDEFAULT.equals(extraIn);
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
    result.append(", extraIn: ");
    result.append(extraIn);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl