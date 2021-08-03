/**
 */
package rba.sound.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import rba.core.ExpressionType;

import rba.core.impl.ContentImpl;

import rba.sound.RBASoundPackage;
import rba.sound.SoundContent;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sound Content</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class SoundContentImpl extends ContentImpl implements SoundContent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SoundContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.SOUND_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		return ExpressionType.SOUND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBASoundPackage.SOUND_CONTENT___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // SoundContentImpl
