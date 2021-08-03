/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ActiveContents;
import rba.core.ExpressionType;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActiveContentsImpl extends AllocatableOperatorImpl implements ActiveContents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ACTIVE_CONTENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".activeContents()";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.ACTIVE_CONTENTS___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.ACTIVE_CONTENTS___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActiveContentsImpl
