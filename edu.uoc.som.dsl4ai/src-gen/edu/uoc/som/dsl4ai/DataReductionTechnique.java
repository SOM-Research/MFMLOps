/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Reduction Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataReductionTechnique#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataReductionTechnique()
 * @model
 * @generated
 */
public interface DataReductionTechnique extends DataEngineeringTechnique {
	/**
	 * Returns the value of the '<em><b>Technique Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.DataReductionTechniqueKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DataReductionTechniqueKind
	 * @see #setTechniqueKind(DataReductionTechniqueKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataReductionTechnique_TechniqueKind()
	 * @model
	 * @generated
	 */
	DataReductionTechniqueKind getTechniqueKind();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataReductionTechnique#getTechniqueKind <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DataReductionTechniqueKind
	 * @see #getTechniqueKind()
	 * @generated
	 */
	void setTechniqueKind(DataReductionTechniqueKind value);

} // DataReductionTechnique
