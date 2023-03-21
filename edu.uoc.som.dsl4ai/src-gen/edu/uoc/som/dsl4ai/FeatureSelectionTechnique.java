/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Selection Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.FeatureSelectionTechnique#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureSelectionTechnique()
 * @model
 * @generated
 */
public interface FeatureSelectionTechnique extends FeatureEngineeringTechnique {
	/**
	 * Returns the value of the '<em><b>Technique Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind
	 * @see #setTechniqueKind(FeatureSelectionTechniqueKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureSelectionTechnique_TechniqueKind()
	 * @model
	 * @generated
	 */
	FeatureSelectionTechniqueKind getTechniqueKind();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechnique#getTechniqueKind <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind
	 * @see #getTechniqueKind()
	 * @generated
	 */
	void setTechniqueKind(FeatureSelectionTechniqueKind value);

} // FeatureSelectionTechnique
