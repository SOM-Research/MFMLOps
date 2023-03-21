/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Modeling Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelingTechnique#getHyperparameters <em>Hyperparameters</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelingTechnique()
 * @model abstract="true"
 * @generated
 */
public interface AIModelingTechnique extends Technique {
	/**
	 * Returns the value of the '<em><b>Hyperparameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.HyperParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperparameters</em>' containment reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelingTechnique_Hyperparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<HyperParameter> getHyperparameters();

} // AIModelingTechnique
