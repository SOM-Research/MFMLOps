/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModel;
import edu.uoc.som.dsl4ai.AIModelEvaluationActivity;
import edu.uoc.som.dsl4ai.CriterionValue;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.TestDataset;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Evaluation Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl#getEvaluatesWith <em>Evaluates With</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl#getEvaluates <em>Evaluates</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl#getCriteriaValues <em>Criteria Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelEvaluationActivityImpl extends ActivityImpl implements AIModelEvaluationActivity {
	/**
	 * The cached value of the '{@link #getEvaluatesWith() <em>Evaluates With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatesWith()
	 * @generated
	 * @ordered
	 */
	protected TestDataset evaluatesWith;

	/**
	 * The cached value of the '{@link #getEvaluates() <em>Evaluates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluates()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModel> evaluates;

	/**
	 * The cached value of the '{@link #getCriteriaValues() <em>Criteria Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaValues()
	 * @generated
	 * @ordered
	 */
	protected EList<CriterionValue> criteriaValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelEvaluationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_EVALUATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestDataset getEvaluatesWith() {
		if (evaluatesWith != null && evaluatesWith.eIsProxy()) {
			InternalEObject oldEvaluatesWith = (InternalEObject) evaluatesWith;
			evaluatesWith = (TestDataset) eResolveProxy(oldEvaluatesWith);
			if (evaluatesWith != oldEvaluatesWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH, oldEvaluatesWith,
							evaluatesWith));
			}
		}
		return evaluatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDataset basicGetEvaluatesWith() {
		return evaluatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvaluatesWith(TestDataset newEvaluatesWith) {
		TestDataset oldEvaluatesWith = evaluatesWith;
		evaluatesWith = newEvaluatesWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH, oldEvaluatesWith, evaluatesWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModel> getEvaluates() {
		if (evaluates == null) {
			evaluates = new EObjectResolvingEList<AIModel>(AIModel.class, this,
					Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES);
		}
		return evaluates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CriterionValue> getCriteriaValues() {
		if (criteriaValues == null) {
			criteriaValues = new EObjectWithInverseResolvingEList<CriterionValue>(CriterionValue.class, this,
					Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES,
					Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY);
		}
		return criteriaValues;
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
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCriteriaValues()).basicAdd(otherEnd, msgs);
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
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES:
			return ((InternalEList<?>) getCriteriaValues()).basicRemove(otherEnd, msgs);
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
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH:
			if (resolve)
				return getEvaluatesWith();
			return basicGetEvaluatesWith();
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES:
			return getEvaluates();
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES:
			return getCriteriaValues();
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
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH:
			setEvaluatesWith((TestDataset) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES:
			getEvaluates().clear();
			getEvaluates().addAll((Collection<? extends AIModel>) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES:
			getCriteriaValues().clear();
			getCriteriaValues().addAll((Collection<? extends CriterionValue>) newValue);
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
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH:
			setEvaluatesWith((TestDataset) null);
			return;
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES:
			getEvaluates().clear();
			return;
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES:
			getCriteriaValues().clear();
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
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH:
			return evaluatesWith != null;
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__EVALUATES:
			return evaluates != null && !evaluates.isEmpty();
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES:
			return criteriaValues != null && !criteriaValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelEvaluationActivityImpl
