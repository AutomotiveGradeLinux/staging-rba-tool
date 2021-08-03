/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;

import rba.core.impl.ContentSetImpl;

import rba.view.RBAViewPackage;
import rba.view.ViewContentSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>View Content Set</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ViewContentSetImpl extends ContentSetImpl implements ViewContentSet {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewContentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.VIEW_CONTENT_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		return ExpressionType.SET_OF_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBAViewPackage.VIEW_CONTENT_SET___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ViewContentSetImpl
