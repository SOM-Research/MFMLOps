/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.DataCleaningTechnique;
import edu.uoc.som.dsl4ai.DataCleaningTechniqueKind;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Cleaning Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataCleaningTechniqueImpl#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCleaningTechniqueImpl extends DataEngineeringTechniqueImpl implements DataCleaningTechnique {
	/**
	 * The default value of the '{@link #getTechniqueKind() <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniqueKind()
	 * @generated
	 * @ordered
	 */
	protected static final DataCleaningTechniqueKind TECHNIQUE_KIND_EDEFAULT = DataCleaningTechniqueKind.DELETION;

	/**
	 * The cached value of the '{@link #getTechniqueKind() <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniqueKind()
	 * @generated
	 * @ordered
	 */
	protected DataCleaningTechniqueKind techniqueKind = TECHNIQUE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCleaningTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DATA_CLEANING_TECHNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCleaningTechniqueKind getTechniqueKind() {
		return techniqueKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechniqueKind(DataCleaningTechniqueKind newTechniqueKind) {
		DataCleaningTechniqueKind oldTechniqueKind = techniqueKind;
		techniqueKind = newTechniqueKind == null ? TECHNIQUE_KIND_EDEFAULT : newTechniqueKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND,
					oldTechniqueKind, techniqueKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND:
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
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND:
			setTechniqueKind((DataCleaningTechniqueKind) newValue);
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
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND:
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
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND:
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

} //DataCleaningTechniqueImpl
