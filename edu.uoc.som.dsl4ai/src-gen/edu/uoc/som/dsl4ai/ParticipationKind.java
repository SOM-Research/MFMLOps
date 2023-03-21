/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Participation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getParticipationKind()
 * @model
 * @generated
 */
public enum ParticipationKind implements Enumerator {
	/**
	 * The '<em><b>Responsible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSIBLE(0, "responsible", "responsible"),

	/**
	 * The '<em><b>Accountable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNTABLE(1, "accountable", "accountable"),

	/**
	 * The '<em><b>Consulted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTED_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTED(2, "consulted", "consulted"),

	/**
	 * The '<em><b>Informed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMED_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMED(3, "informed", "informed");

	/**
	 * The '<em><b>Responsible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIBLE
	 * @model name="responsible"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSIBLE_VALUE = 0;

	/**
	 * The '<em><b>Accountable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTABLE
	 * @model name="accountable"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTABLE_VALUE = 1;

	/**
	 * The '<em><b>Consulted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTED
	 * @model name="consulted"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTED_VALUE = 2;

	/**
	 * The '<em><b>Informed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMED
	 * @model name="informed"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Participation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParticipationKind[] VALUES_ARRAY = new ParticipationKind[] { RESPONSIBLE, ACCOUNTABLE,
			CONSULTED, INFORMED, };

	/**
	 * A public read-only list of all the '<em><b>Participation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParticipationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipationKind get(int value) {
		switch (value) {
		case RESPONSIBLE_VALUE:
			return RESPONSIBLE;
		case ACCOUNTABLE_VALUE:
			return ACCOUNTABLE;
		case CONSULTED_VALUE:
			return CONSULTED;
		case INFORMED_VALUE:
			return INFORMED;
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
	private ParticipationKind(int value, String name, String literal) {
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

} //ParticipationKind
