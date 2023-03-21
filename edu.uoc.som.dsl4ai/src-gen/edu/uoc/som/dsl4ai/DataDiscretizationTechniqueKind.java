/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Discretization Technique Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataDiscretizationTechniqueKind()
 * @model
 * @generated
 */
public enum DataDiscretizationTechniqueKind implements Enumerator {
	/**
	 * The '<em><b>Equal Width Binning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_WIDTH_BINNING_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_WIDTH_BINNING(0, "equalWidthBinning", "equalWidthBinning"),

	/**
	 * The '<em><b>Equal Height Binning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_HEIGHT_BINNING_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_HEIGHT_BINNING(1, "equalHeightBinning", "equalHeightBinning");

	/**
	 * The '<em><b>Equal Width Binning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_WIDTH_BINNING
	 * @model name="equalWidthBinning"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_WIDTH_BINNING_VALUE = 0;

	/**
	 * The '<em><b>Equal Height Binning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_HEIGHT_BINNING
	 * @model name="equalHeightBinning"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_HEIGHT_BINNING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Data Discretization Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataDiscretizationTechniqueKind[] VALUES_ARRAY = new DataDiscretizationTechniqueKind[] {
			EQUAL_WIDTH_BINNING, EQUAL_HEIGHT_BINNING, };

	/**
	 * A public read-only list of all the '<em><b>Data Discretization Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataDiscretizationTechniqueKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Discretization Technique Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataDiscretizationTechniqueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataDiscretizationTechniqueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Discretization Technique Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataDiscretizationTechniqueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataDiscretizationTechniqueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Discretization Technique Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataDiscretizationTechniqueKind get(int value) {
		switch (value) {
		case EQUAL_WIDTH_BINNING_VALUE:
			return EQUAL_WIDTH_BINNING;
		case EQUAL_HEIGHT_BINNING_VALUE:
			return EQUAL_HEIGHT_BINNING;
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
	private DataDiscretizationTechniqueKind(int value, String name, String literal) {
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

} //DataDiscretizationTechniqueKind
