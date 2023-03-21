/**
 */
package edu.uoc.som.dsl4ai;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiFactory
 * @model kind="package"
 * @generated
 */
public interface Dsl4aiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl4ai";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.uoc.som/dsl4ai/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl4ai";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dsl4aiPackage eINSTANCE = edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TECHNIQUES = 6;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARTICIPANTS = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NEXT = 8;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RATIONALE = 9;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUBACTIVITIES = 10;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.NamedElementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.LocatedElementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ResourceImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = LOCATED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH = LOCATED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ArtifactImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = LOCATED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATH = LOCATED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_DELIVERABLE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DocumentImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PATH = ARTIFACT__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IS_DELIVERABLE = ARTIFACT__IS_DELIVERABLE;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TEMPLATE = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.TemplateImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PATH = RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ExecutableImpl <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ExecutableImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__PATH = RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.PlatformImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = EXECUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__PATH = EXECUTABLE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DESCRIPTION = EXECUTABLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = EXECUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ScriptImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = EXECUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__PATH = EXECUTABLE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__DESCRIPTION = EXECUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CODE = EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = EXECUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.GuidelineImpl <em>Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.GuidelineImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getGuideline()
	 * @generated
	 */
	int GUIDELINE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__PATH = RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.RoleImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.TechniqueImpl <em>Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.TechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTechnique()
	 * @generated
	 */
	int TECHNIQUE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__PATH = RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__SCRIPT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ParticipantImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 13;

	/**
	 * The feature id for the '<em><b>Participation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PARTICIPATION = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.BusinessUnderstandingActivityImpl <em>Business Understanding Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.BusinessUnderstandingActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessUnderstandingActivity()
	 * @generated
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The number of structural features of the '<em>Business Understanding Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Understanding Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNDERSTANDING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.RequirementsEngineeringActivityImpl <em>Requirements Engineering Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.RequirementsEngineeringActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getRequirementsEngineeringActivity()
	 * @generated
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Engineering Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirements Engineering Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_ENGINEERING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataIdentificationActivityImpl <em>Data Identification Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataIdentificationActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataIdentificationActivity()
	 * @generated
	 */
	int DATA_IDENTIFICATION_ACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Identifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Identification Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Identification Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFICATION_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.RequirementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RATIONALE = 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelRequirementImpl <em>AI Model Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelRequirementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelRequirement()
	 * @generated
	 */
	int AI_MODEL_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_REQUIREMENT__RATIONALE = REQUIREMENT__RATIONALE;

	/**
	 * The number of structural features of the '<em>AI Model Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AI Model Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.GoalImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.BusinessGoalImpl <em>Business Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.BusinessGoalImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessGoal()
	 * @generated
	 */
	int BUSINESS_GOAL = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__DESCRIPTION = GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__CRITERIA = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelGoalImpl <em>AI Model Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelGoalImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelGoal()
	 * @generated
	 */
	int AI_MODEL_GOAL = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_GOAL__DESCRIPTION = GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Aligned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_GOAL__ALIGNED_TO = GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_GOAL__CRITERIA = GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AI Model Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AI Model Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.SuccessCriterionImpl <em>Success Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.SuccessCriterionImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getSuccessCriterion()
	 * @generated
	 */
	int SUCCESS_CRITERION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_CRITERION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_CRITERION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_CRITERION__BASELINE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_CRITERION__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Success Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_CRITERION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Success Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_CRITERION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.BusinessSuccessCriterionImpl <em>Business Success Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.BusinessSuccessCriterionImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessSuccessCriterion()
	 * @generated
	 */
	int BUSINESS_SUCCESS_CRITERION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SUCCESS_CRITERION__NAME = SUCCESS_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SUCCESS_CRITERION__DESCRIPTION = SUCCESS_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SUCCESS_CRITERION__BASELINE = SUCCESS_CRITERION__BASELINE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SUCCESS_CRITERION__TARGET = SUCCESS_CRITERION__TARGET;

	/**
	 * The number of structural features of the '<em>Business Success Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SUCCESS_CRITERION_FEATURE_COUNT = SUCCESS_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Success Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SUCCESS_CRITERION_OPERATION_COUNT = SUCCESS_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelSuccessCriterionImpl <em>AI Model Success Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelSuccessCriterionImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelSuccessCriterion()
	 * @generated
	 */
	int AI_MODEL_SUCCESS_CRITERION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION__NAME = SUCCESS_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION__DESCRIPTION = SUCCESS_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION__BASELINE = SUCCESS_CRITERION__BASELINE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION__TARGET = SUCCESS_CRITERION__TARGET;

	/**
	 * The feature id for the '<em><b>Aligned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO = SUCCESS_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criterion Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE = SUCCESS_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AI Model Success Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION_FEATURE_COUNT = SUCCESS_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AI Model Success Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SUCCESS_CRITERION_OPERATION_COUNT = SUCCESS_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataSourceImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PATH = RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__IS_EXTERNAL = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__IS_SELECTED = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complies With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__COMPLIES_WITH = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataSourceRequirementImpl <em>Data Source Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataSourceRequirementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataSourceRequirement()
	 * @generated
	 */
	int DATA_SOURCE_REQUIREMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_REQUIREMENT__RATIONALE = REQUIREMENT__RATIONALE;

	/**
	 * The number of structural features of the '<em>Data Source Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Source Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataRequirementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataRequirement()
	 * @generated
	 */
	int DATA_REQUIREMENT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__RATIONALE = REQUIREMENT__RATIONALE;

	/**
	 * The number of structural features of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIEthicalRequirementImpl <em>AI Ethical Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIEthicalRequirementImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIEthicalRequirement()
	 * @generated
	 */
	int AI_ETHICAL_REQUIREMENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_ETHICAL_REQUIREMENT__NAME = AI_MODEL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_ETHICAL_REQUIREMENT__RATIONALE = AI_MODEL_REQUIREMENT__RATIONALE;

	/**
	 * The feature id for the '<em><b>Ethic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_ETHICAL_REQUIREMENT__ETHIC = AI_MODEL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AI Ethical Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_ETHICAL_REQUIREMENT_FEATURE_COUNT = AI_MODEL_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AI Ethical Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_ETHICAL_REQUIREMENT_OPERATION_COUNT = AI_MODEL_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelDegradationImpl <em>AI Model Degradation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelDegradationImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelDegradation()
	 * @generated
	 */
	int AI_MODEL_DEGRADATION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEGRADATION__NAME = AI_MODEL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEGRADATION__RATIONALE = AI_MODEL_REQUIREMENT__RATIONALE;

	/**
	 * The number of structural features of the '<em>AI Model Degradation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEGRADATION_FEATURE_COUNT = AI_MODEL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AI Model Degradation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEGRADATION_OPERATION_COUNT = AI_MODEL_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.MethodImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ACTIVITIES = 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ARTIFACTS = 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ROLES = 4;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl <em>Data Preparation Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataPreparationActivity()
	 * @generated
	 */
	int DATA_PREPARATION_ACTIVITY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Training Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__TRAINING_DATASET = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validation Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY__TEST_DATASET = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Preparation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Preparation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREPARATION_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataCollectionActivityImpl <em>Data Collection Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataCollectionActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataCollectionActivity()
	 * @generated
	 */
	int DATA_COLLECTION_ACTIVITY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Collects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__COLLECTS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY__SOURCES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Collection Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Collection Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataProcessingActivityImpl <em>Data Processing Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataProcessingActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataProcessingActivity()
	 * @generated
	 */
	int DATA_PROCESSING_ACTIVITY = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__LABELS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY__PROCESSES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Processing Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Processing Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataEngineeringTechniqueImpl <em>Data Engineering Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataEngineeringTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataEngineeringTechnique()
	 * @generated
	 */
	int DATA_ENGINEERING_TECHNIQUE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEERING_TECHNIQUE__NAME = TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEERING_TECHNIQUE__PATH = TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEERING_TECHNIQUE__DESCRIPTION = TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEERING_TECHNIQUE__SCRIPT = TECHNIQUE__SCRIPT;

	/**
	 * The number of structural features of the '<em>Data Engineering Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT = TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Engineering Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT = TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataAnnotationGuidelineImpl <em>Data Annotation Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataAnnotationGuidelineImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAnnotationGuideline()
	 * @generated
	 */
	int DATA_ANNOTATION_GUIDELINE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_GUIDELINE__NAME = GUIDELINE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_GUIDELINE__PATH = GUIDELINE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_GUIDELINE__DESCRIPTION = GUIDELINE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Data Annotation Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_GUIDELINE_FEATURE_COUNT = GUIDELINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Annotation Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_GUIDELINE_OPERATION_COUNT = GUIDELINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.LabelImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getData()
	 * @generated
	 */
	int DATA = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATH = ARTIFACT__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__IS_DELIVERABLE = ARTIFACT__IS_DELIVERABLE;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LABELS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ATTRIBUTES = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.FeatureEngineeringTechniqueImpl <em>Feature Engineering Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.FeatureEngineeringTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureEngineeringTechnique()
	 * @generated
	 */
	int FEATURE_ENGINEERING_TECHNIQUE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_TECHNIQUE__NAME = TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_TECHNIQUE__PATH = TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_TECHNIQUE__DESCRIPTION = TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_TECHNIQUE__SCRIPT = TECHNIQUE__SCRIPT;

	/**
	 * The number of structural features of the '<em>Feature Engineering Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_TECHNIQUE_FEATURE_COUNT = TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Engineering Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_TECHNIQUE_OPERATION_COUNT = TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.FeatureEngineeringActivityImpl <em>Feature Engineering Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.FeatureEngineeringActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureEngineeringActivity()
	 * @generated
	 */
	int FEATURE_ENGINEERING_ACTIVITY = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Extracts From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY__CREATES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Engineering Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Engineering Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENGINEERING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.FeatureImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FROM = 2;

	/**
	 * The feature id for the '<em><b>Correlated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CORRELATED_TO = 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataAttributeImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAttribute()
	 * @generated
	 */
	int DATA_ATTRIBUTE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelingActivityImpl <em>AI Modeling Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelingActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelingActivity()
	 * @generated
	 */
	int AI_MODELING_ACTIVITY = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The number of structural features of the '<em>AI Modeling Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AI Modeling Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl <em>AI Model Training Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelTrainingActivity()
	 * @generated
	 */
	int AI_MODEL_TRAINING_ACTIVITY = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Trains With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validates With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__TRAINS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optimal Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AI Model Training Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>AI Model Training Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_TRAINING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelingTechniqueImpl <em>AI Modeling Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelingTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelingTechnique()
	 * @generated
	 */
	int AI_MODELING_TECHNIQUE = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE__NAME = TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE__PATH = TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE__DESCRIPTION = TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE__SCRIPT = TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Hyperparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE__HYPERPARAMETERS = TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AI Modeling Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE_FEATURE_COUNT = TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AI Modeling Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODELING_TECHNIQUE_OPERATION_COUNT = TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl <em>AI Model Evaluation Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelEvaluationActivity()
	 * @generated
	 */
	int AI_MODEL_EVALUATION_ACTIVITY = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Evaluates With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evaluates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__EVALUATES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criteria Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AI Model Evaluation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>AI Model Evaluation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_EVALUATION_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelDatasetImpl <em>AI Model Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelDatasetImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelDataset()
	 * @generated
	 */
	int AI_MODEL_DATASET = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DATASET__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DATASET__PATH = ARTIFACT__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DATASET__IS_DELIVERABLE = ARTIFACT__IS_DELIVERABLE;

	/**
	 * The number of structural features of the '<em>AI Model Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DATASET_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AI Model Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DATASET_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.TrainingDatasetImpl <em>Training Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.TrainingDatasetImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTrainingDataset()
	 * @generated
	 */
	int TRAINING_DATASET = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATASET__NAME = AI_MODEL_DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATASET__PATH = AI_MODEL_DATASET__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATASET__IS_DELIVERABLE = AI_MODEL_DATASET__IS_DELIVERABLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATASET__DATA = AI_MODEL_DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATASET_FEATURE_COUNT = AI_MODEL_DATASET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Training Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATASET_OPERATION_COUNT = AI_MODEL_DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ValidationDatasetImpl <em>Validation Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ValidationDatasetImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getValidationDataset()
	 * @generated
	 */
	int VALIDATION_DATASET = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_DATASET__NAME = AI_MODEL_DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_DATASET__PATH = AI_MODEL_DATASET__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_DATASET__IS_DELIVERABLE = AI_MODEL_DATASET__IS_DELIVERABLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_DATASET__DATA = AI_MODEL_DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validation Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_DATASET_FEATURE_COUNT = AI_MODEL_DATASET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Validation Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_DATASET_OPERATION_COUNT = AI_MODEL_DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.TestDatasetImpl <em>Test Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.TestDatasetImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTestDataset()
	 * @generated
	 */
	int TEST_DATASET = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATASET__NAME = AI_MODEL_DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATASET__PATH = AI_MODEL_DATASET__PATH;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATASET__IS_DELIVERABLE = AI_MODEL_DATASET__IS_DELIVERABLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATASET__DATA = AI_MODEL_DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATASET_FEATURE_COUNT = AI_MODEL_DATASET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATASET_OPERATION_COUNT = AI_MODEL_DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelImpl <em>AI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModel()
	 * @generated
	 */
	int AI_MODEL = 49;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__RANK = 0;

	/**
	 * The feature id for the '<em><b>Criteria Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__CRITERIA_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__GOAL = 2;

	/**
	 * The feature id for the '<em><b>Satisfied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__SATISFIED_REQUIREMENTS = 3;

	/**
	 * The feature id for the '<em><b>Optimal Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__OPTIMAL_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL__BASED_ON = 5;

	/**
	 * The number of structural features of the '<em>AI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>AI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.CriterionValueImpl <em>Criterion Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.CriterionValueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getCriterionValue()
	 * @generated
	 */
	int CRITERION_VALUE = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Aimodelsuccesscriterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_VALUE__AIMODELSUCCESSCRITERION = 1;

	/**
	 * The feature id for the '<em><b>Ai Model Evaluation Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Criterion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Criterion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.HyperParameterImpl <em>Hyper Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.HyperParameterImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getHyperParameter()
	 * @generated
	 */
	int HYPER_PARAMETER = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Optimal Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_PARAMETER__OPTIMAL_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Hyper Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hyper Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.OptimalValueImpl <em>Optimal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.OptimalValueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getOptimalValue()
	 * @generated
	 */
	int OPTIMAL_VALUE = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMAL_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Hyperparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMAL_VALUE__HYPERPARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Ai Model Training Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Optimal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMAL_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Optimal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.OperationsActivityImpl <em>Operations Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.OperationsActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getOperationsActivity()
	 * @generated
	 */
	int OPERATIONS_ACTIVITY = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The number of structural features of the '<em>Operations Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operations Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelDeploymentActivityImpl <em>AI Model Deployment Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelDeploymentActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelDeploymentActivity()
	 * @generated
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Deploys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AI Model Deployment Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AI Model Deployment Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_DEPLOYMENT_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelMonitoringActivityImpl <em>AI Model Monitoring Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelMonitoringActivityImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelMonitoringActivity()
	 * @generated
	 */
	int AI_MODEL_MONITORING_ACTIVITY = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__IS_OPTIONAL = ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires All Subactivities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = ACTIVITY__REQUIRES_ALL_SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__TECHNIQUES = ACTIVITY__TECHNIQUES;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__PARTICIPANTS = ACTIVITY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__NEXT = ACTIVITY__NEXT;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__RATIONALE = ACTIVITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Subactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__SUBACTIVITIES = ACTIVITY__SUBACTIVITIES;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY__MONITORS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AI Model Monitoring Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AI Model Monitoring Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_MONITORING_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl <em>Deployed AI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDeployedAIModel()
	 * @generated
	 */
	int DEPLOYED_AI_MODEL = 57;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL__PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL__STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Inference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL__INFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL__API = 4;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL__OBSERVATIONS = 5;

	/**
	 * The number of structural features of the '<em>Deployed AI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Deployed AI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_AI_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelObservationImpl <em>AI Model Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelObservationImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelObservation()
	 * @generated
	 */
	int AI_MODEL_OBSERVATION = 58;

	/**
	 * The number of structural features of the '<em>AI Model Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_OBSERVATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>AI Model Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_OBSERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.IssueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 59;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = AI_MODEL_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = AI_MODEL_OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelFlawImpl <em>AI Model Flaw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelFlawImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelFlaw()
	 * @generated
	 */
	int AI_MODEL_FLAW = 60;

	/**
	 * The feature id for the '<em><b>Degrades</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_FLAW__DEGRADES = AI_MODEL_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AI Model Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_FLAW_FEATURE_COUNT = AI_MODEL_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AI Model Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_FLAW_OPERATION_COUNT = AI_MODEL_OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl <em>Performance Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getPerformanceMetric()
	 * @generated
	 */
	int PERFORMANCE_METRIC = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC__NAME = AI_MODEL_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC__MIN_THRESHOLD = AI_MODEL_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC__MAX_THRESHOLD = AI_MODEL_OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ensures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC__ENSURES = AI_MODEL_OBSERVATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Performance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_FEATURE_COUNT = AI_MODEL_OBSERVATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Performance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_OPERATION_COUNT = AI_MODEL_OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataCleaningTechniqueImpl <em>Data Cleaning Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataCleaningTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataCleaningTechnique()
	 * @generated
	 */
	int DATA_CLEANING_TECHNIQUE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE__NAME = DATA_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE__PATH = DATA_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE__DESCRIPTION = DATA_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE__SCRIPT = DATA_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Technique Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Cleaning Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE_FEATURE_COUNT = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Cleaning Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_TECHNIQUE_OPERATION_COUNT = DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataTransformationTechniqueImpl <em>Data Transformation Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataTransformationTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataTransformationTechnique()
	 * @generated
	 */
	int DATA_TRANSFORMATION_TECHNIQUE = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE__NAME = DATA_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE__PATH = DATA_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE__DESCRIPTION = DATA_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE__SCRIPT = DATA_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Technique Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE__TECHNIQUE_KIND = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Transformation Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE_FEATURE_COUNT = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Transformation Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_TECHNIQUE_OPERATION_COUNT = DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataDiscretizationTechniqueImpl <em>Data Discretization Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataDiscretizationTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataDiscretizationTechnique()
	 * @generated
	 */
	int DATA_DISCRETIZATION_TECHNIQUE = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE__NAME = DATA_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE__PATH = DATA_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE__DESCRIPTION = DATA_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE__SCRIPT = DATA_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Technique Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Discretization Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE_FEATURE_COUNT = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Discretization Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISCRETIZATION_TECHNIQUE_OPERATION_COUNT = DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataReductionTechniqueImpl <em>Data Reduction Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataReductionTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataReductionTechnique()
	 * @generated
	 */
	int DATA_REDUCTION_TECHNIQUE = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE__NAME = DATA_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE__PATH = DATA_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE__DESCRIPTION = DATA_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE__SCRIPT = DATA_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Technique Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE__TECHNIQUE_KIND = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Reduction Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE_FEATURE_COUNT = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Reduction Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REDUCTION_TECHNIQUE_OPERATION_COUNT = DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataIntegrationTechniqueImpl <em>Data Integration Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataIntegrationTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataIntegrationTechnique()
	 * @generated
	 */
	int DATA_INTEGRATION_TECHNIQUE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TECHNIQUE__NAME = DATA_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TECHNIQUE__PATH = DATA_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TECHNIQUE__DESCRIPTION = DATA_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TECHNIQUE__SCRIPT = DATA_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The number of structural features of the '<em>Data Integration Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TECHNIQUE_FEATURE_COUNT = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Integration Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TECHNIQUE_OPERATION_COUNT = DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataAugmentationTechniqueImpl <em>Data Augmentation Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataAugmentationTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAugmentationTechnique()
	 * @generated
	 */
	int DATA_AUGMENTATION_TECHNIQUE = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AUGMENTATION_TECHNIQUE__NAME = DATA_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AUGMENTATION_TECHNIQUE__PATH = DATA_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AUGMENTATION_TECHNIQUE__DESCRIPTION = DATA_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AUGMENTATION_TECHNIQUE__SCRIPT = DATA_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The number of structural features of the '<em>Data Augmentation Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AUGMENTATION_TECHNIQUE_FEATURE_COUNT = DATA_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Augmentation Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AUGMENTATION_TECHNIQUE_OPERATION_COUNT = DATA_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.FeatureExtractionTechniqueImpl <em>Feature Extraction Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.FeatureExtractionTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureExtractionTechnique()
	 * @generated
	 */
	int FEATURE_EXTRACTION_TECHNIQUE = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE__NAME = FEATURE_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE__PATH = FEATURE_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE__DESCRIPTION = FEATURE_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE__SCRIPT = FEATURE_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Technique Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE__TECHNIQUE_KIND = FEATURE_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Extraction Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE_FEATURE_COUNT = FEATURE_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Extraction Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXTRACTION_TECHNIQUE_OPERATION_COUNT = FEATURE_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.FeatureSelectionTechniqueImpl <em>Feature Selection Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.FeatureSelectionTechniqueImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureSelectionTechnique()
	 * @generated
	 */
	int FEATURE_SELECTION_TECHNIQUE = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE__NAME = FEATURE_ENGINEERING_TECHNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE__PATH = FEATURE_ENGINEERING_TECHNIQUE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE__DESCRIPTION = FEATURE_ENGINEERING_TECHNIQUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE__SCRIPT = FEATURE_ENGINEERING_TECHNIQUE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Technique Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND = FEATURE_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Selection Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE_FEATURE_COUNT = FEATURE_ENGINEERING_TECHNIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Selection Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_TECHNIQUE_OPERATION_COUNT = FEATURE_ENGINEERING_TECHNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ManagementRoleImpl <em>Management Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ManagementRoleImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getManagementRole()
	 * @generated
	 */
	int MANAGEMENT_ROLE = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_ROLE__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Management Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Management Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DomainRoleImpl <em>Domain Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DomainRoleImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDomainRole()
	 * @generated
	 */
	int DOMAIN_ROLE = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Domain Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataRoleImpl <em>Data Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataRoleImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataRole()
	 * @generated
	 */
	int DATA_ROLE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ROLE__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Data Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.AIModelServingRoleImpl <em>AI Model Serving Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.AIModelServingRoleImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelServingRole()
	 * @generated
	 */
	int AI_MODEL_SERVING_ROLE = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SERVING_ROLE__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>AI Model Serving Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SERVING_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AI Model Serving Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_MODEL_SERVING_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.GroupManagerImpl <em>Group Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.GroupManagerImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getGroupManager()
	 * @generated
	 */
	int GROUP_MANAGER = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MANAGER__NAME = MANAGEMENT_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Group Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MANAGER_FEATURE_COUNT = MANAGEMENT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MANAGER_OPERATION_COUNT = MANAGEMENT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.TeamLeadImpl <em>Team Lead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.TeamLeadImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTeamLead()
	 * @generated
	 */
	int TEAM_LEAD = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_LEAD__NAME = MANAGEMENT_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Team Lead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_LEAD_FEATURE_COUNT = MANAGEMENT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Team Lead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_LEAD_OPERATION_COUNT = MANAGEMENT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ProjectLeadImpl <em>Project Lead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ProjectLeadImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getProjectLead()
	 * @generated
	 */
	int PROJECT_LEAD = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LEAD__NAME = MANAGEMENT_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Project Lead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LEAD_FEATURE_COUNT = MANAGEMENT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Lead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LEAD_OPERATION_COUNT = MANAGEMENT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataConsumerImpl <em>Data Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataConsumerImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataConsumer()
	 * @generated
	 */
	int DATA_CONSUMER = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSUMER__NAME = DOMAIN_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Data Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSUMER_FEATURE_COUNT = DOMAIN_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSUMER_OPERATION_COUNT = DOMAIN_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.BusinessUserImpl <em>Business User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.BusinessUserImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessUser()
	 * @generated
	 */
	int BUSINESS_USER = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_USER__NAME = DOMAIN_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Business User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_USER_FEATURE_COUNT = DOMAIN_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_USER_OPERATION_COUNT = DOMAIN_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.BusinessAnalystImpl <em>Business Analyst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.BusinessAnalystImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessAnalyst()
	 * @generated
	 */
	int BUSINESS_ANALYST = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ANALYST__NAME = DOMAIN_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Business Analyst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ANALYST_FEATURE_COUNT = DOMAIN_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Analyst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ANALYST_OPERATION_COUNT = DOMAIN_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DomainExpertImpl <em>Domain Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DomainExpertImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDomainExpert()
	 * @generated
	 */
	int DOMAIN_EXPERT = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXPERT__NAME = BUSINESS_USER__NAME;

	/**
	 * The number of structural features of the '<em>Domain Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXPERT_FEATURE_COUNT = BUSINESS_USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EXPERT_OPERATION_COUNT = BUSINESS_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataScientistImpl <em>Data Scientist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataScientistImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataScientist()
	 * @generated
	 */
	int DATA_SCIENTIST = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCIENTIST__NAME = DATA_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Data Scientist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCIENTIST_FEATURE_COUNT = DATA_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Scientist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCIENTIST_OPERATION_COUNT = DATA_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataEngineerImpl <em>Data Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataEngineerImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataEngineer()
	 * @generated
	 */
	int DATA_ENGINEER = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEER__NAME = DATA_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Data Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEER_FEATURE_COUNT = DATA_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENGINEER_OPERATION_COUNT = DATA_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataStewardImpl <em>Data Steward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataStewardImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataSteward()
	 * @generated
	 */
	int DATA_STEWARD = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STEWARD__NAME = DATA_ENGINEER__NAME;

	/**
	 * The number of structural features of the '<em>Data Steward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STEWARD_FEATURE_COUNT = DATA_ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Steward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STEWARD_OPERATION_COUNT = DATA_ENGINEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataProviderImpl <em>Data Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataProviderImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataProvider()
	 * @generated
	 */
	int DATA_PROVIDER = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__NAME = DATA_ENGINEER__NAME;

	/**
	 * The number of structural features of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_FEATURE_COUNT = DATA_ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_OPERATION_COUNT = DATA_ENGINEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.DataAnnotatorImpl <em>Data Annotator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.DataAnnotatorImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAnnotator()
	 * @generated
	 */
	int DATA_ANNOTATOR = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATOR__NAME = DATA_ENGINEER__NAME;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATOR__IS_EXTERNAL = DATA_ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Annotator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATOR_FEATURE_COUNT = DATA_ENGINEER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Annotator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATOR_OPERATION_COUNT = DATA_ENGINEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ArchitectImpl <em>Architect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ArchitectImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getArchitect()
	 * @generated
	 */
	int ARCHITECT = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECT__NAME = AI_MODEL_SERVING_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Architect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECT_FEATURE_COUNT = AI_MODEL_SERVING_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Architect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECT_OPERATION_COUNT = AI_MODEL_SERVING_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.SoftwareEngineerImpl <em>Software Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.SoftwareEngineerImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getSoftwareEngineer()
	 * @generated
	 */
	int SOFTWARE_ENGINEER = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER__NAME = AI_MODEL_SERVING_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Software Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER_FEATURE_COUNT = AI_MODEL_SERVING_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Software Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER_OPERATION_COUNT = AI_MODEL_SERVING_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.impl.ModelOperatorImpl <em>Model Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.impl.ModelOperatorImpl
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getModelOperator()
	 * @generated
	 */
	int MODEL_OPERATOR = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATOR__NAME = AI_MODEL_SERVING_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Model Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATOR_FEATURE_COUNT = AI_MODEL_SERVING_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATOR_OPERATION_COUNT = AI_MODEL_SERVING_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.ParticipationKind <em>Participation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.ParticipationKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getParticipationKind()
	 * @generated
	 */
	int PARTICIPATION_KIND = 89;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.AIEthicsKind <em>AI Ethics Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.AIEthicsKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIEthicsKind()
	 * @generated
	 */
	int AI_ETHICS_KIND = 90;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.DeploymentStrategyKind <em>Deployment Strategy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.DeploymentStrategyKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDeploymentStrategyKind()
	 * @generated
	 */
	int DEPLOYMENT_STRATEGY_KIND = 91;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.DeploymentPatternKind <em>Deployment Pattern Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.DeploymentPatternKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDeploymentPatternKind()
	 * @generated
	 */
	int DEPLOYMENT_PATTERN_KIND = 92;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.InferenceModeKind <em>Inference Mode Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.InferenceModeKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getInferenceModeKind()
	 * @generated
	 */
	int INFERENCE_MODE_KIND = 93;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.DataCleaningTechniqueKind <em>Data Cleaning Technique Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechniqueKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataCleaningTechniqueKind()
	 * @generated
	 */
	int DATA_CLEANING_TECHNIQUE_KIND = 94;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.DataTransformationTechniqueKind <em>Data Transformation Technique Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.DataTransformationTechniqueKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataTransformationTechniqueKind()
	 * @generated
	 */
	int DATA_TRANSFORMATION_TECHNIQUE_KIND = 95;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind <em>Data Discretization Technique Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataDiscretizationTechniqueKind()
	 * @generated
	 */
	int DATA_DISCRETIZATION_TECHNIQUE_KIND = 96;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.DataReductionTechniqueKind <em>Data Reduction Technique Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.DataReductionTechniqueKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataReductionTechniqueKind()
	 * @generated
	 */
	int DATA_REDUCTION_TECHNIQUE_KIND = 97;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind <em>Feature Extraction Technique Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureExtractionTechniqueKind()
	 * @generated
	 */
	int FEATURE_EXTRACTION_TECHNIQUE_KIND = 98;

	/**
	 * The meta object id for the '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind <em>Feature Selection Technique Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind
	 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureSelectionTechniqueKind()
	 * @generated
	 */
	int FEATURE_SELECTION_TECHNIQUE_KIND = 99;

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Activity#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#isIsOptional()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Activity#isRequiresAllSubactivities <em>Requires All Subactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires All Subactivities</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#isRequiresAllSubactivities()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_RequiresAllSubactivities();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Activity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getOutputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Outputs();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Activity#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getResources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Resources();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Activity#getTechniques <em>Techniques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Techniques</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getTechniques()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Techniques();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Activity#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getParticipants()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Participants();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.Activity#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getNext()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Next();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Activity#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getRationale()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Rationale();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Activity#getSubactivities <em>Subactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subactivities</em>'.
	 * @see edu.uoc.som.dsl4ai.Activity#getSubactivities()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Subactivities();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see edu.uoc.som.dsl4ai.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.LocatedElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see edu.uoc.som.dsl4ai.LocatedElement#getPath()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Path();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see edu.uoc.som.dsl4ai.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see edu.uoc.som.dsl4ai.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.dsl4ai.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see edu.uoc.som.dsl4ai.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Artifact#isIsDeliverable <em>Is Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deliverable</em>'.
	 * @see edu.uoc.som.dsl4ai.Artifact#isIsDeliverable()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_IsDeliverable();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see edu.uoc.som.dsl4ai.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.Document#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see edu.uoc.som.dsl4ai.Document#getTemplate()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Template();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see edu.uoc.som.dsl4ai.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see edu.uoc.som.dsl4ai.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see edu.uoc.som.dsl4ai.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see edu.uoc.som.dsl4ai.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Script#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.dsl4ai.Script#getCode()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Code();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guideline</em>'.
	 * @see edu.uoc.som.dsl4ai.Guideline
	 * @generated
	 */
	EClass getGuideline();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.uoc.som.dsl4ai.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Technique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.Technique
	 * @generated
	 */
	EClass getTechnique();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.Technique#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see edu.uoc.som.dsl4ai.Technique#getScript()
	 * @see #getTechnique()
	 * @generated
	 */
	EReference getTechnique_Script();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see edu.uoc.som.dsl4ai.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Participant#getParticipation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Participation</em>'.
	 * @see edu.uoc.som.dsl4ai.Participant#getParticipation()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Participation();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.Participant#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.uoc.som.dsl4ai.Participant#getRole()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Role();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.BusinessUnderstandingActivity <em>Business Understanding Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Understanding Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.BusinessUnderstandingActivity
	 * @generated
	 */
	EClass getBusinessUnderstandingActivity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.RequirementsEngineeringActivity <em>Requirements Engineering Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Engineering Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.RequirementsEngineeringActivity
	 * @generated
	 */
	EClass getRequirementsEngineeringActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.RequirementsEngineeringActivity#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see edu.uoc.som.dsl4ai.RequirementsEngineeringActivity#getGoals()
	 * @see #getRequirementsEngineeringActivity()
	 * @generated
	 */
	EReference getRequirementsEngineeringActivity_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.RequirementsEngineeringActivity#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see edu.uoc.som.dsl4ai.RequirementsEngineeringActivity#getRequirements()
	 * @see #getRequirementsEngineeringActivity()
	 * @generated
	 */
	EReference getRequirementsEngineeringActivity_Requirements();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataIdentificationActivity <em>Data Identification Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Identification Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.DataIdentificationActivity
	 * @generated
	 */
	EClass getDataIdentificationActivity();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.DataIdentificationActivity#getIdentifies <em>Identifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifies</em>'.
	 * @see edu.uoc.som.dsl4ai.DataIdentificationActivity#getIdentifies()
	 * @see #getDataIdentificationActivity()
	 * @generated
	 */
	EReference getDataIdentificationActivity_Identifies();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see edu.uoc.som.dsl4ai.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Requirement#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see edu.uoc.som.dsl4ai.Requirement#getRationale()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Rationale();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelRequirement <em>AI Model Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Requirement</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelRequirement
	 * @generated
	 */
	EClass getAIModelRequirement();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.BusinessGoal <em>Business Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Goal</em>'.
	 * @see edu.uoc.som.dsl4ai.BusinessGoal
	 * @generated
	 */
	EClass getBusinessGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.BusinessGoal#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see edu.uoc.som.dsl4ai.BusinessGoal#getCriteria()
	 * @see #getBusinessGoal()
	 * @generated
	 */
	EReference getBusinessGoal_Criteria();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelGoal <em>AI Model Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Goal</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelGoal
	 * @generated
	 */
	EClass getAIModelGoal();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModelGoal#getAlignedTo <em>Aligned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aligned To</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelGoal#getAlignedTo()
	 * @see #getAIModelGoal()
	 * @generated
	 */
	EReference getAIModelGoal_AlignedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.AIModelGoal#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelGoal#getCriteria()
	 * @see #getAIModelGoal()
	 * @generated
	 */
	EReference getAIModelGoal_Criteria();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.BusinessSuccessCriterion <em>Business Success Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Success Criterion</em>'.
	 * @see edu.uoc.som.dsl4ai.BusinessSuccessCriterion
	 * @generated
	 */
	EClass getBusinessSuccessCriterion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion <em>AI Model Success Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Success Criterion</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelSuccessCriterion
	 * @generated
	 */
	EClass getAIModelSuccessCriterion();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getAlignedTo <em>Aligned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aligned To</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getAlignedTo()
	 * @see #getAIModelSuccessCriterion()
	 * @generated
	 */
	EReference getAIModelSuccessCriterion_AlignedTo();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getCriterionValue <em>Criterion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criterion Value</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelSuccessCriterion#getCriterionValue()
	 * @see #getAIModelSuccessCriterion()
	 * @generated
	 */
	EReference getAIModelSuccessCriterion_CriterionValue();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see edu.uoc.som.dsl4ai.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.dsl4ai.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.SuccessCriterion <em>Success Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Criterion</em>'.
	 * @see edu.uoc.som.dsl4ai.SuccessCriterion
	 * @generated
	 */
	EClass getSuccessCriterion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.SuccessCriterion#getName()
	 * @see #getSuccessCriterion()
	 * @generated
	 */
	EAttribute getSuccessCriterion_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.dsl4ai.SuccessCriterion#getDescription()
	 * @see #getSuccessCriterion()
	 * @generated
	 */
	EAttribute getSuccessCriterion_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline</em>'.
	 * @see edu.uoc.som.dsl4ai.SuccessCriterion#getBaseline()
	 * @see #getSuccessCriterion()
	 * @generated
	 */
	EAttribute getSuccessCriterion_Baseline();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.SuccessCriterion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see edu.uoc.som.dsl4ai.SuccessCriterion#getTarget()
	 * @see #getSuccessCriterion()
	 * @generated
	 */
	EAttribute getSuccessCriterion_Target();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see edu.uoc.som.dsl4ai.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataSource#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see edu.uoc.som.dsl4ai.DataSource#isIsExternal()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_IsExternal();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataSource#isIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see edu.uoc.som.dsl4ai.DataSource#isIsSelected()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_IsSelected();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.DataSource#getCompliesWith <em>Complies With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Complies With</em>'.
	 * @see edu.uoc.som.dsl4ai.DataSource#getCompliesWith()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_CompliesWith();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataSourceRequirement <em>Data Source Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Requirement</em>'.
	 * @see edu.uoc.som.dsl4ai.DataSourceRequirement
	 * @generated
	 */
	EClass getDataSourceRequirement();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement</em>'.
	 * @see edu.uoc.som.dsl4ai.DataRequirement
	 * @generated
	 */
	EClass getDataRequirement();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIEthicalRequirement <em>AI Ethical Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Ethical Requirement</em>'.
	 * @see edu.uoc.som.dsl4ai.AIEthicalRequirement
	 * @generated
	 */
	EClass getAIEthicalRequirement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.AIEthicalRequirement#getEthic <em>Ethic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ethic</em>'.
	 * @see edu.uoc.som.dsl4ai.AIEthicalRequirement#getEthic()
	 * @see #getAIEthicalRequirement()
	 * @generated
	 */
	EAttribute getAIEthicalRequirement_Ethic();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelDegradation <em>AI Model Degradation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Degradation</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelDegradation
	 * @generated
	 */
	EClass getAIModelDegradation();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see edu.uoc.som.dsl4ai.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Method#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see edu.uoc.som.dsl4ai.Method#getActivities()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Method#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see edu.uoc.som.dsl4ai.Method#getArtifacts()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Method#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see edu.uoc.som.dsl4ai.Method#getResources()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Method#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.uoc.som.dsl4ai.Method#getRoles()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Roles();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataPreparationActivity <em>Data Preparation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Preparation Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.DataPreparationActivity
	 * @generated
	 */
	EClass getDataPreparationActivity();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getTrainingDataset <em>Training Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Training Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.DataPreparationActivity#getTrainingDataset()
	 * @see #getDataPreparationActivity()
	 * @generated
	 */
	EReference getDataPreparationActivity_TrainingDataset();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getValidationDataset <em>Validation Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.DataPreparationActivity#getValidationDataset()
	 * @see #getDataPreparationActivity()
	 * @generated
	 */
	EReference getDataPreparationActivity_ValidationDataset();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.dsl4ai.DataPreparationActivity#getTestDataset <em>Test Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.DataPreparationActivity#getTestDataset()
	 * @see #getDataPreparationActivity()
	 * @generated
	 */
	EReference getDataPreparationActivity_TestDataset();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataCollectionActivity <em>Data Collection Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collection Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.DataCollectionActivity
	 * @generated
	 */
	EClass getDataCollectionActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.DataCollectionActivity#getCollects <em>Collects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collects</em>'.
	 * @see edu.uoc.som.dsl4ai.DataCollectionActivity#getCollects()
	 * @see #getDataCollectionActivity()
	 * @generated
	 */
	EReference getDataCollectionActivity_Collects();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.DataCollectionActivity#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see edu.uoc.som.dsl4ai.DataCollectionActivity#getSources()
	 * @see #getDataCollectionActivity()
	 * @generated
	 */
	EReference getDataCollectionActivity_Sources();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataProcessingActivity <em>Data Processing Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.DataProcessingActivity
	 * @generated
	 */
	EClass getDataProcessingActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.DataProcessingActivity#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see edu.uoc.som.dsl4ai.DataProcessingActivity#getLabels()
	 * @see #getDataProcessingActivity()
	 * @generated
	 */
	EReference getDataProcessingActivity_Labels();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.DataProcessingActivity#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see edu.uoc.som.dsl4ai.DataProcessingActivity#getProcesses()
	 * @see #getDataProcessingActivity()
	 * @generated
	 */
	EReference getDataProcessingActivity_Processes();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataEngineeringTechnique <em>Data Engineering Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Engineering Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataEngineeringTechnique
	 * @generated
	 */
	EClass getDataEngineeringTechnique();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataAnnotationGuideline <em>Data Annotation Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Annotation Guideline</em>'.
	 * @see edu.uoc.som.dsl4ai.DataAnnotationGuideline
	 * @generated
	 */
	EClass getDataAnnotationGuideline();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see edu.uoc.som.dsl4ai.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see edu.uoc.som.dsl4ai.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Data#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see edu.uoc.som.dsl4ai.Data#getLabels()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.Data#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see edu.uoc.som.dsl4ai.Data#getAttributes()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Attributes();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.FeatureEngineeringTechnique <em>Feature Engineering Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Engineering Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureEngineeringTechnique
	 * @generated
	 */
	EClass getFeatureEngineeringTechnique();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.FeatureEngineeringActivity <em>Feature Engineering Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Engineering Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureEngineeringActivity
	 * @generated
	 */
	EClass getFeatureEngineeringActivity();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.FeatureEngineeringActivity#getExtractsFrom <em>Extracts From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extracts From</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureEngineeringActivity#getExtractsFrom()
	 * @see #getFeatureEngineeringActivity()
	 * @generated
	 */
	EReference getFeatureEngineeringActivity_ExtractsFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.FeatureEngineeringActivity#getCreates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creates</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureEngineeringActivity#getCreates()
	 * @see #getFeatureEngineeringActivity()
	 * @generated
	 */
	EReference getFeatureEngineeringActivity_Creates();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see edu.uoc.som.dsl4ai.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.dsl4ai.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Feature#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see edu.uoc.som.dsl4ai.Feature#getFrom()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_From();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.Feature#getCorrelatedTo <em>Correlated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correlated To</em>'.
	 * @see edu.uoc.som.dsl4ai.Feature#getCorrelatedTo()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_CorrelatedTo();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataAttribute <em>Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Attribute</em>'.
	 * @see edu.uoc.som.dsl4ai.DataAttribute
	 * @generated
	 */
	EClass getDataAttribute();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.DataAttribute#getName()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EAttribute getDataAttribute_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelingActivity <em>AI Modeling Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Modeling Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelingActivity
	 * @generated
	 */
	EClass getAIModelingActivity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity <em>AI Model Training Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Training Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity
	 * @generated
	 */
	EClass getAIModelTrainingActivity();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrainsWith <em>Trains With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trains With</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrainsWith()
	 * @see #getAIModelTrainingActivity()
	 * @generated
	 */
	EReference getAIModelTrainingActivity_TrainsWith();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getValidatesWith <em>Validates With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validates With</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity#getValidatesWith()
	 * @see #getAIModelTrainingActivity()
	 * @generated
	 */
	EReference getAIModelTrainingActivity_ValidatesWith();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity#getTrains()
	 * @see #getAIModelTrainingActivity()
	 * @generated
	 */
	EReference getAIModelTrainingActivity_Trains();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModelTrainingActivity#getOptimalValues <em>Optimal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optimal Values</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelTrainingActivity#getOptimalValues()
	 * @see #getAIModelTrainingActivity()
	 * @generated
	 */
	EReference getAIModelTrainingActivity_OptimalValues();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelingTechnique <em>AI Modeling Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Modeling Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelingTechnique
	 * @generated
	 */
	EClass getAIModelingTechnique();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.AIModelingTechnique#getHyperparameters <em>Hyperparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hyperparameters</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelingTechnique#getHyperparameters()
	 * @see #getAIModelingTechnique()
	 * @generated
	 */
	EReference getAIModelingTechnique_Hyperparameters();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity <em>AI Model Evaluation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Evaluation Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelEvaluationActivity
	 * @generated
	 */
	EClass getAIModelEvaluationActivity();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluatesWith <em>Evaluates With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluates With</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluatesWith()
	 * @see #getAIModelEvaluationActivity()
	 * @generated
	 */
	EReference getAIModelEvaluationActivity_EvaluatesWith();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluates <em>Evaluates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluates</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getEvaluates()
	 * @see #getAIModelEvaluationActivity()
	 * @generated
	 */
	EReference getAIModelEvaluationActivity_Evaluates();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getCriteriaValues <em>Criteria Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria Values</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelEvaluationActivity#getCriteriaValues()
	 * @see #getAIModelEvaluationActivity()
	 * @generated
	 */
	EReference getAIModelEvaluationActivity_CriteriaValues();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.TrainingDataset <em>Training Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.TrainingDataset
	 * @generated
	 */
	EClass getTrainingDataset();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.TrainingDataset#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see edu.uoc.som.dsl4ai.TrainingDataset#getData()
	 * @see #getTrainingDataset()
	 * @generated
	 */
	EReference getTrainingDataset_Data();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.ValidationDataset <em>Validation Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.ValidationDataset
	 * @generated
	 */
	EClass getValidationDataset();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.ValidationDataset#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see edu.uoc.som.dsl4ai.ValidationDataset#getData()
	 * @see #getValidationDataset()
	 * @generated
	 */
	EReference getValidationDataset_Data();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.TestDataset <em>Test Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.TestDataset
	 * @generated
	 */
	EClass getTestDataset();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.TestDataset#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see edu.uoc.som.dsl4ai.TestDataset#getData()
	 * @see #getTestDataset()
	 * @generated
	 */
	EReference getTestDataset_Data();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModel <em>AI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel
	 * @generated
	 */
	EClass getAIModel();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.AIModel#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel#getRank()
	 * @see #getAIModel()
	 * @generated
	 */
	EAttribute getAIModel_Rank();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.AIModel#getCriteriaValues <em>Criteria Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria Values</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel#getCriteriaValues()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_CriteriaValues();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModel#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel#getGoal()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_Goal();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModel#getSatisfiedRequirements <em>Satisfied Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied Requirements</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel#getSatisfiedRequirements()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_SatisfiedRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.dsl4ai.AIModel#getOptimalValues <em>Optimal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optimal Values</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel#getOptimalValues()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_OptimalValues();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModel#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Based On</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModel#getBasedOn()
	 * @see #getAIModel()
	 * @generated
	 */
	EReference getAIModel_BasedOn();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.CriterionValue <em>Criterion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion Value</em>'.
	 * @see edu.uoc.som.dsl4ai.CriterionValue
	 * @generated
	 */
	EClass getCriterionValue();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.CriterionValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.dsl4ai.CriterionValue#getValue()
	 * @see #getCriterionValue()
	 * @generated
	 */
	EAttribute getCriterionValue_Value();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.CriterionValue#getAimodelsuccesscriterion <em>Aimodelsuccesscriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aimodelsuccesscriterion</em>'.
	 * @see edu.uoc.som.dsl4ai.CriterionValue#getAimodelsuccesscriterion()
	 * @see #getCriterionValue()
	 * @generated
	 */
	EReference getCriterionValue_Aimodelsuccesscriterion();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.CriterionValue#getAiModelEvaluationActivity <em>Ai Model Evaluation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ai Model Evaluation Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.CriterionValue#getAiModelEvaluationActivity()
	 * @see #getCriterionValue()
	 * @generated
	 */
	EReference getCriterionValue_AiModelEvaluationActivity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.HyperParameter <em>Hyper Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Parameter</em>'.
	 * @see edu.uoc.som.dsl4ai.HyperParameter
	 * @generated
	 */
	EClass getHyperParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.HyperParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.HyperParameter#getName()
	 * @see #getHyperParameter()
	 * @generated
	 */
	EAttribute getHyperParameter_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.HyperParameter#getOptimalValues <em>Optimal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optimal Values</em>'.
	 * @see edu.uoc.som.dsl4ai.HyperParameter#getOptimalValues()
	 * @see #getHyperParameter()
	 * @generated
	 */
	EReference getHyperParameter_OptimalValues();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.OptimalValue <em>Optimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimal Value</em>'.
	 * @see edu.uoc.som.dsl4ai.OptimalValue
	 * @generated
	 */
	EClass getOptimalValue();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.OptimalValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.dsl4ai.OptimalValue#getValue()
	 * @see #getOptimalValue()
	 * @generated
	 */
	EAttribute getOptimalValue_Value();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.OptimalValue#getHyperparameter <em>Hyperparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hyperparameter</em>'.
	 * @see edu.uoc.som.dsl4ai.OptimalValue#getHyperparameter()
	 * @see #getOptimalValue()
	 * @generated
	 */
	EReference getOptimalValue_Hyperparameter();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.OptimalValue#getAiModelTrainingActivity <em>Ai Model Training Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ai Model Training Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.OptimalValue#getAiModelTrainingActivity()
	 * @see #getOptimalValue()
	 * @generated
	 */
	EReference getOptimalValue_AiModelTrainingActivity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelDataset <em>AI Model Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Dataset</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelDataset
	 * @generated
	 */
	EClass getAIModelDataset();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.OperationsActivity <em>Operations Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.OperationsActivity
	 * @generated
	 */
	EClass getOperationsActivity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelDeploymentActivity <em>AI Model Deployment Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Deployment Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelDeploymentActivity
	 * @generated
	 */
	EClass getAIModelDeploymentActivity();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModelDeploymentActivity#getDeploys <em>Deploys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deploys</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelDeploymentActivity#getDeploys()
	 * @see #getAIModelDeploymentActivity()
	 * @generated
	 */
	EReference getAIModelDeploymentActivity_Deploys();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelMonitoringActivity <em>AI Model Monitoring Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Monitoring Activity</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelMonitoringActivity
	 * @generated
	 */
	EClass getAIModelMonitoringActivity();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.AIModelMonitoringActivity#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitors</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelMonitoringActivity#getMonitors()
	 * @see #getAIModelMonitoringActivity()
	 * @generated
	 */
	EReference getAIModelMonitoringActivity_Monitors();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DeployedAIModel <em>Deployed AI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed AI Model</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel
	 * @generated
	 */
	EClass getDeployedAIModel();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel#getPlatform()
	 * @see #getDeployedAIModel()
	 * @generated
	 */
	EReference getDeployedAIModel_Platform();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel#getPattern()
	 * @see #getDeployedAIModel()
	 * @generated
	 */
	EAttribute getDeployedAIModel_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel#getStrategy()
	 * @see #getDeployedAIModel()
	 * @generated
	 */
	EAttribute getDeployedAIModel_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getInference <em>Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inference</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel#getInference()
	 * @see #getDeployedAIModel()
	 * @generated
	 */
	EAttribute getDeployedAIModel_Inference();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel#getApi()
	 * @see #getDeployedAIModel()
	 * @generated
	 */
	EAttribute getDeployedAIModel_Api();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.dsl4ai.DeployedAIModel#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observations</em>'.
	 * @see edu.uoc.som.dsl4ai.DeployedAIModel#getObservations()
	 * @see #getDeployedAIModel()
	 * @generated
	 */
	EReference getDeployedAIModel_Observations();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelObservation <em>AI Model Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Observation</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelObservation
	 * @generated
	 */
	EClass getAIModelObservation();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see edu.uoc.som.dsl4ai.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelFlaw <em>AI Model Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Flaw</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelFlaw
	 * @generated
	 */
	EClass getAIModelFlaw();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.AIModelFlaw#getDegrades <em>Degrades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degrades</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelFlaw#getDegrades()
	 * @see #getAIModelFlaw()
	 * @generated
	 */
	EReference getAIModelFlaw_Degrades();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.PerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Metric</em>'.
	 * @see edu.uoc.som.dsl4ai.PerformanceMetric
	 * @generated
	 */
	EClass getPerformanceMetric();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.dsl4ai.PerformanceMetric#getName()
	 * @see #getPerformanceMetric()
	 * @generated
	 */
	EAttribute getPerformanceMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getMinThreshold <em>Min Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Threshold</em>'.
	 * @see edu.uoc.som.dsl4ai.PerformanceMetric#getMinThreshold()
	 * @see #getPerformanceMetric()
	 * @generated
	 */
	EAttribute getPerformanceMetric_MinThreshold();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getMaxThreshold <em>Max Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Threshold</em>'.
	 * @see edu.uoc.som.dsl4ai.PerformanceMetric#getMaxThreshold()
	 * @see #getPerformanceMetric()
	 * @generated
	 */
	EAttribute getPerformanceMetric_MaxThreshold();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.dsl4ai.PerformanceMetric#getEnsures <em>Ensures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ensures</em>'.
	 * @see edu.uoc.som.dsl4ai.PerformanceMetric#getEnsures()
	 * @see #getPerformanceMetric()
	 * @generated
	 */
	EReference getPerformanceMetric_Ensures();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataCleaningTechnique <em>Data Cleaning Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Cleaning Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechnique
	 * @generated
	 */
	EClass getDataCleaningTechnique();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataCleaningTechnique#getTechniqueKind <em>Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechnique#getTechniqueKind()
	 * @see #getDataCleaningTechnique()
	 * @generated
	 */
	EAttribute getDataCleaningTechnique_TechniqueKind();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataTransformationTechnique <em>Data Transformation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transformation Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataTransformationTechnique
	 * @generated
	 */
	EClass getDataTransformationTechnique();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataTransformationTechnique#getTechniqueKind <em>Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataTransformationTechnique#getTechniqueKind()
	 * @see #getDataTransformationTechnique()
	 * @generated
	 */
	EAttribute getDataTransformationTechnique_TechniqueKind();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechnique <em>Data Discretization Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Discretization Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechnique
	 * @generated
	 */
	EClass getDataDiscretizationTechnique();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechnique#getTechniqueKind <em>Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechnique#getTechniqueKind()
	 * @see #getDataDiscretizationTechnique()
	 * @generated
	 */
	EAttribute getDataDiscretizationTechnique_TechniqueKind();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataReductionTechnique <em>Data Reduction Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Reduction Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataReductionTechnique
	 * @generated
	 */
	EClass getDataReductionTechnique();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataReductionTechnique#getTechniqueKind <em>Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataReductionTechnique#getTechniqueKind()
	 * @see #getDataReductionTechnique()
	 * @generated
	 */
	EAttribute getDataReductionTechnique_TechniqueKind();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataIntegrationTechnique <em>Data Integration Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Integration Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataIntegrationTechnique
	 * @generated
	 */
	EClass getDataIntegrationTechnique();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataAugmentationTechnique <em>Data Augmentation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Augmentation Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.DataAugmentationTechnique
	 * @generated
	 */
	EClass getDataAugmentationTechnique();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechnique <em>Feature Extraction Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Extraction Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechnique
	 * @generated
	 */
	EClass getFeatureExtractionTechnique();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechnique#getTechniqueKind <em>Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechnique#getTechniqueKind()
	 * @see #getFeatureExtractionTechnique()
	 * @generated
	 */
	EAttribute getFeatureExtractionTechnique_TechniqueKind();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechnique <em>Feature Selection Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Selection Technique</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechnique
	 * @generated
	 */
	EClass getFeatureSelectionTechnique();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechnique#getTechniqueKind <em>Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechnique#getTechniqueKind()
	 * @see #getFeatureSelectionTechnique()
	 * @generated
	 */
	EAttribute getFeatureSelectionTechnique_TechniqueKind();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.ManagementRole <em>Management Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Role</em>'.
	 * @see edu.uoc.som.dsl4ai.ManagementRole
	 * @generated
	 */
	EClass getManagementRole();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DomainRole <em>Domain Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Role</em>'.
	 * @see edu.uoc.som.dsl4ai.DomainRole
	 * @generated
	 */
	EClass getDomainRole();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataRole <em>Data Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Role</em>'.
	 * @see edu.uoc.som.dsl4ai.DataRole
	 * @generated
	 */
	EClass getDataRole();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.AIModelServingRole <em>AI Model Serving Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Model Serving Role</em>'.
	 * @see edu.uoc.som.dsl4ai.AIModelServingRole
	 * @generated
	 */
	EClass getAIModelServingRole();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.GroupManager <em>Group Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Manager</em>'.
	 * @see edu.uoc.som.dsl4ai.GroupManager
	 * @generated
	 */
	EClass getGroupManager();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.TeamLead <em>Team Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Lead</em>'.
	 * @see edu.uoc.som.dsl4ai.TeamLead
	 * @generated
	 */
	EClass getTeamLead();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.ProjectLead <em>Project Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Lead</em>'.
	 * @see edu.uoc.som.dsl4ai.ProjectLead
	 * @generated
	 */
	EClass getProjectLead();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataConsumer <em>Data Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Consumer</em>'.
	 * @see edu.uoc.som.dsl4ai.DataConsumer
	 * @generated
	 */
	EClass getDataConsumer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.BusinessUser <em>Business User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business User</em>'.
	 * @see edu.uoc.som.dsl4ai.BusinessUser
	 * @generated
	 */
	EClass getBusinessUser();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.BusinessAnalyst <em>Business Analyst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Analyst</em>'.
	 * @see edu.uoc.som.dsl4ai.BusinessAnalyst
	 * @generated
	 */
	EClass getBusinessAnalyst();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DomainExpert <em>Domain Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Expert</em>'.
	 * @see edu.uoc.som.dsl4ai.DomainExpert
	 * @generated
	 */
	EClass getDomainExpert();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataScientist <em>Data Scientist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Scientist</em>'.
	 * @see edu.uoc.som.dsl4ai.DataScientist
	 * @generated
	 */
	EClass getDataScientist();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataEngineer <em>Data Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Engineer</em>'.
	 * @see edu.uoc.som.dsl4ai.DataEngineer
	 * @generated
	 */
	EClass getDataEngineer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataSteward <em>Data Steward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Steward</em>'.
	 * @see edu.uoc.som.dsl4ai.DataSteward
	 * @generated
	 */
	EClass getDataSteward();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Provider</em>'.
	 * @see edu.uoc.som.dsl4ai.DataProvider
	 * @generated
	 */
	EClass getDataProvider();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.DataAnnotator <em>Data Annotator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Annotator</em>'.
	 * @see edu.uoc.som.dsl4ai.DataAnnotator
	 * @generated
	 */
	EClass getDataAnnotator();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.dsl4ai.DataAnnotator#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see edu.uoc.som.dsl4ai.DataAnnotator#isIsExternal()
	 * @see #getDataAnnotator()
	 * @generated
	 */
	EAttribute getDataAnnotator_IsExternal();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.Architect <em>Architect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architect</em>'.
	 * @see edu.uoc.som.dsl4ai.Architect
	 * @generated
	 */
	EClass getArchitect();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.SoftwareEngineer <em>Software Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Engineer</em>'.
	 * @see edu.uoc.som.dsl4ai.SoftwareEngineer
	 * @generated
	 */
	EClass getSoftwareEngineer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.dsl4ai.ModelOperator <em>Model Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Operator</em>'.
	 * @see edu.uoc.som.dsl4ai.ModelOperator
	 * @generated
	 */
	EClass getModelOperator();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.ParticipationKind <em>Participation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.ParticipationKind
	 * @generated
	 */
	EEnum getParticipationKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.AIEthicsKind <em>AI Ethics Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AI Ethics Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.AIEthicsKind
	 * @generated
	 */
	EEnum getAIEthicsKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.DeploymentStrategyKind <em>Deployment Strategy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Strategy Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DeploymentStrategyKind
	 * @generated
	 */
	EEnum getDeploymentStrategyKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.DeploymentPatternKind <em>Deployment Pattern Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Pattern Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DeploymentPatternKind
	 * @generated
	 */
	EEnum getDeploymentPatternKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.InferenceModeKind <em>Inference Mode Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inference Mode Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.InferenceModeKind
	 * @generated
	 */
	EEnum getInferenceModeKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.DataCleaningTechniqueKind <em>Data Cleaning Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Cleaning Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataCleaningTechniqueKind
	 * @generated
	 */
	EEnum getDataCleaningTechniqueKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.DataTransformationTechniqueKind <em>Data Transformation Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Transformation Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataTransformationTechniqueKind
	 * @generated
	 */
	EEnum getDataTransformationTechniqueKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind <em>Data Discretization Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Discretization Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind
	 * @generated
	 */
	EEnum getDataDiscretizationTechniqueKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.DataReductionTechniqueKind <em>Data Reduction Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Reduction Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.DataReductionTechniqueKind
	 * @generated
	 */
	EEnum getDataReductionTechniqueKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind <em>Feature Extraction Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Extraction Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind
	 * @generated
	 */
	EEnum getFeatureExtractionTechniqueKind();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind <em>Feature Selection Technique Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Selection Technique Kind</em>'.
	 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind
	 * @generated
	 */
	EEnum getFeatureSelectionTechniqueKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dsl4aiFactory getDsl4aiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_OPTIONAL = eINSTANCE.getActivity_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Requires All Subactivities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__REQUIRES_ALL_SUBACTIVITIES = eINSTANCE.getActivity_RequiresAllSubactivities();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUTS = eINSTANCE.getActivity_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTPUTS = eINSTANCE.getActivity_Outputs();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RESOURCES = eINSTANCE.getActivity_Resources();

		/**
		 * The meta object literal for the '<em><b>Techniques</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TECHNIQUES = eINSTANCE.getActivity_Techniques();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARTICIPANTS = eINSTANCE.getActivity_Participants();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NEXT = eINSTANCE.getActivity_Next();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__RATIONALE = eINSTANCE.getActivity_Rationale();

		/**
		 * The meta object literal for the '<em><b>Subactivities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SUBACTIVITIES = eINSTANCE.getActivity_Subactivities();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.LocatedElementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__PATH = eINSTANCE.getLocatedElement_Path();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.NamedElementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ResourceImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ArtifactImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Is Deliverable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__IS_DELIVERABLE = eINSTANCE.getArtifact_IsDeliverable();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DocumentImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__TEMPLATE = eINSTANCE.getDocument_Template();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.TemplateImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ExecutableImpl <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ExecutableImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.PlatformImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ScriptImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__CODE = eINSTANCE.getScript_Code();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.GuidelineImpl <em>Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.GuidelineImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getGuideline()
		 * @generated
		 */
		EClass GUIDELINE = eINSTANCE.getGuideline();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.RoleImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.TechniqueImpl <em>Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.TechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTechnique()
		 * @generated
		 */
		EClass TECHNIQUE = eINSTANCE.getTechnique();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNIQUE__SCRIPT = eINSTANCE.getTechnique_Script();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ParticipantImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Participation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__PARTICIPATION = eINSTANCE.getParticipant_Participation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__ROLE = eINSTANCE.getParticipant_Role();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.BusinessUnderstandingActivityImpl <em>Business Understanding Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.BusinessUnderstandingActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessUnderstandingActivity()
		 * @generated
		 */
		EClass BUSINESS_UNDERSTANDING_ACTIVITY = eINSTANCE.getBusinessUnderstandingActivity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.RequirementsEngineeringActivityImpl <em>Requirements Engineering Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.RequirementsEngineeringActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getRequirementsEngineeringActivity()
		 * @generated
		 */
		EClass REQUIREMENTS_ENGINEERING_ACTIVITY = eINSTANCE.getRequirementsEngineeringActivity();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_ENGINEERING_ACTIVITY__GOALS = eINSTANCE.getRequirementsEngineeringActivity_Goals();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_ENGINEERING_ACTIVITY__REQUIREMENTS = eINSTANCE
				.getRequirementsEngineeringActivity_Requirements();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataIdentificationActivityImpl <em>Data Identification Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataIdentificationActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataIdentificationActivity()
		 * @generated
		 */
		EClass DATA_IDENTIFICATION_ACTIVITY = eINSTANCE.getDataIdentificationActivity();

		/**
		 * The meta object literal for the '<em><b>Identifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_IDENTIFICATION_ACTIVITY__IDENTIFIES = eINSTANCE.getDataIdentificationActivity_Identifies();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.RequirementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RATIONALE = eINSTANCE.getRequirement_Rationale();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelRequirementImpl <em>AI Model Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelRequirementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelRequirement()
		 * @generated
		 */
		EClass AI_MODEL_REQUIREMENT = eINSTANCE.getAIModelRequirement();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.BusinessGoalImpl <em>Business Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.BusinessGoalImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessGoal()
		 * @generated
		 */
		EClass BUSINESS_GOAL = eINSTANCE.getBusinessGoal();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_GOAL__CRITERIA = eINSTANCE.getBusinessGoal_Criteria();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelGoalImpl <em>AI Model Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelGoalImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelGoal()
		 * @generated
		 */
		EClass AI_MODEL_GOAL = eINSTANCE.getAIModelGoal();

		/**
		 * The meta object literal for the '<em><b>Aligned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_GOAL__ALIGNED_TO = eINSTANCE.getAIModelGoal_AlignedTo();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_GOAL__CRITERIA = eINSTANCE.getAIModelGoal_Criteria();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.BusinessSuccessCriterionImpl <em>Business Success Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.BusinessSuccessCriterionImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessSuccessCriterion()
		 * @generated
		 */
		EClass BUSINESS_SUCCESS_CRITERION = eINSTANCE.getBusinessSuccessCriterion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelSuccessCriterionImpl <em>AI Model Success Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelSuccessCriterionImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelSuccessCriterion()
		 * @generated
		 */
		EClass AI_MODEL_SUCCESS_CRITERION = eINSTANCE.getAIModelSuccessCriterion();

		/**
		 * The meta object literal for the '<em><b>Aligned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_SUCCESS_CRITERION__ALIGNED_TO = eINSTANCE.getAIModelSuccessCriterion_AlignedTo();

		/**
		 * The meta object literal for the '<em><b>Criterion Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_SUCCESS_CRITERION__CRITERION_VALUE = eINSTANCE.getAIModelSuccessCriterion_CriterionValue();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.GoalImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.SuccessCriterionImpl <em>Success Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.SuccessCriterionImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getSuccessCriterion()
		 * @generated
		 */
		EClass SUCCESS_CRITERION = eINSTANCE.getSuccessCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_CRITERION__NAME = eINSTANCE.getSuccessCriterion_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_CRITERION__DESCRIPTION = eINSTANCE.getSuccessCriterion_Description();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_CRITERION__BASELINE = eINSTANCE.getSuccessCriterion_Baseline();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_CRITERION__TARGET = eINSTANCE.getSuccessCriterion_Target();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataSourceImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__IS_EXTERNAL = eINSTANCE.getDataSource_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__IS_SELECTED = eINSTANCE.getDataSource_IsSelected();

		/**
		 * The meta object literal for the '<em><b>Complies With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__COMPLIES_WITH = eINSTANCE.getDataSource_CompliesWith();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataSourceRequirementImpl <em>Data Source Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataSourceRequirementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataSourceRequirement()
		 * @generated
		 */
		EClass DATA_SOURCE_REQUIREMENT = eINSTANCE.getDataSourceRequirement();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataRequirementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataRequirement()
		 * @generated
		 */
		EClass DATA_REQUIREMENT = eINSTANCE.getDataRequirement();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIEthicalRequirementImpl <em>AI Ethical Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIEthicalRequirementImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIEthicalRequirement()
		 * @generated
		 */
		EClass AI_ETHICAL_REQUIREMENT = eINSTANCE.getAIEthicalRequirement();

		/**
		 * The meta object literal for the '<em><b>Ethic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_ETHICAL_REQUIREMENT__ETHIC = eINSTANCE.getAIEthicalRequirement_Ethic();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelDegradationImpl <em>AI Model Degradation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelDegradationImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelDegradation()
		 * @generated
		 */
		EClass AI_MODEL_DEGRADATION = eINSTANCE.getAIModelDegradation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.MethodImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ACTIVITIES = eINSTANCE.getMethod_Activities();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ARTIFACTS = eINSTANCE.getMethod_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RESOURCES = eINSTANCE.getMethod_Resources();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ROLES = eINSTANCE.getMethod_Roles();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl <em>Data Preparation Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataPreparationActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataPreparationActivity()
		 * @generated
		 */
		EClass DATA_PREPARATION_ACTIVITY = eINSTANCE.getDataPreparationActivity();

		/**
		 * The meta object literal for the '<em><b>Training Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREPARATION_ACTIVITY__TRAINING_DATASET = eINSTANCE.getDataPreparationActivity_TrainingDataset();

		/**
		 * The meta object literal for the '<em><b>Validation Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREPARATION_ACTIVITY__VALIDATION_DATASET = eINSTANCE
				.getDataPreparationActivity_ValidationDataset();

		/**
		 * The meta object literal for the '<em><b>Test Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREPARATION_ACTIVITY__TEST_DATASET = eINSTANCE.getDataPreparationActivity_TestDataset();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataCollectionActivityImpl <em>Data Collection Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataCollectionActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataCollectionActivity()
		 * @generated
		 */
		EClass DATA_COLLECTION_ACTIVITY = eINSTANCE.getDataCollectionActivity();

		/**
		 * The meta object literal for the '<em><b>Collects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION_ACTIVITY__COLLECTS = eINSTANCE.getDataCollectionActivity_Collects();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION_ACTIVITY__SOURCES = eINSTANCE.getDataCollectionActivity_Sources();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataProcessingActivityImpl <em>Data Processing Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataProcessingActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataProcessingActivity()
		 * @generated
		 */
		EClass DATA_PROCESSING_ACTIVITY = eINSTANCE.getDataProcessingActivity();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROCESSING_ACTIVITY__LABELS = eINSTANCE.getDataProcessingActivity_Labels();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROCESSING_ACTIVITY__PROCESSES = eINSTANCE.getDataProcessingActivity_Processes();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataEngineeringTechniqueImpl <em>Data Engineering Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataEngineeringTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataEngineeringTechnique()
		 * @generated
		 */
		EClass DATA_ENGINEERING_TECHNIQUE = eINSTANCE.getDataEngineeringTechnique();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataAnnotationGuidelineImpl <em>Data Annotation Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataAnnotationGuidelineImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAnnotationGuideline()
		 * @generated
		 */
		EClass DATA_ANNOTATION_GUIDELINE = eINSTANCE.getDataAnnotationGuideline();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.LabelImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__LABELS = eINSTANCE.getData_Labels();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ATTRIBUTES = eINSTANCE.getData_Attributes();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.FeatureEngineeringTechniqueImpl <em>Feature Engineering Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.FeatureEngineeringTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureEngineeringTechnique()
		 * @generated
		 */
		EClass FEATURE_ENGINEERING_TECHNIQUE = eINSTANCE.getFeatureEngineeringTechnique();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.FeatureEngineeringActivityImpl <em>Feature Engineering Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.FeatureEngineeringActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureEngineeringActivity()
		 * @generated
		 */
		EClass FEATURE_ENGINEERING_ACTIVITY = eINSTANCE.getFeatureEngineeringActivity();

		/**
		 * The meta object literal for the '<em><b>Extracts From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENGINEERING_ACTIVITY__EXTRACTS_FROM = eINSTANCE.getFeatureEngineeringActivity_ExtractsFrom();

		/**
		 * The meta object literal for the '<em><b>Creates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENGINEERING_ACTIVITY__CREATES = eINSTANCE.getFeatureEngineeringActivity_Creates();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.FeatureImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FROM = eINSTANCE.getFeature_From();

		/**
		 * The meta object literal for the '<em><b>Correlated To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CORRELATED_TO = eINSTANCE.getFeature_CorrelatedTo();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataAttributeImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAttribute()
		 * @generated
		 */
		EClass DATA_ATTRIBUTE = eINSTANCE.getDataAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ATTRIBUTE__NAME = eINSTANCE.getDataAttribute_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelingActivityImpl <em>AI Modeling Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelingActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelingActivity()
		 * @generated
		 */
		EClass AI_MODELING_ACTIVITY = eINSTANCE.getAIModelingActivity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl <em>AI Model Training Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelTrainingActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelTrainingActivity()
		 * @generated
		 */
		EClass AI_MODEL_TRAINING_ACTIVITY = eINSTANCE.getAIModelTrainingActivity();

		/**
		 * The meta object literal for the '<em><b>Trains With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_TRAINING_ACTIVITY__TRAINS_WITH = eINSTANCE.getAIModelTrainingActivity_TrainsWith();

		/**
		 * The meta object literal for the '<em><b>Validates With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_TRAINING_ACTIVITY__VALIDATES_WITH = eINSTANCE.getAIModelTrainingActivity_ValidatesWith();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_TRAINING_ACTIVITY__TRAINS = eINSTANCE.getAIModelTrainingActivity_Trains();

		/**
		 * The meta object literal for the '<em><b>Optimal Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_TRAINING_ACTIVITY__OPTIMAL_VALUES = eINSTANCE.getAIModelTrainingActivity_OptimalValues();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelingTechniqueImpl <em>AI Modeling Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelingTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelingTechnique()
		 * @generated
		 */
		EClass AI_MODELING_TECHNIQUE = eINSTANCE.getAIModelingTechnique();

		/**
		 * The meta object literal for the '<em><b>Hyperparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODELING_TECHNIQUE__HYPERPARAMETERS = eINSTANCE.getAIModelingTechnique_Hyperparameters();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl <em>AI Model Evaluation Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelEvaluationActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelEvaluationActivity()
		 * @generated
		 */
		EClass AI_MODEL_EVALUATION_ACTIVITY = eINSTANCE.getAIModelEvaluationActivity();

		/**
		 * The meta object literal for the '<em><b>Evaluates With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_EVALUATION_ACTIVITY__EVALUATES_WITH = eINSTANCE
				.getAIModelEvaluationActivity_EvaluatesWith();

		/**
		 * The meta object literal for the '<em><b>Evaluates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_EVALUATION_ACTIVITY__EVALUATES = eINSTANCE.getAIModelEvaluationActivity_Evaluates();

		/**
		 * The meta object literal for the '<em><b>Criteria Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_EVALUATION_ACTIVITY__CRITERIA_VALUES = eINSTANCE
				.getAIModelEvaluationActivity_CriteriaValues();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.TrainingDatasetImpl <em>Training Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.TrainingDatasetImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTrainingDataset()
		 * @generated
		 */
		EClass TRAINING_DATASET = eINSTANCE.getTrainingDataset();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_DATASET__DATA = eINSTANCE.getTrainingDataset_Data();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ValidationDatasetImpl <em>Validation Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ValidationDatasetImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getValidationDataset()
		 * @generated
		 */
		EClass VALIDATION_DATASET = eINSTANCE.getValidationDataset();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_DATASET__DATA = eINSTANCE.getValidationDataset_Data();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.TestDatasetImpl <em>Test Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.TestDatasetImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTestDataset()
		 * @generated
		 */
		EClass TEST_DATASET = eINSTANCE.getTestDataset();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_DATASET__DATA = eINSTANCE.getTestDataset_Data();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelImpl <em>AI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModel()
		 * @generated
		 */
		EClass AI_MODEL = eINSTANCE.getAIModel();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_MODEL__RANK = eINSTANCE.getAIModel_Rank();

		/**
		 * The meta object literal for the '<em><b>Criteria Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__CRITERIA_VALUES = eINSTANCE.getAIModel_CriteriaValues();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__GOAL = eINSTANCE.getAIModel_Goal();

		/**
		 * The meta object literal for the '<em><b>Satisfied Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__SATISFIED_REQUIREMENTS = eINSTANCE.getAIModel_SatisfiedRequirements();

		/**
		 * The meta object literal for the '<em><b>Optimal Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__OPTIMAL_VALUES = eINSTANCE.getAIModel_OptimalValues();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL__BASED_ON = eINSTANCE.getAIModel_BasedOn();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.CriterionValueImpl <em>Criterion Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.CriterionValueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getCriterionValue()
		 * @generated
		 */
		EClass CRITERION_VALUE = eINSTANCE.getCriterionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERION_VALUE__VALUE = eINSTANCE.getCriterionValue_Value();

		/**
		 * The meta object literal for the '<em><b>Aimodelsuccesscriterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_VALUE__AIMODELSUCCESSCRITERION = eINSTANCE.getCriterionValue_Aimodelsuccesscriterion();

		/**
		 * The meta object literal for the '<em><b>Ai Model Evaluation Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_VALUE__AI_MODEL_EVALUATION_ACTIVITY = eINSTANCE
				.getCriterionValue_AiModelEvaluationActivity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.HyperParameterImpl <em>Hyper Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.HyperParameterImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getHyperParameter()
		 * @generated
		 */
		EClass HYPER_PARAMETER = eINSTANCE.getHyperParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPER_PARAMETER__NAME = eINSTANCE.getHyperParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Optimal Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPER_PARAMETER__OPTIMAL_VALUES = eINSTANCE.getHyperParameter_OptimalValues();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.OptimalValueImpl <em>Optimal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.OptimalValueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getOptimalValue()
		 * @generated
		 */
		EClass OPTIMAL_VALUE = eINSTANCE.getOptimalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMAL_VALUE__VALUE = eINSTANCE.getOptimalValue_Value();

		/**
		 * The meta object literal for the '<em><b>Hyperparameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMAL_VALUE__HYPERPARAMETER = eINSTANCE.getOptimalValue_Hyperparameter();

		/**
		 * The meta object literal for the '<em><b>Ai Model Training Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMAL_VALUE__AI_MODEL_TRAINING_ACTIVITY = eINSTANCE.getOptimalValue_AiModelTrainingActivity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelDatasetImpl <em>AI Model Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelDatasetImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelDataset()
		 * @generated
		 */
		EClass AI_MODEL_DATASET = eINSTANCE.getAIModelDataset();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.OperationsActivityImpl <em>Operations Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.OperationsActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getOperationsActivity()
		 * @generated
		 */
		EClass OPERATIONS_ACTIVITY = eINSTANCE.getOperationsActivity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelDeploymentActivityImpl <em>AI Model Deployment Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelDeploymentActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelDeploymentActivity()
		 * @generated
		 */
		EClass AI_MODEL_DEPLOYMENT_ACTIVITY = eINSTANCE.getAIModelDeploymentActivity();

		/**
		 * The meta object literal for the '<em><b>Deploys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_DEPLOYMENT_ACTIVITY__DEPLOYS = eINSTANCE.getAIModelDeploymentActivity_Deploys();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelMonitoringActivityImpl <em>AI Model Monitoring Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelMonitoringActivityImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelMonitoringActivity()
		 * @generated
		 */
		EClass AI_MODEL_MONITORING_ACTIVITY = eINSTANCE.getAIModelMonitoringActivity();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_MONITORING_ACTIVITY__MONITORS = eINSTANCE.getAIModelMonitoringActivity_Monitors();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl <em>Deployed AI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DeployedAIModelImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDeployedAIModel()
		 * @generated
		 */
		EClass DEPLOYED_AI_MODEL = eINSTANCE.getDeployedAIModel();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_AI_MODEL__PLATFORM = eINSTANCE.getDeployedAIModel_Platform();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_AI_MODEL__PATTERN = eINSTANCE.getDeployedAIModel_Pattern();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_AI_MODEL__STRATEGY = eINSTANCE.getDeployedAIModel_Strategy();

		/**
		 * The meta object literal for the '<em><b>Inference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_AI_MODEL__INFERENCE = eINSTANCE.getDeployedAIModel_Inference();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_AI_MODEL__API = eINSTANCE.getDeployedAIModel_Api();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_AI_MODEL__OBSERVATIONS = eINSTANCE.getDeployedAIModel_Observations();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelObservationImpl <em>AI Model Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelObservationImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelObservation()
		 * @generated
		 */
		EClass AI_MODEL_OBSERVATION = eINSTANCE.getAIModelObservation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.IssueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelFlawImpl <em>AI Model Flaw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelFlawImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelFlaw()
		 * @generated
		 */
		EClass AI_MODEL_FLAW = eINSTANCE.getAIModelFlaw();

		/**
		 * The meta object literal for the '<em><b>Degrades</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_MODEL_FLAW__DEGRADES = eINSTANCE.getAIModelFlaw_Degrades();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl <em>Performance Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.PerformanceMetricImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getPerformanceMetric()
		 * @generated
		 */
		EClass PERFORMANCE_METRIC = eINSTANCE.getPerformanceMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRIC__NAME = eINSTANCE.getPerformanceMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Min Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRIC__MIN_THRESHOLD = eINSTANCE.getPerformanceMetric_MinThreshold();

		/**
		 * The meta object literal for the '<em><b>Max Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRIC__MAX_THRESHOLD = eINSTANCE.getPerformanceMetric_MaxThreshold();

		/**
		 * The meta object literal for the '<em><b>Ensures</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_METRIC__ENSURES = eINSTANCE.getPerformanceMetric_Ensures();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataCleaningTechniqueImpl <em>Data Cleaning Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataCleaningTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataCleaningTechnique()
		 * @generated
		 */
		EClass DATA_CLEANING_TECHNIQUE = eINSTANCE.getDataCleaningTechnique();

		/**
		 * The meta object literal for the '<em><b>Technique Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CLEANING_TECHNIQUE__TECHNIQUE_KIND = eINSTANCE.getDataCleaningTechnique_TechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataTransformationTechniqueImpl <em>Data Transformation Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataTransformationTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataTransformationTechnique()
		 * @generated
		 */
		EClass DATA_TRANSFORMATION_TECHNIQUE = eINSTANCE.getDataTransformationTechnique();

		/**
		 * The meta object literal for the '<em><b>Technique Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFORMATION_TECHNIQUE__TECHNIQUE_KIND = eINSTANCE
				.getDataTransformationTechnique_TechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataDiscretizationTechniqueImpl <em>Data Discretization Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataDiscretizationTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataDiscretizationTechnique()
		 * @generated
		 */
		EClass DATA_DISCRETIZATION_TECHNIQUE = eINSTANCE.getDataDiscretizationTechnique();

		/**
		 * The meta object literal for the '<em><b>Technique Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DISCRETIZATION_TECHNIQUE__TECHNIQUE_KIND = eINSTANCE
				.getDataDiscretizationTechnique_TechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataReductionTechniqueImpl <em>Data Reduction Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataReductionTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataReductionTechnique()
		 * @generated
		 */
		EClass DATA_REDUCTION_TECHNIQUE = eINSTANCE.getDataReductionTechnique();

		/**
		 * The meta object literal for the '<em><b>Technique Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_REDUCTION_TECHNIQUE__TECHNIQUE_KIND = eINSTANCE.getDataReductionTechnique_TechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataIntegrationTechniqueImpl <em>Data Integration Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataIntegrationTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataIntegrationTechnique()
		 * @generated
		 */
		EClass DATA_INTEGRATION_TECHNIQUE = eINSTANCE.getDataIntegrationTechnique();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataAugmentationTechniqueImpl <em>Data Augmentation Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataAugmentationTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAugmentationTechnique()
		 * @generated
		 */
		EClass DATA_AUGMENTATION_TECHNIQUE = eINSTANCE.getDataAugmentationTechnique();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.FeatureExtractionTechniqueImpl <em>Feature Extraction Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.FeatureExtractionTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureExtractionTechnique()
		 * @generated
		 */
		EClass FEATURE_EXTRACTION_TECHNIQUE = eINSTANCE.getFeatureExtractionTechnique();

		/**
		 * The meta object literal for the '<em><b>Technique Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_EXTRACTION_TECHNIQUE__TECHNIQUE_KIND = eINSTANCE
				.getFeatureExtractionTechnique_TechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.FeatureSelectionTechniqueImpl <em>Feature Selection Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.FeatureSelectionTechniqueImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureSelectionTechnique()
		 * @generated
		 */
		EClass FEATURE_SELECTION_TECHNIQUE = eINSTANCE.getFeatureSelectionTechnique();

		/**
		 * The meta object literal for the '<em><b>Technique Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION_TECHNIQUE__TECHNIQUE_KIND = eINSTANCE.getFeatureSelectionTechnique_TechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ManagementRoleImpl <em>Management Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ManagementRoleImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getManagementRole()
		 * @generated
		 */
		EClass MANAGEMENT_ROLE = eINSTANCE.getManagementRole();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DomainRoleImpl <em>Domain Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DomainRoleImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDomainRole()
		 * @generated
		 */
		EClass DOMAIN_ROLE = eINSTANCE.getDomainRole();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataRoleImpl <em>Data Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataRoleImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataRole()
		 * @generated
		 */
		EClass DATA_ROLE = eINSTANCE.getDataRole();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.AIModelServingRoleImpl <em>AI Model Serving Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.AIModelServingRoleImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIModelServingRole()
		 * @generated
		 */
		EClass AI_MODEL_SERVING_ROLE = eINSTANCE.getAIModelServingRole();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.GroupManagerImpl <em>Group Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.GroupManagerImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getGroupManager()
		 * @generated
		 */
		EClass GROUP_MANAGER = eINSTANCE.getGroupManager();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.TeamLeadImpl <em>Team Lead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.TeamLeadImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getTeamLead()
		 * @generated
		 */
		EClass TEAM_LEAD = eINSTANCE.getTeamLead();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ProjectLeadImpl <em>Project Lead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ProjectLeadImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getProjectLead()
		 * @generated
		 */
		EClass PROJECT_LEAD = eINSTANCE.getProjectLead();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataConsumerImpl <em>Data Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataConsumerImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataConsumer()
		 * @generated
		 */
		EClass DATA_CONSUMER = eINSTANCE.getDataConsumer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.BusinessUserImpl <em>Business User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.BusinessUserImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessUser()
		 * @generated
		 */
		EClass BUSINESS_USER = eINSTANCE.getBusinessUser();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.BusinessAnalystImpl <em>Business Analyst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.BusinessAnalystImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getBusinessAnalyst()
		 * @generated
		 */
		EClass BUSINESS_ANALYST = eINSTANCE.getBusinessAnalyst();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DomainExpertImpl <em>Domain Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DomainExpertImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDomainExpert()
		 * @generated
		 */
		EClass DOMAIN_EXPERT = eINSTANCE.getDomainExpert();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataScientistImpl <em>Data Scientist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataScientistImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataScientist()
		 * @generated
		 */
		EClass DATA_SCIENTIST = eINSTANCE.getDataScientist();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataEngineerImpl <em>Data Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataEngineerImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataEngineer()
		 * @generated
		 */
		EClass DATA_ENGINEER = eINSTANCE.getDataEngineer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataStewardImpl <em>Data Steward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataStewardImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataSteward()
		 * @generated
		 */
		EClass DATA_STEWARD = eINSTANCE.getDataSteward();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataProviderImpl <em>Data Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataProviderImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataProvider()
		 * @generated
		 */
		EClass DATA_PROVIDER = eINSTANCE.getDataProvider();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.DataAnnotatorImpl <em>Data Annotator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.DataAnnotatorImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataAnnotator()
		 * @generated
		 */
		EClass DATA_ANNOTATOR = eINSTANCE.getDataAnnotator();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANNOTATOR__IS_EXTERNAL = eINSTANCE.getDataAnnotator_IsExternal();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ArchitectImpl <em>Architect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ArchitectImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getArchitect()
		 * @generated
		 */
		EClass ARCHITECT = eINSTANCE.getArchitect();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.SoftwareEngineerImpl <em>Software Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.SoftwareEngineerImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getSoftwareEngineer()
		 * @generated
		 */
		EClass SOFTWARE_ENGINEER = eINSTANCE.getSoftwareEngineer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.impl.ModelOperatorImpl <em>Model Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.impl.ModelOperatorImpl
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getModelOperator()
		 * @generated
		 */
		EClass MODEL_OPERATOR = eINSTANCE.getModelOperator();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.ParticipationKind <em>Participation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.ParticipationKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getParticipationKind()
		 * @generated
		 */
		EEnum PARTICIPATION_KIND = eINSTANCE.getParticipationKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.AIEthicsKind <em>AI Ethics Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.AIEthicsKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getAIEthicsKind()
		 * @generated
		 */
		EEnum AI_ETHICS_KIND = eINSTANCE.getAIEthicsKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.DeploymentStrategyKind <em>Deployment Strategy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.DeploymentStrategyKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDeploymentStrategyKind()
		 * @generated
		 */
		EEnum DEPLOYMENT_STRATEGY_KIND = eINSTANCE.getDeploymentStrategyKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.DeploymentPatternKind <em>Deployment Pattern Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.DeploymentPatternKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDeploymentPatternKind()
		 * @generated
		 */
		EEnum DEPLOYMENT_PATTERN_KIND = eINSTANCE.getDeploymentPatternKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.InferenceModeKind <em>Inference Mode Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.InferenceModeKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getInferenceModeKind()
		 * @generated
		 */
		EEnum INFERENCE_MODE_KIND = eINSTANCE.getInferenceModeKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.DataCleaningTechniqueKind <em>Data Cleaning Technique Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.DataCleaningTechniqueKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataCleaningTechniqueKind()
		 * @generated
		 */
		EEnum DATA_CLEANING_TECHNIQUE_KIND = eINSTANCE.getDataCleaningTechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.DataTransformationTechniqueKind <em>Data Transformation Technique Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.DataTransformationTechniqueKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataTransformationTechniqueKind()
		 * @generated
		 */
		EEnum DATA_TRANSFORMATION_TECHNIQUE_KIND = eINSTANCE.getDataTransformationTechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind <em>Data Discretization Technique Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.DataDiscretizationTechniqueKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataDiscretizationTechniqueKind()
		 * @generated
		 */
		EEnum DATA_DISCRETIZATION_TECHNIQUE_KIND = eINSTANCE.getDataDiscretizationTechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.DataReductionTechniqueKind <em>Data Reduction Technique Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.DataReductionTechniqueKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getDataReductionTechniqueKind()
		 * @generated
		 */
		EEnum DATA_REDUCTION_TECHNIQUE_KIND = eINSTANCE.getDataReductionTechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind <em>Feature Extraction Technique Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.FeatureExtractionTechniqueKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureExtractionTechniqueKind()
		 * @generated
		 */
		EEnum FEATURE_EXTRACTION_TECHNIQUE_KIND = eINSTANCE.getFeatureExtractionTechniqueKind();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind <em>Feature Selection Technique Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.dsl4ai.FeatureSelectionTechniqueKind
		 * @see edu.uoc.som.dsl4ai.impl.Dsl4aiPackageImpl#getFeatureSelectionTechniqueKind()
		 * @generated
		 */
		EEnum FEATURE_SELECTION_TECHNIQUE_KIND = eINSTANCE.getFeatureSelectionTechniqueKind();

	}

} //Dsl4aiPackage
