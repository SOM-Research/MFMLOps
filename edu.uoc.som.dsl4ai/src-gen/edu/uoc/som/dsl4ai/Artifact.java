/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Artifact#isIsDeliverable <em>Is Deliverable</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getArtifact()
 * @model abstract="true"
 * @generated
 */
public interface Artifact extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deliverable</em>' attribute.
	 * @see #setIsDeliverable(boolean)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getArtifact_IsDeliverable()
	 * @model
	 * @generated
	 */
	boolean isIsDeliverable();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Artifact#isIsDeliverable <em>Is Deliverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deliverable</em>' attribute.
	 * @see #isIsDeliverable()
	 * @generated
	 */
	void setIsDeliverable(boolean value);

} // Artifact
