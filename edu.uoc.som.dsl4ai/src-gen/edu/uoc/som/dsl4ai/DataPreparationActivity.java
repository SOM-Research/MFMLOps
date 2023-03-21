/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Preparation Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getTrainingDataset <em>Training Dataset</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getValidationDataset <em>Validation Dataset</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getTestDataset <em>Test Dataset</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataPreparationActivity()
 * @model
 * @generated
 */
public interface DataPreparationActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Training Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Dataset</em>' containment reference.
	 * @see #setTrainingDataset(TrainingDataset)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataPreparationActivity_TrainingDataset()
	 * @model containment="true"
	 * @generated
	 */
	TrainingDataset getTrainingDataset();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getTrainingDataset <em>Training Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Dataset</em>' containment reference.
	 * @see #getTrainingDataset()
	 * @generated
	 */
	void setTrainingDataset(TrainingDataset value);

	/**
	 * Returns the value of the '<em><b>Validation Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Dataset</em>' containment reference.
	 * @see #setValidationDataset(ValidationDataset)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataPreparationActivity_ValidationDataset()
	 * @model containment="true"
	 * @generated
	 */
	ValidationDataset getValidationDataset();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getValidationDataset <em>Validation Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Dataset</em>' containment reference.
	 * @see #getValidationDataset()
	 * @generated
	 */
	void setValidationDataset(ValidationDataset value);

	/**
	 * Returns the value of the '<em><b>Test Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Dataset</em>' containment reference.
	 * @see #setTestDataset(TestDataset)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataPreparationActivity_TestDataset()
	 * @model containment="true"
	 * @generated
	 */
	TestDataset getTestDataset();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getTestDataset <em>Test Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Dataset</em>' containment reference.
	 * @see #getTestDataset()
	 * @generated
	 */
	void setTestDataset(TestDataset value);

} // DataPreparationActivity
