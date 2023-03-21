/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelTrainingActivity;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.HyperParameter;
import edu.uoc.som.dsl4ai.OptimalValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.OptimalValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.OptimalValueImpl#getHyperparameter <em>Hyperparameter</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.OptimalValueImpl#getAiModelTrainingActivity <em>Ai Model Training Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimalValueImpl extends MinimalEObjectImpl.Container implements OptimalValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHyperparameter() <em>Hyperparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperparameter()
	 * @generated
	 * @ordered
	 */
	protected HyperParameter hyperparameter;

	/**
	 * The cached value of the '{@link #getAiModelTrainingActivity() <em>Ai Model Training Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAiModelTrainingActivity()
	 * @generated
	 * @ordered
	 */
	protected AIModelTrainingActivity aiModelTrainingActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.OPTIMAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.OPTIMAL_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HyperParameter getHyperparameter() {
		if (hyperparameter != null && hyperparameter.eIsProxy()) {
			InternalEObject oldHyperparameter = (InternalEObject) hyperparameter;
			hyperparameter = (HyperParameter) eResolveProxy(oldHyperparameter);
			if (hyperparameter != oldHyperparameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER, oldHyperparameter, hyperparameter));
			}
		}
		return hyperparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperParameter basicGetHyperparameter() {
		return hyperparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHyperparameter(HyperParameter newHyperparameter, NotificationChain msgs) {
		HyperParameter oldHyperparameter = hyperparameter;
		hyperparameter = newHyperparameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER, oldHyperparameter, newHyperparameter);
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
	public void setHyperparameter(HyperParameter newHyperparameter) {
		if (newHyperparameter != hyperparameter) {
			NotificationChain msgs = null;
			if (hyperparameter != null)
				msgs = ((InternalEObject) hyperparameter).eInverseRemove(this,
						Dsl4aiPackage.HYPER_PARAMETER__OPTIMAL_VALUES, HyperParameter.class, msgs);
			if (newHyperparameter != null)
				msgs = ((InternalEObject) newHyperparameter).eInverseAdd(this,
						Dsl4aiPackage.HYPER_PARAMETER__OPTIMAL_VALUES, HyperParameter.class, msgs);
			msgs = basicSetHyperparameter(newHyperparameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER,
					newHyperparameter, newHyperparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelTrainingActivity getAiModelTrainingActivity() {
		if (aiModelTrainingActivity != null && aiModelTrainingActivity.eIsProxy()) {
			InternalEObject oldAiModelTrainingActivity = (InternalEObject) aiModelTrainingActivity;
			aiModelTrainingActivity = (AIModelTrainingActivity) eResolveProxy(oldAiModelTrainingActivity);
			if (aiModelTrainingActivity != oldAiModelTrainingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY, oldAiModelTrainingActivity,
							aiModelTrainingActivity));
			}
		}
		return aiModelTrainingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIModelTrainingActivity basicGetAiModelTrainingActivity() {
		return aiModelTrainingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAiModelTrainingActivity(AIModelTrainingActivity newAiModelTrainingActivity,
			NotificationChain msgs) {
		AIModelTrainingActivity oldAiModelTrainingActivity = aiModelTrainingActivity;
		aiModelTrainingActivity = newAiModelTrainingActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY, oldAiModelTrainingActivity,
					newAiModelTrainingActivity);
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
	public void setAiModelTrainingActivity(AIModelTrainingActivity newAiModelTrainingActivity) {
		if (newAiModelTrainingActivity != aiModelTrainingActivity) {
			NotificationChain msgs = null;
			if (aiModelTrainingActivity != null)
				msgs = ((InternalEObject) aiModelTrainingActivity).eInverseRemove(this,
						Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES, AIModelTrainingActivity.class, msgs);
			if (newAiModelTrainingActivity != null)
				msgs = ((InternalEObject) newAiModelTrainingActivity).eInverseAdd(this,
						Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES, AIModelTrainingActivity.class, msgs);
			msgs = basicSetAiModelTrainingActivity(newAiModelTrainingActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY, newAiModelTrainingActivity,
					newAiModelTrainingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER:
			if (hyperparameter != null)
				msgs = ((InternalEObject) hyperparameter).eInverseRemove(this,
						Dsl4aiPackage.HYPER_PARAMETER__OPTIMAL_VALUES, HyperParameter.class, msgs);
			return basicSetHyperparameter((HyperParameter) otherEnd, msgs);
		case Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY:
			if (aiModelTrainingActivity != null)
				msgs = ((InternalEObject) aiModelTrainingActivity).eInverseRemove(this,
						Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES, AIModelTrainingActivity.class, msgs);
			return basicSetAiModelTrainingActivity((AIModelTrainingActivity) otherEnd, msgs);
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
		case Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER:
			return basicSetHyperparameter(null, msgs);
		case Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY:
			return basicSetAiModelTrainingActivity(null, msgs);
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
		case Dsl4aiPackage.OPTIMAL_VALUE__VALUE:
			return getValue();
		case Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER:
			if (resolve)
				return getHyperparameter();
			return basicGetHyperparameter();
		case Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY:
			if (resolve)
				return getAiModelTrainingActivity();
			return basicGetAiModelTrainingActivity();
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
		case Dsl4aiPackage.OPTIMAL_VALUE__VALUE:
			setValue((String) newValue);
			return;
		case Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER:
			setHyperparameter((HyperParameter) newValue);
			return;
		case Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY:
			setAiModelTrainingActivity((AIModelTrainingActivity) newValue);
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
		case Dsl4aiPackage.OPTIMAL_VALUE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER:
			setHyperparameter((HyperParameter) null);
			return;
		case Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY:
			setAiModelTrainingActivity((AIModelTrainingActivity) null);
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
		case Dsl4aiPackage.OPTIMAL_VALUE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case Dsl4aiPackage.OPTIMAL_VALUE__HYPERPARAMETER:
			return hyperparameter != null;
		case Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY:
			return aiModelTrainingActivity != null;
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

} //OptimalValueImpl
