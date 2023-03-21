/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.DataDiscretizationTechnique;
import edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Discretization Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataDiscretizationTechniqueImpl#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDiscretizationTechniqueImpl extends DataEngineeringTechniqueImpl
		implements DataDiscretizationTechnique {
	/**
	 * The default value of the '{@link #getTechniqueKind() <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniqueKind()
	 * @generated
	 * @ordered
	 */
	protected static final DataDiscretizationTechniqueKind TECHNIQUE_KIND_EDEFAULT = DataDiscretizationTechniqueKind.EQUAL_WIDTH_BINNING;

	/**
	 * The cached value of the '{@link #getTechniqueKind() <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniqueKind()
	 * @generated
	 * @ordered
	 */
	protected DataDiscretizationTechniqueKind techniqueKind = TECHNIQUE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDiscretizationTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DATA_DISCRETIZATION_TECHNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDiscretizationTechniqueKind getTechniqueKind() {
		return techniqueKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechniqueKind(DataDiscretizationTechniqueKind newTechniqueKind) {
		DataDiscretizationTechniqueKind oldTechniqueKind = techniqueKind;
		techniqueKind = newTechniqueKind == null ? TECHNIQUE_KIND_EDEFAULT : newTechniqueKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND, oldTechniqueKind, techniqueKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND:
			return getTechniqueKind();
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
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND:
			setTechniqueKind((DataDiscretizationTechniqueKind) newValue);
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
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND:
			setTechniqueKind(TECHNIQUE_KIND_EDEFAULT);
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
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND:
			return techniqueKind != TECHNIQUE_KIND_EDEFAULT;
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
		result.append(" (techniqueKind: ");
		result.append(techniqueKind);
		result.append(')');
		return result.toString();
	}

} //DataDiscretizationTechniqueImpl
