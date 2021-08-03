/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Context</b></em>'.
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
 *   <li>{@link rba.core.LambdaContext#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getLambdaContext()
 * @model abstract="true"
 * @generated
 */
public interface LambdaContext extends SetOperator {
	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link rba.core.LambdaExpression#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lambda</em>' containment reference.
	 * @see #setLambda(LambdaExpression)
	 * @see rba.core.RBACorePackage#getLambdaContext_Lambda()
	 * @see rba.core.LambdaExpression#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	LambdaExpression getLambda();

	/**
	 * Sets the value of the '{@link rba.core.LambdaContext#getLambda <em>Lambda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' containment reference.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(LambdaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (!getOperand().isEmpty()) {\r\n    rba.core.Expression first = getOperand().get(0);\r\n    if (first.getType() == ExpressionType.SET_OF_CONTENT) {\r\n        return ExpressionType.CONTENT;\r\n    } else if (first.getType() == ExpressionType.SET_OF_AREA) {\r\n        return ExpressionType.AREA;\r\n    } else if (first.getType() == ExpressionType.SET_OF_ZONE) {\r\n        return ExpressionType.ZONE;\r\n    } else if (first.getType() == ExpressionType.SET_OF_SOUND) {\r\n        return ExpressionType.SOUND;\r\n    } else {\r\n        return first.getType();\r\n    }\r\n}\r\n\r\nreturn ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getContextType();

} // LambdaContext
