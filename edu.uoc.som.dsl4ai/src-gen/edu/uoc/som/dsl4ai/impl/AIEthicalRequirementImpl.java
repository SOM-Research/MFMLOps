/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIEthicalRequirement;
import edu.uoc.som.dsl4ai.AIEthicsKind;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Ethical Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.AIEthicalRequirementImpl#getEthic <em>Ethic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIEthicalRequirementImpl extends AIModelRequirementImpl implements AIEthicalRequirement {
	/**
	 * The default value of the '{@link #getEthic() <em>Ethic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthic()
	 * @generated
	 * @ordered
	 */
	protected static final AIEthicsKind ETHIC_EDEFAULT = AIEthicsKind.PRIVACY;

	/**
	 * The cached value of the '{@link #getEthic() <em>Ethic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthic()
	 * @generated
	 * @ordered
	 */
	protected AIEthicsKind ethic = ETHIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIEthicalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.AI_ETHICAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIEthicsKind getEthic() {
		return ethic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEthic(AIEthicsKind newEthic) {
		AIEthicsKind oldEthic = ethic;
		ethic = newEthic == null ? ETHIC_EDEFAULT : newEthic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.AI_ETHICAL_REQUIREMENT__ETHIC, oldEthic,
					ethic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.AI_ETHICAL_REQUIREMENT__ETHIC:
			return getEthic();
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
		case Dsl4aiPackage.AI_ETHICAL_REQUIREMENT__ETHIC:
			setEthic((AIEthicsKind) newValue);
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
		case Dsl4aiPackage.AI_ETHICAL_REQUIREMENT__ETHIC:
			setEthic(ETHIC_EDEFAULT);
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
		case Dsl4aiPackage.AI_ETHICAL_REQUIREMENT__ETHIC:
			return ethic != ETHIC_EDEFAULT;
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
		result.append(" (ethic: ");
		result.append(ethic);
		result.append(')');
		return result.toString();
	}

} //AIEthicalRequirementImpl
