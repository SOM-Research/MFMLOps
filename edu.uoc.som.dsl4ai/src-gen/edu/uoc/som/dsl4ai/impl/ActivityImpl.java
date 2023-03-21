/**
 */
package edu.uoc.som.dsl4ai.impl;

import edu.uoc.som.dsl4ai.Activity;
import edu.uoc.som.dsl4ai.Artifact;
import edu.uoc.som.dsl4ai.Dsl4aiPackage;
import edu.uoc.som.dsl4ai.Participant;
import edu.uoc.som.dsl4ai.Resource;
import edu.uoc.som.dsl4ai.Technique;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#isRequiresAllSubactivities <em>Requires All Subactivities</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getTechniques <em>Techniques</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getNext <em>Next</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.uoc.som.dsl4ai.impl.ActivityImpl#getSubactivities <em>Subactivities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresAllSubactivities() <em>Requires All Subactivities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresAllSubactivities()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_ALL_SUBACTIVITIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresAllSubactivities() <em>Requires All Subactivities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresAllSubactivities()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresAllSubactivities = REQUIRES_ALL_SUBACTIVITIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> outputs;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getTechniques() <em>Techniques</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechniques()
	 * @generated
	 * @ordered
	 */
	protected EList<Technique> techniques;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Activity next;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubactivities() <em>Subactivities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubactivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> subactivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl4aiPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.ACTIVITY__IS_OPTIONAL, oldIsOptional,
					isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequiresAllSubactivities() {
		return requiresAllSubactivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresAllSubactivities(boolean newRequiresAllSubactivities) {
		boolean oldRequiresAllSubactivities = requiresAllSubactivities;
		requiresAllSubactivities = newRequiresAllSubactivities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES,
					oldRequiresAllSubactivities, requiresAllSubactivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Artifact>(Artifact.class, this, Dsl4aiPackage.ACTIVITY__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<Artifact>(Artifact.class, this, Dsl4aiPackage.ACTIVITY__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectResolvingEList<Resource>(Resource.class, this, Dsl4aiPackage.ACTIVITY__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Technique> getTechniques() {
		if (techniques == null) {
			techniques = new EObjectResolvingEList<Technique>(Technique.class, this,
					Dsl4aiPackage.ACTIVITY__TECHNIQUES);
		}
		return techniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this,
					Dsl4aiPackage.ACTIVITY__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (Activity) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl4aiPackage.ACTIVITY__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(Activity newNext) {
		Activity oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.ACTIVITY__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl4aiPackage.ACTIVITY__RATIONALE, oldRationale,
					rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getSubactivities() {
		if (subactivities == null) {
			subactivities = new EObjectContainmentEList<Activity>(Activity.class, this,
					Dsl4aiPackage.ACTIVITY__SUBACTIVITIES);
		}
		return subactivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Dsl4aiPackage.ACTIVITY__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		case Dsl4aiPackage.ACTIVITY__SUBACTIVITIES:
			return ((InternalEList<?>) getSubactivities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Dsl4aiPackage.ACTIVITY__NAME:
			return getName();
		case Dsl4aiPackage.ACTIVITY__IS_OPTIONAL:
			return isIsOptional();
		case Dsl4aiPackage.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES:
			return isRequiresAllSubactivities();
		case Dsl4aiPackage.ACTIVITY__INPUTS:
			return getInputs();
		case Dsl4aiPackage.ACTIVITY__OUTPUTS:
			return getOutputs();
		case Dsl4aiPackage.ACTIVITY__RESOURCES:
			return getResources();
		case Dsl4aiPackage.ACTIVITY__TECHNIQUES:
			return getTechniques();
		case Dsl4aiPackage.ACTIVITY__PARTICIPANTS:
			return getParticipants();
		case Dsl4aiPackage.ACTIVITY__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case Dsl4aiPackage.ACTIVITY__RATIONALE:
			return getRationale();
		case Dsl4aiPackage.ACTIVITY__SUBACTIVITIES:
			return getSubactivities();
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
		case Dsl4aiPackage.ACTIVITY__NAME:
			setName((String) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__IS_OPTIONAL:
			setIsOptional((Boolean) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES:
			setRequiresAllSubactivities((Boolean) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Artifact>) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Artifact>) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends Resource>) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__TECHNIQUES:
			getTechniques().clear();
			getTechniques().addAll((Collection<? extends Technique>) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends Participant>) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__NEXT:
			setNext((Activity) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__RATIONALE:
			setRationale((String) newValue);
			return;
		case Dsl4aiPackage.ACTIVITY__SUBACTIVITIES:
			getSubactivities().clear();
			getSubactivities().addAll((Collection<? extends Activity>) newValue);
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
		case Dsl4aiPackage.ACTIVITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Dsl4aiPackage.ACTIVITY__IS_OPTIONAL:
			setIsOptional(IS_OPTIONAL_EDEFAULT);
			return;
		case Dsl4aiPackage.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES:
			setRequiresAllSubactivities(REQUIRES_ALL_SUBACTIVITIES_EDEFAULT);
			return;
		case Dsl4aiPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			return;
		case Dsl4aiPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			return;
		case Dsl4aiPackage.ACTIVITY__RESOURCES:
			getResources().clear();
			return;
		case Dsl4aiPackage.ACTIVITY__TECHNIQUES:
			getTechniques().clear();
			return;
		case Dsl4aiPackage.ACTIVITY__PARTICIPANTS:
			getParticipants().clear();
			return;
		case Dsl4aiPackage.ACTIVITY__NEXT:
			setNext((Activity) null);
			return;
		case Dsl4aiPackage.ACTIVITY__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case Dsl4aiPackage.ACTIVITY__SUBACTIVITIES:
			getSubactivities().clear();
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
		case Dsl4aiPackage.ACTIVITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Dsl4aiPackage.ACTIVITY__IS_OPTIONAL:
			return isOptional != IS_OPTIONAL_EDEFAULT;
		case Dsl4aiPackage.ACTIVITY__REQUIRES_ALL_SUBACTIVITIES:
			return requiresAllSubactivities != REQUIRES_ALL_SUBACTIVITIES_EDEFAULT;
		case Dsl4aiPackage.ACTIVITY__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case Dsl4aiPackage.ACTIVITY__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case Dsl4aiPackage.ACTIVITY__RESOURCES:
			return resources != null && !resources.isEmpty();
		case Dsl4aiPackage.ACTIVITY__TECHNIQUES:
			return techniques != null && !techniques.isEmpty();
		case Dsl4aiPackage.ACTIVITY__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case Dsl4aiPackage.ACTIVITY__NEXT:
			return next != null;
		case Dsl4aiPackage.ACTIVITY__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case Dsl4aiPackage.ACTIVITY__SUBACTIVITIES:
			return subactivities != null && !subactivities.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", requiresAllSubactivities: ");
		result.append(requiresAllSubactivities);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
