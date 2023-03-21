/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.Data;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.Feature;
import edu.uoc.som.dsl4ai.FeatureEngineeringActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Engineering Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.FeatureEngineeringActivityImpl#getExtractsFrom <em>Extracts From</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.FeatureEngineeringActivityImpl#getCreates <em>Creates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureEngineeringActivityImpl extends ActivityImpl implements FeatureEngineeringActivity {
	/**
	 * The cached value of the '{@link #getExtractsFrom() <em>Extracts From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractsFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> extractsFrom;

	/**
	 * The cached value of the '{@link #getCreates() <em>Creates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreates()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> creates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureEngineeringActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.FEATURE_ENGINEERING_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getExtractsFrom() {
		if (extractsFrom == null) {
			extractsFrom = new EObjectResolvingEList<Data>(Data.class, this,
					Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM);
		}
		return extractsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getCreates() {
		if (creates == null) {
			creates = new EObjectContainmentEList<Feature>(Feature.class, this,
					Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__CREATES);
		}
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__CREATES:
			return ((InternalEList<?>) getCreates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM:
			return getExtractsFrom();
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__CREATES:
			return getCreates();
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
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM:
			getExtractsFrom().clear();
			getExtractsFrom().addAll((Collection<? extends Data>) newValue);
			return;
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__CREATES:
			getCreates().clear();
			getCreates().addAll((Collection<? extends Feature>) newValue);
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
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM:
			getExtractsFrom().clear();
			return;
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__CREATES:
			getCreates().clear();
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
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM:
			return extractsFrom != null && !extractsFrom.isEmpty();
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY__CREATES:
			return creates != null && !creates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureEngineeringActivityImpl
