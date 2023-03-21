/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed AI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.DeployedAIModel#getPlatform <em>Platform</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DeployedAIModel#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DeployedAIModel#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DeployedAIModel#getInference <em>Inference</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DeployedAIModel#getApi <em>Api</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.DeployedAIModel#getObservations <em>Observations</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel()
 * @model
 * @generated
 */
public interface DeployedAIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference.
	 * @see #setPlatform(Platform)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel_Platform()
	 * @model
	 * @generated
	 */
	Platform getPlatform();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getPlatform <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(Platform value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.DeploymentPatternKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DeploymentPatternKind
	 * @see #setPattern(DeploymentPatternKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel_Pattern()
	 * @model
	 * @generated
	 */
	DeploymentPatternKind getPattern();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DeploymentPatternKind
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(DeploymentPatternKind value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.DeploymentStrategyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DeploymentStrategyKind
	 * @see #setStrategy(DeploymentStrategyKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel_Strategy()
	 * @model
	 * @generated
	 */
	DeploymentStrategyKind getStrategy();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.DeploymentStrategyKind
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(DeploymentStrategyKind value);

	/**
	 * Returns the value of the '<em><b>Inference</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.dsl4ai.InferenceModeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inference</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.InferenceModeKind
	 * @see #setInference(InferenceModeKind)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel_Inference()
	 * @model
	 * @generated
	 */
	InferenceModeKind getInference();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getInference <em>Inference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inference</em>' attribute.
	 * @see edu.uoc.som.dsl4ai.InferenceModeKind
	 * @see #getInference()
	 * @generated
	 */
	void setInference(InferenceModeKind value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' attribute.
	 * @see #setApi(String)
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel_Api()
	 * @model
	 * @generated
	 */
	String getApi();

	/**
	 * Sets the value of the '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getApi <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' attribute.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(String value);

	/**
	 * Returns the value of the '<em><b>Observations</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.dsl4ai.AIModelObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' reference list.
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeployedAIModel_Observations()
	 * @model
	 * @generated
	 */
	EList<AIModelObservation> getObservations();

} // DeployedAIModel
