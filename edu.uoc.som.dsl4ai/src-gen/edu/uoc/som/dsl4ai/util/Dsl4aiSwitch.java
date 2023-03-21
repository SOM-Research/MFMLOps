/**
 */
package edu.uoc.som.dsl4ai.util;

import edu.uoc.som.dsl4ai.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage
 * @generated
 */
public class Dsl4aiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dsl4aiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl4aiSwitch() {
		if (modelPackage == null) {
			modelPackage = Dsl4aiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Dsl4aiPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.LOCATED_ELEMENT: {
			LocatedElement locatedElement = (LocatedElement) theEObject;
			T result = caseLocatedElement(locatedElement);
			if (result == null)
				result = caseNamedElement(locatedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.RESOURCE: {
			Resource resource = (Resource) theEObject;
			T result = caseResource(resource);
			if (result == null)
				result = caseLocatedElement(resource);
			if (result == null)
				result = caseNamedElement(resource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.ARTIFACT: {
			Artifact artifact = (Artifact) theEObject;
			T result = caseArtifact(artifact);
			if (result == null)
				result = caseLocatedElement(artifact);
			if (result == null)
				result = caseNamedElement(artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DOCUMENT: {
			Document document = (Document) theEObject;
			T result = caseDocument(document);
			if (result == null)
				result = caseArtifact(document);
			if (result == null)
				result = caseLocatedElement(document);
			if (result == null)
				result = caseNamedElement(document);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.TEMPLATE: {
			Template template = (Template) theEObject;
			T result = caseTemplate(template);
			if (result == null)
				result = caseResource(template);
			if (result == null)
				result = caseLocatedElement(template);
			if (result == null)
				result = caseNamedElement(template);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.EXECUTABLE: {
			Executable executable = (Executable) theEObject;
			T result = caseExecutable(executable);
			if (result == null)
				result = caseResource(executable);
			if (result == null)
				result = caseLocatedElement(executable);
			if (result == null)
				result = caseNamedElement(executable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.PLATFORM: {
			Platform platform = (Platform) theEObject;
			T result = casePlatform(platform);
			if (result == null)
				result = caseExecutable(platform);
			if (result == null)
				result = caseResource(platform);
			if (result == null)
				result = caseLocatedElement(platform);
			if (result == null)
				result = caseNamedElement(platform);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.SCRIPT: {
			Script script = (Script) theEObject;
			T result = caseScript(script);
			if (result == null)
				result = caseExecutable(script);
			if (result == null)
				result = caseResource(script);
			if (result == null)
				result = caseLocatedElement(script);
			if (result == null)
				result = caseNamedElement(script);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.GUIDELINE: {
			Guideline guideline = (Guideline) theEObject;
			T result = caseGuideline(guideline);
			if (result == null)
				result = caseResource(guideline);
			if (result == null)
				result = caseLocatedElement(guideline);
			if (result == null)
				result = caseNamedElement(guideline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.TECHNIQUE: {
			Technique technique = (Technique) theEObject;
			T result = caseTechnique(technique);
			if (result == null)
				result = caseResource(technique);
			if (result == null)
				result = caseLocatedElement(technique);
			if (result == null)
				result = caseNamedElement(technique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.PARTICIPANT: {
			Participant participant = (Participant) theEObject;
			T result = caseParticipant(participant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.BUSINESS_UNDERSTANDING_ACTIVITY: {
			BusinessUnderstandingActivity businessUnderstandingActivity = (BusinessUnderstandingActivity) theEObject;
			T result = caseBusinessUnderstandingActivity(businessUnderstandingActivity);
			if (result == null)
				result = caseActivity(businessUnderstandingActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY: {
			RequirementsEngineeringActivity requirementsEngineeringActivity = (RequirementsEngineeringActivity) theEObject;
			T result = caseRequirementsEngineeringActivity(requirementsEngineeringActivity);
			if (result == null)
				result = caseActivity(requirementsEngineeringActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY: {
			DataIdentificationActivity dataIdentificationActivity = (DataIdentificationActivity) theEObject;
			T result = caseDataIdentificationActivity(dataIdentificationActivity);
			if (result == null)
				result = caseActivity(dataIdentificationActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.REQUIREMENT: {
			Requirement requirement = (Requirement) theEObject;
			T result = caseRequirement(requirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_REQUIREMENT: {
			AIModelRequirement aiModelRequirement = (AIModelRequirement) theEObject;
			T result = caseAIModelRequirement(aiModelRequirement);
			if (result == null)
				result = caseRequirement(aiModelRequirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.BUSINESS_GOAL: {
			BusinessGoal businessGoal = (BusinessGoal) theEObject;
			T result = caseBusinessGoal(businessGoal);
			if (result == null)
				result = caseGoal(businessGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_GOAL: {
			AIModelGoal aiModelGoal = (AIModelGoal) theEObject;
			T result = caseAIModelGoal(aiModelGoal);
			if (result == null)
				result = caseGoal(aiModelGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.BUSINESS_SUCCESS_CRITERION: {
			BusinessSuccessCriterion businessSuccessCriterion = (BusinessSuccessCriterion) theEObject;
			T result = caseBusinessSuccessCriterion(businessSuccessCriterion);
			if (result == null)
				result = caseSuccessCriterion(businessSuccessCriterion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION: {
			AIModelSuccessCriterion aiModelSuccessCriterion = (AIModelSuccessCriterion) theEObject;
			T result = caseAIModelSuccessCriterion(aiModelSuccessCriterion);
			if (result == null)
				result = caseSuccessCriterion(aiModelSuccessCriterion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.GOAL: {
			Goal goal = (Goal) theEObject;
			T result = caseGoal(goal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.SUCCESS_CRITERION: {
			SuccessCriterion successCriterion = (SuccessCriterion) theEObject;
			T result = caseSuccessCriterion(successCriterion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_SOURCE: {
			DataSource dataSource = (DataSource) theEObject;
			T result = caseDataSource(dataSource);
			if (result == null)
				result = caseResource(dataSource);
			if (result == null)
				result = caseLocatedElement(dataSource);
			if (result == null)
				result = caseNamedElement(dataSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_SOURCE_REQUIREMENT: {
			DataSourceRequirement dataSourceRequirement = (DataSourceRequirement) theEObject;
			T result = caseDataSourceRequirement(dataSourceRequirement);
			if (result == null)
				result = caseRequirement(dataSourceRequirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_REQUIREMENT: {
			DataRequirement dataRequirement = (DataRequirement) theEObject;
			T result = caseDataRequirement(dataRequirement);
			if (result == null)
				result = caseRequirement(dataRequirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_ETHICAL_REQUIREMENT: {
			AIEthicalRequirement aiEthicalRequirement = (AIEthicalRequirement) theEObject;
			T result = caseAIEthicalRequirement(aiEthicalRequirement);
			if (result == null)
				result = caseAIModelRequirement(aiEthicalRequirement);
			if (result == null)
				result = caseRequirement(aiEthicalRequirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_DEGRADATION: {
			AIModelDegradation aiModelDegradation = (AIModelDegradation) theEObject;
			T result = caseAIModelDegradation(aiModelDegradation);
			if (result == null)
				result = caseAIModelRequirement(aiModelDegradation);
			if (result == null)
				result = caseRequirement(aiModelDegradation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.METHOD: {
			Method method = (Method) theEObject;
			T result = caseMethod(method);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY: {
			DataPreparationActivity dataPreparationActivity = (DataPreparationActivity) theEObject;
			T result = caseDataPreparationActivity(dataPreparationActivity);
			if (result == null)
				result = caseActivity(dataPreparationActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY: {
			DataCollectionActivity dataCollectionActivity = (DataCollectionActivity) theEObject;
			T result = caseDataCollectionActivity(dataCollectionActivity);
			if (result == null)
				result = caseActivity(dataCollectionActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_PROCESSING_ACTIVITY: {
			DataProcessingActivity dataProcessingActivity = (DataProcessingActivity) theEObject;
			T result = caseDataProcessingActivity(dataProcessingActivity);
			if (result == null)
				result = caseActivity(dataProcessingActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_ENGINEERING_TECHNIQUE: {
			DataEngineeringTechnique dataEngineeringTechnique = (DataEngineeringTechnique) theEObject;
			T result = caseDataEngineeringTechnique(dataEngineeringTechnique);
			if (result == null)
				result = caseTechnique(dataEngineeringTechnique);
			if (result == null)
				result = caseResource(dataEngineeringTechnique);
			if (result == null)
				result = caseLocatedElement(dataEngineeringTechnique);
			if (result == null)
				result = caseNamedElement(dataEngineeringTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_ANNOTATION_GUIDELINE: {
			DataAnnotationGuideline dataAnnotationGuideline = (DataAnnotationGuideline) theEObject;
			T result = caseDataAnnotationGuideline(dataAnnotationGuideline);
			if (result == null)
				result = caseGuideline(dataAnnotationGuideline);
			if (result == null)
				result = caseResource(dataAnnotationGuideline);
			if (result == null)
				result = caseLocatedElement(dataAnnotationGuideline);
			if (result == null)
				result = caseNamedElement(dataAnnotationGuideline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = caseArtifact(data);
			if (result == null)
				result = caseLocatedElement(data);
			if (result == null)
				result = caseNamedElement(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.FEATURE_ENGINEERING_TECHNIQUE: {
			FeatureEngineeringTechnique featureEngineeringTechnique = (FeatureEngineeringTechnique) theEObject;
			T result = caseFeatureEngineeringTechnique(featureEngineeringTechnique);
			if (result == null)
				result = caseTechnique(featureEngineeringTechnique);
			if (result == null)
				result = caseResource(featureEngineeringTechnique);
			if (result == null)
				result = caseLocatedElement(featureEngineeringTechnique);
			if (result == null)
				result = caseNamedElement(featureEngineeringTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY: {
			FeatureEngineeringActivity featureEngineeringActivity = (FeatureEngineeringActivity) theEObject;
			T result = caseFeatureEngineeringActivity(featureEngineeringActivity);
			if (result == null)
				result = caseActivity(featureEngineeringActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_ATTRIBUTE: {
			DataAttribute dataAttribute = (DataAttribute) theEObject;
			T result = caseDataAttribute(dataAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODELING_ACTIVITY: {
			AIModelingActivity aiModelingActivity = (AIModelingActivity) theEObject;
			T result = caseAIModelingActivity(aiModelingActivity);
			if (result == null)
				result = caseActivity(aiModelingActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY: {
			AIModelTrainingActivity aiModelTrainingActivity = (AIModelTrainingActivity) theEObject;
			T result = caseAIModelTrainingActivity(aiModelTrainingActivity);
			if (result == null)
				result = caseActivity(aiModelTrainingActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODELING_TECHNIQUE: {
			AIModelingTechnique aiModelingTechnique = (AIModelingTechnique) theEObject;
			T result = caseAIModelingTechnique(aiModelingTechnique);
			if (result == null)
				result = caseTechnique(aiModelingTechnique);
			if (result == null)
				result = caseResource(aiModelingTechnique);
			if (result == null)
				result = caseLocatedElement(aiModelingTechnique);
			if (result == null)
				result = caseNamedElement(aiModelingTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY: {
			AIModelEvaluationActivity aiModelEvaluationActivity = (AIModelEvaluationActivity) theEObject;
			T result = caseAIModelEvaluationActivity(aiModelEvaluationActivity);
			if (result == null)
				result = caseActivity(aiModelEvaluationActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.TRAINING_DATASET: {
			TrainingDataset trainingDataset = (TrainingDataset) theEObject;
			T result = caseTrainingDataset(trainingDataset);
			if (result == null)
				result = caseAIModelDataset(trainingDataset);
			if (result == null)
				result = caseArtifact(trainingDataset);
			if (result == null)
				result = caseLocatedElement(trainingDataset);
			if (result == null)
				result = caseNamedElement(trainingDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.VALIDATION_DATASET: {
			ValidationDataset validationDataset = (ValidationDataset) theEObject;
			T result = caseValidationDataset(validationDataset);
			if (result == null)
				result = caseAIModelDataset(validationDataset);
			if (result == null)
				result = caseArtifact(validationDataset);
			if (result == null)
				result = caseLocatedElement(validationDataset);
			if (result == null)
				result = caseNamedElement(validationDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.TEST_DATASET: {
			TestDataset testDataset = (TestDataset) theEObject;
			T result = caseTestDataset(testDataset);
			if (result == null)
				result = caseAIModelDataset(testDataset);
			if (result == null)
				result = caseArtifact(testDataset);
			if (result == null)
				result = caseLocatedElement(testDataset);
			if (result == null)
				result = caseNamedElement(testDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL: {
			AIModel aiModel = (AIModel) theEObject;
			T result = caseAIModel(aiModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.CRITERION_VALUE: {
			CriterionValue criterionValue = (CriterionValue) theEObject;
			T result = caseCriterionValue(criterionValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.HYPER_PARAMETER: {
			HyperParameter hyperParameter = (HyperParameter) theEObject;
			T result = caseHyperParameter(hyperParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.OPTIMAL_VALUE: {
			OptimalValue optimalValue = (OptimalValue) theEObject;
			T result = caseOptimalValue(optimalValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_DATASET: {
			AIModelDataset aiModelDataset = (AIModelDataset) theEObject;
			T result = caseAIModelDataset(aiModelDataset);
			if (result == null)
				result = caseArtifact(aiModelDataset);
			if (result == null)
				result = caseLocatedElement(aiModelDataset);
			if (result == null)
				result = caseNamedElement(aiModelDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.OPERATIONS_ACTIVITY: {
			OperationsActivity operationsActivity = (OperationsActivity) theEObject;
			T result = caseOperationsActivity(operationsActivity);
			if (result == null)
				result = caseActivity(operationsActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY: {
			AIModelDeploymentActivity aiModelDeploymentActivity = (AIModelDeploymentActivity) theEObject;
			T result = caseAIModelDeploymentActivity(aiModelDeploymentActivity);
			if (result == null)
				result = caseActivity(aiModelDeploymentActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY: {
			AIModelMonitoringActivity aiModelMonitoringActivity = (AIModelMonitoringActivity) theEObject;
			T result = caseAIModelMonitoringActivity(aiModelMonitoringActivity);
			if (result == null)
				result = caseActivity(aiModelMonitoringActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DEPLOYED_AI_MODEL: {
			DeployedAIModel deployedAIModel = (DeployedAIModel) theEObject;
			T result = caseDeployedAIModel(deployedAIModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_OBSERVATION: {
			AIModelObservation aiModelObservation = (AIModelObservation) theEObject;
			T result = caseAIModelObservation(aiModelObservation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.ISSUE: {
			Issue issue = (Issue) theEObject;
			T result = caseIssue(issue);
			if (result == null)
				result = caseAIModelObservation(issue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_FLAW: {
			AIModelFlaw aiModelFlaw = (AIModelFlaw) theEObject;
			T result = caseAIModelFlaw(aiModelFlaw);
			if (result == null)
				result = caseAIModelObservation(aiModelFlaw);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.PERFORMANCE_METRIC: {
			PerformanceMetric performanceMetric = (PerformanceMetric) theEObject;
			T result = casePerformanceMetric(performanceMetric);
			if (result == null)
				result = caseAIModelObservation(performanceMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE: {
			DataCleaningTechnique dataCleaningTechnique = (DataCleaningTechnique) theEObject;
			T result = caseDataCleaningTechnique(dataCleaningTechnique);
			if (result == null)
				result = caseDataEngineeringTechnique(dataCleaningTechnique);
			if (result == null)
				result = caseTechnique(dataCleaningTechnique);
			if (result == null)
				result = caseResource(dataCleaningTechnique);
			if (result == null)
				result = caseLocatedElement(dataCleaningTechnique);
			if (result == null)
				result = caseNamedElement(dataCleaningTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_TRANSFORMATION_TECHNIQUE: {
			DataTransformationTechnique dataTransformationTechnique = (DataTransformationTechnique) theEObject;
			T result = caseDataTransformationTechnique(dataTransformationTechnique);
			if (result == null)
				result = caseDataEngineeringTechnique(dataTransformationTechnique);
			if (result == null)
				result = caseTechnique(dataTransformationTechnique);
			if (result == null)
				result = caseResource(dataTransformationTechnique);
			if (result == null)
				result = caseLocatedElement(dataTransformationTechnique);
			if (result == null)
				result = caseNamedElement(dataTransformationTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE: {
			DataDiscretizationTechnique dataDiscretizationTechnique = (DataDiscretizationTechnique) theEObject;
			T result = caseDataDiscretizationTechnique(dataDiscretizationTechnique);
			if (result == null)
				result = caseDataEngineeringTechnique(dataDiscretizationTechnique);
			if (result == null)
				result = caseTechnique(dataDiscretizationTechnique);
			if (result == null)
				result = caseResource(dataDiscretizationTechnique);
			if (result == null)
				result = caseLocatedElement(dataDiscretizationTechnique);
			if (result == null)
				result = caseNamedElement(dataDiscretizationTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_REDUCTION_TECHNIQUE: {
			DataReductionTechnique dataReductionTechnique = (DataReductionTechnique) theEObject;
			T result = caseDataReductionTechnique(dataReductionTechnique);
			if (result == null)
				result = caseDataEngineeringTechnique(dataReductionTechnique);
			if (result == null)
				result = caseTechnique(dataReductionTechnique);
			if (result == null)
				result = caseResource(dataReductionTechnique);
			if (result == null)
				result = caseLocatedElement(dataReductionTechnique);
			if (result == null)
				result = caseNamedElement(dataReductionTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_INTEGRATION_TECHNIQUE: {
			DataIntegrationTechnique dataIntegrationTechnique = (DataIntegrationTechnique) theEObject;
			T result = caseDataIntegrationTechnique(dataIntegrationTechnique);
			if (result == null)
				result = caseDataEngineeringTechnique(dataIntegrationTechnique);
			if (result == null)
				result = caseTechnique(dataIntegrationTechnique);
			if (result == null)
				result = caseResource(dataIntegrationTechnique);
			if (result == null)
				result = caseLocatedElement(dataIntegrationTechnique);
			if (result == null)
				result = caseNamedElement(dataIntegrationTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_AUGMENTATION_TECHNIQUE: {
			DataAugmentationTechnique dataAugmentationTechnique = (DataAugmentationTechnique) theEObject;
			T result = caseDataAugmentationTechnique(dataAugmentationTechnique);
			if (result == null)
				result = caseDataEngineeringTechnique(dataAugmentationTechnique);
			if (result == null)
				result = caseTechnique(dataAugmentationTechnique);
			if (result == null)
				result = caseResource(dataAugmentationTechnique);
			if (result == null)
				result = caseLocatedElement(dataAugmentationTechnique);
			if (result == null)
				result = caseNamedElement(dataAugmentationTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.FEATURE_EXTRACTION_TECHNIQUE: {
			FeatureExtractionTechnique featureExtractionTechnique = (FeatureExtractionTechnique) theEObject;
			T result = caseFeatureExtractionTechnique(featureExtractionTechnique);
			if (result == null)
				result = caseFeatureEngineeringTechnique(featureExtractionTechnique);
			if (result == null)
				result = caseTechnique(featureExtractionTechnique);
			if (result == null)
				result = caseResource(featureExtractionTechnique);
			if (result == null)
				result = caseLocatedElement(featureExtractionTechnique);
			if (result == null)
				result = caseNamedElement(featureExtractionTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE: {
			FeatureSelectionTechnique featureSelectionTechnique = (FeatureSelectionTechnique) theEObject;
			T result = caseFeatureSelectionTechnique(featureSelectionTechnique);
			if (result == null)
				result = caseFeatureEngineeringTechnique(featureSelectionTechnique);
			if (result == null)
				result = caseTechnique(featureSelectionTechnique);
			if (result == null)
				result = caseResource(featureSelectionTechnique);
			if (result == null)
				result = caseLocatedElement(featureSelectionTechnique);
			if (result == null)
				result = caseNamedElement(featureSelectionTechnique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.MANAGEMENT_ROLE: {
			ManagementRole managementRole = (ManagementRole) theEObject;
			T result = caseManagementRole(managementRole);
			if (result == null)
				result = caseRole(managementRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DOMAIN_ROLE: {
			DomainRole domainRole = (DomainRole) theEObject;
			T result = caseDomainRole(domainRole);
			if (result == null)
				result = caseRole(domainRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_ROLE: {
			DataRole dataRole = (DataRole) theEObject;
			T result = caseDataRole(dataRole);
			if (result == null)
				result = caseRole(dataRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.AI_MODEL_SERVING_ROLE: {
			AIModelServingRole aiModelServingRole = (AIModelServingRole) theEObject;
			T result = caseAIModelServingRole(aiModelServingRole);
			if (result == null)
				result = caseRole(aiModelServingRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.GROUP_MANAGER: {
			GroupManager groupManager = (GroupManager) theEObject;
			T result = caseGroupManager(groupManager);
			if (result == null)
				result = caseManagementRole(groupManager);
			if (result == null)
				result = caseRole(groupManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.TEAM_LEAD: {
			TeamLead teamLead = (TeamLead) theEObject;
			T result = caseTeamLead(teamLead);
			if (result == null)
				result = caseManagementRole(teamLead);
			if (result == null)
				result = caseRole(teamLead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.PROJECT_LEAD: {
			ProjectLead projectLead = (ProjectLead) theEObject;
			T result = caseProjectLead(projectLead);
			if (result == null)
				result = caseManagementRole(projectLead);
			if (result == null)
				result = caseRole(projectLead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_CONSUMER: {
			DataConsumer dataConsumer = (DataConsumer) theEObject;
			T result = caseDataConsumer(dataConsumer);
			if (result == null)
				result = caseDomainRole(dataConsumer);
			if (result == null)
				result = caseRole(dataConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.BUSINESS_USER: {
			BusinessUser businessUser = (BusinessUser) theEObject;
			T result = caseBusinessUser(businessUser);
			if (result == null)
				result = caseDomainRole(businessUser);
			if (result == null)
				result = caseRole(businessUser);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.BUSINESS_ANALYST: {
			BusinessAnalyst businessAnalyst = (BusinessAnalyst) theEObject;
			T result = caseBusinessAnalyst(businessAnalyst);
			if (result == null)
				result = caseDomainRole(businessAnalyst);
			if (result == null)
				result = caseRole(businessAnalyst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DOMAIN_EXPERT: {
			DomainExpert domainExpert = (DomainExpert) theEObject;
			T result = caseDomainExpert(domainExpert);
			if (result == null)
				result = caseBusinessUser(domainExpert);
			if (result == null)
				result = caseDomainRole(domainExpert);
			if (result == null)
				result = caseRole(domainExpert);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_SCIENTIST: {
			DataScientist dataScientist = (DataScientist) theEObject;
			T result = caseDataScientist(dataScientist);
			if (result == null)
				result = caseDataRole(dataScientist);
			if (result == null)
				result = caseRole(dataScientist);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_ENGINEER: {
			DataEngineer dataEngineer = (DataEngineer) theEObject;
			T result = caseDataEngineer(dataEngineer);
			if (result == null)
				result = caseDataRole(dataEngineer);
			if (result == null)
				result = caseRole(dataEngineer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_STEWARD: {
			DataSteward dataSteward = (DataSteward) theEObject;
			T result = caseDataSteward(dataSteward);
			if (result == null)
				result = caseDataEngineer(dataSteward);
			if (result == null)
				result = caseDataRole(dataSteward);
			if (result == null)
				result = caseRole(dataSteward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_PROVIDER: {
			DataProvider dataProvider = (DataProvider) theEObject;
			T result = caseDataProvider(dataProvider);
			if (result == null)
				result = caseDataEngineer(dataProvider);
			if (result == null)
				result = caseDataRole(dataProvider);
			if (result == null)
				result = caseRole(dataProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.DATA_ANNOTATOR: {
			DataAnnotator dataAnnotator = (DataAnnotator) theEObject;
			T result = caseDataAnnotator(dataAnnotator);
			if (result == null)
				result = caseDataEngineer(dataAnnotator);
			if (result == null)
				result = caseDataRole(dataAnnotator);
			if (result == null)
				result = caseRole(dataAnnotator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.ARCHITECT: {
			Architect architect = (Architect) theEObject;
			T result = caseArchitect(architect);
			if (result == null)
				result = caseAIModelServingRole(architect);
			if (result == null)
				result = caseRole(architect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.SOFTWARE_ENGINEER: {
			SoftwareEngineer softwareEngineer = (SoftwareEngineer) theEObject;
			T result = caseSoftwareEngineer(softwareEngineer);
			if (result == null)
				result = caseAIModelServingRole(softwareEngineer);
			if (result == null)
				result = caseRole(softwareEngineer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Dsl4aiPackage.MODEL_OPERATOR: {
			ModelOperator modelOperator = (ModelOperator) theEObject;
			T result = caseModelOperator(modelOperator);
			if (result == null)
				result = caseAIModelServingRole(modelOperator);
			if (result == null)
				result = caseRole(modelOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutable(Executable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guideline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideline(Guideline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnique(Technique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Understanding Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Understanding Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessUnderstandingActivity(BusinessUnderstandingActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Engineering Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Engineering Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsEngineeringActivity(RequirementsEngineeringActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Identification Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Identification Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIdentificationActivity(DataIdentificationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelRequirement(AIModelRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessGoal(BusinessGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelGoal(AIModelGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Success Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Success Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessSuccessCriterion(BusinessSuccessCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Success Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Success Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelSuccessCriterion(AIModelSuccessCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessCriterion(SuccessCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceRequirement(DataSourceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirement(DataRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Ethical Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Ethical Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIEthicalRequirement(AIEthicalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Degradation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Degradation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelDegradation(AIModelDegradation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Preparation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Preparation Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPreparationActivity(DataPreparationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Collection Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Collection Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCollectionActivity(DataCollectionActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Processing Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Processing Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProcessingActivity(DataProcessingActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Engineering Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Engineering Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEngineeringTechnique(DataEngineeringTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Annotation Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Annotation Guideline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAnnotationGuideline(DataAnnotationGuideline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Engineering Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Engineering Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureEngineeringTechnique(FeatureEngineeringTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Engineering Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Engineering Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureEngineeringActivity(FeatureEngineeringActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAttribute(DataAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Modeling Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Modeling Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelingActivity(AIModelingActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Training Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Training Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelTrainingActivity(AIModelTrainingActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Modeling Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Modeling Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelingTechnique(AIModelingTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Evaluation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Evaluation Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelEvaluationActivity(AIModelEvaluationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Training Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Training Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainingDataset(TrainingDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationDataset(ValidationDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestDataset(TestDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModel(AIModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterionValue(CriterionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperParameter(HyperParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimalValue(OptimalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelDataset(AIModelDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationsActivity(OperationsActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Deployment Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Deployment Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelDeploymentActivity(AIModelDeploymentActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Monitoring Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Monitoring Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelMonitoringActivity(AIModelMonitoringActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed AI Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedAIModel(DeployedAIModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelObservation(AIModelObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Flaw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelFlaw(AIModelFlaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceMetric(PerformanceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Cleaning Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Cleaning Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCleaningTechnique(DataCleaningTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transformation Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transformation Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransformationTechnique(DataTransformationTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Discretization Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Discretization Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDiscretizationTechnique(DataDiscretizationTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Reduction Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Reduction Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReductionTechnique(DataReductionTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Integration Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Integration Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIntegrationTechnique(DataIntegrationTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Augmentation Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Augmentation Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAugmentationTechnique(DataAugmentationTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Extraction Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Extraction Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureExtractionTechnique(FeatureExtractionTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Selection Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Selection Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSelectionTechnique(FeatureSelectionTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementRole(ManagementRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainRole(DomainRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRole(DataRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Model Serving Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Model Serving Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIModelServingRole(AIModelServingRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupManager(GroupManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Lead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Lead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamLead(TeamLead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Lead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Lead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectLead(ProjectLead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConsumer(DataConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessUser(BusinessUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Analyst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Analyst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessAnalyst(BusinessAnalyst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainExpert(DomainExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Scientist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Scientist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataScientist(DataScientist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEngineer(DataEngineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Steward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Steward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSteward(DataSteward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProvider(DataProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Annotator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Annotator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAnnotator(DataAnnotator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitect(Architect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareEngineer(SoftwareEngineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelOperator(ModelOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Dsl4aiSwitch
