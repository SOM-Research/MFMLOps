/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.BusinessGoal#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getBusinessGoal()
 * @model
 * @generated
 */
public interface BusinessGoal extends Goal {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.BusinessSuccessCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getBusinessGoal_Criteria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusinessSuccessCriterion> getCriteria();

} // BusinessGoal
