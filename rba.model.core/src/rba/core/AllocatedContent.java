/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocated Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getAllocatedContent()
 * @model
 * @generated
 */
public interface AllocatedContent extends AllocatableOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".allocatedContent()\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nif (!expressions.isEmpty() &amp;&amp; expressions.get(0) != null) {\r\n    rba.core.Expression first = expressions.get(0);\r\n    if ((first.getType() == ExpressionType.AREA) || (first.getType() == ExpressionType.SET_OF_AREA)) {\r\n        return ExpressionType.CONTENT;\r\n    } else if ((first.getType() == ExpressionType.ZONE) || (first.getType() == ExpressionType.SET_OF_ZONE)) {\r\n        return ExpressionType.SOUND;\r\n    }\r\n}\r\nreturn ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // AllocatedContent
