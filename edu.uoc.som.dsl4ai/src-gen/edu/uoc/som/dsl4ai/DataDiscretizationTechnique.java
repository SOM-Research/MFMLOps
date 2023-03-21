/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Discretization Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DataDiscretizationTechnique#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataDiscretizationTechnique()
 * @model
 * @generated
 */
public interface DataDiscretizationTechnique extends DataEngineeringTechnique {
	/**
	 * Returns the value of the '<em><b>Technique Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind
	 * @see #setTechniqueKind(DataDiscretizationTechniqueKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataDiscretizationTechnique_TechniqueKind()
	 * @model
	 * @generated
	 */
	DataDiscretizationTechniqueKind getTechniqueKind();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechnique#getTechniqueKind <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind
	 * @see #getTechniqueKind()
	 * @generated
	 */
	void setTechniqueKind(DataDiscretizationTechniqueKind value);

} // DataDiscretizationTechnique
