/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Identification Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataIdentificationActivity#getIdentifies <em>Identifies</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataIdentificationActivity()
 * @model
 * @generated
 */
public interface DataIdentificationActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Identifies</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifies</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataIdentificationActivity_Identifies()
	 * @model
	 * @generated
	 */
	EList<DataSource> getIdentifies();

} // DataIdentificationActivity
