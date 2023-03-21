/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Deployment Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelDeploymentActivity#getDeploys <em>Deploys</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelDeploymentActivity()
 * @model
 * @generated
 */
public interface AIModelDeploymentActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Deploys</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.AIModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploys</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelDeploymentActivity_Deploys()
	 * @model
	 * @generated
	 */
	EList<AIModel> getDeploys();

} // AIModelDeploymentActivity
