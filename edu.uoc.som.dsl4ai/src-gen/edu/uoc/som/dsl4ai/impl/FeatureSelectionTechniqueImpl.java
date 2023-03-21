/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.FeatureSelectionTechnique;
import edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Selection Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.FeatureSelectionTechniqueImpl#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureSelectionTechniqueImpl extends FeatureEngineeringTechniqueImpl
		implements FeatureSelectionTechnique {
	/**
	 * The default value of the '{@link #getTechniqueKind() <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniqueKind()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureSelectionTechniqueKind TECHNIQUE_KIND_EDEFAULT = FeatureSelectionTechniqueKind.REGULARIZATION;

	/**
	 * The cached value of the '{@link #getTechniqueKind() <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniqueKind()
	 * @generated
	 * @ordered
	 */
	protected FeatureSelectionTechniqueKind techniqueKind = TECHNIQUE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSelectionTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.FEATURE_SELECTION_TECHNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureSelectionTechniqueKind getTechniqueKind() {
		return techniqueKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechniqueKind(FeatureSelectionTechniqueKind newTechniqueKind) {
		FeatureSelectionTechniqueKind oldTechniqueKind = techniqueKind;
		techniqueKind = newTechniqueKind == null ? TECHNIQUE_KIND_EDEFAULT : newTechniqueKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND, oldTechniqueKind, techniqueKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND:
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
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND:
			setTechniqueKind((FeatureSelectionTechniqueKind) newValue);
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
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND:
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
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND:
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

} //FeatureSelectionTechniqueImpl
