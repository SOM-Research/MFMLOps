/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.SuccessCriterion#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.SuccessCriterion#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.SuccessCriterion#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.SuccessCriterion#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getSuccessCriterion()
 * @model abstract="true"
 * @generated
 */
public interface SuccessCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getSuccessCriterion_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getSuccessCriterion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseline</em>' attribute.
	 * @see #setBaseline(float)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getSuccessCriterion_Baseline()
	 * @model
	 * @generated
	 */
	float getBaseline();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getBaseline <em>Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline</em>' attribute.
	 * @see #getBaseline()
	 * @generated
	 */
	void setBaseline(float value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(float)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getSuccessCriterion_Target()
	 * @model
	 * @generated
	 */
	float getTarget();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(float value);

} // SuccessCriterion
