/**
 */
package rba.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arbitration Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see rba.core.RBACorePackage#getArbitrationPolicy()
 * @model
 * @generated
 */
public enum ArbitrationPolicy implements Enumerator {
	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>FIRST COME FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_COME_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_COME_FIRST(4, "FIRST_COME_FIRST", "FIRST_COME_FIRST"),

	/**
	 * The '<em><b>LAST COME FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_COME_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_COME_FIRST(1, "LAST_COME_FIRST", "LAST_COME_FIRST"),

	/**
	 * The '<em><b>PRIORITY FIRST COME FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY_FIRST_COME_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	PRIORITY_FIRST_COME_FIRST(5, "PRIORITY_FIRST_COME_FIRST", "PRIORITY_FIRST_COME_FIRST"),

	/**
	 * The '<em><b>PRIORITY LAST COME FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY_LAST_COME_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	PRIORITY_LAST_COME_FIRST(6, "PRIORITY_LAST_COME_FIRST", "PRIORITY_LAST_COME_FIRST");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>FIRST COME FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #FIRST_COME_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_COME_FIRST_VALUE = 4;

	/**
	 * The '<em><b>LAST COME FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #LAST_COME_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_COME_FIRST_VALUE = 1;

	/**
	 * The '<em><b>PRIORITY FIRST COME FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PRIORITY_FIRST_COME_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_FIRST_COME_FIRST_VALUE = 5;

	/**
	 * The '<em><b>PRIORITY LAST COME FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PRIORITY_LAST_COME_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_LAST_COME_FIRST_VALUE = 6;

	/**
	 * An array of all the '<em><b>Arbitration Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArbitrationPolicy[] VALUES_ARRAY = new ArbitrationPolicy[] { DEFAULT, FIRST_COME_FIRST,
			LAST_COME_FIRST, PRIORITY_FIRST_COME_FIRST, PRIORITY_LAST_COME_FIRST, };

	/**
	 * A public read-only list of all the '<em><b>Arbitration Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArbitrationPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arbitration Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArbitrationPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArbitrationPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arbitration Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArbitrationPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArbitrationPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arbitration Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArbitrationPolicy get(int value) {
		switch (value) {
		case DEFAULT_VALUE:
			return DEFAULT;
		case FIRST_COME_FIRST_VALUE:
			return FIRST_COME_FIRST;
		case LAST_COME_FIRST_VALUE:
			return LAST_COME_FIRST;
		case PRIORITY_FIRST_COME_FIRST_VALUE:
			return PRIORITY_FIRST_COME_FIRST;
		case PRIORITY_LAST_COME_FIRST_VALUE:
			return PRIORITY_LAST_COME_FIRST;
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
	private ArbitrationPolicy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //ArbitrationPolicy
