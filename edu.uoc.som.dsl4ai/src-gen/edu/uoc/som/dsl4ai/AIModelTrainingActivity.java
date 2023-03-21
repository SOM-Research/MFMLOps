/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Training Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrainsWith <em>Trains With</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getValidatesWith <em>Validates With</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrains <em>Trains</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getOptimalValues <em>Optimal Values</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelTrainingActivity()
 * @model
 * @generated
 */
public interface AIModelTrainingActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Trains With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains With</em>' reference.
	 * @see #setTrainsWith(TrainingDataset)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelTrainingActivity_TrainsWith()
	 * @model
	 * @generated
	 */
	TrainingDataset getTrainsWith();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrainsWith <em>Trains With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trains With</em>' reference.
	 * @see #getTrainsWith()
	 * @generated
	 */
	void setTrainsWith(TrainingDataset value);

	/**
	 * Returns the value of the '<em><b>Validates With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validates With</em>' reference.
	 * @see #setValidatesWith(ValidationDataset)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelTrainingActivity_ValidatesWith()
	 * @model
	 * @generated
	 */
	ValidationDataset getValidatesWith();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getValidatesWith <em>Validates With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validates With</em>' reference.
	 * @see #getValidatesWith()
	 * @generated
	 */
	void setValidatesWith(ValidationDataset value);

	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.AIModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelTrainingActivity_Trains()
	 * @model containment="true"
	 * @generated
	 */
	EList<AIModel> getTrains();

	/**
	 * Returns the value of the '<em><b>Optimal Values</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.OptimalValue}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.OptimalValue#getAiModelTrainingActivity <em>Ai Model Training Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimal Values</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelTrainingActivity_OptimalValues()
	 * @see edu.uoc.som.dsl4ai.OptimalValue#getAiModelTrainingActivity
	 * @model opposite="aiModelTrainingActivity"
	 * @generated
	 */
	EList<OptimalValue> getOptimalValues();

} // AIModelTrainingActivity
