/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.BusinessGoal;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.Requirement;
import edu.uoc.som.dsl4ai.RequirementsEngineeringActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Engineering Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.RequirementsEngineeringActivityImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.RequirementsEngineeringActivityImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsEngineeringActivityImpl extends ActivityImpl implements RequirementsEngineeringActivity {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessGoal> goals;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsEngineeringActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.REQUIREMENTS_ENGINEERING_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessGoal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<BusinessGoal>(BusinessGoal.class, this,
					Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this,
					Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS:
			return ((InternalEList<?>) getGoals()).basicRemove(otherEnd, msgs);
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS:
			return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
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
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS:
			return getGoals();
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS:
			return getRequirements();
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
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS:
			getGoals().clear();
			getGoals().addAll((Collection<? extends BusinessGoal>) newValue);
			return;
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS:
			getRequirements().clear();
			getRequirements().addAll((Collection<? extends Requirement>) newValue);
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
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS:
			getGoals().clear();
			return;
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS:
			getRequirements().clear();
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
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS:
			return goals != null && !goals.isEmpty();
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS:
			return requirements != null && !requirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsEngineeringActivityImpl
