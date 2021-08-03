/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;

import rba.view.DisplayingContent;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Displaying Content</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class DisplayingContentImpl extends AreaOperatorImpl implements DisplayingContent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayingContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.DISPLAYING_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".displayingContent()";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBAViewPackage.DISPLAYING_CONTENT___GET_SYMBOL:
			return getSymbol();
		case RBAViewPackage.DISPLAYING_CONTENT___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // DisplayingContentImpl
