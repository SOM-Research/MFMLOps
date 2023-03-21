/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Document#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Artifact {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Template)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDocument_Template()
	 * @model
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Document#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

} // Document
