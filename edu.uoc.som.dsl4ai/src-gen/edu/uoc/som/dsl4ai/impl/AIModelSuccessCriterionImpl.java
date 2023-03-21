/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelSuccessCriterion;
import edu.uoc.som.dsl4ai.BusinessSuccessCriterion;
import edu.uoc.som.dsl4ai.CriterionValue;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Success Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelSuccessCriterionImpl#getAlignedTo <em>Aligned To</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelSuccessCriterionImpl#getCriterionValue <em>Criterion Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelSuccessCriterionImpl extends SuccessCriterionImpl implements AIModelSuccessCriterion {
	/**
	 * The cached value of the '{@link #getAlignedTo() <em>Aligned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignedTo()
	 * @generated
	 * @ordered
	 */
	protected BusinessSuccessCriterion alignedTo;

	/**
	 * The cached value of the '{@link #getCriterionValue() <em>Criterion Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterionValue()
	 * @generated
	 * @ordered
	 */
	protected EList<CriterionValue> criterionValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelSuccessCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_SUCCESS_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessSuccessCriterion getAlignedTo() {
		if (alignedTo != null && alignedTo.eIsProxy()) {
			InternalEObject oldAlignedTo = (InternalEObject) alignedTo;
			alignedTo = (BusinessSuccessCriterion) eResolveProxy(oldAlignedTo);
			if (alignedTo != oldAlignedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO, oldAlignedTo, alignedTo));
			}
		}
		return alignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessSuccessCriterion basicGetAlignedTo() {
		return alignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignedTo(BusinessSuccessCriterion newAlignedTo) {
		BusinessSuccessCriterion oldAlignedTo = alignedTo;
		alignedTo = newAlignedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO,
					oldAlignedTo, alignedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CriterionValue> getCriterionValue() {
		if (criterionValue == null) {
			criterionValue = new EObjectWithInverseResolvingEList<CriterionValue>(CriterionValue.class, this,
					Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE,
					Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION);
		}
		return criterionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCriterionValue()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE:
			return ((InternalEList<?>) getCriterionValue()).basicRemove(otherEnd, msgs);
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
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO:
			if (resolve)
				return getAlignedTo();
			return basicGetAlignedTo();
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE:
			return getCriterionValue();
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
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO:
			setAlignedTo((BusinessSuccessCriterion) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE:
			getCriterionValue().clear();
			getCriterionValue().addAll((Collection<? extends CriterionValue>) newValue);
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
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO:
			setAlignedTo((BusinessSuccessCriterion) null);
			return;
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE:
			getCriterionValue().clear();
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
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO:
			return alignedTo != null;
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE:
			return criterionValue != null && !criterionValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelSuccessCriterionImpl
