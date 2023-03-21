/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Engineering Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.FeatureEngineeringActivity#getExtractsFrom <em>Extracts From</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.FeatureEngineeringActivity#getCreates <em>Creates</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureEngineeringActivity()
 * @model
 * @generated
 */
public interface FeatureEngineeringActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Extracts From</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extracts From</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureEngineeringActivity_ExtractsFrom()
	 * @model
	 * @generated
	 */
	EList<Data> getExtractsFrom();

	/**
	 * Returns the value of the '<em><b>Creates</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureEngineeringActivity_Creates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getCreates();

} // FeatureEngineeringActivity
