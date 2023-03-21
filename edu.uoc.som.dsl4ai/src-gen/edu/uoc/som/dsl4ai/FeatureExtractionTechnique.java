/**
 */
package edu.uoc.som.dsl4ai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Extraction Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.FeatureExtractionTechnique#getTechniqueKind <em>Technique Kind</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureExtractionTechnique()
 * @model
 * @generated
 */
public interface FeatureExtractionTechnique extends FeatureEngineeringTechnique {
	/**
	 * Returns the value of the '<em><b>Technique Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind
	 * @see #setTechniqueKind(FeatureExtractionTechniqueKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureExtractionTechnique_TechniqueKind()
	 * @model
	 * @generated
	 */
	FeatureExtractionTechniqueKind getTechniqueKind();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechnique#getTechniqueKind <em>Technique Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique Kind</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind
	 * @see #getTechniqueKind()
	 * @generated
	 */
	void setTechniqueKind(FeatureExtractionTechniqueKind value);

} // FeatureExtractionTechnique
