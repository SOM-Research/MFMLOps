/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.DataSource;
import edu.uoc.som.dsl4ai.DataSourceRequirement;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataSourceImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataSourceImpl#isIsSelected <em>Is Selected</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DataSourceImpl#getCompliesWith <em>Complies With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceImpl extends ResourceImpl implements DataSource {
	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelected = IS_SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompliesWith() <em>Complies With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliesWith()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceRequirement> compliesWith;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DATA_SOURCE__IS_EXTERNAL, oldIsExternal,
					isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSelected() {
		return isSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSelected(boolean newIsSelected) {
		boolean oldIsSelected = isSelected;
		isSelected = newIsSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DATA_SOURCE__IS_SELECTED, oldIsSelected,
					isSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSourceRequirement> getCompliesWith() {
		if (compliesWith == null) {
			compliesWith = new EObjectResolvingEList<DataSourceRequirement>(DataSourceRequirement.class, this,
					Dsl4aiPackage.DATA_SOURCE__COMPLIES_WITH);
		}
		return compliesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.DATA_SOURCE__IS_EXTERNAL:
			return isIsExternal();
		case Dsl4aiPackage.DATA_SOURCE__IS_SELECTED:
			return isIsSelected();
		case Dsl4aiPackage.DATA_SOURCE__COMPLIES_WITH:
			return getCompliesWith();
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
		case Dsl4aiPackage.DATA_SOURCE__IS_EXTERNAL:
			setIsExternal((Boolean) newValue);
			return;
		case Dsl4aiPackage.DATA_SOURCE__IS_SELECTED:
			setIsSelected((Boolean) newValue);
			return;
		case Dsl4aiPackage.DATA_SOURCE__COMPLIES_WITH:
			getCompliesWith().clear();
			getCompliesWith().addAll((Collection<? extends DataSourceRequirement>) newValue);
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
		case Dsl4aiPackage.DATA_SOURCE__IS_EXTERNAL:
			setIsExternal(IS_EXTERNAL_EDEFAULT);
			return;
		case Dsl4aiPackage.DATA_SOURCE__IS_SELECTED:
			setIsSelected(IS_SELECTED_EDEFAULT);
			return;
		case Dsl4aiPackage.DATA_SOURCE__COMPLIES_WITH:
			getCompliesWith().clear();
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
		case Dsl4aiPackage.DATA_SOURCE__IS_EXTERNAL:
			return isExternal != IS_EXTERNAL_EDEFAULT;
		case Dsl4aiPackage.DATA_SOURCE__IS_SELECTED:
			return isSelected != IS_SELECTED_EDEFAULT;
		case Dsl4aiPackage.DATA_SOURCE__COMPLIES_WITH:
			return compliesWith != null && !compliesWith.isEmpty();
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
		result.append(" (isExternal: ");
		result.append(isExternal);
		result.append(", isSelected: ");
		result.append(isSelected);
		result.append(')');
		return result.toString();
	}

} //DataSourceImpl
