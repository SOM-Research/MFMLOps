/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Selection Technique Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureSelectionTechniqueKind()
 * @model
 * @generated
 */
public enum FeatureSelectionTechniqueKind implements Enumerator {
	/**
	 * The '<em><b>Regularization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULARIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULARIZATION(0, "regularization", "regularization"),

	/**
	 * The '<em><b>Wrapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	WRAPPER(1, "wrapper", "wrapper"),

	/**
	 * The '<em><b>Greedy Algorithm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEDY_ALGORITHM_VALUE
	 * @generated
	 * @ordered
	 */
	GREEDY_ALGORITHM(2, "greedyAlgorithm", "greedyAlgorithm");

	/**
	 * The '<em><b>Regularization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULARIZATION
	 * @model name="regularization"
	 * @generated
	 * @ordered
	 */
	public static final int REGULARIZATION_VALUE = 0;

	/**
	 * The '<em><b>Wrapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAPPER
	 * @model name="wrapper"
	 * @generated
	 * @ordered
	 */
	public static final int WRAPPER_VALUE = 1;

	/**
	 * The '<em><b>Greedy Algorithm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEDY_ALGORITHM
	 * @model name="greedyAlgorithm"
	 * @generated
	 * @ordered
	 */
	public static final int GREEDY_ALGORITHM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feature Selection Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureSelectionTechniqueKind[] VALUES_ARRAY = new FeatureSelectionTechniqueKind[] {
			REGULARIZATION, WRAPPER, GREEDY_ALGORITHM, };

	/**
	 * A public read-only list of all the '<em><b>Feature Selection Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureSelectionTechniqueKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Selection Technique Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureSelectionTechniqueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureSelectionTechniqueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Selection Technique Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureSelectionTechniqueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureSelectionTechniqueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Selection Technique Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureSelectionTechniqueKind get(int value) {
		switch (value) {
		case REGULARIZATION_VALUE:
			return REGULARIZATION;
		case WRAPPER_VALUE:
			return WRAPPER;
		case GREEDY_ALGORITHM_VALUE:
			return GREEDY_ALGORITHM;
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
	private FeatureSelectionTechniqueKind(int value, String name, String literal) {
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

} //FeatureSelectionTechniqueKind
