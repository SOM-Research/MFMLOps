/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.HyperParameter#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.HyperParameter#getOptimalValues <em>Optimal Values</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getHyperParameter()
 * @model
 * @generated
 */
public interface HyperParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getHyperParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.HyperParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Optimal Values</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.OptimalValue}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.dsl4ai.OptimalValue#getHyperparameter <em>Hyperparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimal Values</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getHyperParameter_OptimalValues()
	 * @see edu.uoc.som.dsl4ai.OptimalValue#getHyperparameter
	 * @model opposite="hyperparameter"
	 * @generated
	 */
	EList<OptimalValue> getOptimalValues();

} // HyperParameter
