/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.Data#getLabels <em>Labels</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.Data#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Artifact {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getData_Labels()
	 * @model
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.DataAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getData_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataAttribute> getAttributes();

} // Data
