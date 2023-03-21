/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIModelObservation;
import edu.uoc.som.dsl4ai.DeployedAIModel;
import edu.uoc.som.dsl4ai.DeploymentPatternKind;
import edu.uoc.som.dsl4ai.DeploymentStrategyKind;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.InferenceModeKind;
import edu.uoc.som.dsl4ai.Platform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed AI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl#getInference <em>Inference</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl#getApi <em>Api</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl#getObservations <em>Observations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedAIModelImpl extends MinimalEObjectImpl.Container implements DeployedAIModel {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected Platform platform;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentPatternKind PATTERN_EDEFAULT = DeploymentPatternKind.STATICALLY;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected DeploymentPatternKind pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentStrategyKind STRATEGY_EDEFAULT = DeploymentStrategyKind.SINGLE_DEPLOYMENT;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStrategyKind strategy = STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInference() <em>Inference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInference()
	 * @generated
	 * @ordered
	 */
	protected static final InferenceModeKind INFERENCE_EDEFAULT = InferenceModeKind.BATCH;

	/**
	 * The cached value of the '{@link #getInference() <em>Inference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInference()
	 * @generated
	 * @ordered
	 */
	protected InferenceModeKind inference = INFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected static final String API_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected String api = API_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<AIModelObservation> observations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedAIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.DEPLOYED_AI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Platform getPlatform() {
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject) platform;
			platform = (Platform) eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.DEPLOYED_AI_MODEL__PLATFORM,
							oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform basicGetPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatform(Platform newPlatform) {
		Platform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DEPLOYED_AI_MODEL__PLATFORM,
					oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentPatternKind getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(DeploymentPatternKind newPattern) {
		DeploymentPatternKind oldPattern = pattern;
		pattern = newPattern == null ? PATTERN_EDEFAULT : newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DEPLOYED_AI_MODEL__PATTERN, oldPattern,
					pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentStrategyKind getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(DeploymentStrategyKind newStrategy) {
		DeploymentStrategyKind oldStrategy = strategy;
		strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DEPLOYED_AI_MODEL__STRATEGY,
					oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InferenceModeKind getInference() {
		return inference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInference(InferenceModeKind newInference) {
		InferenceModeKind oldInference = inference;
		inference = newInference == null ? INFERENCE_EDEFAULT : newInference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DEPLOYED_AI_MODEL__INFERENCE,
					oldInference, inference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApi(String newApi) {
		String oldApi = api;
		api = newApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.DEPLOYED_AI_MODEL__API, oldApi, api));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AIModelObservation> getObservations() {
		if (observations == null) {
			observations = new EObjectResolvingEList<AIModelObservation>(AIModelObservation.class, this,
					Dsl4aiPackage.DEPLOYED_AI_MODEL__OBSERVATIONS);
		}
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PLATFORM:
			if (resolve)
				return getPlatform();
			return basicGetPlatform();
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PATTERN:
			return getPattern();
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__STRATEGY:
			return getStrategy();
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__INFERENCE:
			return getInference();
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__API:
			return getApi();
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__OBSERVATIONS:
			return getObservations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PLATFORM:
			setPlatform((Platform) newValue);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PATTERN:
			setPattern((DeploymentPatternKind) newValue);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__STRATEGY:
			setStrategy((DeploymentStrategyKind) newValue);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__INFERENCE:
			setInference((InferenceModeKind) newValue);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__API:
			setApi((String) newValue);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__OBSERVATIONS:
			getObservations().clear();
			getObservations().addAll((Collection<? extends AIModelObservation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PLATFORM:
			setPlatform((Platform) null);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PATTERN:
			setPattern(PATTERN_EDEFAULT);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__STRATEGY:
			setStrategy(STRATEGY_EDEFAULT);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__INFERENCE:
			setInference(INFERENCE_EDEFAULT);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__API:
			setApi(API_EDEFAULT);
			return;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__OBSERVATIONS:
			getObservations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PLATFORM:
			return platform != null;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__PATTERN:
			return pattern != PATTERN_EDEFAULT;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__STRATEGY:
			return strategy != STRATEGY_EDEFAULT;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__INFERENCE:
			return inference != INFERENCE_EDEFAULT;
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__API:
			return API_EDEFAULT == null ? api != null : !API_EDEFAULT.equals(api);
		case Dsl4aiPackage.DEPLOYED_AI_MODEL__OBSERVATIONS:
			return observations != null && !observations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", strategy: ");
		result.append(strategy);
		result.append(", inference: ");
		result.append(inference);
		result.append(", api: ");
		result.append(api);
		result.append(')');
		return result.toString();
	}

} //DeployedAIModelImpl
