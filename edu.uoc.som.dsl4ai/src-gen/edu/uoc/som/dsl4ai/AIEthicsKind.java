/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>AI Ethics Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getAIEthicsKind()
 * @model
 * @generated
 */
public enum AIEthicsKind implements Enumerator {
	/**
	 * The '<em><b>Privacy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVACY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVACY(0, "privacy", "privacy"),

	/**
	 * The '<em><b>Accountability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNTABILITY(1, "accountability", "accountability"),

	/**
	 * The '<em><b>Safety Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY_SECURITY(2, "safetySecurity", "safetySecurity"),

	/**
	 * The '<em><b>Transparency Explainability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_EXPLAINABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENCY_EXPLAINABILITY(3, "transparencyExplainability", "transparencyExplainability"),

	/**
	 * The '<em><b>Fairness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIRNESS_VALUE
	 * @generated
	 * @ordered
	 */
	FAIRNESS(4, "fairness", "fairness"),

	/**
	 * The '<em><b>Human Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_CONTROL(5, "humanControl", "humanControl"),

	/**
	 * The '<em><b>Professional Responsibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL_RESPONSIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSIONAL_RESPONSIBILITY(6, "professionalResponsibility", "professionalResponsibility"),

	/**
	 * The '<em><b>Human Values</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_VALUES(7, "humanValues", "humanValues");

	/**
	 * The '<em><b>Privacy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVACY
	 * @model name="privacy"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVACY_VALUE = 0;

	/**
	 * The '<em><b>Accountability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTABILITY
	 * @model name="accountability"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTABILITY_VALUE = 1;

	/**
	 * The '<em><b>Safety Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_SECURITY
	 * @model name="safetySecurity"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_SECURITY_VALUE = 2;

	/**
	 * The '<em><b>Transparency Explainability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_EXPLAINABILITY
	 * @model name="transparencyExplainability"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENCY_EXPLAINABILITY_VALUE = 3;

	/**
	 * The '<em><b>Fairness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIRNESS
	 * @model name="fairness"
	 * @generated
	 * @ordered
	 */
	public static final int FAIRNESS_VALUE = 4;

	/**
	 * The '<em><b>Human Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_CONTROL
	 * @model name="humanControl"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_CONTROL_VALUE = 5;

	/**
	 * The '<em><b>Professional Responsibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL_RESPONSIBILITY
	 * @model name="professionalResponsibility"
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSIONAL_RESPONSIBILITY_VALUE = 6;

	/**
	 * The '<em><b>Human Values</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_VALUES
	 * @model name="humanValues"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_VALUES_VALUE = 7;

	/**
	 * An array of all the '<em><b>AI Ethics Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AIEthicsKind[] VALUES_ARRAY = new AIEthicsKind[] { PRIVACY, ACCOUNTABILITY, SAFETY_SECURITY,
			TRANSPARENCY_EXPLAINABILITY, FAIRNESS, HUMAN_CONTROL, PROFESSIONAL_RESPONSIBILITY, HUMAN_VALUES, };

	/**
	 * A public read-only list of all the '<em><b>AI Ethics Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AIEthicsKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>AI Ethics Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AIEthicsKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AIEthicsKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AI Ethics Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AIEthicsKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AIEthicsKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AI Ethics Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AIEthicsKind get(int value) {
		switch (value) {
		case PRIVACY_VALUE:
			return PRIVACY;
		case ACCOUNTABILITY_VALUE:
			return ACCOUNTABILITY;
		case SAFETY_SECURITY_VALUE:
			return SAFETY_SECURITY;
		case TRANSPARENCY_EXPLAINABILITY_VALUE:
			return TRANSPARENCY_EXPLAINABILITY;
		case FAIRNESS_VALUE:
			return FAIRNESS;
		case HUMAN_CONTROL_VALUE:
			return HUMAN_CONTROL;
		case PROFESSIONAL_RESPONSIBILITY_VALUE:
			return PROFESSIONAL_RESPONSIBILITY;
		case HUMAN_VALUES_VALUE:
			return HUMAN_VALUES;
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
	private AIEthicsKind(int value, String name, String literal) {
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

} //AIEthicsKind
