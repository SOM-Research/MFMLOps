/**
 */
package edu.uoc.som.dsl4ai.provider;

import edu.uoc.som.dsl4ai.Dsl4aiFactory;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.Method;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.uoc.som.dsl4ai.Method} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Method_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Method_name_feature", "_UI_Method_type"),
						Dsl4aiPackage.Literals.METHOD__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Dsl4aiPackage.Literals.METHOD__ACTIVITIES);
			childrenFeatures.add(Dsl4aiPackage.Literals.METHOD__ARTIFACTS);
			childrenFeatures.add(Dsl4aiPackage.Literals.METHOD__RESOURCES);
			childrenFeatures.add(Dsl4aiPackage.Literals.METHOD__ROLES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Method.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Method"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Method) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Method_type")
				: getString("_UI_Method_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Method.class)) {
		case Dsl4aiPackage.METHOD__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Dsl4aiPackage.METHOD__ACTIVITIES:
		case Dsl4aiPackage.METHOD__ARTIFACTS:
		case Dsl4aiPackage.METHOD__RESOURCES:
		case Dsl4aiPackage.METHOD__ROLES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createBusinessUnderstandingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createRequirementsEngineeringActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataIdentificationActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataPreparationActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataCollectionActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataProcessingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createFeatureEngineeringActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelTrainingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelEvaluationActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createOperationsActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelDeploymentActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelMonitoringActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ARTIFACTS,
				Dsl4aiFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add(
				createChildParameter(Dsl4aiPackage.Literals.METHOD__ARTIFACTS, Dsl4aiFactory.eINSTANCE.createData()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ARTIFACTS,
				Dsl4aiFactory.eINSTANCE.createAIModelDataset()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ARTIFACTS,
				Dsl4aiFactory.eINSTANCE.createTrainingDataset()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ARTIFACTS,
				Dsl4aiFactory.eINSTANCE.createValidationDataset()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ARTIFACTS,
				Dsl4aiFactory.eINSTANCE.createTestDataset()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createPlatform()));

		newChildDescriptors.add(
				createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES, Dsl4aiFactory.eINSTANCE.createScript()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createGuideline()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataSource()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataAnnotationGuideline()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataCleaningTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataTransformationTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataDiscretizationTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataReductionTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataIntegrationTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createDataAugmentationTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createFeatureExtractionTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__RESOURCES,
				Dsl4aiFactory.eINSTANCE.createFeatureSelectionTechnique()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createGroupManager()));

		newChildDescriptors.add(
				createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES, Dsl4aiFactory.eINSTANCE.createTeamLead()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createProjectLead()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDataConsumer()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createBusinessUser()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createBusinessAnalyst()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDomainExpert()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDataScientist()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDataEngineer()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDataSteward()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createDataAnnotator()));

		newChildDescriptors.add(
				createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES, Dsl4aiFactory.eINSTANCE.createArchitect()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createSoftwareEngineer()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.METHOD__ROLES,
				Dsl4aiFactory.eINSTANCE.createModelOperator()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Dsl4aiEditPlugin.INSTANCE;
	}

}
