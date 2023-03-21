/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Feature#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Feature#getFrom <em>From</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Feature#getCorrelatedTo <em>Correlated To</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Feature#getName <em>Name</em>}' attribute.
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
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.DataAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeature_From()
	 * @model required="true"
	 * @generated
	 */
	EList<DataAttribute> getFrom();

	/**
	 * Returns the value of the '<em><b>Correlated To</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlated To</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeature_CorrelatedTo()
	 * @model
	 * @generated
	 */
	EList<Feature> getCorrelatedTo();

} // Feature
