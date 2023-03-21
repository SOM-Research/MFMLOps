/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Cleaning Technique Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getDataCleaningTechniqueKind()
 * @model
 * @generated
 */
public enum DataCleaningTechniqueKind implements Enumerator {
	/**
	 * The '<em><b>Deletion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETION_VALUE
	 * @generated
	 * @ordered
	 */
	DELETION(0, "deletion", "deletion"),

	/**
	 * The '<em><b>Dummy Substitution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUMMY_SUBSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DUMMY_SUBSTITUTION(1, "dummySubstitution", "dummySubstitution"),

	/**
	 * The '<em><b>Mean Substitution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_SUBSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN_SUBSTITUTION(2, "meanSubstitution", "meanSubstitution"),

	/**
	 * The '<em><b>Frequent Substitution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_SUBSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENT_SUBSTITUTION(3, "frequentSubstitution", "frequentSubstitution"),

	/**
	 * The '<em><b>Regression Substitution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_SUBSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	REGRESSION_SUBSTITUTION(4, "regressionSubstitution", "regressionSubstitution");

	/**
	 * The '<em><b>Deletion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETION
	 * @model name="deletion"
	 * @generated
	 * @ordered
	 */
	public static final int DELETION_VALUE = 0;

	/**
	 * The '<em><b>Dummy Substitution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUMMY_SUBSTITUTION
	 * @model name="dummySubstitution"
	 * @generated
	 * @ordered
	 */
	public static final int DUMMY_SUBSTITUTION_VALUE = 1;

	/**
	 * The '<em><b>Mean Substitution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_SUBSTITUTION
	 * @model name="meanSubstitution"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_SUBSTITUTION_VALUE = 2;

	/**
	 * The '<em><b>Frequent Substitution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_SUBSTITUTION
	 * @model name="frequentSubstitution"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENT_SUBSTITUTION_VALUE = 3;

	/**
	 * The '<em><b>Regression Substitution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_SUBSTITUTION
	 * @model name="regressionSubstitution"
	 * @generated
	 * @ordered
	 */
	public static final int REGRESSION_SUBSTITUTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Data Cleaning Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataCleaningTechniqueKind[] VALUES_ARRAY = new DataCleaningTechniqueKind[] { DELETION,
			DUMMY_SUBSTITUTION, MEAN_SUBSTITUTION, FREQUENT_SUBSTITUTION, REGRESSION_SUBSTITUTION, };

	/**
	 * A public read-only list of all the '<em><b>Data Cleaning Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataCleaningTechniqueKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Cleaning Technique Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataCleaningTechniqueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataCleaningTechniqueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Cleaning Technique Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataCleaningTechniqueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataCleaningTechniqueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Cleaning Technique Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataCleaningTechniqueKind get(int value) {
		switch (value) {
		case DELETION_VALUE:
			return DELETION;
		case DUMMY_SUBSTITUTION_VALUE:
			return DUMMY_SUBSTITUTION;
		case MEAN_SUBSTITUTION_VALUE:
			return MEAN_SUBSTITUTION;
		case FREQUENT_SUBSTITUTION_VALUE:
			return FREQUENT_SUBSTITUTION;
		case REGRESSION_SUBSTITUTION_VALUE:
			return REGRESSION_SUBSTITUTION;
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
	private DataCleaningTechniqueKind(int value, String name, String literal) {
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

} //DataCleaningTechniqueKind
