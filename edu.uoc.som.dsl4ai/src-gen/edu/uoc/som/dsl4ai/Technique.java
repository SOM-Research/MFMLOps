/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Technique#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getTechnique()
 * @model abstract="true"
 * @generated
 */
public interface Technique extends Resource {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(Script)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getTechnique_Script()
	 * @model
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Technique#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // Technique
