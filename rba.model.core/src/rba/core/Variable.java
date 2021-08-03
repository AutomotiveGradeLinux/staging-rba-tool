/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends RuleObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EObject%&gt; container = eContainer();\r\nif(container instanceof &lt;%rba.core.LambdaExpression%&gt;) {\r\n    container = container.eContainer();\r\n    if(container instanceof &lt;%rba.core.LambdaContext%&gt;) {\r\n        &lt;%java.util.List%&gt;&lt;Expression&gt; operands = ((LambdaContext) container).getOperand();\r\n        if (operands.size() &gt; 0) {\r\n            switch (operands.get(0).getUnderlyingType()) {\r\n            case AREA:\r\n            case SET_OF_AREA:\r\n                return ExpressionType.AREA;\r\n            case CONTENT:\r\n            case SET_OF_CONTENT:\r\n                return ExpressionType.CONTENT;\r\n            case SOUND:\r\n            case SET_OF_SOUND:\r\n                return ExpressionType.SOUND;\r\n            case ZONE:\r\n            case SET_OF_ZONE:\r\n                return ExpressionType.ZONE;\r\n            case SCENE:\r\n                return ExpressionType.SCENE;\r\n            case PROPERTY:\r\n                return ExpressionType.PROPERTY;\r\n            case BOOLEAN:\r\n                return ExpressionType.BOOLEAN;\r\n            case LAMBDA:\r\n                return ExpressionType.LAMBDA;\r\n            case VALUE:\r\n            default:\r\n                return ExpressionType.VALUE;\r\n            }\r\n        }\r\n    }\r\n} else if (container instanceof &lt;%rba.core.LetStatement%&gt;) {\r\n    &lt;%rba.core.Expression%&gt; body = ((LetStatement) container).getBody();\r\n    if (body != null) {\r\n        return body.getUnderlyingType();\r\n    }\r\n}\r\nreturn ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // Variable
