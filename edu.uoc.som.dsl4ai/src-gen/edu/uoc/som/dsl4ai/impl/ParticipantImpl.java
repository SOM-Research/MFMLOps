/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.Participant;
import edu.uoc.som.dsl4ai.ParticipationKind;
import edu.uoc.som.dsl4ai.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ParticipantImpl#getParticipation <em>Participation</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ParticipantImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The default value of the '{@link #getParticipation() <em>Participation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipation()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipationKind PARTICIPATION_EDEFAULT = ParticipationKind.RESPONSIBLE;

	/**
	 * The cached value of the '{@link #getParticipation() <em>Participation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipation()
	 * @generated
	 * @ordered
	 */
	protected ParticipationKind participation = PARTICIPATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipationKind getParticipation() {
		return participation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipation(ParticipationKind newParticipation) {
		ParticipationKind oldParticipation = participation;
		participation = newParticipation == null ? PARTICIPATION_EDEFAULT : newParticipation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.PARTICIPANT__PARTICIPATION,
					oldParticipation, participation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (Role) eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.PARTICIPANT__ROLE, oldRole,
							role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.PARTICIPANT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.PARTICIPANT__PARTICIPATION:
			return getParticipation();
		case Dsl4aiPackage.PARTICIPANT__ROLE:
			if (resolve)
				return getRole();
			return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Dsl4aiPackage.PARTICIPANT__PARTICIPATION:
			setParticipation((ParticipationKind) newValue);
			return;
		case Dsl4aiPackage.PARTICIPANT__ROLE:
			setRole((Role) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Dsl4aiPackage.PARTICIPANT__PARTICIPATION:
			setParticipation(PARTICIPATION_EDEFAULT);
			return;
		case Dsl4aiPackage.PARTICIPANT__ROLE:
			setRole((Role) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Dsl4aiPackage.PARTICIPANT__PARTICIPATION:
			return participation != PARTICIPATION_EDEFAULT;
		case Dsl4aiPackage.PARTICIPANT__ROLE:
			return role != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (participation: ");
		result.append(participation);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
