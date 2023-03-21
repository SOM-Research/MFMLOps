/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Cleaning Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataCleaningTechnique#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataCleaningTechnique()
 * @model
 * @generated
 */
public interface DataCleaningTechnique extends DataEngineeringTechnique {
	/**
	 * Returns the value of the '<em><b>Technique Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.DataCleaningTechniqueKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechniqueKind
	 * @see #setTechniqueKind(DataCleaningTechniqueKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataCleaningTechnique_TechniqueKind()
	 * @model
	 * @generated
	 */
	DataCleaningTechniqueKind getTechniqueKind();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataCleaningTechnique#getTechniqueKind <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechniqueKind
	 * @see #getTechniqueKind()
	 * @generated
	 */
	void setTechniqueKind(DataCleaningTechniqueKind value);

} // DataCleaningTechnique
