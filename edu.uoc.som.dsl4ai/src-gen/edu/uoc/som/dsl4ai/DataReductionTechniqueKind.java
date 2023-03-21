/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Reduction Technique Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataReductionTechniqueKind()
 * @model
 * @generated
 */
public enum DataReductionTechniqueKind implements Enumerator {
	/**
	 * The '<em><b>Record Sampling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_SAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_SAMPLING(0, "recordSampling", "recordSampling"),

	/**
	 * The '<em><b>Attribute Sampling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_SAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE_SAMPLING(1, "attributeSampling", "attributeSampling"),

	/**
	 * The '<em><b>Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(2, "aggregation", "aggregation");

	/**
	 * The '<em><b>Record Sampling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_SAMPLING
	 * @model name="recordSampling"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_SAMPLING_VALUE = 0;

	/**
	 * The '<em><b>Attribute Sampling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_SAMPLING
	 * @model name="attributeSampling"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_SAMPLING_VALUE = 1;

	/**
	 * The '<em><b>Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @model name="aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Reduction Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataReductionTechniqueKind[] VALUES_ARRAY = new DataReductionTechniqueKind[] { RECORD_SAMPLING,
			ATTRIBUTE_SAMPLING, AGGREGATION, };

	/**
	 * A public read-only list of all the '<em><b>Data Reduction Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataReductionTechniqueKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Reduction Technique Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataReductionTechniqueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataReductionTechniqueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Reduction Technique Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataReductionTechniqueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataReductionTechniqueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Reduction Technique Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataReductionTechniqueKind get(int value) {
		switch (value) {
		case RECORD_SAMPLING_VALUE:
			return RECORD_SAMPLING;
		case ATTRIBUTE_SAMPLING_VALUE:
			return ATTRIBUTE_SAMPLING;
		case AGGREGATION_VALUE:
			return AGGREGATION;
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
	private DataReductionTechniqueKind(int value, String name, String literal) {
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

} //DataReductionTechniqueKind
