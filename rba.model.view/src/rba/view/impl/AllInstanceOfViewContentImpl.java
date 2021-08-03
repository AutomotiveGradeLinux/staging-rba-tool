/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;

import rba.core.impl.SetExpressionImpl;

import rba.view.AllInstanceOfViewContent;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>All Instance Of View Content</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class AllInstanceOfViewContentImpl extends SetExpressionImpl implements AllInstanceOfViewContent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AllInstanceOfViewContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.ALL_INSTANCE_OF_VIEW_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		return "ALL_VIEWCONTENTS";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.SET_OF_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBAViewPackage.ALL_INSTANCE_OF_VIEW_CONTENT___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBAViewPackage.ALL_INSTANCE_OF_VIEW_CONTENT___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AllInstanceOfViewContentImpl
