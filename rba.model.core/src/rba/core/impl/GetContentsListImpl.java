/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;
import rba.core.GetContentsList;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get Contents List</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetContentsListImpl extends AllocatableOperatorImpl implements GetContentsList {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GetContentsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.GET_CONTENTS_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".contentsList()";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		EList<rba.core.Expression> expressions = getOperand();
		if (!expressions.isEmpty() && expressions.get(0) != null) {
			rba.core.Expression first = expressions.get(0);
			if (first.getType() == ExpressionType.AREA) {
				return ExpressionType.SET_OF_CONTENT;
			} else if (first.getType() == ExpressionType.ZONE) {
				return ExpressionType.SET_OF_SOUND;
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
		case RBACorePackage.GET_CONTENTS_LIST___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.GET_CONTENTS_LIST___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // GetContentsListImpl
