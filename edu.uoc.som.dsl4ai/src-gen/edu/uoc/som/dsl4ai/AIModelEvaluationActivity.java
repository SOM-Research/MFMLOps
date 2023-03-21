/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Evaluation Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluatesWith <em>Evaluates With</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluates <em>Evaluates</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getCriteriaValues <em>Criteria Values</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelEvaluationActivity()
 * @model
 * @generated
 */
public interface AIModelEvaluationActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Evaluates With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates With</em>' reference.
	 * @see #setEvaluatesWith(TestDataset)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelEvaluationActivity_EvaluatesWith()
	 * @model
	 * @generated
	 */
	TestDataset getEvaluatesWith();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluatesWith <em>Evaluates With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluates With</em>' reference.
	 * @see #getEvaluatesWith()
	 * @generated
	 */
	void setEvaluatesWith(TestDataset value);

	/**
	 * Returns the value of the '<em><b>Evaluates</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.AIModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelEvaluationActivity_Evaluates()
	 * @model
	 * @generated
	 */
	EList<AIModel> getEvaluates();

	/**
	 * Returns the value of the '<em><b>Criteria Values</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.CriterionValue}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.CriterionValue#getAiModelEvaluationActivity <em>Ai Model Evaluation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Values</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelEvaluationActivity_CriteriaValues()
	 * @see edu.uoc.som.dsl4ai.CriterionValue#getAiModelEvaluationActivity
	 * @model opposite="aiModelEvaluationActivity"
	 * @generated
	 */
	EList<CriterionValue> getCriteriaValues();

} // AIModelEvaluationActivity
