/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.AIEthicalRequirement;
import edu.uoc.som.dsl4ai.AIEthicsKind;
import edu.uoc.som.dsl4ai.AIModel;
import edu.uoc.som.dsl4ai.AIModelDataset;
import edu.uoc.som.dsl4ai.AIModelDegradation;
import edu.uoc.som.dsl4ai.AIModelDeploymentActivity;
import edu.uoc.som.dsl4ai.AIModelEvaluationActivity;
import edu.uoc.som.dsl4ai.AIModelFlaw;
import edu.uoc.som.dsl4ai.AIModelGoal;
import edu.uoc.som.dsl4ai.AIModelMonitoringActivity;
import edu.uoc.som.dsl4ai.AIModelObservation;
import edu.uoc.som.dsl4ai.AIModelRequirement;
import edu.uoc.som.dsl4ai.AIModelServingRole;
import edu.uoc.som.dsl4ai.AIModelSuccessCriterion;
import edu.uoc.som.dsl4ai.AIModelTrainingActivity;
import edu.uoc.som.dsl4ai.AIModelingActivity;
import edu.uoc.som.dsl4ai.AIModelingTechnique;
import edu.uoc.som.dsl4ai.Activity;
import edu.uoc.som.dsl4ai.Architect;
import edu.uoc.som.dsl4ai.Artifact;
import edu.uoc.som.dsl4ai.BusinessAnalyst;
import edu.uoc.som.dsl4ai.BusinessGoal;
import edu.uoc.som.dsl4ai.BusinessSuccessCriterion;
import edu.uoc.som.dsl4ai.BusinessUnderstandingActivity;
import edu.uoc.som.dsl4ai.BusinessUser;
import edu.uoc.som.dsl4ai.CriterionValue;
import edu.uoc.som.dsl4ai.Data;
import edu.uoc.som.dsl4ai.DataAnnotationGuideline;
import edu.uoc.som.dsl4ai.DataAnnotator;
import edu.uoc.som.dsl4ai.DataAttribute;
import edu.uoc.som.dsl4ai.DataAugmentationTechnique;
import edu.uoc.som.dsl4ai.DataCleaningTechnique;
import edu.uoc.som.dsl4ai.DataCleaningTechniqueKind;
import edu.uoc.som.dsl4ai.DataCollectionActivity;
import edu.uoc.som.dsl4ai.DataConsumer;
import edu.uoc.som.dsl4ai.DataDiscretizationTechnique;
import edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind;
import edu.uoc.som.dsl4ai.DataEngineer;
import edu.uoc.som.dsl4ai.DataEngineeringTechnique;
import edu.uoc.som.dsl4ai.DataIdentificationActivity;
import edu.uoc.som.dsl4ai.DataIntegrationTechnique;
import edu.uoc.som.dsl4ai.DataPreparationActivity;
import edu.uoc.som.dsl4ai.DataProcessingActivity;
import edu.uoc.som.dsl4ai.DataProvider;
import edu.uoc.som.dsl4ai.DataReductionTechnique;
import edu.uoc.som.dsl4ai.DataReductionTechniqueKind;
import edu.uoc.som.dsl4ai.DataRequirement;
import edu.uoc.som.dsl4ai.DataRole;
import edu.uoc.som.dsl4ai.DataScientist;
import edu.uoc.som.dsl4ai.DataSource;
import edu.uoc.som.dsl4ai.DataSourceRequirement;
import edu.uoc.som.dsl4ai.DataSteward;
import edu.uoc.som.dsl4ai.DataTransformationTechnique;
import edu.uoc.som.dsl4ai.DataTransformationTechniqueKind;
import edu.uoc.som.dsl4ai.DeployedAIModel;
import edu.uoc.som.dsl4ai.DeploymentPatternKind;
import edu.uoc.som.dsl4ai.DeploymentStrategyKind;
import edu.uoc.som.dsl4ai.Document;
import edu.uoc.som.dsl4ai.DomainExpert;
import edu.uoc.som.dsl4ai.DomainRole;
import edu.uoc.som.dsl4ai.Dsl4aiFactory;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.Executable;
import edu.uoc.som.dsl4ai.Feature;
import edu.uoc.som.dsl4ai.FeatureEngineeringActivity;
import edu.uoc.som.dsl4ai.FeatureEngineeringTechnique;
import edu.uoc.som.dsl4ai.FeatureExtractionTechnique;
import edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind;
import edu.uoc.som.dsl4ai.FeatureSelectionTechnique;
import edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind;
import edu.uoc.som.dsl4ai.Goal;
import edu.uoc.som.dsl4ai.GroupManager;
import edu.uoc.som.dsl4ai.Guideline;
import edu.uoc.som.dsl4ai.HyperParameter;
import edu.uoc.som.dsl4ai.InferenceModeKind;
import edu.uoc.som.dsl4ai.Issue;
import edu.uoc.som.dsl4ai.Label;
import edu.uoc.som.dsl4ai.LocatedElement;
import edu.uoc.som.dsl4ai.ManagementRole;
import edu.uoc.som.dsl4ai.Method;
import edu.uoc.som.dsl4ai.ModelOperator;
import edu.uoc.som.dsl4ai.NamedElement;
import edu.uoc.som.dsl4ai.OperationsActivity;
import edu.uoc.som.dsl4ai.OptimalValue;
import edu.uoc.som.dsl4ai.Participant;
import edu.uoc.som.dsl4ai.ParticipationKind;
import edu.uoc.som.dsl4ai.PerformanceMetric;
import edu.uoc.som.dsl4ai.Platform;
import edu.uoc.som.dsl4ai.ProjectLead;
import edu.uoc.som.dsl4ai.Requirement;
import edu.uoc.som.dsl4ai.RequirementsEngineeringActivity;
import edu.uoc.som.dsl4ai.Resource;
import edu.uoc.som.dsl4ai.Role;
import edu.uoc.som.dsl4ai.Script;
import edu.uoc.som.dsl4ai.SoftwareEngineer;
import edu.uoc.som.dsl4ai.SuccessCriterion;
import edu.uoc.som.dsl4ai.TeamLead;
import edu.uoc.som.dsl4ai.Technique;
import edu.uoc.som.dsl4ai.Template;
import edu.uoc.som.dsl4ai.TestDataset;
import edu.uoc.som.dsl4ai.TrainingDataset;
import edu.uoc.som.dsl4ai.ValidationDataset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dsl4aiPackageImpl extends EPackageImpl implements Dsl4aiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessUnderstandingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsEngineeringActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIdentificationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessSuccessCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelSuccessCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiEthicalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelDegradationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPreparationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCollectionActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcessingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEngineeringTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnnotationGuidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEngineeringTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEngineeringActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelTrainingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelingTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelEvaluationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationsActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelDeploymentActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelMonitoringActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedAIModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelFlawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCleaningTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransformationTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDiscretizationTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReductionTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIntegrationTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAugmentationTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureExtractionTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSelectionTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiModelServingRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamLeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectLeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAnalystEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataScientistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnnotatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aiEthicsKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentStrategyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentPatternKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inferenceModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataCleaningTechniqueKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTransformationTechniqueKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDiscretizationTechniqueKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataReductionTechniqueKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureExtractionTechniqueKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureSelectionTechniqueKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dsl4aiPackageImpl() {
		super(eNS_URI, Dsl4aiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Dsl4aiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dsl4aiPackage init() {
		if (isInited)
			return (Dsl4aiPackage) EPackage.Registry.INSTANCE.getEPackage(Dsl4aiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDsl4aiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Dsl4aiPackageImpl theDsl4aiPackage = registeredDsl4aiPackage instanceof Dsl4aiPackageImpl
				? (Dsl4aiPackageImpl) registeredDsl4aiPackage
				: new Dsl4aiPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDsl4aiPackage.createPackageContents();

		// Initialize created meta-data
		theDsl4aiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsl4aiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dsl4aiPackage.eNS_URI, theDsl4aiPackage);
		return theDsl4aiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Name() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_IsOptional() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_RequiresAllSubactivities() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Inputs() {
		return (EReference) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Outputs() {
		return (EReference) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Resources() {
		return (EReference) activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Techniques() {
		return (EReference) activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Participants() {
		return (EReference) activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Next() {
		return (EReference) activityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Rationale() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Subactivities() {
		return (EReference) activityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocatedElement() {
		return locatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocatedElement_Path() {
		return (EAttribute) locatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Description() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_IsDeliverable() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_Template() {
		return (EReference) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutable() {
		return executableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScript_Code() {
		return (EAttribute) scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGuideline() {
		return guidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnique() {
		return techniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnique_Script() {
		return (EReference) techniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipant_Participation() {
		return (EAttribute) participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Role() {
		return (EReference) participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessUnderstandingActivity() {
		return businessUnderstandingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsEngineeringActivity() {
		return requirementsEngineeringActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsEngineeringActivity_Goals() {
		return (EReference) requirementsEngineeringActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsEngineeringActivity_Requirements() {
		return (EReference) requirementsEngineeringActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataIdentificationActivity() {
		return dataIdentificationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataIdentificationActivity_Identifies() {
		return (EReference) dataIdentificationActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Name() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Rationale() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelRequirement() {
		return aiModelRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessGoal() {
		return businessGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessGoal_Criteria() {
		return (EReference) businessGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelGoal() {
		return aiModelGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelGoal_AlignedTo() {
		return (EReference) aiModelGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelGoal_Criteria() {
		return (EReference) aiModelGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessSuccessCriterion() {
		return businessSuccessCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelSuccessCriterion() {
		return aiModelSuccessCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelSuccessCriterion_AlignedTo() {
		return (EReference) aiModelSuccessCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelSuccessCriterion_CriterionValue() {
		return (EReference) aiModelSuccessCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_Description() {
		return (EAttribute) goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessCriterion() {
		return successCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessCriterion_Name() {
		return (EAttribute) successCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessCriterion_Description() {
		return (EAttribute) successCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessCriterion_Baseline() {
		return (EAttribute) successCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessCriterion_Target() {
		return (EAttribute) successCriterionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_IsExternal() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_IsSelected() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_CompliesWith() {
		return (EReference) dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSourceRequirement() {
		return dataSourceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirement() {
		return dataRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIEthicalRequirement() {
		return aiEthicalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIEthicalRequirement_Ethic() {
		return (EAttribute) aiEthicalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelDegradation() {
		return aiModelDegradationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_Name() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Activities() {
		return (EReference) methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Artifacts() {
		return (EReference) methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Resources() {
		return (EReference) methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Roles() {
		return (EReference) methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataPreparationActivity() {
		return dataPreparationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPreparationActivity_TrainingDataset() {
		return (EReference) dataPreparationActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPreparationActivity_ValidationDataset() {
		return (EReference) dataPreparationActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPreparationActivity_TestDataset() {
		return (EReference) dataPreparationActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataCollectionActivity() {
		return dataCollectionActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCollectionActivity_Collects() {
		return (EReference) dataCollectionActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCollectionActivity_Sources() {
		return (EReference) dataCollectionActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataProcessingActivity() {
		return dataProcessingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataProcessingActivity_Labels() {
		return (EReference) dataProcessingActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataProcessingActivity_Processes() {
		return (EReference) dataProcessingActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataEngineeringTechnique() {
		return dataEngineeringTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAnnotationGuideline() {
		return dataAnnotationGuidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Name() {
		return (EAttribute) labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Labels() {
		return (EReference) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Attributes() {
		return (EReference) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureEngineeringTechnique() {
		return featureEngineeringTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureEngineeringActivity() {
		return featureEngineeringActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureEngineeringActivity_ExtractsFrom() {
		return (EReference) featureEngineeringActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureEngineeringActivity_Creates() {
		return (EReference) featureEngineeringActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Description() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_From() {
		return (EReference) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_CorrelatedTo() {
		return (EReference) featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAttribute() {
		return dataAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAttribute_Name() {
		return (EAttribute) dataAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelingActivity() {
		return aiModelingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelTrainingActivity() {
		return aiModelTrainingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelTrainingActivity_TrainsWith() {
		return (EReference) aiModelTrainingActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelTrainingActivity_ValidatesWith() {
		return (EReference) aiModelTrainingActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelTrainingActivity_Trains() {
		return (EReference) aiModelTrainingActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelTrainingActivity_OptimalValues() {
		return (EReference) aiModelTrainingActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelingTechnique() {
		return aiModelingTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelingTechnique_Hyperparameters() {
		return (EReference) aiModelingTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelEvaluationActivity() {
		return aiModelEvaluationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelEvaluationActivity_EvaluatesWith() {
		return (EReference) aiModelEvaluationActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelEvaluationActivity_Evaluates() {
		return (EReference) aiModelEvaluationActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelEvaluationActivity_CriteriaValues() {
		return (EReference) aiModelEvaluationActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainingDataset() {
		return trainingDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrainingDataset_Data() {
		return (EReference) trainingDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationDataset() {
		return validationDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationDataset_Data() {
		return (EReference) validationDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestDataset() {
		return testDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDataset_Data() {
		return (EReference) testDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModel() {
		return aiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIModel_Rank() {
		return (EAttribute) aiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_CriteriaValues() {
		return (EReference) aiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_Goal() {
		return (EReference) aiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_SatisfiedRequirements() {
		return (EReference) aiModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_OptimalValues() {
		return (EReference) aiModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModel_BasedOn() {
		return (EReference) aiModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriterionValue() {
		return criterionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterionValue_Value() {
		return (EAttribute) criterionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterionValue_Aimodelsuccesscriterion() {
		return (EReference) criterionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterionValue_AiModelEvaluationActivity() {
		return (EReference) criterionValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHyperParameter() {
		return hyperParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHyperParameter_Name() {
		return (EAttribute) hyperParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHyperParameter_OptimalValues() {
		return (EReference) hyperParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptimalValue() {
		return optimalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptimalValue_Value() {
		return (EAttribute) optimalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimalValue_Hyperparameter() {
		return (EReference) optimalValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimalValue_AiModelTrainingActivity() {
		return (EReference) optimalValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelDataset() {
		return aiModelDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationsActivity() {
		return operationsActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelDeploymentActivity() {
		return aiModelDeploymentActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelDeploymentActivity_Deploys() {
		return (EReference) aiModelDeploymentActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelMonitoringActivity() {
		return aiModelMonitoringActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelMonitoringActivity_Monitors() {
		return (EReference) aiModelMonitoringActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployedAIModel() {
		return deployedAIModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedAIModel_Platform() {
		return (EReference) deployedAIModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployedAIModel_Pattern() {
		return (EAttribute) deployedAIModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployedAIModel_Strategy() {
		return (EAttribute) deployedAIModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployedAIModel_Inference() {
		return (EAttribute) deployedAIModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployedAIModel_Api() {
		return (EAttribute) deployedAIModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedAIModel_Observations() {
		return (EReference) deployedAIModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelObservation() {
		return aiModelObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelFlaw() {
		return aiModelFlawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAIModelFlaw_Degrades() {
		return (EReference) aiModelFlawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceMetric() {
		return performanceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetric_Name() {
		return (EAttribute) performanceMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetric_MinThreshold() {
		return (EAttribute) performanceMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetric_MaxThreshold() {
		return (EAttribute) performanceMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceMetric_Ensures() {
		return (EReference) performanceMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataCleaningTechnique() {
		return dataCleaningTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataCleaningTechnique_TechniqueKind() {
		return (EAttribute) dataCleaningTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTransformationTechnique() {
		return dataTransformationTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransformationTechnique_TechniqueKind() {
		return (EAttribute) dataTransformationTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDiscretizationTechnique() {
		return dataDiscretizationTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataDiscretizationTechnique_TechniqueKind() {
		return (EAttribute) dataDiscretizationTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataReductionTechnique() {
		return dataReductionTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataReductionTechnique_TechniqueKind() {
		return (EAttribute) dataReductionTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataIntegrationTechnique() {
		return dataIntegrationTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAugmentationTechnique() {
		return dataAugmentationTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureExtractionTechnique() {
		return featureExtractionTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureExtractionTechnique_TechniqueKind() {
		return (EAttribute) featureExtractionTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureSelectionTechnique() {
		return featureSelectionTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureSelectionTechnique_TechniqueKind() {
		return (EAttribute) featureSelectionTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManagementRole() {
		return managementRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainRole() {
		return domainRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRole() {
		return dataRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIModelServingRole() {
		return aiModelServingRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupManager() {
		return groupManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeamLead() {
		return teamLeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectLead() {
		return projectLeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataConsumer() {
		return dataConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessUser() {
		return businessUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessAnalyst() {
		return businessAnalystEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainExpert() {
		return domainExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataScientist() {
		return dataScientistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataEngineer() {
		return dataEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSteward() {
		return dataStewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataProvider() {
		return dataProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAnnotator() {
		return dataAnnotatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAnnotator_IsExternal() {
		return (EAttribute) dataAnnotatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitect() {
		return architectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareEngineer() {
		return softwareEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelOperator() {
		return modelOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParticipationKind() {
		return participationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAIEthicsKind() {
		return aiEthicsKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeploymentStrategyKind() {
		return deploymentStrategyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeploymentPatternKind() {
		return deploymentPatternKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInferenceModeKind() {
		return inferenceModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataCleaningTechniqueKind() {
		return dataCleaningTechniqueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTransformationTechniqueKind() {
		return dataTransformationTechniqueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataDiscretizationTechniqueKind() {
		return dataDiscretizationTechniqueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataReductionTechniqueKind() {
		return dataReductionTechniqueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureExtractionTechniqueKind() {
		return featureExtractionTechniqueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureSelectionTechniqueKind() {
		return featureSelectionTechniqueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dsl4aiFactory getDsl4aiFactory() {
		return (Dsl4aiFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__IS_OPTIONAL);
		createEAttribute(activityEClass, ACTIVITY__REQUIRES_ALL_SUBACTIVITIES);
		createEReference(activityEClass, ACTIVITY__INPUTS);
		createEReference(activityEClass, ACTIVITY__OUTPUTS);
		createEReference(activityEClass, ACTIVITY__RESOURCES);
		createEReference(activityEClass, ACTIVITY__TECHNIQUES);
		createEReference(activityEClass, ACTIVITY__PARTICIPANTS);
		createEReference(activityEClass, ACTIVITY__NEXT);
		createEAttribute(activityEClass, ACTIVITY__RATIONALE);
		createEReference(activityEClass, ACTIVITY__SUBACTIVITIES);

		locatedElementEClass = createEClass(LOCATED_ELEMENT);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__PATH);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__DESCRIPTION);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__IS_DELIVERABLE);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__TEMPLATE);

		templateEClass = createEClass(TEMPLATE);

		executableEClass = createEClass(EXECUTABLE);

		platformEClass = createEClass(PLATFORM);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__CODE);

		guidelineEClass = createEClass(GUIDELINE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);

		techniqueEClass = createEClass(TECHNIQUE);
		createEReference(techniqueEClass, TECHNIQUE__SCRIPT);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__PARTICIPATION);
		createEReference(participantEClass, PARTICIPANT__ROLE);

		businessUnderstandingActivityEClass = createEClass(BUSINESS_UNDERSTANDING_ACTIVITY);

		requirementsEngineeringActivityEClass = createEClass(REQUIREMENTS_ENGINEERING_ACTIVITY);
		createEReference(requirementsEngineeringActivityEClass, REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS);
		createEReference(requirementsEngineeringActivityEClass, REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS);

		dataIdentificationActivityEClass = createEClass(DATA_IDENTIFICATION_ACTIVITY);
		createEReference(dataIdentificationActivityEClass, DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__RATIONALE);

		aiModelRequirementEClass = createEClass(AI_MODEL_REQUIREMENT);

		businessGoalEClass = createEClass(BUSINESS_GOAL);
		createEReference(businessGoalEClass, BUSINESS_GOAL__CRITERIA);

		aiModelGoalEClass = createEClass(AI_MODEL_GOAL);
		createEReference(aiModelGoalEClass, AI_MODEL_GOAL__ALIGNED_TO);
		createEReference(aiModelGoalEClass, AI_MODEL_GOAL__CRITERIA);

		businessSuccessCriterionEClass = createEClass(BUSINESS_SUCCESS_CRITERION);

		aiModelSuccessCriterionEClass = createEClass(AI_MODEL_SUCCESS_CRITERION);
		createEReference(aiModelSuccessCriterionEClass, AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO);
		createEReference(aiModelSuccessCriterionEClass, AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__DESCRIPTION);

		successCriterionEClass = createEClass(SUCCESS_CRITERION);
		createEAttribute(successCriterionEClass, SUCCESS_CRITERION__NAME);
		createEAttribute(successCriterionEClass, SUCCESS_CRITERION__DESCRIPTION);
		createEAttribute(successCriterionEClass, SUCCESS_CRITERION__BASELINE);
		createEAttribute(successCriterionEClass, SUCCESS_CRITERION__TARGET);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__IS_EXTERNAL);
		createEAttribute(dataSourceEClass, DATA_SOURCE__IS_SELECTED);
		createEReference(dataSourceEClass, DATA_SOURCE__COMPLIES_WITH);

		dataSourceRequirementEClass = createEClass(DATA_SOURCE_REQUIREMENT);

		dataRequirementEClass = createEClass(DATA_REQUIREMENT);

		aiEthicalRequirementEClass = createEClass(AI_ETHICAL_REQUIREMENT);
		createEAttribute(aiEthicalRequirementEClass, AI_ETHICAL_REQUIREMENT__ETHIC);

		aiModelDegradationEClass = createEClass(AI_MODEL_DEGRADATION);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEReference(methodEClass, METHOD__ACTIVITIES);
		createEReference(methodEClass, METHOD__ARTIFACTS);
		createEReference(methodEClass, METHOD__RESOURCES);
		createEReference(methodEClass, METHOD__ROLES);

		dataPreparationActivityEClass = createEClass(DATA_PREPARATION_ACTIVITY);
		createEReference(dataPreparationActivityEClass, DATA_PREPARATION_ACTIVITY__TRAINING_DATASET);
		createEReference(dataPreparationActivityEClass, DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET);
		createEReference(dataPreparationActivityEClass, DATA_PREPARATION_ACTIVITY__TEST_DATASET);

		dataCollectionActivityEClass = createEClass(DATA_COLLECTION_ACTIVITY);
		createEReference(dataCollectionActivityEClass, DATA_COLLECTION_ACTIVITY__COLLECTS);
		createEReference(dataCollectionActivityEClass, DATA_COLLECTION_ACTIVITY__SOURCES);

		dataProcessingActivityEClass = createEClass(DATA_PROCESSING_ACTIVITY);
		createEReference(dataProcessingActivityEClass, DATA_PROCESSING_ACTIVITY__LABELS);
		createEReference(dataProcessingActivityEClass, DATA_PROCESSING_ACTIVITY__PROCESSES);

		dataEngineeringTechniqueEClass = createEClass(DATA_ENGINEERING_TECHNIQUE);

		dataAnnotationGuidelineEClass = createEClass(DATA_ANNOTATION_GUIDELINE);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__NAME);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__LABELS);
		createEReference(dataEClass, DATA__ATTRIBUTES);

		featureEngineeringTechniqueEClass = createEClass(FEATURE_ENGINEERING_TECHNIQUE);

		featureEngineeringActivityEClass = createEClass(FEATURE_ENGINEERING_ACTIVITY);
		createEReference(featureEngineeringActivityEClass, FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM);
		createEReference(featureEngineeringActivityEClass, FEATURE_ENGINEERING_ACTIVITY__CREATES);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__DESCRIPTION);
		createEReference(featureEClass, FEATURE__FROM);
		createEReference(featureEClass, FEATURE__CORRELATED_TO);

		dataAttributeEClass = createEClass(DATA_ATTRIBUTE);
		createEAttribute(dataAttributeEClass, DATA_ATTRIBUTE__NAME);

		aiModelingActivityEClass = createEClass(AI_MODELING_ACTIVITY);

		aiModelTrainingActivityEClass = createEClass(AI_MODEL_TRAINING_ACTIVITY);
		createEReference(aiModelTrainingActivityEClass, AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH);
		createEReference(aiModelTrainingActivityEClass, AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH);
		createEReference(aiModelTrainingActivityEClass, AI_MODEL_TRAINING_ACTIVITY__TRAINS);
		createEReference(aiModelTrainingActivityEClass, AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES);

		aiModelingTechniqueEClass = createEClass(AI_MODELING_TECHNIQUE);
		createEReference(aiModelingTechniqueEClass, AI_MODELING_TECHNIQUE__HYPERPARAMETERS);

		aiModelEvaluationActivityEClass = createEClass(AI_MODEL_EVALUATION_ACTIVITY);
		createEReference(aiModelEvaluationActivityEClass, AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH);
		createEReference(aiModelEvaluationActivityEClass, AI_MODEL_EVALUATION_ACTIVITY__EVALUATES);
		createEReference(aiModelEvaluationActivityEClass, AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES);

		trainingDatasetEClass = createEClass(TRAINING_DATASET);
		createEReference(trainingDatasetEClass, TRAINING_DATASET__DATA);

		validationDatasetEClass = createEClass(VALIDATION_DATASET);
		createEReference(validationDatasetEClass, VALIDATION_DATASET__DATA);

		testDatasetEClass = createEClass(TEST_DATASET);
		createEReference(testDatasetEClass, TEST_DATASET__DATA);

		aiModelEClass = createEClass(AI_MODEL);
		createEAttribute(aiModelEClass, AI_MODEL__RANK);
		createEReference(aiModelEClass, AI_MODEL__CRITERIA_VALUES);
		createEReference(aiModelEClass, AI_MODEL__GOAL);
		createEReference(aiModelEClass, AI_MODEL__SATISFIED_REQUIREMENTS);
		createEReference(aiModelEClass, AI_MODEL__OPTIMAL_VALUES);
		createEReference(aiModelEClass, AI_MODEL__BASED_ON);

		criterionValueEClass = createEClass(CRITERION_VALUE);
		createEAttribute(criterionValueEClass, CRITERION_VALUE__VALUE);
		createEReference(criterionValueEClass, CRITERION_VALUE__AIMODELSUCCESSCRITERION);
		createEReference(criterionValueEClass, CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY);

		hyperParameterEClass = createEClass(HYPER_PARAMETER);
		createEAttribute(hyperParameterEClass, HYPER_PARAMETER__NAME);
		createEReference(hyperParameterEClass, HYPER_PARAMETER__OPTIMAL_VALUES);

		optimalValueEClass = createEClass(OPTIMAL_VALUE);
		createEAttribute(optimalValueEClass, OPTIMAL_VALUE__VALUE);
		createEReference(optimalValueEClass, OPTIMAL_VALUE__HYPERPARAMETER);
		createEReference(optimalValueEClass, OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY);

		aiModelDatasetEClass = createEClass(AI_MODEL_DATASET);

		operationsActivityEClass = createEClass(OPERATIONS_ACTIVITY);

		aiModelDeploymentActivityEClass = createEClass(AI_MODEL_DEPLOYMENT_ACTIVITY);
		createEReference(aiModelDeploymentActivityEClass, AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS);

		aiModelMonitoringActivityEClass = createEClass(AI_MODEL_MONITORING_ACTIVITY);
		createEReference(aiModelMonitoringActivityEClass, AI_MODEL_MONITORING_ACTIVITY__MONITORS);

		deployedAIModelEClass = createEClass(DEPLOYED_AI_MODEL);
		createEReference(deployedAIModelEClass, DEPLOYED_AI_MODEL__PLATFORM);
		createEAttribute(deployedAIModelEClass, DEPLOYED_AI_MODEL__PATTERN);
		createEAttribute(deployedAIModelEClass, DEPLOYED_AI_MODEL__STRATEGY);
		createEAttribute(deployedAIModelEClass, DEPLOYED_AI_MODEL__INFERENCE);
		createEAttribute(deployedAIModelEClass, DEPLOYED_AI_MODEL__API);
		createEReference(deployedAIModelEClass, DEPLOYED_AI_MODEL__OBSERVATIONS);

		aiModelObservationEClass = createEClass(AI_MODEL_OBSERVATION);

		issueEClass = createEClass(ISSUE);

		aiModelFlawEClass = createEClass(AI_MODEL_FLAW);
		createEReference(aiModelFlawEClass, AI_MODEL_FLAW__DEGRADES);

		performanceMetricEClass = createEClass(PERFORMANCE_METRIC);
		createEAttribute(performanceMetricEClass, PERFORMANCE_METRIC__NAME);
		createEAttribute(performanceMetricEClass, PERFORMANCE_METRIC__MIN_THRESHOLD);
		createEAttribute(performanceMetricEClass, PERFORMANCE_METRIC__MAX_THRESHOLD);
		createEReference(performanceMetricEClass, PERFORMANCE_METRIC__ENSURES);

		dataCleaningTechniqueEClass = createEClass(DATA_CLEANING_TECHNIQUE);
		createEAttribute(dataCleaningTechniqueEClass, DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND);

		dataTransformationTechniqueEClass = createEClass(DATA_TRANSFORMATION_TECHNIQUE);
		createEAttribute(dataTransformationTechniqueEClass, DATA_TRANSFORMATION_TECHNIQUE__TECHNIQUE_KIND);

		dataDiscretizationTechniqueEClass = createEClass(DATA_DISCRETIZATION_TECHNIQUE);
		createEAttribute(dataDiscretizationTechniqueEClass, DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND);

		dataReductionTechniqueEClass = createEClass(DATA_REDUCTION_TECHNIQUE);
		createEAttribute(dataReductionTechniqueEClass, DATA_REDUCTION_TECHNIQUE__TECHNIQUE_KIND);

		dataIntegrationTechniqueEClass = createEClass(DATA_INTEGRATION_TECHNIQUE);

		dataAugmentationTechniqueEClass = createEClass(DATA_AUGMENTATION_TECHNIQUE);

		featureExtractionTechniqueEClass = createEClass(FEATURE_EXTRACTION_TECHNIQUE);
		createEAttribute(featureExtractionTechniqueEClass, FEATURE_EXTRACTION_TECHNIQUE__TECHNIQUE_KIND);

		featureSelectionTechniqueEClass = createEClass(FEATURE_SELECTION_TECHNIQUE);
		createEAttribute(featureSelectionTechniqueEClass, FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND);

		managementRoleEClass = createEClass(MANAGEMENT_ROLE);

		domainRoleEClass = createEClass(DOMAIN_ROLE);

		dataRoleEClass = createEClass(DATA_ROLE);

		aiModelServingRoleEClass = createEClass(AI_MODEL_SERVING_ROLE);

		groupManagerEClass = createEClass(GROUP_MANAGER);

		teamLeadEClass = createEClass(TEAM_LEAD);

		projectLeadEClass = createEClass(PROJECT_LEAD);

		dataConsumerEClass = createEClass(DATA_CONSUMER);

		businessUserEClass = createEClass(BUSINESS_USER);

		businessAnalystEClass = createEClass(BUSINESS_ANALYST);

		domainExpertEClass = createEClass(DOMAIN_EXPERT);

		dataScientistEClass = createEClass(DATA_SCIENTIST);

		dataEngineerEClass = createEClass(DATA_ENGINEER);

		dataStewardEClass = createEClass(DATA_STEWARD);

		dataProviderEClass = createEClass(DATA_PROVIDER);

		dataAnnotatorEClass = createEClass(DATA_ANNOTATOR);
		createEAttribute(dataAnnotatorEClass, DATA_ANNOTATOR__IS_EXTERNAL);

		architectEClass = createEClass(ARCHITECT);

		softwareEngineerEClass = createEClass(SOFTWARE_ENGINEER);

		modelOperatorEClass = createEClass(MODEL_OPERATOR);

		// Create enums
		participationKindEEnum = createEEnum(PARTICIPATION_KIND);
		aiEthicsKindEEnum = createEEnum(AI_ETHICS_KIND);
		deploymentStrategyKindEEnum = createEEnum(DEPLOYMENT_STRATEGY_KIND);
		deploymentPatternKindEEnum = createEEnum(DEPLOYMENT_PATTERN_KIND);
		inferenceModeKindEEnum = createEEnum(INFERENCE_MODE_KIND);
		dataCleaningTechniqueKindEEnum = createEEnum(DATA_CLEANING_TECHNIQUE_KIND);
		dataTransformationTechniqueKindEEnum = createEEnum(DATA_TRANSFORMATION_TECHNIQUE_KIND);
		dataDiscretizationTechniqueKindEEnum = createEEnum(DATA_DISCRETIZATION_TECHNIQUE_KIND);
		dataReductionTechniqueKindEEnum = createEEnum(DATA_REDUCTION_TECHNIQUE_KIND);
		featureExtractionTechniqueKindEEnum = createEEnum(FEATURE_EXTRACTION_TECHNIQUE_KIND);
		featureSelectionTechniqueKindEEnum = createEEnum(FEATURE_SELECTION_TECHNIQUE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		locatedElementEClass.getESuperTypes().add(this.getNamedElement());
		resourceEClass.getESuperTypes().add(this.getLocatedElement());
		artifactEClass.getESuperTypes().add(this.getLocatedElement());
		documentEClass.getESuperTypes().add(this.getArtifact());
		templateEClass.getESuperTypes().add(this.getResource());
		executableEClass.getESuperTypes().add(this.getResource());
		platformEClass.getESuperTypes().add(this.getExecutable());
		scriptEClass.getESuperTypes().add(this.getExecutable());
		guidelineEClass.getESuperTypes().add(this.getResource());
		techniqueEClass.getESuperTypes().add(this.getResource());
		businessUnderstandingActivityEClass.getESuperTypes().add(this.getActivity());
		requirementsEngineeringActivityEClass.getESuperTypes().add(this.getActivity());
		dataIdentificationActivityEClass.getESuperTypes().add(this.getActivity());
		aiModelRequirementEClass.getESuperTypes().add(this.getRequirement());
		businessGoalEClass.getESuperTypes().add(this.getGoal());
		aiModelGoalEClass.getESuperTypes().add(this.getGoal());
		businessSuccessCriterionEClass.getESuperTypes().add(this.getSuccessCriterion());
		aiModelSuccessCriterionEClass.getESuperTypes().add(this.getSuccessCriterion());
		dataSourceEClass.getESuperTypes().add(this.getResource());
		dataSourceRequirementEClass.getESuperTypes().add(this.getRequirement());
		dataRequirementEClass.getESuperTypes().add(this.getRequirement());
		aiEthicalRequirementEClass.getESuperTypes().add(this.getAIModelRequirement());
		aiModelDegradationEClass.getESuperTypes().add(this.getAIModelRequirement());
		dataPreparationActivityEClass.getESuperTypes().add(this.getActivity());
		dataCollectionActivityEClass.getESuperTypes().add(this.getActivity());
		dataProcessingActivityEClass.getESuperTypes().add(this.getActivity());
		dataEngineeringTechniqueEClass.getESuperTypes().add(this.getTechnique());
		dataAnnotationGuidelineEClass.getESuperTypes().add(this.getGuideline());
		dataEClass.getESuperTypes().add(this.getArtifact());
		featureEngineeringTechniqueEClass.getESuperTypes().add(this.getTechnique());
		featureEngineeringActivityEClass.getESuperTypes().add(this.getActivity());
		aiModelingActivityEClass.getESuperTypes().add(this.getActivity());
		aiModelTrainingActivityEClass.getESuperTypes().add(this.getActivity());
		aiModelingTechniqueEClass.getESuperTypes().add(this.getTechnique());
		aiModelEvaluationActivityEClass.getESuperTypes().add(this.getActivity());
		trainingDatasetEClass.getESuperTypes().add(this.getAIModelDataset());
		validationDatasetEClass.getESuperTypes().add(this.getAIModelDataset());
		testDatasetEClass.getESuperTypes().add(this.getAIModelDataset());
		aiModelDatasetEClass.getESuperTypes().add(this.getArtifact());
		operationsActivityEClass.getESuperTypes().add(this.getActivity());
		aiModelDeploymentActivityEClass.getESuperTypes().add(this.getActivity());
		aiModelMonitoringActivityEClass.getESuperTypes().add(this.getActivity());
		issueEClass.getESuperTypes().add(this.getAIModelObservation());
		aiModelFlawEClass.getESuperTypes().add(this.getAIModelObservation());
		performanceMetricEClass.getESuperTypes().add(this.getAIModelObservation());
		dataCleaningTechniqueEClass.getESuperTypes().add(this.getDataEngineeringTechnique());
		dataTransformationTechniqueEClass.getESuperTypes().add(this.getDataEngineeringTechnique());
		dataDiscretizationTechniqueEClass.getESuperTypes().add(this.getDataEngineeringTechnique());
		dataReductionTechniqueEClass.getESuperTypes().add(this.getDataEngineeringTechnique());
		dataIntegrationTechniqueEClass.getESuperTypes().add(this.getDataEngineeringTechnique());
		dataAugmentationTechniqueEClass.getESuperTypes().add(this.getDataEngineeringTechnique());
		featureExtractionTechniqueEClass.getESuperTypes().add(this.getFeatureEngineeringTechnique());
		featureSelectionTechniqueEClass.getESuperTypes().add(this.getFeatureEngineeringTechnique());
		managementRoleEClass.getESuperTypes().add(this.getRole());
		domainRoleEClass.getESuperTypes().add(this.getRole());
		dataRoleEClass.getESuperTypes().add(this.getRole());
		aiModelServingRoleEClass.getESuperTypes().add(this.getRole());
		groupManagerEClass.getESuperTypes().add(this.getManagementRole());
		teamLeadEClass.getESuperTypes().add(this.getManagementRole());
		projectLeadEClass.getESuperTypes().add(this.getManagementRole());
		dataConsumerEClass.getESuperTypes().add(this.getDomainRole());
		businessUserEClass.getESuperTypes().add(this.getDomainRole());
		businessAnalystEClass.getESuperTypes().add(this.getDomainRole());
		domainExpertEClass.getESuperTypes().add(this.getBusinessUser());
		dataScientistEClass.getESuperTypes().add(this.getDataRole());
		dataEngineerEClass.getESuperTypes().add(this.getDataRole());
		dataStewardEClass.getESuperTypes().add(this.getDataEngineer());
		dataProviderEClass.getESuperTypes().add(this.getDataEngineer());
		dataAnnotatorEClass.getESuperTypes().add(this.getDataEngineer());
		architectEClass.getESuperTypes().add(this.getAIModelServingRole());
		softwareEngineerEClass.getESuperTypes().add(this.getAIModelServingRole());
		modelOperatorEClass.getESuperTypes().add(this.getAIModelServingRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_IsOptional(), ecorePackage.getEBoolean(), "isOptional", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_RequiresAllSubactivities(), ecorePackage.getEBoolean(), "requiresAllSubactivities",
				null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Inputs(), this.getArtifact(), null, "inputs", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Outputs(), this.getArtifact(), null, "outputs", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Resources(), this.getResource(), null, "resources", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Techniques(), this.getTechnique(), null, "techniques", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Participants(), this.getParticipant(), null, "participants", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Next(), this.getActivity(), null, "next", null, 0, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getActivity_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Subactivities(), this.getActivity(), null, "subactivities", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locatedElementEClass, LocatedElement.class, "LocatedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocatedElement_Path(), ecorePackage.getEString(), "path", null, 0, 1, LocatedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Description(), ecorePackage.getEString(), "description", null, 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_IsDeliverable(), ecorePackage.getEBoolean(), "isDeliverable", null, 0, 1,
				Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Template(), this.getTemplate(), null, "template", null, 0, 1, Document.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableEClass, Executable.class, "Executable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Code(), ecorePackage.getEString(), "code", null, 1, 1, Script.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guidelineEClass, Guideline.class, "Guideline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(techniqueEClass, Technique.class, "Technique", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnique_Script(), this.getScript(), null, "script", null, 0, 1, Technique.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_Participation(), this.getParticipationKind(), "participation", null, 0, 1,
				Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Role(), this.getRole(), null, "role", null, 1, 1, Participant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessUnderstandingActivityEClass, BusinessUnderstandingActivity.class,
				"BusinessUnderstandingActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementsEngineeringActivityEClass, RequirementsEngineeringActivity.class,
				"RequirementsEngineeringActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsEngineeringActivity_Goals(), this.getBusinessGoal(), null, "goals", null, 0, -1,
				RequirementsEngineeringActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsEngineeringActivity_Requirements(), this.getRequirement(), null, "requirements",
				null, 0, -1, RequirementsEngineeringActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataIdentificationActivityEClass, DataIdentificationActivity.class, "DataIdentificationActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataIdentificationActivity_Identifies(), this.getDataSource(), null, "identifies", null, 0,
				-1, DataIdentificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(aiModelRequirementEClass, AIModelRequirement.class, "AIModelRequirement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessGoalEClass, BusinessGoal.class, "BusinessGoal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessGoal_Criteria(), this.getBusinessSuccessCriterion(), null, "criteria", null, 1, -1,
				BusinessGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelGoalEClass, AIModelGoal.class, "AIModelGoal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelGoal_AlignedTo(), this.getBusinessGoal(), null, "alignedTo", null, 1, 1,
				AIModelGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelGoal_Criteria(), this.getAIModelSuccessCriterion(), null, "criteria", null, 1, -1,
				AIModelGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessSuccessCriterionEClass, BusinessSuccessCriterion.class, "BusinessSuccessCriterion",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiModelSuccessCriterionEClass, AIModelSuccessCriterion.class, "AIModelSuccessCriterion",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelSuccessCriterion_AlignedTo(), this.getBusinessSuccessCriterion(), null, "alignedTo",
				null, 1, 1, AIModelSuccessCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelSuccessCriterion_CriterionValue(), this.getCriterionValue(),
				this.getCriterionValue_Aimodelsuccesscriterion(), "criterionValue", null, 0, -1,
				AIModelSuccessCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Description(), ecorePackage.getEString(), "description", null, 1, 1, Goal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successCriterionEClass, SuccessCriterion.class, "SuccessCriterion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuccessCriterion_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SuccessCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessCriterion_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SuccessCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessCriterion_Baseline(), ecorePackage.getEFloat(), "baseline", null, 0, 1,
				SuccessCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessCriterion_Target(), ecorePackage.getEFloat(), "target", null, 0, 1,
				SuccessCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_IsExternal(), ecorePackage.getEBoolean(), "isExternal", null, 0, 1,
				DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_IsSelected(), ecorePackage.getEBoolean(), "isSelected", null, 0, 1,
				DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_CompliesWith(), this.getDataSourceRequirement(), null, "compliesWith", null, 0, -1,
				DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceRequirementEClass, DataSourceRequirement.class, "DataSourceRequirement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRequirementEClass, DataRequirement.class, "DataRequirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiEthicalRequirementEClass, AIEthicalRequirement.class, "AIEthicalRequirement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIEthicalRequirement_Ethic(), this.getAIEthicsKind(), "ethic", null, 1, 1,
				AIEthicalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelDegradationEClass, AIModelDegradation.class, "AIModelDegradation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, Method.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Activities(), this.getActivity(), null, "activities", null, 1, -1, Method.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Method.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Resources(), this.getResource(), null, "resources", null, 0, -1, Method.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Roles(), this.getRole(), null, "roles", null, 0, -1, Method.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dataPreparationActivityEClass, DataPreparationActivity.class, "DataPreparationActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPreparationActivity_TrainingDataset(), this.getTrainingDataset(), null, "trainingDataset",
				null, 0, 1, DataPreparationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPreparationActivity_ValidationDataset(), this.getValidationDataset(), null,
				"validationDataset", null, 0, 1, DataPreparationActivity.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPreparationActivity_TestDataset(), this.getTestDataset(), null, "testDataset", null, 0, 1,
				DataPreparationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCollectionActivityEClass, DataCollectionActivity.class, "DataCollectionActivity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCollectionActivity_Collects(), this.getData(), null, "collects", null, 0, -1,
				DataCollectionActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollectionActivity_Sources(), this.getDataSource(), null, "sources", null, 0, -1,
				DataCollectionActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataProcessingActivityEClass, DataProcessingActivity.class, "DataProcessingActivity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProcessingActivity_Labels(), this.getLabel(), null, "labels", null, 0, -1,
				DataProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProcessingActivity_Processes(), this.getData(), null, "processes", null, 0, -1,
				DataProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEngineeringTechniqueEClass, DataEngineeringTechnique.class, "DataEngineeringTechnique",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAnnotationGuidelineEClass, DataAnnotationGuideline.class, "DataAnnotationGuideline",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Labels(), this.getLabel(), null, "labels", null, 0, -1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getData_Attributes(), this.getDataAttribute(), null, "attributes", null, 1, -1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEngineeringTechniqueEClass, FeatureEngineeringTechnique.class, "FeatureEngineeringTechnique",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEngineeringActivityEClass, FeatureEngineeringActivity.class, "FeatureEngineeringActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureEngineeringActivity_ExtractsFrom(), this.getData(), null, "extractsFrom", null, 0, -1,
				FeatureEngineeringActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureEngineeringActivity_Creates(), this.getFeature(), null, "creates", null, 0, -1,
				FeatureEngineeringActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_From(), this.getDataAttribute(), null, "from", null, 1, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_CorrelatedTo(), this.getFeature(), null, "correlatedTo", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAttributeEClass, DataAttribute.class, "DataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelingActivityEClass, AIModelingActivity.class, "AIModelingActivity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiModelTrainingActivityEClass, AIModelTrainingActivity.class, "AIModelTrainingActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelTrainingActivity_TrainsWith(), this.getTrainingDataset(), null, "trainsWith", null, 0,
				1, AIModelTrainingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelTrainingActivity_ValidatesWith(), this.getValidationDataset(), null, "validatesWith",
				null, 0, 1, AIModelTrainingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelTrainingActivity_Trains(), this.getAIModel(), null, "trains", null, 0, -1,
				AIModelTrainingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelTrainingActivity_OptimalValues(), this.getOptimalValue(),
				this.getOptimalValue_AiModelTrainingActivity(), "optimalValues", null, 0, -1,
				AIModelTrainingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelingTechniqueEClass, AIModelingTechnique.class, "AIModelingTechnique", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelingTechnique_Hyperparameters(), this.getHyperParameter(), null, "hyperparameters",
				null, 0, -1, AIModelingTechnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelEvaluationActivityEClass, AIModelEvaluationActivity.class, "AIModelEvaluationActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelEvaluationActivity_EvaluatesWith(), this.getTestDataset(), null, "evaluatesWith", null,
				0, 1, AIModelEvaluationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelEvaluationActivity_Evaluates(), this.getAIModel(), null, "evaluates", null, 0, -1,
				AIModelEvaluationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModelEvaluationActivity_CriteriaValues(), this.getCriterionValue(),
				this.getCriterionValue_AiModelEvaluationActivity(), "criteriaValues", null, 0, -1,
				AIModelEvaluationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingDatasetEClass, TrainingDataset.class, "TrainingDataset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainingDataset_Data(), this.getData(), null, "data", null, 1, -1, TrainingDataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationDatasetEClass, ValidationDataset.class, "ValidationDataset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidationDataset_Data(), this.getData(), null, "data", null, 1, -1, ValidationDataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testDatasetEClass, TestDataset.class, "TestDataset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestDataset_Data(), this.getData(), null, "data", null, 1, -1, TestDataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelEClass, AIModel.class, "AIModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIModel_Rank(), ecorePackage.getEFloat(), "rank", null, 0, 1, AIModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_CriteriaValues(), this.getCriterionValue(), null, "criteriaValues", null, 0, -1,
				AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_Goal(), this.getAIModelGoal(), null, "goal", null, 1, 1, AIModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAIModel_SatisfiedRequirements(), this.getAIModelRequirement(), null, "satisfiedRequirements",
				null, 0, -1, AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_OptimalValues(), this.getOptimalValue(), null, "optimalValues", null, 0, -1,
				AIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAIModel_BasedOn(), this.getAIModelingTechnique(), null, "basedOn", null, 1, 1, AIModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criterionValueEClass, CriterionValue.class, "CriterionValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriterionValue_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, CriterionValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterionValue_Aimodelsuccesscriterion(), this.getAIModelSuccessCriterion(),
				this.getAIModelSuccessCriterion_CriterionValue(), "aimodelsuccesscriterion", null, 1, 1,
				CriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterionValue_AiModelEvaluationActivity(), this.getAIModelEvaluationActivity(),
				this.getAIModelEvaluationActivity_CriteriaValues(), "aiModelEvaluationActivity", null, 1, 1,
				CriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hyperParameterEClass, HyperParameter.class, "HyperParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHyperParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, HyperParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHyperParameter_OptimalValues(), this.getOptimalValue(), this.getOptimalValue_Hyperparameter(),
				"optimalValues", null, 0, -1, HyperParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimalValueEClass, OptimalValue.class, "OptimalValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimalValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, OptimalValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimalValue_Hyperparameter(), this.getHyperParameter(),
				this.getHyperParameter_OptimalValues(), "hyperparameter", null, 1, 1, OptimalValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOptimalValue_AiModelTrainingActivity(), this.getAIModelTrainingActivity(),
				this.getAIModelTrainingActivity_OptimalValues(), "aiModelTrainingActivity", null, 1, 1,
				OptimalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelDatasetEClass, AIModelDataset.class, "AIModelDataset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationsActivityEClass, OperationsActivity.class, "OperationsActivity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiModelDeploymentActivityEClass, AIModelDeploymentActivity.class, "AIModelDeploymentActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelDeploymentActivity_Deploys(), this.getAIModel(), null, "deploys", null, 0, -1,
				AIModelDeploymentActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelMonitoringActivityEClass, AIModelMonitoringActivity.class, "AIModelMonitoringActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelMonitoringActivity_Monitors(), this.getDeployedAIModel(), null, "monitors", null, 0,
				-1, AIModelMonitoringActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedAIModelEClass, DeployedAIModel.class, "DeployedAIModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployedAIModel_Platform(), this.getPlatform(), null, "platform", null, 0, 1,
				DeployedAIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedAIModel_Pattern(), this.getDeploymentPatternKind(), "pattern", null, 0, 1,
				DeployedAIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedAIModel_Strategy(), this.getDeploymentStrategyKind(), "strategy", null, 0, 1,
				DeployedAIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedAIModel_Inference(), this.getInferenceModeKind(), "inference", null, 0, 1,
				DeployedAIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedAIModel_Api(), ecorePackage.getEString(), "api", null, 0, 1, DeployedAIModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedAIModel_Observations(), this.getAIModelObservation(), null, "observations", null, 0,
				-1, DeployedAIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiModelObservationEClass, AIModelObservation.class, "AIModelObservation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiModelFlawEClass, AIModelFlaw.class, "AIModelFlaw", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAIModelFlaw_Degrades(), this.getAIModelRequirement(), null, "degrades", null, 1, 1,
				AIModelFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceMetricEClass, PerformanceMetric.class, "PerformanceMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PerformanceMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceMetric_MinThreshold(), ecorePackage.getEFloat(), "minThreshold", null, 0, 1,
				PerformanceMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceMetric_MaxThreshold(), ecorePackage.getEFloat(), "maxThreshold", null, 0, 1,
				PerformanceMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceMetric_Ensures(), this.getAIModelSuccessCriterion(), null, "ensures", null, 1, 1,
				PerformanceMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCleaningTechniqueEClass, DataCleaningTechnique.class, "DataCleaningTechnique", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCleaningTechnique_TechniqueKind(), this.getDataCleaningTechniqueKind(), "techniqueKind",
				null, 0, 1, DataCleaningTechnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTransformationTechniqueEClass, DataTransformationTechnique.class, "DataTransformationTechnique",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTransformationTechnique_TechniqueKind(), this.getDataTransformationTechniqueKind(),
				"techniqueKind", null, 0, 1, DataTransformationTechnique.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDiscretizationTechniqueEClass, DataDiscretizationTechnique.class, "DataDiscretizationTechnique",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDiscretizationTechnique_TechniqueKind(), this.getDataDiscretizationTechniqueKind(),
				"techniqueKind", null, 0, 1, DataDiscretizationTechnique.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataReductionTechniqueEClass, DataReductionTechnique.class, "DataReductionTechnique", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataReductionTechnique_TechniqueKind(), this.getDataReductionTechniqueKind(), "techniqueKind",
				null, 0, 1, DataReductionTechnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataIntegrationTechniqueEClass, DataIntegrationTechnique.class, "DataIntegrationTechnique",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAugmentationTechniqueEClass, DataAugmentationTechnique.class, "DataAugmentationTechnique",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureExtractionTechniqueEClass, FeatureExtractionTechnique.class, "FeatureExtractionTechnique",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureExtractionTechnique_TechniqueKind(), this.getFeatureExtractionTechniqueKind(),
				"techniqueKind", null, 0, 1, FeatureExtractionTechnique.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSelectionTechniqueEClass, FeatureSelectionTechnique.class, "FeatureSelectionTechnique",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureSelectionTechnique_TechniqueKind(), this.getFeatureSelectionTechniqueKind(),
				"techniqueKind", null, 0, 1, FeatureSelectionTechnique.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managementRoleEClass, ManagementRole.class, "ManagementRole", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainRoleEClass, DomainRole.class, "DomainRole", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRoleEClass, DataRole.class, "DataRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiModelServingRoleEClass, AIModelServingRole.class, "AIModelServingRole", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupManagerEClass, GroupManager.class, "GroupManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(teamLeadEClass, TeamLead.class, "TeamLead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectLeadEClass, ProjectLead.class, "ProjectLead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataConsumerEClass, DataConsumer.class, "DataConsumer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessUserEClass, BusinessUser.class, "BusinessUser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessAnalystEClass, BusinessAnalyst.class, "BusinessAnalyst", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainExpertEClass, DomainExpert.class, "DomainExpert", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataScientistEClass, DataScientist.class, "DataScientist", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEngineerEClass, DataEngineer.class, "DataEngineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStewardEClass, DataSteward.class, "DataSteward", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataProviderEClass, DataProvider.class, "DataProvider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAnnotatorEClass, DataAnnotator.class, "DataAnnotator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAnnotator_IsExternal(), ecorePackage.getEBoolean(), "isExternal", null, 0, 1,
				DataAnnotator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(architectEClass, Architect.class, "Architect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareEngineerEClass, SoftwareEngineer.class, "SoftwareEngineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelOperatorEClass, ModelOperator.class, "ModelOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(participationKindEEnum, ParticipationKind.class, "ParticipationKind");
		addEEnumLiteral(participationKindEEnum, ParticipationKind.RESPONSIBLE);
		addEEnumLiteral(participationKindEEnum, ParticipationKind.ACCOUNTABLE);
		addEEnumLiteral(participationKindEEnum, ParticipationKind.CONSULTED);
		addEEnumLiteral(participationKindEEnum, ParticipationKind.INFORMED);

		initEEnum(aiEthicsKindEEnum, AIEthicsKind.class, "AIEthicsKind");
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.PRIVACY);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.ACCOUNTABILITY);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.SAFETY_SECURITY);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.TRANSPARENCY_EXPLAINABILITY);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.FAIRNESS);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.HUMAN_CONTROL);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.PROFESSIONAL_RESPONSIBILITY);
		addEEnumLiteral(aiEthicsKindEEnum, AIEthicsKind.HUMAN_VALUES);

		initEEnum(deploymentStrategyKindEEnum, DeploymentStrategyKind.class, "DeploymentStrategyKind");
		addEEnumLiteral(deploymentStrategyKindEEnum, DeploymentStrategyKind.SINGLE_DEPLOYMENT);
		addEEnumLiteral(deploymentStrategyKindEEnum, DeploymentStrategyKind.SILENT_DEPLOYMENT);
		addEEnumLiteral(deploymentStrategyKindEEnum, DeploymentStrategyKind.CANARY_DEPLOYMENT);
		addEEnumLiteral(deploymentStrategyKindEEnum, DeploymentStrategyKind.MULTI_ARMED_BANDIT);

		initEEnum(deploymentPatternKindEEnum, DeploymentPatternKind.class, "DeploymentPatternKind");
		addEEnumLiteral(deploymentPatternKindEEnum, DeploymentPatternKind.STATICALLY);
		addEEnumLiteral(deploymentPatternKindEEnum, DeploymentPatternKind.DYNAMICALLY_ON_USER_DEVICE);
		addEEnumLiteral(deploymentPatternKindEEnum, DeploymentPatternKind.DYNAMICALLY_ON_SERVER);
		addEEnumLiteral(deploymentPatternKindEEnum, DeploymentPatternKind.STREAMING);

		initEEnum(inferenceModeKindEEnum, InferenceModeKind.class, "InferenceModeKind");
		addEEnumLiteral(inferenceModeKindEEnum, InferenceModeKind.BATCH);
		addEEnumLiteral(inferenceModeKindEEnum, InferenceModeKind.REAL_TIME);

		initEEnum(dataCleaningTechniqueKindEEnum, DataCleaningTechniqueKind.class, "DataCleaningTechniqueKind");
		addEEnumLiteral(dataCleaningTechniqueKindEEnum, DataCleaningTechniqueKind.DELETION);
		addEEnumLiteral(dataCleaningTechniqueKindEEnum, DataCleaningTechniqueKind.DUMMY_SUBSTITUTION);
		addEEnumLiteral(dataCleaningTechniqueKindEEnum, DataCleaningTechniqueKind.MEAN_SUBSTITUTION);
		addEEnumLiteral(dataCleaningTechniqueKindEEnum, DataCleaningTechniqueKind.FREQUENT_SUBSTITUTION);
		addEEnumLiteral(dataCleaningTechniqueKindEEnum, DataCleaningTechniqueKind.REGRESSION_SUBSTITUTION);

		initEEnum(dataTransformationTechniqueKindEEnum, DataTransformationTechniqueKind.class,
				"DataTransformationTechniqueKind");
		addEEnumLiteral(dataTransformationTechniqueKindEEnum, DataTransformationTechniqueKind.MIN_MAX_NORMALIZATION);
		addEEnumLiteral(dataTransformationTechniqueKindEEnum, DataTransformationTechniqueKind.ZSCORE_NORMALIZATION);
		addEEnumLiteral(dataTransformationTechniqueKindEEnum, DataTransformationTechniqueKind.DECIMAL_SCALING);

		initEEnum(dataDiscretizationTechniqueKindEEnum, DataDiscretizationTechniqueKind.class,
				"DataDiscretizationTechniqueKind");
		addEEnumLiteral(dataDiscretizationTechniqueKindEEnum, DataDiscretizationTechniqueKind.EQUAL_WIDTH_BINNING);
		addEEnumLiteral(dataDiscretizationTechniqueKindEEnum, DataDiscretizationTechniqueKind.EQUAL_HEIGHT_BINNING);

		initEEnum(dataReductionTechniqueKindEEnum, DataReductionTechniqueKind.class, "DataReductionTechniqueKind");
		addEEnumLiteral(dataReductionTechniqueKindEEnum, DataReductionTechniqueKind.RECORD_SAMPLING);
		addEEnumLiteral(dataReductionTechniqueKindEEnum, DataReductionTechniqueKind.ATTRIBUTE_SAMPLING);
		addEEnumLiteral(dataReductionTechniqueKindEEnum, DataReductionTechniqueKind.AGGREGATION);

		initEEnum(featureExtractionTechniqueKindEEnum, FeatureExtractionTechniqueKind.class,
				"FeatureExtractionTechniqueKind");
		addEEnumLiteral(featureExtractionTechniqueKindEEnum, FeatureExtractionTechniqueKind.CLUSTER_ANALYSIS);
		addEEnumLiteral(featureExtractionTechniqueKindEEnum, FeatureExtractionTechniqueKind.TEXT_ANALYTICS);
		addEEnumLiteral(featureExtractionTechniqueKindEEnum, FeatureExtractionTechniqueKind.EDGE_DETECTION);
		addEEnumLiteral(featureExtractionTechniqueKindEEnum,
				FeatureExtractionTechniqueKind.PRINCIPAL_COMPONENTS_ANALYSIS);

		initEEnum(featureSelectionTechniqueKindEEnum, FeatureSelectionTechniqueKind.class,
				"FeatureSelectionTechniqueKind");
		addEEnumLiteral(featureSelectionTechniqueKindEEnum, FeatureSelectionTechniqueKind.REGULARIZATION);
		addEEnumLiteral(featureSelectionTechniqueKindEEnum, FeatureSelectionTechniqueKind.WRAPPER);
		addEEnumLiteral(featureSelectionTechniqueKindEEnum, FeatureSelectionTechniqueKind.GREEDY_ALGORITHM);

		// Create resource
		createResource(eNS_URI);
	}

} //Dsl4aiPackageImpl
