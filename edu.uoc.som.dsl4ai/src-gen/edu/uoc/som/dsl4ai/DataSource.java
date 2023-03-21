/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataSource#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DataSource#isIsSelected <em>Is Selected</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DataSource#getCompliesWith <em>Complies With</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends Resource {
	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataSource_IsExternal()
	 * @model
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataSource#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Selected</em>' attribute.
	 * @see #setIsSelected(boolean)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataSource_IsSelected()
	 * @model
	 * @generated
	 */
	boolean isIsSelected();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataSource#isIsSelected <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Selected</em>' attribute.
	 * @see #isIsSelected()
	 * @generated
	 */
	void setIsSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Complies With</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.DataSourceRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complies With</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataSource_CompliesWith()
	 * @model
	 * @generated
	 */
	EList<DataSourceRequirement> getCompliesWith();

} // DataSource
