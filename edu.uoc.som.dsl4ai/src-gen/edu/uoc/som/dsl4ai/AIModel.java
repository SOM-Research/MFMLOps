/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModel#getRank <em>Rank</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModel#getCriteriaValues <em>Criteria Values</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModel#getGoal <em>Goal</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModel#getSatisfiedRequirements <em>Satisfied Requirements</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModel#getOptimalValues <em>Optimal Values</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModel#getBasedOn <em>Based On</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel()
 * @model
 * @generated
 */
public interface AIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(float)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel_Rank()
	 * @model
	 * @generated
	 */
	float getRank();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModel#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(float value);

	/**
	 * Returns the value of the '<em><b>Criteria Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.CriterionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Values</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel_CriteriaValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<CriterionValue> getCriteriaValues();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(AIModelGoal)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel_Goal()
	 * @model required="true"
	 * @generated
	 */
	AIModelGoal getGoal();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModel#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(AIModelGoal value);

	/**
	 * Returns the value of the '<em><b>Satisfied Requirements</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.AIModelRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied Requirements</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel_SatisfiedRequirements()
	 * @model
	 * @generated
	 */
	EList<AIModelRequirement> getSatisfiedRequirements();

	/**
	 * Returns the value of the '<em><b>Optimal Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.OptimalValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimal Values</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel_OptimalValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptimalValue> getOptimalValues();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference.
	 * @see #setBasedOn(AIModelingTechnique)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModel_BasedOn()
	 * @model required="true"
	 * @generated
	 */
	AIModelingTechnique getBasedOn();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModel#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(AIModelingTechnique value);

} // AIModel
