/**
 */
package edu.uoc.som.dsl4ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Extraction Technique Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.dsl4ai.Dsl4aiPackage#getFeatureExtractionTechniqueKind()
 * @model
 * @generated
 */
public enum FeatureExtractionTechniqueKind implements Enumerator {
	/**
	 * The '<em><b>Cluster Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_ANALYSIS(0, "clusterAnalysis", "clusterAnalysis"),

	/**
	 * The '<em><b>Text Analytics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_ANALYTICS_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_ANALYTICS(1, "textAnalytics", "textAnalytics"),

	/**
	 * The '<em><b>Edge Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	EDGE_DETECTION(2, "edgeDetection", "edgeDetection"),

	/**
	 * The '<em><b>Principal Components Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINCIPAL_COMPONENTS_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	PRINCIPAL_COMPONENTS_ANALYSIS(3, "principalComponentsAnalysis", "principalComponentsAnalysis");

	/**
	 * The '<em><b>Cluster Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ANALYSIS
	 * @model name="clusterAnalysis"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_ANALYSIS_VALUE = 0;

	/**
	 * The '<em><b>Text Analytics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_ANALYTICS
	 * @model name="textAnalytics"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_ANALYTICS_VALUE = 1;

	/**
	 * The '<em><b>Edge Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE_DETECTION
	 * @model name="edgeDetection"
	 * @generated
	 * @ordered
	 */
	public static final int EDGE_DETECTION_VALUE = 2;

	/**
	 * The '<em><b>Principal Components Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINCIPAL_COMPONENTS_ANALYSIS
	 * @model name="principalComponentsAnalysis"
	 * @generated
	 * @ordered
	 */
	public static final int PRINCIPAL_COMPONENTS_ANALYSIS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Feature Extraction Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureExtractionTechniqueKind[] VALUES_ARRAY = new FeatureExtractionTechniqueKind[] {
			CLUSTER_ANALYSIS, TEXT_ANALYTICS, EDGE_DETECTION, PRINCIPAL_COMPONENTS_ANALYSIS, };

	/**
	 * A public read-only list of all the '<em><b>Feature Extraction Technique Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureExtractionTechniqueKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Extraction Technique Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureExtractionTechniqueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureExtractionTechniqueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Extraction Technique Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureExtractionTechniqueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureExtractionTechniqueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Extraction Technique Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureExtractionTechniqueKind get(int value) {
		switch (value) {
		case CLUSTER_ANALYSIS_VALUE:
			return CLUSTER_ANALYSIS;
		case TEXT_ANALYTICS_VALUE:
			return TEXT_ANALYTICS;
		case EDGE_DETECTION_VALUE:
			return EDGE_DETECTION;
		case PRINCIPAL_COMPONENTS_ANALYSIS_VALUE:
			return PRINCIPAL_COMPONENTS_ANALYSIS;
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
	private FeatureExtractionTechniqueKind(int value, String name, String literal) {
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

} //FeatureExtractionTechniqueKind
