/**
 */
package edu.uoc.som.dsl4ai.provider;

import edu.uoc.som.dsl4ai.Activity;
import edu.uoc.som.dsl4ai.Dsl4aiFactory;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;

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
 * This is the item provider adapter for a {@link edu.uoc.som.dsl4ai.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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
			addIsOptionalPropertyDescriptor(object);
			addRequiresAllSubactivitiesPropertyDescriptor(object);
			addInputsPropertyDescriptor(object);
			addOutputsPropertyDescriptor(object);
			addResourcesPropertyDescriptor(object);
			addTechniquesPropertyDescriptor(object);
			addNextPropertyDescriptor(object);
			addRationalePropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Activity_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_name_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_isOptional_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_isOptional_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__IS_OPTIONAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Requires All Subactivities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresAllSubactivitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_requiresAllSubactivities_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_requiresAllSubactivities_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_inputs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_inputs_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__INPUTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_outputs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_outputs_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__OUTPUTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_resources_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_resources_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__RESOURCES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Techniques feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechniquesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_techniques_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_techniques_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__TECHNIQUES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_next_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_next_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__NEXT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rationale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRationalePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_rationale_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_rationale_feature",
								"_UI_Activity_type"),
						Dsl4aiPackage.Literals.ACTIVITY__RATIONALE, true, false, false,
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
			childrenFeatures.add(Dsl4aiPackage.Literals.ACTIVITY__PARTICIPANTS);
			childrenFeatures.add(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
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
		String label = ((Activity) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Activity_type")
				: getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
		case Dsl4aiPackage.ACTIVITY__NAME:
		case Dsl4aiPackage.ACTIVITY__IS_OPTIONAL:
		case Dsl4aiPackage.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES:
		case Dsl4aiPackage.ACTIVITY__RATIONALE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Dsl4aiPackage.ACTIVITY__PARTICIPANTS:
		case Dsl4aiPackage.ACTIVITY__SUBACTIVITIES:
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

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__PARTICIPANTS,
				Dsl4aiFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createBusinessUnderstandingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createRequirementsEngineeringActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataIdentificationActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataPreparationActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataCollectionActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createDataProcessingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createFeatureEngineeringActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelTrainingActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelEvaluationActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createOperationsActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelDeploymentActivity()));

		newChildDescriptors.add(createChildParameter(Dsl4aiPackage.Literals.ACTIVITY__SUBACTIVITIES,
				Dsl4aiFactory.eINSTANCE.createAIModelMonitoringActivity()));
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
