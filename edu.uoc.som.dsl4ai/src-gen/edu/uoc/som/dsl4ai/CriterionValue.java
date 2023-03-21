/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.CriterionValue#getValue <em>Value</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.CriterionValue#getAimodelsuccesscriterion <em>Aimodelsuccesscriterion</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.CriterionValue#getAiModelEvaluationActivity <em>Ai Model Evaluation Activity</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getCriterionValue()
 * @model
 * @generated
 */
public interface CriterionValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getCriterionValue_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.CriterionValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Aimodelsuccesscriterion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getCriterionValue <em>Criterion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aimodelsuccesscriterion</em>' reference.
	 * @see #setAimodelsuccesscriterion(AIModelSuccessCriterion)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getCriterionValue_Aimodelsuccesscriterion()
	 * @see edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getCriterionValue
	 * @model opposite="criterionValue" required="true"
	 * @generated
	 */
	AIModelSuccessCriterion getAimodelsuccesscriterion();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.CriterionValue#getAimodelsuccesscriterion <em>Aimodelsuccesscriterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aimodelsuccesscriterion</em>' reference.
	 * @see #getAimodelsuccesscriterion()
	 * @generated
	 */
	void setAimodelsuccesscriterion(AIModelSuccessCriterion value);

	/**
	 * Returns the value of the '<em><b>Ai Model Evaluation Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getCriteriaValues <em>Criteria Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai Model Evaluation Activity</em>' reference.
	 * @see #setAiModelEvaluationActivity(AIModelEvaluationActivity)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getCriterionValue_AiModelEvaluationActivity()
	 * @see edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getCriteriaValues
	 * @model opposite="criteriaValues" required="true"
	 * @generated
	 */
	AIModelEvaluationActivity getAiModelEvaluationActivity();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.CriterionValue#getAiModelEvaluationActivity <em>Ai Model Evaluation Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai Model Evaluation Activity</em>' reference.
	 * @see #getAiModelEvaluationActivity()
	 * @generated
	 */
	void setAiModelEvaluationActivity(AIModelEvaluationActivity value);

} // CriterionValue
