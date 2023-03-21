/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelSuccessCriterion;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.PerformanceMetric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl#getMinThreshold <em>Min Threshold</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl#getMaxThreshold <em>Max Threshold</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl#getEnsures <em>Ensures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceMetricImpl extends AIModelObservationImpl implements PerformanceMetric {
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
	 * The default value of the '{@link #getMinThreshold() <em>Min Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_THRESHOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinThreshold() <em>Min Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinThreshold()
	 * @generated
	 * @ordered
	 */
	protected float minThreshold = MIN_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxThreshold() <em>Max Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_THRESHOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxThreshold() <em>Max Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreshold()
	 * @generated
	 * @ordered
	 */
	protected float maxThreshold = MAX_THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnsures() <em>Ensures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsures()
	 * @generated
	 * @ordered
	 */
	protected AIModelSuccessCriterion ensures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.PERFORMANCE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.PERFORMANCE_METRIC__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinThreshold() {
		return minThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinThreshold(float newMinThreshold) {
		float oldMinThreshold = minThreshold;
		minThreshold = newMinThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.PERFORMANCE_METRIC__MIN_THRESHOLD,
					oldMinThreshold, minThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxThreshold() {
		return maxThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxThreshold(float newMaxThreshold) {
		float oldMaxThreshold = maxThreshold;
		maxThreshold = newMaxThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.PERFORMANCE_METRIC__MAX_THRESHOLD,
					oldMaxThreshold, maxThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelSuccessCriterion getEnsures() {
		if (ensures != null && ensures.eIsProxy()) {
			InternalEObject oldEnsures = (InternalEObject) ensures;
			ensures = (AIModelSuccessCriterion) eResolveProxy(oldEnsures);
			if (ensures != oldEnsures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.PERFORMANCE_METRIC__ENSURES,
							oldEnsures, ensures));
			}
		}
		return ensures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelSuccessCriterion basicGetEnsures() {
		return ensures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnsures(AIModelSuccessCriterion newEnsures) {
		AIModelSuccessCriterion oldEnsures = ensures;
		ensures = newEnsures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.PERFORMANCE_METRIC__ENSURES, oldEnsures,
					ensures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.PERFORMANCE_METRIC__NAME:
			return getName();
		case Dsl4aiPackage.PERFORMANCE_METRIC__MIN_THRESHOLD:
			return getMinThreshold();
		case Dsl4aiPackage.PERFORMANCE_METRIC__MAX_THRESHOLD:
			return getMaxThreshold();
		case Dsl4aiPackage.PERFORMANCE_METRIC__ENSURES:
			if (resolve)
				return getEnsures();
			return basicGetEnsures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Dsl4aiPackage.PERFORMANCE_METRIC__NAME:
			setName((String) newValue);
			return;
		case Dsl4aiPackage.PERFORMANCE_METRIC__MIN_THRESHOLD:
			setMinThreshold((Float) newValue);
			return;
		case Dsl4aiPackage.PERFORMANCE_METRIC__MAX_THRESHOLD:
			setMaxThreshold((Float) newValue);
			return;
		case Dsl4aiPackage.PERFORMANCE_METRIC__ENSURES:
			setEnsures((AIModelSuccessCriterion) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case Dsl4aiPackage.PERFORMANCE_METRIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Dsl4aiPackage.PERFORMANCE_METRIC__MIN_THRESHOLD:
			setMinThreshold(MIN_THRESHOLD_EDEFAULT);
			return;
		case Dsl4aiPackage.PERFORMANCE_METRIC__MAX_THRESHOLD:
			setMaxThreshold(MAX_THRESHOLD_EDEFAULT);
			return;
		case Dsl4aiPackage.PERFORMANCE_METRIC__ENSURES:
			setEnsures((AIModelSuccessCriterion) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Dsl4aiPackage.PERFORMANCE_METRIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Dsl4aiPackage.PERFORMANCE_METRIC__MIN_THRESHOLD:
			return minThreshold != MIN_THRESHOLD_EDEFAULT;
		case Dsl4aiPackage.PERFORMANCE_METRIC__MAX_THRESHOLD:
			return maxThreshold != MAX_THRESHOLD_EDEFAULT;
		case Dsl4aiPackage.PERFORMANCE_METRIC__ENSURES:
			return ensures != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", minThreshold: ");
		result.append(minThreshold);
		result.append(", maxThreshold: ");
		result.append(maxThreshold);
		result.append(')');
		return result.toString();
	}

} //PerformanceMetricImpl
