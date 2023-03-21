/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Model Monitoring Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.AIModelMonitoringActivity#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelMonitoringActivity()
 * @model
 * @generated
 */
public interface AIModelMonitoringActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.DeployedAIModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIModelMonitoringActivity_Monitors()
	 * @model
	 * @generated
	 */
	EList<DeployedAIModel> getMonitors();

} // AIModelMonitoringActivity
