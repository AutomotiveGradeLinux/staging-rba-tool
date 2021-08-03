/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rba.core.Scene#isGlobal <em>Global</em>}</li>
 *   <li>{@link rba.core.Scene#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends AbstractScene {
	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(boolean)
	 * @see rba.core.RBACorePackage#getScene_Global()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link rba.core.Scene#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link rba.core.AbstractProperty}.
	 * It is bidirectional and its opposite is '{@link rba.core.AbstractProperty#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see rba.core.RBACorePackage#getScene_Properties()
	 * @see rba.core.AbstractProperty#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<AbstractProperty> getProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SCENE;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // Scene
