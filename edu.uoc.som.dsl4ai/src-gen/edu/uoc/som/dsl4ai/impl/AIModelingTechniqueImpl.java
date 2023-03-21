/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelingTechnique;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.HyperParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Modeling Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelingTechniqueImpl#getHyperparameters <em>Hyperparameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AIModelingTechniqueImpl extends TechniqueImpl implements AIModelingTechnique {
	/**
	 * The cached value of the '{@link #getHyperparameters() <em>Hyperparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<HyperParameter> hyperparameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelingTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODELING_TECHNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HyperParameter> getHyperparameters() {
		if (hyperparameters == null) {
			hyperparameters = new EObjectContainmentEList<HyperParameter>(HyperParameter.class, this,
					Dsl4aiPackage.AI_MODELING_TECHNIQUE__HYPERPARAMETERS);
		}
		return hyperparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODELING_TECHNIQUE__HYPERPARAMETERS:
			return ((InternalEList<?>) getHyperparameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODELING_TECHNIQUE__HYPERPARAMETERS:
			return getHyperparameters();
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
		case Dsl4aiPackage.AI_MODELING_TECHNIQUE__HYPERPARAMETERS:
			getHyperparameters().clear();
			getHyperparameters().addAll((Collection<? extends HyperParameter>) newValue);
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
		case Dsl4aiPackage.AI_MODELING_TECHNIQUE__HYPERPARAMETERS:
			getHyperparameters().clear();
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
		case Dsl4aiPackage.AI_MODELING_TECHNIQUE__HYPERPARAMETERS:
			return hyperparameters != null && !hyperparameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelingTechniqueImpl
