/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.LambdaContext;
import rba.core.LambdaExpression;
import rba.core.LetStatement;
import rba.core.RBACorePackage;
import rba.core.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Variable</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class VariableImpl extends RuleObjectImpl implements Variable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		EObject container = eContainer();
		if (container instanceof LambdaExpression) {
			container = container.eContainer();
			if (container instanceof LambdaContext) {
				List<Expression> operands = ((LambdaContext) container).getOperand();
				if (operands.size() > 0) {
					switch (operands.get(0).getUnderlyingType()) {
					case AREA:
					case SET_OF_AREA:
						return ExpressionType.AREA;
					case CONTENT:
					case SET_OF_CONTENT:
						return ExpressionType.CONTENT;
					case SOUND:
					case SET_OF_SOUND:
						return ExpressionType.SOUND;
					case ZONE:
					case SET_OF_ZONE:
						return ExpressionType.ZONE;
					case SCENE:
						return ExpressionType.SCENE;
					case PROPERTY:
						return ExpressionType.PROPERTY;
					case BOOLEAN:
						return ExpressionType.BOOLEAN;
					case LAMBDA:
						return ExpressionType.LAMBDA;
					case VALUE:
					default:
						return ExpressionType.VALUE;
					}
				}
			}
		} else if (container instanceof LetStatement) {
			Expression body = ((LetStatement) container).getBody();
			if (body != null) {
				return body.getUnderlyingType();
			}
		}
		return ExpressionType.VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.VARIABLE___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // VariableImpl
