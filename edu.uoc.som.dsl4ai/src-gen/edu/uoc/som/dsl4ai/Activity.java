/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#isRequiresAllSubactivities <em>Requires All Subactivities</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getResources <em>Resources</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getTechniques <em>Techniques</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getParticipants <em>Participants</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getNext <em>Next</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Activity#getSubactivities <em>Subactivities</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_IsOptional()
	 * @model
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Activity#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires All Subactivities</em>' attribute.
	 * @see #setRequiresAllSubactivities(boolean)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_RequiresAllSubactivities()
	 * @model
	 * @generated
	 */
	boolean isRequiresAllSubactivities();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Activity#isRequiresAllSubactivities <em>Requires All Subactivities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires All Subactivities</em>' attribute.
	 * @see #isRequiresAllSubactivities()
	 * @generated
	 */
	void setRequiresAllSubactivities(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Inputs()
	 * @model
	 * @generated
	 */
	EList<Artifact> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Outputs()
	 * @model
	 * @generated
	 */
	EList<Artifact> getOutputs();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Resources()
	 * @model
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Techniques</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Technique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Techniques</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Techniques()
	 * @model
	 * @generated
	 */
	EList<Technique> getTechniques();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Activity)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Next()
	 * @model
	 * @generated
	 */
	Activity getNext();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Activity#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Activity value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Activity#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Subactivities</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subactivities</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getActivity_Subactivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getSubactivities();

} // Activity
