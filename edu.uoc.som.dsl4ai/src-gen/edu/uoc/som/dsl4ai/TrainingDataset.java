/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.TrainingDataset#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getTrainingDataset()
 * @model
 * @generated
 */
public interface TrainingDataset extends AIModelDataset {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getTrainingDataset_Data()
	 * @model required="true"
	 * @generated
	 */
	EList<Data> getData();

} // TrainingDataset
