/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collection Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataCollectionActivity#getCollects <em>Collects</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DataCollectionActivity#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataCollectionActivity()
 * @model
 * @generated
 */
public interface DataCollectionActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Collects</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collects</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataCollectionActivity_Collects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getCollects();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataCollectionActivity_Sources()
	 * @model
	 * @generated
	 */
	EList<DataSource> getSources();

} // DataCollectionActivity
