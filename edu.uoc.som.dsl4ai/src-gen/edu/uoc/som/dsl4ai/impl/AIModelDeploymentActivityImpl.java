/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModel;
import edu.uoc.som.dsl4ai.AIModelDeploymentActivity;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Deployment Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelDeploymentActivityImpl#getDeploys <em>Deploys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelDeploymentActivityImpl extends ActivityImpl implements AIModelDeploymentActivity {
	/**
	 * The cached value of the '{@link #getDeploys() <em>Deploys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploys()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModel> deploys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelDeploymentActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_DEPLOYMENT_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModel> getDeploys() {
		if (deploys == null) {
			deploys = new EObjectResolvingEList<AIModel>(AIModel.class, this,
					Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS);
		}
		return deploys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS:
			return getDeploys();
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
		case Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS:
			getDeploys().clear();
			getDeploys().addAll((Collection<? extends AIModel>) newValue);
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
		case Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS:
			getDeploys().clear();
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
		case Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS:
			return deploys != null && !deploys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelDeploymentActivityImpl
