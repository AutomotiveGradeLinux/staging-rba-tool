/**
 */
package rba.sound.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;

import rba.sound.OutputtingSound;
import rba.sound.RBASoundPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Outputting Sound</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputtingSoundImpl extends ZoneOperatorImpl implements OutputtingSound {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputtingSoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.OUTPUTTING_SOUND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".outputtingSound()";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.SOUND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBASoundPackage.OUTPUTTING_SOUND___GET_SYMBOL:
			return getSymbol();
		case RBASoundPackage.OUTPUTTING_SOUND___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // OutputtingSoundImpl
