/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dsl4aiFactoryImpl extends EFactoryImpl implements Dsl4aiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dsl4aiFactory init() {
		try {
			Dsl4aiFactory theDsl4aiFactory = (Dsl4aiFactory) EPackage.Registry.INSTANCE
					.getEFactory(Dsl4aiPackage.eNS_URI);
			if (theDsl4aiFactory != null) {
				return theDsl4aiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dsl4aiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl4aiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Dsl4aiPackage.ACTIVITY:
			return createActivity();
		case Dsl4aiPackage.DOCUMENT:
			return createDocument();
		case Dsl4aiPackage.TEMPLATE:
			return createTemplate();
		case Dsl4aiPackage.PLATFORM:
			return createPlatform();
		case Dsl4aiPackage.SCRIPT:
			return createScript();
		case Dsl4aiPackage.GUIDELINE:
			return createGuideline();
		case Dsl4aiPackage.PARTICIPANT:
			return createParticipant();
		case Dsl4aiPackage.BUSINESS_UNDERSTANDING_ACTIVITY:
			return createBusinessUnderstandingActivity();
		case Dsl4aiPackage.REQUIREMENTS_ENGINEERING_ACTIVITY:
			return createRequirementsEngineeringActivity();
		case Dsl4aiPackage.DATA_IDENTIFICATION_ACTIVITY:
			return createDataIdentificationActivity();
		case Dsl4aiPackage.REQUIREMENT:
			return createRequirement();
		case Dsl4aiPackage.AI_MODEL_REQUIREMENT:
			return createAIModelRequirement();
		case Dsl4aiPackage.BUSINESS_GOAL:
			return createBusinessGoal();
		case Dsl4aiPackage.AI_MODEL_GOAL:
			return createAIModelGoal();
		case Dsl4aiPackage.BUSINESS_SUCCESS_CRITERION:
			return createBusinessSuccessCriterion();
		case Dsl4aiPackage.AI_MODEL_SUCCESS_CRITERION:
			return createAIModelSuccessCriterion();
		case Dsl4aiPackage.DATA_SOURCE:
			return createDataSource();
		case Dsl4aiPackage.DATA_SOURCE_REQUIREMENT:
			return createDataSourceRequirement();
		case Dsl4aiPackage.DATA_REQUIREMENT:
			return createDataRequirement();
		case Dsl4aiPackage.AI_ETHICAL_REQUIREMENT:
			return createAIEthicalRequirement();
		case Dsl4aiPackage.AI_MODEL_DEGRADATION:
			return createAIModelDegradation();
		case Dsl4aiPackage.METHOD:
			return createMethod();
		case Dsl4aiPackage.DATA_PREPARATION_ACTIVITY:
			return createDataPreparationActivity();
		case Dsl4aiPackage.DATA_COLLECTION_ACTIVITY:
			return createDataCollectionActivity();
		case Dsl4aiPackage.DATA_PROCESSING_ACTIVITY:
			return createDataProcessingActivity();
		case Dsl4aiPackage.DATA_ANNOTATION_GUIDELINE:
			return createDataAnnotationGuideline();
		case Dsl4aiPackage.LABEL:
			return createLabel();
		case Dsl4aiPackage.DATA:
			return createData();
		case Dsl4aiPackage.FEATURE_ENGINEERING_ACTIVITY:
			return createFeatureEngineeringActivity();
		case Dsl4aiPackage.FEATURE:
			return createFeature();
		case Dsl4aiPackage.DATA_ATTRIBUTE:
			return createDataAttribute();
		case Dsl4aiPackage.AI_MODELING_ACTIVITY:
			return createAIModelingActivity();
		case Dsl4aiPackage.AI_MODEL_TRAINING_ACTIVITY:
			return createAIModelTrainingActivity();
		case Dsl4aiPackage.AI_MODEL_EVALUATION_ACTIVITY:
			return createAIModelEvaluationActivity();
		case Dsl4aiPackage.TRAINING_DATASET:
			return createTrainingDataset();
		case Dsl4aiPackage.VALIDATION_DATASET:
			return createValidationDataset();
		case Dsl4aiPackage.TEST_DATASET:
			return createTestDataset();
		case Dsl4aiPackage.AI_MODEL:
			return createAIModel();
		case Dsl4aiPackage.CRITERION_VALUE:
			return createCriterionValue();
		case Dsl4aiPackage.HYPER_PARAMETER:
			return createHyperParameter();
		case Dsl4aiPackage.OPTIMAL_VALUE:
			return createOptimalValue();
		case Dsl4aiPackage.AI_MODEL_DATASET:
			return createAIModelDataset();
		case Dsl4aiPackage.OPERATIONS_ACTIVITY:
			return createOperationsActivity();
		case Dsl4aiPackage.AI_MODEL_DEPLOYMENT_ACTIVITY:
			return createAIModelDeploymentActivity();
		case Dsl4aiPackage.AI_MODEL_MONITORING_ACTIVITY:
			return createAIModelMonitoringActivity();
		case Dsl4aiPackage.DEPLOYED_AI_MODEL:
			return createDeployedAIModel();
		case Dsl4aiPackage.ISSUE:
			return createIssue();
		case Dsl4aiPackage.AI_MODEL_FLAW:
			return createAIModelFlaw();
		case Dsl4aiPackage.PERFORMANCE_METRIC:
			return createPerformanceMetric();
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE:
			return createDataCleaningTechnique();
		case Dsl4aiPackage.DATA_TRANSFORMATION_TECHNIQUE:
			return createDataTransformationTechnique();
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE:
			return createDataDiscretizationTechnique();
		case Dsl4aiPackage.DATA_REDUCTION_TECHNIQUE:
			return createDataReductionTechnique();
		case Dsl4aiPackage.DATA_INTEGRATION_TECHNIQUE:
			return createDataIntegrationTechnique();
		case Dsl4aiPackage.DATA_AUGMENTATION_TECHNIQUE:
			return createDataAugmentationTechnique();
		case Dsl4aiPackage.FEATURE_EXTRACTION_TECHNIQUE:
			return createFeatureExtractionTechnique();
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE:
			return createFeatureSelectionTechnique();
		case Dsl4aiPackage.GROUP_MANAGER:
			return createGroupManager();
		case Dsl4aiPackage.TEAM_LEAD:
			return createTeamLead();
		case Dsl4aiPackage.PROJECT_LEAD:
			return createProjectLead();
		case Dsl4aiPackage.DATA_CONSUMER:
			return createDataConsumer();
		case Dsl4aiPackage.BUSINESS_USER:
			return createBusinessUser();
		case Dsl4aiPackage.BUSINESS_ANALYST:
			return createBusinessAnalyst();
		case Dsl4aiPackage.DOMAIN_EXPERT:
			return createDomainExpert();
		case Dsl4aiPackage.DATA_SCIENTIST:
			return createDataScientist();
		case Dsl4aiPackage.DATA_ENGINEER:
			return createDataEngineer();
		case Dsl4aiPackage.DATA_STEWARD:
			return createDataSteward();
		case Dsl4aiPackage.DATA_PROVIDER:
			return createDataProvider();
		case Dsl4aiPackage.DATA_ANNOTATOR:
			return createDataAnnotator();
		case Dsl4aiPackage.ARCHITECT:
			return createArchitect();
		case Dsl4aiPackage.SOFTWARE_ENGINEER:
			return createSoftwareEngineer();
		case Dsl4aiPackage.MODEL_OPERATOR:
			return createModelOperator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Dsl4aiPackage.PARTICIPATION_KIND:
			return createParticipationKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.AI_ETHICS_KIND:
			return createAIEthicsKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.DEPLOYMENT_STRATEGY_KIND:
			return createDeploymentStrategyKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.DEPLOYMENT_PATTERN_KIND:
			return createDeploymentPatternKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.INFERENCE_MODE_KIND:
			return createInferenceModeKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE_KIND:
			return createDataCleaningTechniqueKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.DATA_TRANSFORMATION_TECHNIQUE_KIND:
			return createDataTransformationTechniqueKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE_KIND:
			return createDataDiscretizationTechniqueKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.DATA_REDUCTION_TECHNIQUE_KIND:
			return createDataReductionTechniqueKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.FEATURE_EXTRACTION_TECHNIQUE_KIND:
			return createFeatureExtractionTechniqueKindFromString(eDataType, initialValue);
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE_KIND:
			return createFeatureSelectionTechniqueKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Dsl4aiPackage.PARTICIPATION_KIND:
			return convertParticipationKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.AI_ETHICS_KIND:
			return convertAIEthicsKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.DEPLOYMENT_STRATEGY_KIND:
			return convertDeploymentStrategyKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.DEPLOYMENT_PATTERN_KIND:
			return convertDeploymentPatternKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.INFERENCE_MODE_KIND:
			return convertInferenceModeKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.DATA_CLEANING_TECHNIQUE_KIND:
			return convertDataCleaningTechniqueKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.DATA_TRANSFORMATION_TECHNIQUE_KIND:
			return convertDataTransformationTechniqueKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.DATA_DISCRETIZATION_TECHNIQUE_KIND:
			return convertDataDiscretizationTechniqueKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.DATA_REDUCTION_TECHNIQUE_KIND:
			return convertDataReductionTechniqueKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.FEATURE_EXTRACTION_TECHNIQUE_KIND:
			return convertFeatureExtractionTechniqueKindToString(eDataType, instanceValue);
		case Dsl4aiPackage.FEATURE_SELECTION_TECHNIQUE_KIND:
			return convertFeatureSelectionTechniqueKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guideline createGuideline() {
		GuidelineImpl guideline = new GuidelineImpl();
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessUnderstandingActivity createBusinessUnderstandingActivity() {
		BusinessUnderstandingActivityImpl businessUnderstandingActivity = new BusinessUnderstandingActivityImpl();
		return businessUnderstandingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsEngineeringActivity createRequirementsEngineeringActivity() {
		RequirementsEngineeringActivityImpl requirementsEngineeringActivity = new RequirementsEngineeringActivityImpl();
		return requirementsEngineeringActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataIdentificationActivity createDataIdentificationActivity() {
		DataIdentificationActivityImpl dataIdentificationActivity = new DataIdentificationActivityImpl();
		return dataIdentificationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelRequirement createAIModelRequirement() {
		AIModelRequirementImpl aiModelRequirement = new AIModelRequirementImpl();
		return aiModelRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessGoal createBusinessGoal() {
		BusinessGoalImpl businessGoal = new BusinessGoalImpl();
		return businessGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelGoal createAIModelGoal() {
		AIModelGoalImpl aiModelGoal = new AIModelGoalImpl();
		return aiModelGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessSuccessCriterion createBusinessSuccessCriterion() {
		BusinessSuccessCriterionImpl businessSuccessCriterion = new BusinessSuccessCriterionImpl();
		return businessSuccessCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelSuccessCriterion createAIModelSuccessCriterion() {
		AIModelSuccessCriterionImpl aiModelSuccessCriterion = new AIModelSuccessCriterionImpl();
		return aiModelSuccessCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSourceRequirement createDataSourceRequirement() {
		DataSourceRequirementImpl dataSourceRequirement = new DataSourceRequirementImpl();
		return dataSourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement createDataRequirement() {
		DataRequirementImpl dataRequirement = new DataRequirementImpl();
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIEthicalRequirement createAIEthicalRequirement() {
		AIEthicalRequirementImpl aiEthicalRequirement = new AIEthicalRequirementImpl();
		return aiEthicalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelDegradation createAIModelDegradation() {
		AIModelDegradationImpl aiModelDegradation = new AIModelDegradationImpl();
		return aiModelDegradation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPreparationActivity createDataPreparationActivity() {
		DataPreparationActivityImpl dataPreparationActivity = new DataPreparationActivityImpl();
		return dataPreparationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollectionActivity createDataCollectionActivity() {
		DataCollectionActivityImpl dataCollectionActivity = new DataCollectionActivityImpl();
		return dataCollectionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProcessingActivity createDataProcessingActivity() {
		DataProcessingActivityImpl dataProcessingActivity = new DataProcessingActivityImpl();
		return dataProcessingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAnnotationGuideline createDataAnnotationGuideline() {
		DataAnnotationGuidelineImpl dataAnnotationGuideline = new DataAnnotationGuidelineImpl();
		return dataAnnotationGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureEngineeringActivity createFeatureEngineeringActivity() {
		FeatureEngineeringActivityImpl featureEngineeringActivity = new FeatureEngineeringActivityImpl();
		return featureEngineeringActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAttribute createDataAttribute() {
		DataAttributeImpl dataAttribute = new DataAttributeImpl();
		return dataAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelingActivity createAIModelingActivity() {
		AIModelingActivityImpl aiModelingActivity = new AIModelingActivityImpl();
		return aiModelingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelTrainingActivity createAIModelTrainingActivity() {
		AIModelTrainingActivityImpl aiModelTrainingActivity = new AIModelTrainingActivityImpl();
		return aiModelTrainingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelEvaluationActivity createAIModelEvaluationActivity() {
		AIModelEvaluationActivityImpl aiModelEvaluationActivity = new AIModelEvaluationActivityImpl();
		return aiModelEvaluationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingDataset createTrainingDataset() {
		TrainingDatasetImpl trainingDataset = new TrainingDatasetImpl();
		return trainingDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationDataset createValidationDataset() {
		ValidationDatasetImpl validationDataset = new ValidationDatasetImpl();
		return validationDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestDataset createTestDataset() {
		TestDatasetImpl testDataset = new TestDatasetImpl();
		return testDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModel createAIModel() {
		AIModelImpl aiModel = new AIModelImpl();
		return aiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CriterionValue createCriterionValue() {
		CriterionValueImpl criterionValue = new CriterionValueImpl();
		return criterionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HyperParameter createHyperParameter() {
		HyperParameterImpl hyperParameter = new HyperParameterImpl();
		return hyperParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimalValue createOptimalValue() {
		OptimalValueImpl optimalValue = new OptimalValueImpl();
		return optimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelDataset createAIModelDataset() {
		AIModelDatasetImpl aiModelDataset = new AIModelDatasetImpl();
		return aiModelDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationsActivity createOperationsActivity() {
		OperationsActivityImpl operationsActivity = new OperationsActivityImpl();
		return operationsActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelDeploymentActivity createAIModelDeploymentActivity() {
		AIModelDeploymentActivityImpl aiModelDeploymentActivity = new AIModelDeploymentActivityImpl();
		return aiModelDeploymentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelMonitoringActivity createAIModelMonitoringActivity() {
		AIModelMonitoringActivityImpl aiModelMonitoringActivity = new AIModelMonitoringActivityImpl();
		return aiModelMonitoringActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedAIModel createDeployedAIModel() {
		DeployedAIModelImpl deployedAIModel = new DeployedAIModelImpl();
		return deployedAIModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIModelFlaw createAIModelFlaw() {
		AIModelFlawImpl aiModelFlaw = new AIModelFlawImpl();
		return aiModelFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMetric createPerformanceMetric() {
		PerformanceMetricImpl performanceMetric = new PerformanceMetricImpl();
		return performanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCleaningTechnique createDataCleaningTechnique() {
		DataCleaningTechniqueImpl dataCleaningTechnique = new DataCleaningTechniqueImpl();
		return dataCleaningTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransformationTechnique createDataTransformationTechnique() {
		DataTransformationTechniqueImpl dataTransformationTechnique = new DataTransformationTechniqueImpl();
		return dataTransformationTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDiscretizationTechnique createDataDiscretizationTechnique() {
		DataDiscretizationTechniqueImpl dataDiscretizationTechnique = new DataDiscretizationTechniqueImpl();
		return dataDiscretizationTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataReductionTechnique createDataReductionTechnique() {
		DataReductionTechniqueImpl dataReductionTechnique = new DataReductionTechniqueImpl();
		return dataReductionTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataIntegrationTechnique createDataIntegrationTechnique() {
		DataIntegrationTechniqueImpl dataIntegrationTechnique = new DataIntegrationTechniqueImpl();
		return dataIntegrationTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAugmentationTechnique createDataAugmentationTechnique() {
		DataAugmentationTechniqueImpl dataAugmentationTechnique = new DataAugmentationTechniqueImpl();
		return dataAugmentationTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureExtractionTechnique createFeatureExtractionTechnique() {
		FeatureExtractionTechniqueImpl featureExtractionTechnique = new FeatureExtractionTechniqueImpl();
		return featureExtractionTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureSelectionTechnique createFeatureSelectionTechnique() {
		FeatureSelectionTechniqueImpl featureSelectionTechnique = new FeatureSelectionTechniqueImpl();
		return featureSelectionTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupManager createGroupManager() {
		GroupManagerImpl groupManager = new GroupManagerImpl();
		return groupManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeamLead createTeamLead() {
		TeamLeadImpl teamLead = new TeamLeadImpl();
		return teamLead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectLead createProjectLead() {
		ProjectLeadImpl projectLead = new ProjectLeadImpl();
		return projectLead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataConsumer createDataConsumer() {
		DataConsumerImpl dataConsumer = new DataConsumerImpl();
		return dataConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessUser createBusinessUser() {
		BusinessUserImpl businessUser = new BusinessUserImpl();
		return businessUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessAnalyst createBusinessAnalyst() {
		BusinessAnalystImpl businessAnalyst = new BusinessAnalystImpl();
		return businessAnalyst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainExpert createDomainExpert() {
		DomainExpertImpl domainExpert = new DomainExpertImpl();
		return domainExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataScientist createDataScientist() {
		DataScientistImpl dataScientist = new DataScientistImpl();
		return dataScientist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataEngineer createDataEngineer() {
		DataEngineerImpl dataEngineer = new DataEngineerImpl();
		return dataEngineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSteward createDataSteward() {
		DataStewardImpl dataSteward = new DataStewardImpl();
		return dataSteward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProvider createDataProvider() {
		DataProviderImpl dataProvider = new DataProviderImpl();
		return dataProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAnnotator createDataAnnotator() {
		DataAnnotatorImpl dataAnnotator = new DataAnnotatorImpl();
		return dataAnnotator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architect createArchitect() {
		ArchitectImpl architect = new ArchitectImpl();
		return architect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareEngineer createSoftwareEngineer() {
		SoftwareEngineerImpl softwareEngineer = new SoftwareEngineerImpl();
		return softwareEngineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelOperator createModelOperator() {
		ModelOperatorImpl modelOperator = new ModelOperatorImpl();
		return modelOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationKind createParticipationKindFromString(EDataType eDataType, String initialValue) {
		ParticipationKind result = ParticipationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIEthicsKind createAIEthicsKindFromString(EDataType eDataType, String initialValue) {
		AIEthicsKind result = AIEthicsKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAIEthicsKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStrategyKind createDeploymentStrategyKindFromString(EDataType eDataType, String initialValue) {
		DeploymentStrategyKind result = DeploymentStrategyKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentStrategyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentPatternKind createDeploymentPatternKindFromString(EDataType eDataType, String initialValue) {
		DeploymentPatternKind result = DeploymentPatternKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentPatternKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceModeKind createInferenceModeKindFromString(EDataType eDataType, String initialValue) {
		InferenceModeKind result = InferenceModeKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInferenceModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCleaningTechniqueKind createDataCleaningTechniqueKindFromString(EDataType eDataType,
			String initialValue) {
		DataCleaningTechniqueKind result = DataCleaningTechniqueKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataCleaningTechniqueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransformationTechniqueKind createDataTransformationTechniqueKindFromString(EDataType eDataType,
			String initialValue) {
		DataTransformationTechniqueKind result = DataTransformationTechniqueKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTransformationTechniqueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDiscretizationTechniqueKind createDataDiscretizationTechniqueKindFromString(EDataType eDataType,
			String initialValue) {
		DataDiscretizationTechniqueKind result = DataDiscretizationTechniqueKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataDiscretizationTechniqueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReductionTechniqueKind createDataReductionTechniqueKindFromString(EDataType eDataType,
			String initialValue) {
		DataReductionTechniqueKind result = DataReductionTechniqueKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataReductionTechniqueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureExtractionTechniqueKind createFeatureExtractionTechniqueKindFromString(EDataType eDataType,
			String initialValue) {
		FeatureExtractionTechniqueKind result = FeatureExtractionTechniqueKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureExtractionTechniqueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSelectionTechniqueKind createFeatureSelectionTechniqueKindFromString(EDataType eDataType,
			String initialValue) {
		FeatureSelectionTechniqueKind result = FeatureSelectionTechniqueKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureSelectionTechniqueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dsl4aiPackage getDsl4aiPackage() {
		return (Dsl4aiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dsl4aiPackage getPackage() {
		return Dsl4aiPackage.eINSTANCE;
	}

} //Dsl4aiFactoryImpl
