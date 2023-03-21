/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelGoal;
import edu.uoc.som.dsl4ai.AIModelSuccessCriterion;
import edu.uoc.som.dsl4ai.BusinessGoal;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelGoalImpl#getAlignedTo <em>Aligned To</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelGoalImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelGoalImpl extends GoalImpl implements AIModelGoal {
	/**
	 * The cached value of the '{@link #getAlignedTo() <em>Aligned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignedTo()
	 * @generated
	 * @ordered
	 */
	protected BusinessGoal alignedTo;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModelSuccessCriterion> criteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessGoal getAlignedTo() {
		if (alignedTo != null && alignedTo.eIsProxy()) {
			InternalEObject oldAlignedTo = (InternalEObject) alignedTo;
			alignedTo = (BusinessGoal) eResolveProxy(oldAlignedTo);
			if (alignedTo != oldAlignedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.AI_MODEL_GOAL__ALIGNED_TO,
							oldAlignedTo, alignedTo));
			}
		}
		return alignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessGoal basicGetAlignedTo() {
		return alignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignedTo(BusinessGoal newAlignedTo) {
		BusinessGoal oldAlignedTo = alignedTo;
		alignedTo = newAlignedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL_GOAL__ALIGNED_TO, oldAlignedTo,
					alignedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModelSuccessCriterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentEList<AIModelSuccessCriterion>(AIModelSuccessCriterion.class, this,
					Dsl4aiPackage.AI_MODEL_GOAL__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL_GOAL__CRITERIA:
			return ((InternalEList<?>) getCriteria()).basicRemove(otherEnd, msgs);
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
		case Dsl4aiPackage.AI_MODEL_GOAL__ALIGNED_TO:
			if (resolve)
				return getAlignedTo();
			return basicGetAlignedTo();
		case Dsl4aiPackage.AI_MODEL_GOAL__CRITERIA:
			return getCriteria();
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
		case Dsl4aiPackage.AI_MODEL_GOAL__ALIGNED_TO:
			setAlignedTo((BusinessGoal) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_GOAL__CRITERIA:
			getCriteria().clear();
			getCriteria().addAll((Collection<? extends AIModelSuccessCriterion>) newValue);
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
		case Dsl4aiPackage.AI_MODEL_GOAL__ALIGNED_TO:
			setAlignedTo((BusinessGoal) null);
			return;
		case Dsl4aiPackage.AI_MODEL_GOAL__CRITERIA:
			getCriteria().clear();
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
		case Dsl4aiPackage.AI_MODEL_GOAL__ALIGNED_TO:
			return alignedTo != null;
		case Dsl4aiPackage.AI_MODEL_GOAL__CRITERIA:
			return criteria != null && !criteria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelGoalImpl
