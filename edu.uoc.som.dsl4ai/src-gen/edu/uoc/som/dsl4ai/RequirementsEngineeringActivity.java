/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Engineering Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.RequirementsEngineeringActivity#getGoals <em>Goals</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.RequirementsEngineeringActivity#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getRequirementsEngineeringActivity()
 * @model
 * @generated
 */
public interface RequirementsEngineeringActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.BusinessGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getRequirementsEngineeringActivity_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessGoal> getGoals();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getRequirementsEngineeringActivity_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // RequirementsEngineeringActivity
