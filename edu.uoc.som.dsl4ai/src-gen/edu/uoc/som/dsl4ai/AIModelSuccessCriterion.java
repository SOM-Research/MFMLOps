/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Success Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getAlignedTo <em>Aligned To</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getCriterionValue <em>Criterion Value</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelSuccessCriterion()
 * @model
 * @generated
 */
public interface AIModelSuccessCriterion extends SuccessCriterion {
	/**
	 * Returns the value of the '<em><b>Aligned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aligned To</em>' reference.
	 * @see #setAlignedTo(BusinessSuccessCriterion)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelSuccessCriterion_AlignedTo()
	 * @model required="true"
	 * @generated
	 */
	BusinessSuccessCriterion getAlignedTo();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getAlignedTo <em>Aligned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aligned To</em>' reference.
	 * @see #getAlignedTo()
	 * @generated
	 */
	void setAlignedTo(BusinessSuccessCriterion value);

	/**
	 * Returns the value of the '<em><b>Criterion Value</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.CriterionValue}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.CriterionValue#getAimodelsuccesscriterion <em>Aimodelsuccesscriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion Value</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelSuccessCriterion_CriterionValue()
	 * @see edu.uoc.som.dsl4ai.CriterionValue#getAimodelsuccesscriterion
	 * @model opposite="aimodelsuccesscriterion"
	 * @generated
	 */
	EList<CriterionValue> getCriterionValue();

} // AIModelSuccessCriterion
