/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.DataIdentificationActivity;
import edu.uoc.som.dsl4ai.DataSource;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Identification Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataIdentificationActivityImpl#getIdentifies <em>Identifies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataIdentificationActivityImpl extends ActivityImpl implements DataIdentificationActivity {
	/**
	 * The cached value of the '{@link #getIdentifies() <em>Identifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifies()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> identifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataIdentificationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DATA_IDENTIFICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getIdentifies() {
		if (identifies == null) {
			identifies = new EObjectResolvingEList<DataSource>(DataSource.class, this,
					Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES);
		}
		return identifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES:
			return getIdentifies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES:
			getIdentifies().clear();
			getIdentifies().addAll((Collection<? extends DataSource>) newValue);
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
		case Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES:
			getIdentifies().clear();
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
		case Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES:
			return identifies != null && !identifies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataIdentificationActivityImpl
