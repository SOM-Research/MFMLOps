/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Flaw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelFlaw#getDegrades <em>Degrades</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelFlaw()
 * @model
 * @generated
 */
public interface AIModelFlaw extends AIModelObservation {
	/**
	 * Returns the value of the '<em><b>Degrades</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrades</em>' reference.
	 * @see #setDegrades(AIModelRequirement)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelFlaw_Degrades()
	 * @model required="true"
	 * @generated
	 */
	AIModelRequirement getDegrades();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIModelFlaw#getDegrades <em>Degrades</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrades</em>' reference.
	 * @see #getDegrades()
	 * @generated
	 */
	void setDegrades(AIModelRequirement value);

} // AIModelFlaw
