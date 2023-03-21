/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Pattern Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDeploymentPatternKind()
 * @model
 * @generated
 */
public enum DeploymentPatternKind implements Enumerator {
	/**
	 * The '<em><b>Statically</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATICALLY_VALUE
	 * @generated
	 * @ordered
	 */
	STATICALLY(0, "statically", "statically"),

	/**
	 * The '<em><b>Dynamically On User Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMICALLY_ON_USER_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMICALLY_ON_USER_DEVICE(1, "dynamicallyOnUserDevice", "dynamicallyOnUserDevice"),

	/**
	 * The '<em><b>Dynamically On Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMICALLY_ON_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMICALLY_ON_SERVER(2, "dynamicallyOnServer", "dynamicallyOnServer"),

	/**
	 * The '<em><b>Streaming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAMING_VALUE
	 * @generated
	 * @ordered
	 */
	STREAMING(3, "streaming", "streaming");

	/**
	 * The '<em><b>Statically</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATICALLY
	 * @model name="statically"
	 * @generated
	 * @ordered
	 */
	public static final int STATICALLY_VALUE = 0;

	/**
	 * The '<em><b>Dynamically On User Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMICALLY_ON_USER_DEVICE
	 * @model name="dynamicallyOnUserDevice"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMICALLY_ON_USER_DEVICE_VALUE = 1;

	/**
	 * The '<em><b>Dynamically On Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMICALLY_ON_SERVER
	 * @model name="dynamicallyOnServer"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMICALLY_ON_SERVER_VALUE = 2;

	/**
	 * The '<em><b>Streaming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAMING
	 * @model name="streaming"
	 * @generated
	 * @ordered
	 */
	public static final int STREAMING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Deployment Pattern Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentPatternKind[] VALUES_ARRAY = new DeploymentPatternKind[] { STATICALLY,
			DYNAMICALLY_ON_USER_DEVICE, DYNAMICALLY_ON_SERVER, STREAMING, };

	/**
	 * A public read-only list of all the '<em><b>Deployment Pattern Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentPatternKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Pattern Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentPatternKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentPatternKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Pattern Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentPatternKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentPatternKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Pattern Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentPatternKind get(int value) {
		switch (value) {
		case STATICALLY_VALUE:
			return STATICALLY;
		case DYNAMICALLY_ON_USER_DEVICE_VALUE:
			return DYNAMICALLY_ON_USER_DEVICE;
		case DYNAMICALLY_ON_SERVER_VALUE:
			return DYNAMICALLY_ON_SERVER;
		case STREAMING_VALUE:
			return STREAMING;
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
	private DeploymentPatternKind(int value, String name, String literal) {
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

} //DeploymentPatternKind
