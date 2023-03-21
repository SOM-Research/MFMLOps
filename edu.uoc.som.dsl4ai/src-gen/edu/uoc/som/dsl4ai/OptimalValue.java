/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.OptimalValue#getValue <em>Value</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.OptimalValue#getHyperparameter <em>Hyperparameter</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.OptimalValue#getAiModelTrainingActivity <em>Ai Model Training Activity</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getOptimalValue()
 * @model
 * @generated
 */
public interface OptimalValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getOptimalValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.OptimalValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Hyperparameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.HyperParameter#getOptimalValues <em>Optimal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperparameter</em>' reference.
	 * @see #setHyperparameter(HyperParameter)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getOptimalValue_Hyperparameter()
	 * @see edu.uoc.som.dsl4ai.HyperParameter#getOptimalValues
	 * @model opposite="optimalValues" required="true"
	 * @generated
	 */
	HyperParameter getHyperparameter();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.OptimalValue#getHyperparameter <em>Hyperparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperparameter</em>' reference.
	 * @see #getHyperparameter()
	 * @generated
	 */
	void setHyperparameter(HyperParameter value);

	/**
	 * Returns the value of the '<em><b>Ai Model Training Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getOptimalValues <em>Optimal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai Model Training Activity</em>' reference.
	 * @see #setAiModelTrainingActivity(AIModelTrainingActivity)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getOptimalValue_AiModelTrainingActivity()
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity#getOptimalValues
	 * @model opposite="optimalValues" required="true"
	 * @generated
	 */
	AIModelTrainingActivity getAiModelTrainingActivity();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.OptimalValue#getAiModelTrainingActivity <em>Ai Model Training Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai Model Training Activity</em>' reference.
	 * @see #getAiModelTrainingActivity()
	 * @generated
	 */
	void setAiModelTrainingActivity(AIModelTrainingActivity value);

} // OptimalValue
