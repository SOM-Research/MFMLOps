/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage
 * @generated
 */
public interface Dsl4aiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dsl4aiFactory eINSTANCE = edu.uoc.som.dsl4ai.impl.Dsl4aiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guideline</em>'.
	 * @generated
	 */
	Guideline createGuideline();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Business Understanding Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Understanding Activity</em>'.
	 * @generated
	 */
	BusinessUnderstandingActivity createBusinessUnderstandingActivity();

	/**
	 * Returns a new object of class '<em>Requirements Engineering Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Engineering Activity</em>'.
	 * @generated
	 */
	RequirementsEngineeringActivity createRequirementsEngineeringActivity();

	/**
	 * Returns a new object of class '<em>Data Identification Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Identification Activity</em>'.
	 * @generated
	 */
	DataIdentificationActivity createDataIdentificationActivity();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>AI Model Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Requirement</em>'.
	 * @generated
	 */
	AIModelRequirement createAIModelRequirement();

	/**
	 * Returns a new object of class '<em>Business Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Goal</em>'.
	 * @generated
	 */
	BusinessGoal createBusinessGoal();

	/**
	 * Returns a new object of class '<em>AI Model Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Goal</em>'.
	 * @generated
	 */
	AIModelGoal createAIModelGoal();

	/**
	 * Returns a new object of class '<em>Business Success Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Success Criterion</em>'.
	 * @generated
	 */
	BusinessSuccessCriterion createBusinessSuccessCriterion();

	/**
	 * Returns a new object of class '<em>AI Model Success Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Success Criterion</em>'.
	 * @generated
	 */
	AIModelSuccessCriterion createAIModelSuccessCriterion();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Data Source Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Requirement</em>'.
	 * @generated
	 */
	DataSourceRequirement createDataSourceRequirement();

	/**
	 * Returns a new object of class '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement</em>'.
	 * @generated
	 */
	DataRequirement createDataRequirement();

	/**
	 * Returns a new object of class '<em>AI Ethical Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Ethical Requirement</em>'.
	 * @generated
	 */
	AIEthicalRequirement createAIEthicalRequirement();

	/**
	 * Returns a new object of class '<em>AI Model Degradation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Degradation</em>'.
	 * @generated
	 */
	AIModelDegradation createAIModelDegradation();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Data Preparation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Preparation Activity</em>'.
	 * @generated
	 */
	DataPreparationActivity createDataPreparationActivity();

	/**
	 * Returns a new object of class '<em>Data Collection Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Collection Activity</em>'.
	 * @generated
	 */
	DataCollectionActivity createDataCollectionActivity();

	/**
	 * Returns a new object of class '<em>Data Processing Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processing Activity</em>'.
	 * @generated
	 */
	DataProcessingActivity createDataProcessingActivity();

	/**
	 * Returns a new object of class '<em>Data Annotation Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Annotation Guideline</em>'.
	 * @generated
	 */
	DataAnnotationGuideline createDataAnnotationGuideline();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Feature Engineering Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Engineering Activity</em>'.
	 * @generated
	 */
	FeatureEngineeringActivity createFeatureEngineeringActivity();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Attribute</em>'.
	 * @generated
	 */
	DataAttribute createDataAttribute();

	/**
	 * Returns a new object of class '<em>AI Modeling Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Modeling Activity</em>'.
	 * @generated
	 */
	AIModelingActivity createAIModelingActivity();

	/**
	 * Returns a new object of class '<em>AI Model Training Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Training Activity</em>'.
	 * @generated
	 */
	AIModelTrainingActivity createAIModelTrainingActivity();

	/**
	 * Returns a new object of class '<em>AI Model Evaluation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Evaluation Activity</em>'.
	 * @generated
	 */
	AIModelEvaluationActivity createAIModelEvaluationActivity();

	/**
	 * Returns a new object of class '<em>Training Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training Dataset</em>'.
	 * @generated
	 */
	TrainingDataset createTrainingDataset();

	/**
	 * Returns a new object of class '<em>Validation Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Dataset</em>'.
	 * @generated
	 */
	ValidationDataset createValidationDataset();

	/**
	 * Returns a new object of class '<em>Test Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Dataset</em>'.
	 * @generated
	 */
	TestDataset createTestDataset();

	/**
	 * Returns a new object of class '<em>AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model</em>'.
	 * @generated
	 */
	AIModel createAIModel();

	/**
	 * Returns a new object of class '<em>Criterion Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion Value</em>'.
	 * @generated
	 */
	CriterionValue createCriterionValue();

	/**
	 * Returns a new object of class '<em>Hyper Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyper Parameter</em>'.
	 * @generated
	 */
	HyperParameter createHyperParameter();

	/**
	 * Returns a new object of class '<em>Optimal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimal Value</em>'.
	 * @generated
	 */
	OptimalValue createOptimalValue();

	/**
	 * Returns a new object of class '<em>AI Model Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Dataset</em>'.
	 * @generated
	 */
	AIModelDataset createAIModelDataset();

	/**
	 * Returns a new object of class '<em>Operations Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operations Activity</em>'.
	 * @generated
	 */
	OperationsActivity createOperationsActivity();

	/**
	 * Returns a new object of class '<em>AI Model Deployment Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Deployment Activity</em>'.
	 * @generated
	 */
	AIModelDeploymentActivity createAIModelDeploymentActivity();

	/**
	 * Returns a new object of class '<em>AI Model Monitoring Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Monitoring Activity</em>'.
	 * @generated
	 */
	AIModelMonitoringActivity createAIModelMonitoringActivity();

	/**
	 * Returns a new object of class '<em>Deployed AI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed AI Model</em>'.
	 * @generated
	 */
	DeployedAIModel createDeployedAIModel();

	/**
	 * Returns a new object of class '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue</em>'.
	 * @generated
	 */
	Issue createIssue();

	/**
	 * Returns a new object of class '<em>AI Model Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Model Flaw</em>'.
	 * @generated
	 */
	AIModelFlaw createAIModelFlaw();

	/**
	 * Returns a new object of class '<em>Performance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Metric</em>'.
	 * @generated
	 */
	PerformanceMetric createPerformanceMetric();

	/**
	 * Returns a new object of class '<em>Data Cleaning Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Cleaning Technique</em>'.
	 * @generated
	 */
	DataCleaningTechnique createDataCleaningTechnique();

	/**
	 * Returns a new object of class '<em>Data Transformation Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Transformation Technique</em>'.
	 * @generated
	 */
	DataTransformationTechnique createDataTransformationTechnique();

	/**
	 * Returns a new object of class '<em>Data Discretization Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Discretization Technique</em>'.
	 * @generated
	 */
	DataDiscretizationTechnique createDataDiscretizationTechnique();

	/**
	 * Returns a new object of class '<em>Data Reduction Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Reduction Technique</em>'.
	 * @generated
	 */
	DataReductionTechnique createDataReductionTechnique();

	/**
	 * Returns a new object of class '<em>Data Integration Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Integration Technique</em>'.
	 * @generated
	 */
	DataIntegrationTechnique createDataIntegrationTechnique();

	/**
	 * Returns a new object of class '<em>Data Augmentation Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Augmentation Technique</em>'.
	 * @generated
	 */
	DataAugmentationTechnique createDataAugmentationTechnique();

	/**
	 * Returns a new object of class '<em>Feature Extraction Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Extraction Technique</em>'.
	 * @generated
	 */
	FeatureExtractionTechnique createFeatureExtractionTechnique();

	/**
	 * Returns a new object of class '<em>Feature Selection Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Selection Technique</em>'.
	 * @generated
	 */
	FeatureSelectionTechnique createFeatureSelectionTechnique();

	/**
	 * Returns a new object of class '<em>Group Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Manager</em>'.
	 * @generated
	 */
	GroupManager createGroupManager();

	/**
	 * Returns a new object of class '<em>Team Lead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Lead</em>'.
	 * @generated
	 */
	TeamLead createTeamLead();

	/**
	 * Returns a new object of class '<em>Project Lead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Lead</em>'.
	 * @generated
	 */
	ProjectLead createProjectLead();

	/**
	 * Returns a new object of class '<em>Data Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Consumer</em>'.
	 * @generated
	 */
	DataConsumer createDataConsumer();

	/**
	 * Returns a new object of class '<em>Business User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business User</em>'.
	 * @generated
	 */
	BusinessUser createBusinessUser();

	/**
	 * Returns a new object of class '<em>Business Analyst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Analyst</em>'.
	 * @generated
	 */
	BusinessAnalyst createBusinessAnalyst();

	/**
	 * Returns a new object of class '<em>Domain Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Expert</em>'.
	 * @generated
	 */
	DomainExpert createDomainExpert();

	/**
	 * Returns a new object of class '<em>Data Scientist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Scientist</em>'.
	 * @generated
	 */
	DataScientist createDataScientist();

	/**
	 * Returns a new object of class '<em>Data Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Engineer</em>'.
	 * @generated
	 */
	DataEngineer createDataEngineer();

	/**
	 * Returns a new object of class '<em>Data Steward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Steward</em>'.
	 * @generated
	 */
	DataSteward createDataSteward();

	/**
	 * Returns a new object of class '<em>Data Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Provider</em>'.
	 * @generated
	 */
	DataProvider createDataProvider();

	/**
	 * Returns a new object of class '<em>Data Annotator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Annotator</em>'.
	 * @generated
	 */
	DataAnnotator createDataAnnotator();

	/**
	 * Returns a new object of class '<em>Architect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architect</em>'.
	 * @generated
	 */
	Architect createArchitect();

	/**
	 * Returns a new object of class '<em>Software Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Engineer</em>'.
	 * @generated
	 */
	SoftwareEngineer createSoftwareEngineer();

	/**
	 * Returns a new object of class '<em>Model Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Operator</em>'.
	 * @generated
	 */
	ModelOperator createModelOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Dsl4aiPackage getDsl4aiPackage();

} //Dsl4aiFactory
