/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.Data;
import edu.uoc.som.dsl4ai.DataCollectionActivity;
import edu.uoc.som.dsl4ai.DataSource;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

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
 * An implementation of the model object '<em><b>Data Collection Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataCollectionActivityImpl#getCollects <em>Collects</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataCollectionActivityImpl#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCollectionActivityImpl extends ActivityImpl implements DataCollectionActivity {
	/**
	 * The cached value of the '{@link #getCollects() <em>Collects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollects()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> collects;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectionActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DATA_COLLECTION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getCollects() {
		if (collects == null) {
			collects = new EObjectContainmentEList<Data>(Data.class, this,
					Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__COLLECTS);
		}
		return collects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<DataSource>(DataSource.class, this,
					Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__COLLECTS:
			return ((InternalEList<?>) getCollects()).basicRemove(otherEnd, msgs);
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
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__COLLECTS:
			return getCollects();
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__SOURCES:
			return getSources();
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
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__COLLECTS:
			getCollects().clear();
			getCollects().addAll((Collection<? extends Data>) newValue);
			return;
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__SOURCES:
			getSources().clear();
			getSources().addAll((Collection<? extends DataSource>) newValue);
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
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__COLLECTS:
			getCollects().clear();
			return;
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__SOURCES:
			getSources().clear();
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
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__COLLECTS:
			return collects != null && !collects.isEmpty();
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY__SOURCES:
			return sources != null && !sources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataCollectionActivityImpl
