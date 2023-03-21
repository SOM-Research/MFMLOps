/**
 */
package edu.uoc.som.dsl4ai.util;

import edu.uoc.som.dsl4ai.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage
 * @generated
 */
public class Dsl4aiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dsl4aiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl4aiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dsl4aiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dsl4aiSwitch<Adapter> modelSwitch = new Dsl4aiSwitch<Adapter>() {
		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseLocatedElement(LocatedElement object) {
			return createLocatedElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseArtifact(Artifact object) {
			return createArtifactAdapter();
		}

		@Override
		public Adapter caseDocument(Document object) {
			return createDocumentAdapter();
		}

		@Override
		public Adapter caseTemplate(Template object) {
			return createTemplateAdapter();
		}

		@Override
		public Adapter caseExecutable(Executable object) {
			return createExecutableAdapter();
		}

		@Override
		public Adapter casePlatform(Platform object) {
			return createPlatformAdapter();
		}

		@Override
		public Adapter caseScript(Script object) {
			return createScriptAdapter();
		}

		@Override
		public Adapter caseGuideline(Guideline object) {
			return createGuidelineAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseTechnique(Technique object) {
			return createTechniqueAdapter();
		}

		@Override
		public Adapter caseParticipant(Participant object) {
			return createParticipantAdapter();
		}

		@Override
		public Adapter caseBusinessUnderstandingActivity(BusinessUnderstandingActivity object) {
			return createBusinessUnderstandingActivityAdapter();
		}

		@Override
		public Adapter caseRequirementsEngineeringActivity(RequirementsEngineeringActivity object) {
			return createRequirementsEngineeringActivityAdapter();
		}

		@Override
		public Adapter caseDataIdentificationActivity(DataIdentificationActivity object) {
			return createDataIdentificationActivityAdapter();
		}

		@Override
		public Adapter caseRequirement(Requirement object) {
			return createRequirementAdapter();
		}

		@Override
		public Adapter caseAIModelRequirement(AIModelRequirement object) {
			return createAIModelRequirementAdapter();
		}

		@Override
		public Adapter caseBusinessGoal(BusinessGoal object) {
			return createBusinessGoalAdapter();
		}

		@Override
		public Adapter caseAIModelGoal(AIModelGoal object) {
			return createAIModelGoalAdapter();
		}

		@Override
		public Adapter caseBusinessSuccessCriterion(BusinessSuccessCriterion object) {
			return createBusinessSuccessCriterionAdapter();
		}

		@Override
		public Adapter caseAIModelSuccessCriterion(AIModelSuccessCriterion object) {
			return createAIModelSuccessCriterionAdapter();
		}

		@Override
		public Adapter caseGoal(Goal object) {
			return createGoalAdapter();
		}

		@Override
		public Adapter caseSuccessCriterion(SuccessCriterion object) {
			return createSuccessCriterionAdapter();
		}

		@Override
		public Adapter caseDataSource(DataSource object) {
			return createDataSourceAdapter();
		}

		@Override
		public Adapter caseDataSourceRequirement(DataSourceRequirement object) {
			return createDataSourceRequirementAdapter();
		}

		@Override
		public Adapter caseDataRequirement(DataRequirement object) {
			return createDataRequirementAdapter();
		}

		@Override
		public Adapter caseAIEthicalRequirement(AIEthicalRequirement object) {
			return createAIEthicalRequirementAdapter();
		}

		@Override
		public Adapter caseAIModelDegradation(AIModelDegradation object) {
			return createAIModelDegradationAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter caseDataPreparationActivity(DataPreparationActivity object) {
			return createDataPreparationActivityAdapter();
		}

		@Override
		public Adapter caseDataCollectionActivity(DataCollectionActivity object) {
			return createDataCollectionActivityAdapter();
		}

		@Override
		public Adapter caseDataProcessingActivity(DataProcessingActivity object) {
			return createDataProcessingActivityAdapter();
		}

		@Override
		public Adapter caseDataEngineeringTechnique(DataEngineeringTechnique object) {
			return createDataEngineeringTechniqueAdapter();
		}

		@Override
		public Adapter caseDataAnnotationGuideline(DataAnnotationGuideline object) {
			return createDataAnnotationGuidelineAdapter();
		}

		@Override
		public Adapter caseLabel(Label object) {
			return createLabelAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseFeatureEngineeringTechnique(FeatureEngineeringTechnique object) {
			return createFeatureEngineeringTechniqueAdapter();
		}

		@Override
		public Adapter caseFeatureEngineeringActivity(FeatureEngineeringActivity object) {
			return createFeatureEngineeringActivityAdapter();
		}

		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter caseDataAttribute(DataAttribute object) {
			return createDataAttributeAdapter();
		}

		@Override
		public Adapter caseAIModelingActivity(AIModelingActivity object) {
			return createAIModelingActivityAdapter();
		}

		@Override
		public Adapter caseAIModelTrainingActivity(AIModelTrainingActivity object) {
			return createAIModelTrainingActivityAdapter();
		}

		@Override
		public Adapter caseAIModelingTechnique(AIModelingTechnique object) {
			return createAIModelingTechniqueAdapter();
		}

		@Override
		public Adapter caseAIModelEvaluationActivity(AIModelEvaluationActivity object) {
			return createAIModelEvaluationActivityAdapter();
		}

		@Override
		public Adapter caseTrainingDataset(TrainingDataset object) {
			return createTrainingDatasetAdapter();
		}

		@Override
		public Adapter caseValidationDataset(ValidationDataset object) {
			return createValidationDatasetAdapter();
		}

		@Override
		public Adapter caseTestDataset(TestDataset object) {
			return createTestDatasetAdapter();
		}

		@Override
		public Adapter caseAIModel(AIModel object) {
			return createAIModelAdapter();
		}

		@Override
		public Adapter caseCriterionValue(CriterionValue object) {
			return createCriterionValueAdapter();
		}

		@Override
		public Adapter caseHyperParameter(HyperParameter object) {
			return createHyperParameterAdapter();
		}

		@Override
		public Adapter caseOptimalValue(OptimalValue object) {
			return createOptimalValueAdapter();
		}

		@Override
		public Adapter caseAIModelDataset(AIModelDataset object) {
			return createAIModelDatasetAdapter();
		}

		@Override
		public Adapter caseOperationsActivity(OperationsActivity object) {
			return createOperationsActivityAdapter();
		}

		@Override
		public Adapter caseAIModelDeploymentActivity(AIModelDeploymentActivity object) {
			return createAIModelDeploymentActivityAdapter();
		}

		@Override
		public Adapter caseAIModelMonitoringActivity(AIModelMonitoringActivity object) {
			return createAIModelMonitoringActivityAdapter();
		}

		@Override
		public Adapter caseDeployedAIModel(DeployedAIModel object) {
			return createDeployedAIModelAdapter();
		}

		@Override
		public Adapter caseAIModelObservation(AIModelObservation object) {
			return createAIModelObservationAdapter();
		}

		@Override
		public Adapter caseIssue(Issue object) {
			return createIssueAdapter();
		}

		@Override
		public Adapter caseAIModelFlaw(AIModelFlaw object) {
			return createAIModelFlawAdapter();
		}

		@Override
		public Adapter casePerformanceMetric(PerformanceMetric object) {
			return createPerformanceMetricAdapter();
		}

		@Override
		public Adapter caseDataCleaningTechnique(DataCleaningTechnique object) {
			return createDataCleaningTechniqueAdapter();
		}

		@Override
		public Adapter caseDataTransformationTechnique(DataTransformationTechnique object) {
			return createDataTransformationTechniqueAdapter();
		}

		@Override
		public Adapter caseDataDiscretizationTechnique(DataDiscretizationTechnique object) {
			return createDataDiscretizationTechniqueAdapter();
		}

		@Override
		public Adapter caseDataReductionTechnique(DataReductionTechnique object) {
			return createDataReductionTechniqueAdapter();
		}

		@Override
		public Adapter caseDataIntegrationTechnique(DataIntegrationTechnique object) {
			return createDataIntegrationTechniqueAdapter();
		}

		@Override
		public Adapter caseDataAugmentationTechnique(DataAugmentationTechnique object) {
			return createDataAugmentationTechniqueAdapter();
		}

		@Override
		public Adapter caseFeatureExtractionTechnique(FeatureExtractionTechnique object) {
			return createFeatureExtractionTechniqueAdapter();
		}

		@Override
		public Adapter caseFeatureSelectionTechnique(FeatureSelectionTechnique object) {
			return createFeatureSelectionTechniqueAdapter();
		}

		@Override
		public Adapter caseManagementRole(ManagementRole object) {
			return createManagementRoleAdapter();
		}

		@Override
		public Adapter caseDomainRole(DomainRole object) {
			return createDomainRoleAdapter();
		}

		@Override
		public Adapter caseDataRole(DataRole object) {
			return createDataRoleAdapter();
		}

		@Override
		public Adapter caseAIModelServingRole(AIModelServingRole object) {
			return createAIModelServingRoleAdapter();
		}

		@Override
		public Adapter caseGroupManager(GroupManager object) {
			return createGroupManagerAdapter();
		}

		@Override
		public Adapter caseTeamLead(TeamLead object) {
			return createTeamLeadAdapter();
		}

		@Override
		public Adapter caseProjectLead(ProjectLead object) {
			return createProjectLeadAdapter();
		}

		@Override
		public Adapter caseDataConsumer(DataConsumer object) {
			return createDataConsumerAdapter();
		}

		@Override
		public Adapter caseBusinessUser(BusinessUser object) {
			return createBusinessUserAdapter();
		}

		@Override
		public Adapter caseBusinessAnalyst(BusinessAnalyst object) {
			return createBusinessAnalystAdapter();
		}

		@Override
		public Adapter caseDomainExpert(DomainExpert object) {
			return createDomainExpertAdapter();
		}

		@Override
		public Adapter caseDataScientist(DataScientist object) {
			return createDataScientistAdapter();
		}

		@Override
		public Adapter caseDataEngineer(DataEngineer object) {
			return createDataEngineerAdapter();
		}

		@Override
		public Adapter caseDataSteward(DataSteward object) {
			return createDataStewardAdapter();
		}

		@Override
		public Adapter caseDataProvider(DataProvider object) {
			return createDataProviderAdapter();
		}

		@Override
		public Adapter caseDataAnnotator(DataAnnotator object) {
			return createDataAnnotatorAdapter();
		}

		@Override
		public Adapter caseArchitect(Architect object) {
			return createArchitectAdapter();
		}

		@Override
		public Adapter caseSoftwareEngineer(SoftwareEngineer object) {
			return createSoftwareEngineerAdapter();
		}

		@Override
		public Adapter caseModelOperator(ModelOperator object) {
			return createModelOperatorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Executable
	 * @generated
	 */
	public Adapter createExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Guideline
	 * @generated
	 */
	public Adapter createGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Technique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Technique
	 * @generated
	 */
	public Adapter createTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.BusinessUnderstandingActivity <em>Business Understanding Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.BusinessUnderstandingActivity
	 * @generated
	 */
	public Adapter createBusinessUnderstandingActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.RequirementsEngineeringActivity <em>Requirements Engineering Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.RequirementsEngineeringActivity
	 * @generated
	 */
	public Adapter createRequirementsEngineeringActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataIdentificationActivity <em>Data Identification Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataIdentificationActivity
	 * @generated
	 */
	public Adapter createDataIdentificationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelRequirement <em>AI Model Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelRequirement
	 * @generated
	 */
	public Adapter createAIModelRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.BusinessGoal <em>Business Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.BusinessGoal
	 * @generated
	 */
	public Adapter createBusinessGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelGoal <em>AI Model Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelGoal
	 * @generated
	 */
	public Adapter createAIModelGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.BusinessSuccessCriterion <em>Business Success Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.BusinessSuccessCriterion
	 * @generated
	 */
	public Adapter createBusinessSuccessCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion <em>AI Model Success Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelSuccessCriterion
	 * @generated
	 */
	public Adapter createAIModelSuccessCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.SuccessCriterion <em>Success Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.SuccessCriterion
	 * @generated
	 */
	public Adapter createSuccessCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataSourceRequirement <em>Data Source Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataSourceRequirement
	 * @generated
	 */
	public Adapter createDataSourceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataRequirement
	 * @generated
	 */
	public Adapter createDataRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIEthicalRequirement <em>AI Ethical Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIEthicalRequirement
	 * @generated
	 */
	public Adapter createAIEthicalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelDegradation <em>AI Model Degradation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelDegradation
	 * @generated
	 */
	public Adapter createAIModelDegradationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataPreparationActivity <em>Data Preparation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataPreparationActivity
	 * @generated
	 */
	public Adapter createDataPreparationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataCollectionActivity <em>Data Collection Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataCollectionActivity
	 * @generated
	 */
	public Adapter createDataCollectionActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataProcessingActivity <em>Data Processing Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataProcessingActivity
	 * @generated
	 */
	public Adapter createDataProcessingActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataEngineeringTechnique <em>Data Engineering Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataEngineeringTechnique
	 * @generated
	 */
	public Adapter createDataEngineeringTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataAnnotationGuideline <em>Data Annotation Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataAnnotationGuideline
	 * @generated
	 */
	public Adapter createDataAnnotationGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.FeatureEngineeringTechnique <em>Feature Engineering Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.FeatureEngineeringTechnique
	 * @generated
	 */
	public Adapter createFeatureEngineeringTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.FeatureEngineeringActivity <em>Feature Engineering Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.FeatureEngineeringActivity
	 * @generated
	 */
	public Adapter createFeatureEngineeringActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataAttribute <em>Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataAttribute
	 * @generated
	 */
	public Adapter createDataAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelingActivity <em>AI Modeling Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelingActivity
	 * @generated
	 */
	public Adapter createAIModelingActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity <em>AI Model Training Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity
	 * @generated
	 */
	public Adapter createAIModelTrainingActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelingTechnique <em>AI Modeling Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelingTechnique
	 * @generated
	 */
	public Adapter createAIModelingTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity <em>AI Model Evaluation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelEvaluationActivity
	 * @generated
	 */
	public Adapter createAIModelEvaluationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.TrainingDataset <em>Training Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.TrainingDataset
	 * @generated
	 */
	public Adapter createTrainingDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.ValidationDataset <em>Validation Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.ValidationDataset
	 * @generated
	 */
	public Adapter createValidationDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.TestDataset <em>Test Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.TestDataset
	 * @generated
	 */
	public Adapter createTestDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModel <em>AI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModel
	 * @generated
	 */
	public Adapter createAIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.CriterionValue <em>Criterion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.CriterionValue
	 * @generated
	 */
	public Adapter createCriterionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.HyperParameter <em>Hyper Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.HyperParameter
	 * @generated
	 */
	public Adapter createHyperParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.OptimalValue <em>Optimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.OptimalValue
	 * @generated
	 */
	public Adapter createOptimalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelDataset <em>AI Model Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelDataset
	 * @generated
	 */
	public Adapter createAIModelDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.OperationsActivity <em>Operations Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.OperationsActivity
	 * @generated
	 */
	public Adapter createOperationsActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelDeploymentActivity <em>AI Model Deployment Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelDeploymentActivity
	 * @generated
	 */
	public Adapter createAIModelDeploymentActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelMonitoringActivity <em>AI Model Monitoring Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelMonitoringActivity
	 * @generated
	 */
	public Adapter createAIModelMonitoringActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DeployedAIModel <em>Deployed AI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel
	 * @generated
	 */
	public Adapter createDeployedAIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelObservation <em>AI Model Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelObservation
	 * @generated
	 */
	public Adapter createAIModelObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Issue
	 * @generated
	 */
	public Adapter createIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelFlaw <em>AI Model Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelFlaw
	 * @generated
	 */
	public Adapter createAIModelFlawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.PerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.PerformanceMetric
	 * @generated
	 */
	public Adapter createPerformanceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataCleaningTechnique <em>Data Cleaning Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechnique
	 * @generated
	 */
	public Adapter createDataCleaningTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataTransformationTechnique <em>Data Transformation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataTransformationTechnique
	 * @generated
	 */
	public Adapter createDataTransformationTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechnique <em>Data Discretization Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechnique
	 * @generated
	 */
	public Adapter createDataDiscretizationTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataReductionTechnique <em>Data Reduction Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataReductionTechnique
	 * @generated
	 */
	public Adapter createDataReductionTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataIntegrationTechnique <em>Data Integration Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataIntegrationTechnique
	 * @generated
	 */
	public Adapter createDataIntegrationTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataAugmentationTechnique <em>Data Augmentation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataAugmentationTechnique
	 * @generated
	 */
	public Adapter createDataAugmentationTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechnique <em>Feature Extraction Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechnique
	 * @generated
	 */
	public Adapter createFeatureExtractionTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechnique <em>Feature Selection Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechnique
	 * @generated
	 */
	public Adapter createFeatureSelectionTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.ManagementRole <em>Management Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.ManagementRole
	 * @generated
	 */
	public Adapter createManagementRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DomainRole <em>Domain Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DomainRole
	 * @generated
	 */
	public Adapter createDomainRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataRole <em>Data Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataRole
	 * @generated
	 */
	public Adapter createDataRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.AIModelServingRole <em>AI Model Serving Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.AIModelServingRole
	 * @generated
	 */
	public Adapter createAIModelServingRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.GroupManager <em>Group Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.GroupManager
	 * @generated
	 */
	public Adapter createGroupManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.TeamLead <em>Team Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.TeamLead
	 * @generated
	 */
	public Adapter createTeamLeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.ProjectLead <em>Project Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.ProjectLead
	 * @generated
	 */
	public Adapter createProjectLeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataConsumer <em>Data Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataConsumer
	 * @generated
	 */
	public Adapter createDataConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.BusinessUser <em>Business User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.BusinessUser
	 * @generated
	 */
	public Adapter createBusinessUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.BusinessAnalyst <em>Business Analyst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.BusinessAnalyst
	 * @generated
	 */
	public Adapter createBusinessAnalystAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DomainExpert <em>Domain Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DomainExpert
	 * @generated
	 */
	public Adapter createDomainExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataScientist <em>Data Scientist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataScientist
	 * @generated
	 */
	public Adapter createDataScientistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataEngineer <em>Data Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataEngineer
	 * @generated
	 */
	public Adapter createDataEngineerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataSteward <em>Data Steward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataSteward
	 * @generated
	 */
	public Adapter createDataStewardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataProvider
	 * @generated
	 */
	public Adapter createDataProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.DataAnnotator <em>Data Annotator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.DataAnnotator
	 * @generated
	 */
	public Adapter createDataAnnotatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.Architect <em>Architect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.Architect
	 * @generated
	 */
	public Adapter createArchitectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.SoftwareEngineer <em>Software Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.SoftwareEngineer
	 * @generated
	 */
	public Adapter createSoftwareEngineerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.dsl4ai.ModelOperator <em>Model Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.dsl4ai.ModelOperator
	 * @generated
	 */
	public Adapter createModelOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dsl4aiAdapterFactory
