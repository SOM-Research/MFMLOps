/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.DataPreparationActivity;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.TestDataset;
import edu.uoc.som.dsl4ai.TrainingDataset;
import edu.uoc.som.dsl4ai.ValidationDataset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Preparation Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl#getTrainingDataset <em>Training Dataset</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl#getValidationDataset <em>Validation Dataset</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl#getTestDataset <em>Test Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPreparationActivityImpl extends ActivityImpl implements DataPreparationActivity {
	/**
	 * The cached value of the '{@link #getTrainingDataset() <em>Training Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingDataset()
	 * @generated
	 * @ordered
	 */
	protected TrainingDataset trainingDataset;

	/**
	 * The cached value of the '{@link #getValidationDataset() <em>Validation Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationDataset()
	 * @generated
	 * @ordered
	 */
	protected ValidationDataset validationDataset;

	/**
	 * The cached value of the '{@link #getTestDataset() <em>Test Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestDataset()
	 * @generated
	 * @ordered
	 */
	protected TestDataset testDataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPreparationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DATA_PREPARATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingDataset getTrainingDataset() {
		return trainingDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainingDataset(TrainingDataset newTrainingDataset, NotificationChain msgs) {
		TrainingDataset oldTrainingDataset = trainingDataset;
		trainingDataset = newTrainingDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET, oldTrainingDataset, newTrainingDataset);
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
	public void setTrainingDataset(TrainingDataset newTrainingDataset) {
		if (newTrainingDataset != trainingDataset) {
			NotificationChain msgs = null;
			if (trainingDataset != null)
				msgs = ((InternalEObject) trainingDataset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET, null, msgs);
			if (newTrainingDataset != null)
				msgs = ((InternalEObject) newTrainingDataset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET, null, msgs);
			msgs = basicSetTrainingDataset(newTrainingDataset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET, newTrainingDataset, newTrainingDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationDataset getValidationDataset() {
		return validationDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationDataset(ValidationDataset newValidationDataset, NotificationChain msgs) {
		ValidationDataset oldValidationDataset = validationDataset;
		validationDataset = newValidationDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET, oldValidationDataset,
					newValidationDataset);
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
	public void setValidationDataset(ValidationDataset newValidationDataset) {
		if (newValidationDataset != validationDataset) {
			NotificationChain msgs = null;
			if (validationDataset != null)
				msgs = ((InternalEObject) validationDataset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET, null,
						msgs);
			if (newValidationDataset != null)
				msgs = ((InternalEObject) newValidationDataset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET, null,
						msgs);
			msgs = basicSetValidationDataset(newValidationDataset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET, newValidationDataset,
					newValidationDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestDataset getTestDataset() {
		return testDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestDataset(TestDataset newTestDataset, NotificationChain msgs) {
		TestDataset oldTestDataset = testDataset;
		testDataset = newTestDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET, oldTestDataset, newTestDataset);
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
	public void setTestDataset(TestDataset newTestDataset) {
		if (newTestDataset != testDataset) {
			NotificationChain msgs = null;
			if (testDataset != null)
				msgs = ((InternalEObject) testDataset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET, null, msgs);
			if (newTestDataset != null)
				msgs = ((InternalEObject) newTestDataset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET, null, msgs);
			msgs = basicSetTestDataset(newTestDataset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET,
					newTestDataset, newTestDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET:
			return basicSetTrainingDataset(null, msgs);
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET:
			return basicSetValidationDataset(null, msgs);
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET:
			return basicSetTestDataset(null, msgs);
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
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET:
			return getTrainingDataset();
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET:
			return getValidationDataset();
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET:
			return getTestDataset();
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
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET:
			setTrainingDataset((TrainingDataset) newValue);
			return;
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET:
			setValidationDataset((ValidationDataset) newValue);
			return;
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET:
			setTestDataset((TestDataset) newValue);
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
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET:
			setTrainingDataset((TrainingDataset) null);
			return;
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET:
			setValidationDataset((ValidationDataset) null);
			return;
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET:
			setTestDataset((TestDataset) null);
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
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TRAINING_DATASET:
			return trainingDataset != null;
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET:
			return validationDataset != null;
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY__TEST_DATASET:
			return testDataset != null;
		}
		return super.eIsSet(featureID);
	}

} //DataPreparationActivityImpl
