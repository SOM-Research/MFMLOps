/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Strategy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeploymentStrategyKind()
 * @model
 * @generated
 */
public enum DeploymentStrategyKind implements Enumerator {
	/**
	 * The '<em><b>Single Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_DEPLOYMENT(0, "singleDeployment", "singleDeployment"),

	/**
	 * The '<em><b>Silent Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENT_DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SILENT_DEPLOYMENT(1, "silentDeployment", "silentDeployment"),

	/**
	 * The '<em><b>Canary Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANARY_DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CANARY_DEPLOYMENT(2, "canaryDeployment", "canaryDeployment"),

	/**
	 * The '<em><b>Multi Armed Bandit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_ARMED_BANDIT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_ARMED_BANDIT(3, "multiArmedBandit", "multiArmedBandit");

	/**
	 * The '<em><b>Single Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_DEPLOYMENT
	 * @model name="singleDeployment"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_DEPLOYMENT_VALUE = 0;

	/**
	 * The '<em><b>Silent Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENT_DEPLOYMENT
	 * @model name="silentDeployment"
	 * @generated
	 * @ordered
	 */
	public static final int SILENT_DEPLOYMENT_VALUE = 1;

	/**
	 * The '<em><b>Canary Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANARY_DEPLOYMENT
	 * @model name="canaryDeployment"
	 * @generated
	 * @ordered
	 */
	public static final int CANARY_DEPLOYMENT_VALUE = 2;

	/**
	 * The '<em><b>Multi Armed Bandit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_ARMED_BANDIT
	 * @model name="multiArmedBandit"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_ARMED_BANDIT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Deployment Strategy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentStrategyKind[] VALUES_ARRAY = new DeploymentStrategyKind[] { SINGLE_DEPLOYMENT,
			SILENT_DEPLOYMENT, CANARY_DEPLOYMENT, MULTI_ARMED_BANDIT, };

	/**
	 * A public read-only list of all the '<em><b>Deployment Strategy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentStrategyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Strategy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentStrategyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentStrategyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Strategy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentStrategyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentStrategyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Strategy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentStrategyKind get(int value) {
		switch (value) {
		case SINGLE_DEPLOYMENT_VALUE:
			return SINGLE_DEPLOYMENT;
		case SILENT_DEPLOYMENT_VALUE:
			return SILENT_DEPLOYMENT;
		case CANARY_DEPLOYMENT_VALUE:
			return CANARY_DEPLOYMENT;
		case MULTI_ARMED_BANDIT_VALUE:
			return MULTI_ARMED_BANDIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentStrategyKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DeploymentStrategyKind
