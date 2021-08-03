/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getActiveContents()
 * @model
 * @generated
 */
public interface ActiveContents extends AllocatableOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".activeContents()\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nif (!expressions.isEmpty() &amp;&amp; expressions.get(0) != null) {\r\n  rba.core.Expression first = expressions.get(0);\r\n  if (first.getType() == ExpressionType.AREA) {\r\n    return ExpressionType.SET_OF_CONTENT;\r\n  } else if (first.getType() == ExpressionType.ZONE) {\r\n    return ExpressionType.SET_OF_SOUND;\r\n  }\r\n}\r\nreturn ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // ActiveContents
