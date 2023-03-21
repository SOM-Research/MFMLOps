/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelFlaw;
import edu.uoc.som.dsl4ai.AIModelRequirement;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Flaw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelFlawImpl#getDegrades <em>Degrades</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelFlawImpl extends AIModelObservationImpl implements AIModelFlaw {
	/**
	 * The cached value of the '{@link #getDegrades() <em>Degrades</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrades()
	 * @generated
	 * @ordered
	 */
	protected AIModelRequirement degrades;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelFlawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_FLAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelRequirement getDegrades() {
		if (degrades != null && degrades.eIsProxy()) {
			InternalEObject oldDegrades = (InternalEObject) degrades;
			degrades = (AIModelRequirement) eResolveProxy(oldDegrades);
			if (degrades != oldDegrades) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.AI_MODEL_FLAW__DEGRADES,
							oldDegrades, degrades));
			}
		}
		return degrades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelRequirement basicGetDegrades() {
		return degrades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegrades(AIModelRequirement newDegrades) {
		AIModelRequirement oldDegrades = degrades;
		degrades = newDegrades;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL_FLAW__DEGRADES, oldDegrades,
					degrades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_FLAW__DEGRADES:
			if (resolve)
				return getDegrades();
			return basicGetDegrades();
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
		case Dsl4aiPackage.AI_MODEL_FLAW__DEGRADES:
			setDegrades((AIModelRequirement) newValue);
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
		case Dsl4aiPackage.AI_MODEL_FLAW__DEGRADES:
			setDegrades((AIModelRequirement) null);
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
		case Dsl4aiPackage.AI_MODEL_FLAW__DEGRADES:
			return degrades != null;
		}
		return super.eIsSet(featureID);
	}

} //AIModelFlawImpl
