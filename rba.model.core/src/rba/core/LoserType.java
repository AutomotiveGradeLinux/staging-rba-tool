/**
 */
package rba.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Loser Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see rba.core.RBACorePackage#getLoserType()
 * @model
 * @generated
 */
public enum LoserType implements Enumerator {
	/**
	 * The '<em><b>NEVER GIVEUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_GIVEUP_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER_GIVEUP(0, "NEVER_GIVEUP", "NEVER_GIVEUP"),

	/**
	 * The '<em><b>GOOD LOSER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD_LOSER_VALUE
	 * @generated
	 * @ordered
	 */
	GOOD_LOSER(0, "GOOD_LOSER", "GOOD_LOSER"),

	/**
	 * The '<em><b>DO NOT GIVEUP UNTIL WIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO_NOT_GIVEUP_UNTIL_WIN_VALUE
	 * @generated
	 * @ordered
	 */
	DO_NOT_GIVEUP_UNTIL_WIN(0, "DO_NOT_GIVEUP_UNTIL_WIN", "DO_NOT_GIVEUP_UNTIL_WIN");

	/**
	 * The '<em><b>NEVER GIVEUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #NEVER_GIVEUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_GIVEUP_VALUE = 0;

	/**
	 * The '<em><b>GOOD LOSER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #GOOD_LOSER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOOD_LOSER_VALUE = 0;

	/**
	 * The '<em><b>DO NOT GIVEUP UNTIL WIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #DO_NOT_GIVEUP_UNTIL_WIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DO_NOT_GIVEUP_UNTIL_WIN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Loser Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LoserType[] VALUES_ARRAY = new LoserType[] { NEVER_GIVEUP, GOOD_LOSER,
			DO_NOT_GIVEUP_UNTIL_WIN, };

	/**
	 * A public read-only list of all the '<em><b>Loser Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LoserType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Loser Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoserType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoserType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loser Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoserType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoserType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loser Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoserType get(int value) {
		switch (value) {
		case NEVER_GIVEUP_VALUE:
			return NEVER_GIVEUP;
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
	private LoserType(int value, String name, String literal) {
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

} //LoserType
