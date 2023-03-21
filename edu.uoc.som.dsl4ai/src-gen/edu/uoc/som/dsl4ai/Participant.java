/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Participant#getParticipation <em>Participation</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Participant#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Participation</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.ParticipationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participation</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.ParticipationKind
	 * @see #setParticipation(ParticipationKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getParticipant_Participation()
	 * @model
	 * @generated
	 */
	ParticipationKind getParticipation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Participant#getParticipation <em>Participation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participation</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.ParticipationKind
	 * @see #getParticipation()
	 * @generated
	 */
	void setParticipation(ParticipationKind value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getParticipant_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Participant#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Participant
