/**
 */
package rba.sound.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import rba.core.ExpressionType;

import rba.core.impl.AllocatableSetImpl;
import rba.sound.RBASoundPackage;
import rba.sound.ZoneSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Zone Set</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ZoneSetImpl extends AllocatableSetImpl implements ZoneSet {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.ZONE_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		return ExpressionType.SET_OF_ZONE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBASoundPackage.ZONE_SET___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ZoneSetImpl
