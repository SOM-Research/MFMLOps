/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Ethical Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIEthicalRequirement#getEthic <em>Ethic</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIEthicalRequirement()
 * @model
 * @generated
 */
public interface AIEthicalRequirement extends AIModelRequirement {
	/**
	 * Returns the value of the '<em><b>Ethic</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.AIEthicsKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethic</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.AIEthicsKind
	 * @see #setEthic(AIEthicsKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIEthicalRequirement_Ethic()
	 * @model required="true"
	 * @generated
	 */
	AIEthicsKind getEthic();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.AIEthicalRequirement#getEthic <em>Ethic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethic</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.AIEthicsKind
	 * @see #getEthic()
	 * @generated
	 */
	void setEthic(AIEthicsKind value);

} // AIEthicalRequirement
