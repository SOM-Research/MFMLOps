/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModel;
import edu.uoc.som.dsl4ai.AIModelTrainingActivity;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.OptimalValue;
import edu.uoc.som.dsl4ai.TrainingDataset;
import edu.uoc.som.dsl4ai.ValidationDataset;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Model Training Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl#getTrainsWith <em>Trains With</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl#getValidatesWith <em>Validates With</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl#getTrains <em>Trains</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl#getOptimalValues <em>Optimal Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIModelTrainingActivityImpl extends ActivityImpl implements AIModelTrainingActivity {
	/**
	 * The cached value of the '{@link #getTrainsWith() <em>Trains With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainsWith()
	 * @generated
	 * @ordered
	 */
	protected TrainingDataset trainsWith;

	/**
	 * The cached value of the '{@link #getValidatesWith() <em>Validates With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatesWith()
	 * @generated
	 * @ordered
	 */
	protected ValidationDataset validatesWith;

	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModel> trains;

	/**
	 * The cached value of the '{@link #getOptimalValues() <em>Optimal Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<OptimalValue> optimalValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIModelTrainingActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_MODEL_TRAINING_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingDataset getTrainsWith() {
		if (trainsWith != null && trainsWith.eIsProxy()) {
			InternalEObject oldTrainsWith = (InternalEObject) trainsWith;
			trainsWith = (TrainingDataset) eResolveProxy(oldTrainsWith);
			if (trainsWith != oldTrainsWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH, oldTrainsWith, trainsWith));
			}
		}
		return trainsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDataset basicGetTrainsWith() {
		return trainsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainsWith(TrainingDataset newTrainsWith) {
		TrainingDataset oldTrainsWith = trainsWith;
		trainsWith = newTrainsWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH,
					oldTrainsWith, trainsWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationDataset getValidatesWith() {
		if (validatesWith != null && validatesWith.eIsProxy()) {
			InternalEObject oldValidatesWith = (InternalEObject) validatesWith;
			validatesWith = (ValidationDataset) eResolveProxy(oldValidatesWith);
			if (validatesWith != oldValidatesWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH, oldValidatesWith, validatesWith));
			}
		}
		return validatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationDataset basicGetValidatesWith() {
		return validatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidatesWith(ValidationDataset newValidatesWith) {
		ValidationDataset oldValidatesWith = validatesWith;
		validatesWith = newValidatesWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH, oldValidatesWith, validatesWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModel> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<AIModel>(AIModel.class, this,
					Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS);
		}
		return trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptimalValue> getOptimalValues() {
		if (optimalValues == null) {
			optimalValues = new EObjectWithInverseResolvingEList<OptimalValue>(OptimalValue.class, this,
					Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES,
					Dsl4aiPackage.OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY);
		}
		return optimalValues;
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
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptimalValues()).basicAdd(otherEnd, msgs);
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
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS:
			return ((InternalEList<?>) getTrains()).basicRemove(otherEnd, msgs);
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES:
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
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH:
			if (resolve)
				return getTrainsWith();
			return basicGetTrainsWith();
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH:
			if (resolve)
				return getValidatesWith();
			return basicGetValidatesWith();
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS:
			return getTrains();
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES:
			return getOptimalValues();
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
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH:
			setTrainsWith((TrainingDataset) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH:
			setValidatesWith((ValidationDataset) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS:
			getTrains().clear();
			getTrains().addAll((Collection<? extends AIModel>) newValue);
			return;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES:
			getOptimalValues().clear();
			getOptimalValues().addAll((Collection<? extends OptimalValue>) newValue);
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
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH:
			setTrainsWith((TrainingDataset) null);
			return;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH:
			setValidatesWith((ValidationDataset) null);
			return;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS:
			getTrains().clear();
			return;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES:
			getOptimalValues().clear();
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
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH:
			return trainsWith != null;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH:
			return validatesWith != null;
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__TRAINS:
			return trains != null && !trains.isEmpty();
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES:
			return optimalValues != null && !optimalValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AIModelTrainingActivityImpl
