/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModel;
import edu.uoc.som.dsl4ai.AIModelGoal;
import edu.uoc.som.dsl4ai.AIModelRequirement;
import edu.uoc.som.dsl4ai.AIModelingTechnique;
import edu.uoc.som.dsl4ai.CriterionValue;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.OptimalValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelImpl#getCriteriaValues <em>Criteria Values</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelImpl#getSatisfiedRequirements <em>Satisfied Requirements</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelImpl#getOptimalValues <em>Optimal Values</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelImpl#getBasedOn <em>Based On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelImpl extends MinimalEObjectImpl.Container implements AIModel {
	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final float RANK_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected float rank = RANK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCriteriaValues() <em>Criteria Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaValues()
	 * @generated
	 * @ordered
	 */
	protected EList<CriterionValue> criteriaValues;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected AIModelGoal goal;

	/**
	 * The cached value of the '{@link #getSatisfiedRequirements() <em>Satisfied Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModelRequirement> satisfiedRequirements;

	/**
	 * The cached value of the '{@link #getOptimalValues() <em>Optimal Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<OptimalValue> optimalValues;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected AIModelingTechnique basedOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRank(float newRank) {
		float oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CriterionValue> getCriteriaValues() {
		if (criteriaValues == null) {
			criteriaValues = new EObjectContainmentEList<CriterionValue>(CriterionValue.class, this,
					Dsl4aiPackage.AI_MODEL__CRITERIA_VALUES);
		}
		return criteriaValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelGoal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject) goal;
			goal = (AIModelGoal) eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.AI_MODEL__GOAL, oldGoal,
							goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelGoal basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoal(AIModelGoal newGoal) {
		AIModelGoal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModelRequirement> getSatisfiedRequirements() {
		if (satisfiedRequirements == null) {
			satisfiedRequirements = new EObjectResolvingEList<AIModelRequirement>(AIModelRequirement.class, this,
					Dsl4aiPackage.AI_MODEL__SATISFIED_REQUIREMENTS);
		}
		return satisfiedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptimalValue> getOptimalValues() {
		if (optimalValues == null) {
			optimalValues = new EObjectContainmentEList<OptimalValue>(OptimalValue.class, this,
					Dsl4aiPackage.AI_MODEL__OPTIMAL_VALUES);
		}
		return optimalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelingTechnique getBasedOn() {
		if (basedOn != null && basedOn.eIsProxy()) {
			InternalEObject oldBasedOn = (InternalEObject) basedOn;
			basedOn = (AIModelingTechnique) eResolveProxy(oldBasedOn);
			if (basedOn != oldBasedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.AI_MODEL__BASED_ON,
							oldBasedOn, basedOn));
			}
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelingTechnique basicGetBasedOn() {
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasedOn(AIModelingTechnique newBasedOn) {
		AIModelingTechnique oldBasedOn = basedOn;
		basedOn = newBasedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL__BASED_ON, oldBasedOn,
					basedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.AI_MODEL__CRITERIA_VALUES:
			return ((InternalEList<?>) getCriteriaValues()).basicRemove(otherEnd, msgs);
		case Dsl4aiPackage.AI_MODEL__OPTIMAL_VALUES:
			return ((InternalEList<?>) getOptimalValues()).basicRemove(otherEnd, msgs);
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
		case Dsl4aiPackage.AI_MODEL__RANK:
			return getRank();
		case Dsl4aiPackage.AI_MODEL__CRITERIA_VALUES:
			return getCriteriaValues();
		case Dsl4aiPackage.AI_MODEL__GOAL:
			if (resolve)
				return getGoal();
			return basicGetGoal();
		case Dsl4aiPackage.AI_MODEL__SATISFIED_REQUIREMENTS:
			return getSatisfiedRequirements();
		case Dsl4aiPackage.AI_MODEL__OPTIMAL_VALUES:
			return getOptimalValues();
		case Dsl4aiPackage.AI_MODEL__BASED_ON:
			if (resolve)
				return getBasedOn();
			return basicGetBasedOn();
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
		case Dsl4aiPackage.AI_MODEL__RANK:
			setRank((Float) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL__CRITERIA_VALUES:
			getCriteriaValues().clear();
			getCriteriaValues().addAll((Collection<? extends CriterionValue>) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL__GOAL:
			setGoal((AIModelGoal) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL__SATISFIED_REQUIREMENTS:
			getSatisfiedRequirements().clear();
			getSatisfiedRequirements().addAll((Collection<? extends AIModelRequirement>) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL__OPTIMAL_VALUES:
			getOptimalValues().clear();
			getOptimalValues().addAll((Collection<? extends OptimalValue>) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL__BASED_ON:
			setBasedOn((AIModelingTechnique) newValue);
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
		case Dsl4aiPackage.AI_MODEL__RANK:
			setRank(RANK_EDEFAULT);
			return;
		case Dsl4aiPackage.AI_MODEL__CRITERIA_VALUES:
			getCriteriaValues().clear();
			return;
		case Dsl4aiPackage.AI_MODEL__GOAL:
			setGoal((AIModelGoal) null);
			return;
		case Dsl4aiPackage.AI_MODEL__SATISFIED_REQUIREMENTS:
			getSatisfiedRequirements().clear();
			return;
		case Dsl4aiPackage.AI_MODEL__OPTIMAL_VALUES:
			getOptimalValues().clear();
			return;
		case Dsl4aiPackage.AI_MODEL__BASED_ON:
			setBasedOn((AIModelingTechnique) null);
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
		case Dsl4aiPackage.AI_MODEL__RANK:
			return rank != RANK_EDEFAULT;
		case Dsl4aiPackage.AI_MODEL__CRITERIA_VALUES:
			return criteriaValues != null && !criteriaValues.isEmpty();
		case Dsl4aiPackage.AI_MODEL__GOAL:
			return goal != null;
		case Dsl4aiPackage.AI_MODEL__SATISFIED_REQUIREMENTS:
			return satisfiedRequirements != null && !satisfiedRequirements.isEmpty();
		case Dsl4aiPackage.AI_MODEL__OPTIMAL_VALUES:
			return optimalValues != null && !optimalValues.isEmpty();
		case Dsl4aiPackage.AI_MODEL__BASED_ON:
			return basedOn != null;
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
		result.append(" (rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //AIModelImpl
