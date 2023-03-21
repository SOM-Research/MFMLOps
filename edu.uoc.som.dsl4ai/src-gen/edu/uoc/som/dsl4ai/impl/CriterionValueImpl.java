/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelEvaluationActivity;
import edu.uoc.som.dsl4ai.AIModelSuccessCriterion;
import edu.uoc.som.dsl4ai.CriterionValue;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.CriterionValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.CriterionValueImpl#getAimodelsuccesscriterion <em>Aimodelsuccesscriterion</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.CriterionValueImpl#getAiModelEvaluationActivity <em>Ai Model Evaluation Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriterionValueImpl extends MinimalEObjectImpl.Container implements CriterionValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAimodelsuccesscriterion() <em>Aimodelsuccesscriterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimodelsuccesscriterion()
	 * @generated
	 * @ordered
	 */
	protected AIModelSuccessCriterion aimodelsuccesscriterion;

	/**
	 * The cached value of the '{@link #getAiModelEvaluationActivity() <em>Ai Model Evaluation Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAiModelEvaluationActivity()
	 * @generated
	 * @ordered
	 */
	protected AIModelEvaluationActivity aiModelEvaluationActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.CRITERION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.CRITERION_VALUE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelSuccessCriterion getAimodelsuccesscriterion() {
		if (aimodelsuccesscriterion != null && aimodelsuccesscriterion.eIsProxy()) {
			InternalEObject oldAimodelsuccesscriterion = (InternalEObject) aimodelsuccesscriterion;
			aimodelsuccesscriterion = (AIModelSuccessCriterion) eResolveProxy(oldAimodelsuccesscriterion);
			if (aimodelsuccesscriterion != oldAimodelsuccesscriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION, oldAimodelsuccesscriterion,
							aimodelsuccesscriterion));
			}
		}
		return aimodelsuccesscriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelSuccessCriterion basicGetAimodelsuccesscriterion() {
		return aimodelsuccesscriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAimodelsuccesscriterion(AIModelSuccessCriterion newAimodelsuccesscriterion,
			NotificationChain msgs) {
		AIModelSuccessCriterion oldAimodelsuccesscriterion = aimodelsuccesscriterion;
		aimodelsuccesscriterion = newAimodelsuccesscriterion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION, oldAimodelsuccesscriterion,
					newAimodelsuccesscriterion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAimodelsuccesscriterion(AIModelSuccessCriterion newAimodelsuccesscriterion) {
		if (newAimodelsuccesscriterion != aimodelsuccesscriterion) {
			NotificationChain msgs = null;
			if (aimodelsuccesscriterion != null)
				msgs = ((InternalEObject) aimodelsuccesscriterion).eInverseRemove(this,
						Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE, AIModelSuccessCriterion.class, msgs);
			if (newAimodelsuccesscriterion != null)
				msgs = ((InternalEObject) newAimodelsuccesscriterion).eInverseAdd(this,
						Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE, AIModelSuccessCriterion.class, msgs);
			msgs = basicSetAimodelsuccesscriterion(newAimodelsuccesscriterion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION, newAimodelsuccesscriterion,
					newAimodelsuccesscriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelEvaluationActivity getAiModelEvaluationActivity() {
		if (aiModelEvaluationActivity != null && aiModelEvaluationActivity.eIsProxy()) {
			InternalEObject oldAiModelEvaluationActivity = (InternalEObject) aiModelEvaluationActivity;
			aiModelEvaluationActivity = (AIModelEvaluationActivity) eResolveProxy(oldAiModelEvaluationActivity);
			if (aiModelEvaluationActivity != oldAiModelEvaluationActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY, oldAiModelEvaluationActivity,
							aiModelEvaluationActivity));
			}
		}
		return aiModelEvaluationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelEvaluationActivity basicGetAiModelEvaluationActivity() {
		return aiModelEvaluationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAiModelEvaluationActivity(AIModelEvaluationActivity newAiModelEvaluationActivity,
			NotificationChain msgs) {
		AIModelEvaluationActivity oldAiModelEvaluationActivity = aiModelEvaluationActivity;
		aiModelEvaluationActivity = newAiModelEvaluationActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY, oldAiModelEvaluationActivity,
					newAiModelEvaluationActivity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAiModelEvaluationActivity(AIModelEvaluationActivity newAiModelEvaluationActivity) {
		if (newAiModelEvaluationActivity != aiModelEvaluationActivity) {
			NotificationChain msgs = null;
			if (aiModelEvaluationActivity != null)
				msgs = ((InternalEObject) aiModelEvaluationActivity).eInverseRemove(this,
						Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES, AIModelEvaluationActivity.class,
						msgs);
			if (newAiModelEvaluationActivity != null)
				msgs = ((InternalEObject) newAiModelEvaluationActivity).eInverseAdd(this,
						Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES, AIModelEvaluationActivity.class,
						msgs);
			msgs = basicSetAiModelEvaluationActivity(newAiModelEvaluationActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY, newAiModelEvaluationActivity,
					newAiModelEvaluationActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION:
			if (aimodelsuccesscriterion != null)
				msgs = ((InternalEObject) aimodelsuccesscriterion).eInverseRemove(this,
						Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE, AIModelSuccessCriterion.class, msgs);
			return basicSetAimodelsuccesscriterion((AIModelSuccessCriterion) otherEnd, msgs);
		case Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY:
			if (aiModelEvaluationActivity != null)
				msgs = ((InternalEObject) aiModelEvaluationActivity).eInverseRemove(this,
						Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES, AIModelEvaluationActivity.class,
						msgs);
			return basicSetAiModelEvaluationActivity((AIModelEvaluationActivity) otherEnd, msgs);
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
		case Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION:
			return basicSetAimodelsuccesscriterion(null, msgs);
		case Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY:
			return basicSetAiModelEvaluationActivity(null, msgs);
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
		case Dsl4aiPackage.CRITERION_VALUE__VALUE:
			return getValue();
		case Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION:
			if (resolve)
				return getAimodelsuccesscriterion();
			return basicGetAimodelsuccesscriterion();
		case Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY:
			if (resolve)
				return getAiModelEvaluationActivity();
			return basicGetAiModelEvaluationActivity();
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
		case Dsl4aiPackage.CRITERION_VALUE__VALUE:
			setValue((Float) newValue);
			return;
		case Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION:
			setAimodelsuccesscriterion((AIModelSuccessCriterion) newValue);
			return;
		case Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY:
			setAiModelEvaluationActivity((AIModelEvaluationActivity) newValue);
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
		case Dsl4aiPackage.CRITERION_VALUE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION:
			setAimodelsuccesscriterion((AIModelSuccessCriterion) null);
			return;
		case Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY:
			setAiModelEvaluationActivity((AIModelEvaluationActivity) null);
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
		case Dsl4aiPackage.CRITERION_VALUE__VALUE:
			return value != VALUE_EDEFAULT;
		case Dsl4aiPackage.CRITERION_VALUE__AIMODELSUCCESSCRITERION:
			return aimodelsuccesscriterion != null;
		case Dsl4aiPackage.CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY:
			return aiModelEvaluationActivity != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CriterionValueImpl
