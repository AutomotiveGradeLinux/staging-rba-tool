/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;
import rba.core.GetAllocatables;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get Allocatables</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetAllocatablesImpl extends ContentOperatorImpl implements GetAllocatables {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAllocatablesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.GET_ALLOCATABLES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".allocatables()";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		EList<rba.core.Expression> expressions = getOperand();
		if (!expressions.isEmpty() && expressions.get(0) != null) {
			rba.core.Expression first = expressions.get(0);
			if (first.getType() == ExpressionType.CONTENT) {
				return ExpressionType.SET_OF_AREA;
			} else if (first.getType() == ExpressionType.SOUND) {
				return ExpressionType.SET_OF_ZONE;
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
		case RBACorePackage.GET_ALLOCATABLES___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.GET_ALLOCATABLES___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // GetAllocatablesImpl
