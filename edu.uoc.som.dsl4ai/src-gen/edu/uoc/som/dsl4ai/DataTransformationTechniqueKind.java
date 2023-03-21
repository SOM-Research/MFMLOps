/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Transformation Technique Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataTransformationTechniqueKind()
 * @model
 * @generated
 */
public enum DataTransformationTechniqueKind implements Enumerator {
	/**
	 * The '<em><b>Min Max Normalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_MAX_NORMALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_MAX_NORMALIZATION(0, "minMaxNormalization", "minMaxNormalization"),

	/**
	 * The '<em><b>ZScore Normalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZSCORE_NORMALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ZSCORE_NORMALIZATION(1, "zScoreNormalization", "zScoreNormalization"),

	/**
	 * The '<em><b>Decimal Scaling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_SCALING_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL_SCALING(2, "decimalScaling", "decimalScaling");

	/**
	 * The '<em><b>Min Max Normalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_MAX_NORMALIZATION
	 * @model name="minMaxNormalization"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_MAX_NORMALIZATION_VALUE = 0;

	/**
	 * The '<em><b>ZScore Normalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZSCORE_NORMALIZATION
	 * @model name="zScoreNormalization"
	 * @generated
	 * @ordered
	 */
	public static final int ZSCORE_NORMALIZATION_VALUE = 1;

	/**
	 * The '<em><b>Decimal Scaling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_SCALING
	 * @model name="decimalScaling"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_SCALING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Transformation Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTransformationTechniqueKind[] VALUES_ARRAY = new DataTransformationTechniqueKind[] {
			MIN_MAX_NORMALIZATION, ZSCORE_NORMALIZATION, DECIMAL_SCALING, };

	/**
	 * A public read-only list of all the '<em><b>Data Transformation Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTransformationTechniqueKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Transformation Technique Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTransformationTechniqueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTransformationTechniqueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Transformation Technique Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTransformationTechniqueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTransformationTechniqueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Transformation Technique Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTransformationTechniqueKind get(int value) {
		switch (value) {
		case MIN_MAX_NORMALIZATION_VALUE:
			return MIN_MAX_NORMALIZATION;
		case ZSCORE_NORMALIZATION_VALUE:
			return ZSCORE_NORMALIZATION;
		case DECIMAL_SCALING_VALUE:
			return DECIMAL_SCALING;
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
	private DataTransformationTechniqueKind(int value, String name, String literal) {
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

} //DataTransformationTechniqueKind
