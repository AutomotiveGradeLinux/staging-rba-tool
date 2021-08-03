/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.AllocatedContent;
import rba.core.ExpressionType;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Allocated Content</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AllocatedContentImpl extends AllocatableOperatorImpl implements AllocatedContent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatedContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ALLOCATED_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".allocatedContent()";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		EList<rba.core.Expression> expressions = getOperand();
		if (!expressions.isEmpty() && expressions.get(0) != null) {
			rba.core.Expression first = expressions.get(0);
			if ((first.getType() == ExpressionType.AREA) || (first.getType() == ExpressionType.SET_OF_AREA)) {
				return ExpressionType.CONTENT;
			} else if ((first.getType() == ExpressionType.ZONE) || (first.getType() == ExpressionType.SET_OF_ZONE)) {
				return ExpressionType.SOUND;
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
		case RBACorePackage.ALLOCATED_CONTENT___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.ALLOCATED_CONTENT___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AllocatedContentImpl
