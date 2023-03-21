/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelMonitoringActivity;
import edu.uoc.som.dsl4ai.DeployedAIModel;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Monitoring Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelMonitoringActivityImpl#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelMonitoringActivityImpl extends ActivityImpl implements AIModelMonitoringActivity {
	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedAIModel> monitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelMonitoringActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_MONITORING_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeployedAIModel> getMonitors() {
		if (monitors == null) {
			monitors = new EObjectResolvingEList<DeployedAIModel>(DeployedAIModel.class, this,
					Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY__MONITORS);
		}
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY__MONITORS:
			return getMonitors();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY__MONITORS:
			getMonitors().clear();
			getMonitors().addAll((Collection<? extends DeployedAIModel>) newValue);
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
		case Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY__MONITORS:
			getMonitors().clear();
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
		case Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY__MONITORS:
			return monitors != null && !monitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelMonitoringActivityImpl
