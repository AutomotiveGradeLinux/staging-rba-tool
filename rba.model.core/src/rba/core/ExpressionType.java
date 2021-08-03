/**
 */
package rba.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expression Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see rba.core.RBACorePackage#getExpressionType()
 * @model
 * @generated
 */
public enum ExpressionType implements Enumerator {
	/**
	 * The '<em><b>VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(0, "VALUE", "VALUE"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(1, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>AREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(2, "AREA", "AREA"),

	/**
	 * The '<em><b>CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT(3, "CONTENT", "CONTENT"),

	/**
	 * The '<em><b>SET OF AREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_OF_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	SET_OF_AREA(4, "SET_OF_AREA", "SET_OF_AREA"),

	/**
	 * The '<em><b>SET OF CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_OF_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	SET_OF_CONTENT(5, "SET_OF_CONTENT", "SET_OF_CONTENT"),

	/**
	 * The '<em><b>LAMBDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAMBDA_VALUE
	 * @generated
	 * @ordered
	 */
	LAMBDA(6, "LAMBDA", "LAMBDA"),

	/**
	 * The '<em><b>SCENE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCENE_VALUE
	 * @generated
	 * @ordered
	 */
	SCENE(7, "SCENE", "SCENE"),

	/**
	 * The '<em><b>ZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	ZONE(8, "ZONE", "ZONE"),

	/**
	 * The '<em><b>SET OF ZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_OF_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	SET_OF_ZONE(9, "SET_OF_ZONE", "SET_OF_ZONE"),

	/**
	 * The '<em><b>SOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND(10, "SOUND", "SOUND"),

	/**
	 * The '<em><b>SET OF SOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_OF_SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	SET_OF_SOUND(11, "SET_OF_SOUND", "SET_OF_SOUND"),

	/**
	 * The '<em><b>PROPERTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(14, "PROPERTY", "PROPERTY"),

	/**
	 * The '<em><b>CONTENT STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_STATE(17, "CONTENT_STATE", "CONTENT_STATE"),

	/**
	 * The '<em><b>ENUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM(21, "ENUM", "ENUM"),

	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(23, "NULL", "NULL");

	/**
	 * The '<em><b>VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 2;

	/**
	 * The '<em><b>CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_VALUE = 3;

	/**
	 * The '<em><b>SET OF AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET OF AREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_OF_AREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_OF_AREA_VALUE = 4;

	/**
	 * The '<em><b>SET OF CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET OF CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_OF_CONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_OF_CONTENT_VALUE = 5;

	/**
	 * The '<em><b>LAMBDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAMBDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAMBDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAMBDA_VALUE = 6;

	/**
	 * The '<em><b>SCENE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCENE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCENE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCENE_VALUE = 7;

	/**
	 * The '<em><b>ZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZONE_VALUE = 8;

	/**
	 * The '<em><b>SET OF ZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET OF ZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_OF_ZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_OF_ZONE_VALUE = 9;

	/**
	 * The '<em><b>SOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_VALUE = 10;

	/**
	 * The '<em><b>SET OF SOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET OF SOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_OF_SOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_OF_SOUND_VALUE = 11;

	/**
	 * The '<em><b>PROPERTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPERTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 14;

	/**
	 * The '<em><b>CONTENT STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTENT STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTENT_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_STATE_VALUE = 17;

	/**
	 * The '<em><b>ENUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VALUE = 21;

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 23;

	/**
	 * An array of all the '<em><b>Expression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionType[] VALUES_ARRAY = new ExpressionType[] { VALUE, BOOLEAN, AREA, CONTENT,
			SET_OF_AREA, SET_OF_CONTENT, LAMBDA, SCENE, ZONE, SET_OF_ZONE, SOUND, SET_OF_SOUND, PROPERTY, CONTENT_STATE,
			ENUM, NULL, };

	/**
	 * A public read-only list of all the '<em><b>Expression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpressionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionType get(int value) {
		switch (value) {
		case VALUE_VALUE:
			return VALUE;
		case BOOLEAN_VALUE:
			return BOOLEAN;
		case AREA_VALUE:
			return AREA;
		case CONTENT_VALUE:
			return CONTENT;
		case SET_OF_AREA_VALUE:
			return SET_OF_AREA;
		case SET_OF_CONTENT_VALUE:
			return SET_OF_CONTENT;
		case LAMBDA_VALUE:
			return LAMBDA;
		case SCENE_VALUE:
			return SCENE;
		case ZONE_VALUE:
			return ZONE;
		case SET_OF_ZONE_VALUE:
			return SET_OF_ZONE;
		case SOUND_VALUE:
			return SOUND;
		case SET_OF_SOUND_VALUE:
			return SET_OF_SOUND;
		case PROPERTY_VALUE:
			return PROPERTY;
		case CONTENT_STATE_VALUE:
			return CONTENT_STATE;
		case ENUM_VALUE:
			return ENUM;
		case NULL_VALUE:
			return NULL;
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
	private ExpressionType(int value, String name, String literal) {
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

} //ExpressionType
