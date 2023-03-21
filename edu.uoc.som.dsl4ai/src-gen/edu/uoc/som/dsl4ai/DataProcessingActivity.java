/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Processing Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataProcessingActivity#getLabels <em>Labels</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DataProcessingActivity#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataProcessingActivity()
 * @model
 * @generated
 */
public interface DataProcessingActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataProcessingActivity_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataProcessingActivity_Processes()
	 * @model
	 * @generated
	 */
	EList<Data> getProcesses();

} // DataProcessingActivity
