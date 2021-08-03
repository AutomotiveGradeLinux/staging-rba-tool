/**
 */
package rba.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rba.core.Constraint;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.ConstraintImpl#isRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends AbstractConstraintImpl implements Constraint {
	/**
	 * The default value of the '{@link #isRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNTIME_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRuntime()
	 * @generated
	 * @ordered
	 */
	protected boolean runtime = RUNTIME_EDEFAULT;

	/**
	 * This is true if the Runtime attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean runtimeESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(boolean newRuntime) {
		boolean oldRuntime = runtime;
		runtime = newRuntime;
		boolean oldRuntimeESet = runtimeESet;
		runtimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.CONSTRAINT__RUNTIME, oldRuntime,
					runtime, !oldRuntimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRuntime() {
		boolean oldRuntime = runtime;
		boolean oldRuntimeESet = runtimeESet;
		runtime = RUNTIME_EDEFAULT;
		runtimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RBACorePackage.CONSTRAINT__RUNTIME, oldRuntime,
					RUNTIME_EDEFAULT, oldRuntimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRuntime() {
		return runtimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBACorePackage.CONSTRAINT__RUNTIME:
			return isRuntime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RBACorePackage.CONSTRAINT__RUNTIME:
			setRuntime((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RBACorePackage.CONSTRAINT__RUNTIME:
			unsetRuntime();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RBACorePackage.CONSTRAINT__RUNTIME:
			return isSetRuntime();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (runtime: ");
		if (runtimeESet)
			result.append(runtime);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ConstraintImpl
