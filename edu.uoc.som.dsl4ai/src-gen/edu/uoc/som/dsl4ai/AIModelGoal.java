/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelGoal#getAlignedTo <em>Aligned To</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelGoal#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelGoal()
 * @model
 * @generated
 */
public interface AIModelGoal extends Goal {
	/**
	 * Returns the value of the '<em><b>Aligned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aligned To</em>' reference.
	 * @see #setAlignedTo(BusinessGoal)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelGoal_AlignedTo()
	 * @model required="true"
	 * @generated
	 */
	BusinessGoal getAlignedTo();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModelGoal#getAlignedTo <em>Aligned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aligned To</em>' reference.
	 * @see #getAlignedTo()
	 * @generated
	 */
	void setAlignedTo(BusinessGoal value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelGoal_Criteria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AIModelSuccessCriterion> getCriteria();

} // AIModelGoal
