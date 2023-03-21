/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.PerformanceMetric#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.PerformanceMetric#getMinThreshold <em>Min Threshold</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.PerformanceMetric#getMaxThreshold <em>Max Threshold</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.PerformanceMetric#getEnsures <em>Ensures</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getPerformanceMetric()
 * @model
 * @generated
 */
public interface PerformanceMetric extends AIModelObservation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getPerformanceMetric_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Threshold</em>' attribute.
	 * @see #setMinThreshold(float)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getPerformanceMetric_MinThreshold()
	 * @model
	 * @generated
	 */
	float getMinThreshold();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getMinThreshold <em>Min Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Threshold</em>' attribute.
	 * @see #getMinThreshold()
	 * @generated
	 */
	void setMinThreshold(float value);

	/**
	 * Returns the value of the '<em><b>Max Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Threshold</em>' attribute.
	 * @see #setMaxThreshold(float)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getPerformanceMetric_MaxThreshold()
	 * @model
	 * @generated
	 */
	float getMaxThreshold();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getMaxThreshold <em>Max Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Threshold</em>' attribute.
	 * @see #getMaxThreshold()
	 * @generated
	 */
	void setMaxThreshold(float value);

	/**
	 * Returns the value of the '<em><b>Ensures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensures</em>' reference.
	 * @see #setEnsures(AIModelSuccessCriterion)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getPerformanceMetric_Ensures()
	 * @model required="true"
	 * @generated
	 */
	AIModelSuccessCriterion getEnsures();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getEnsures <em>Ensures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ensures</em>' reference.
	 * @see #getEnsures()
	 * @generated
	 */
	void setEnsures(AIModelSuccessCriterion value);

} // PerformanceMetric
