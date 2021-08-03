/**
 */
package rba.sound.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;

import rba.core.impl.SetExpressionImpl;

import rba.sound.AllInstanceOfZone;
import rba.sound.RBASoundPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>All Instance Of Zone</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AllInstanceOfZoneImpl extends SetExpressionImpl implements AllInstanceOfZone {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AllInstanceOfZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.ALL_INSTANCE_OF_ZONE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		return "ALL_ZONES";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.SET_OF_ZONE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBASoundPackage.ALL_INSTANCE_OF_ZONE___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBASoundPackage.ALL_INSTANCE_OF_ZONE___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AllInstanceOfZoneImpl
