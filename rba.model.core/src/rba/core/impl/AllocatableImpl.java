/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rba.core.Allocatable;
import rba.core.ArbitrationPolicy;
import rba.core.Expression;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Allocatable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.AllocatableImpl#getArbitrationPolicy <em>Arbitration Policy</em>}</li>
 *   <li>{@link rba.core.impl.AllocatableImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AllocatableImpl extends AbstractAllocatableImpl implements Allocatable {
	/**
	 * The default value of the '{@link #getArbitrationPolicy() <em>Arbitration Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbitrationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final ArbitrationPolicy ARBITRATION_POLICY_EDEFAULT = ArbitrationPolicy.DEFAULT;

	/**
	 * The cached value of the '{@link #getArbitrationPolicy() <em>Arbitration Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbitrationPolicy()
	 * @generated
	 * @ordered
	 */
	protected ArbitrationPolicy arbitrationPolicy = ARBITRATION_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Expression visibility;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ALLOCATABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrationPolicy getArbitrationPolicy() {
		return arbitrationPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setArbitrationPolicy(ArbitrationPolicy newArbitrationPolicy) {
		ArbitrationPolicy oldArbitrationPolicy = arbitrationPolicy;
		arbitrationPolicy = newArbitrationPolicy == null ? ARBITRATION_POLICY_EDEFAULT : newArbitrationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY,
					oldArbitrationPolicy, arbitrationPolicy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibility(Expression newVisibility, NotificationChain msgs) {
		Expression oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBACorePackage.ALLOCATABLE__VISIBILITY, oldVisibility, newVisibility);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Expression newVisibility) {
		if (newVisibility != visibility) {
			NotificationChain msgs = null;
			if (visibility != null)
				msgs = ((InternalEObject) visibility).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.ALLOCATABLE__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject) newVisibility).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.ALLOCATABLE__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.ALLOCATABLE__VISIBILITY, newVisibility,
					newVisibility));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocatable> collectLeafAllocatable() {
		java.util.Set<Allocatable> allocatables = new java.util.HashSet<Allocatable>();
		allocatables.add(this);
		return new org.eclipse.emf.common.util.BasicEList<Allocatable>(allocatables);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.ALLOCATABLE__VISIBILITY:
			return basicSetVisibility(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY:
			return getArbitrationPolicy();
		case RBACorePackage.ALLOCATABLE__VISIBILITY:
			return getVisibility();
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
		case RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY:
			setArbitrationPolicy((ArbitrationPolicy) newValue);
			return;
		case RBACorePackage.ALLOCATABLE__VISIBILITY:
			setVisibility((Expression) newValue);
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
		case RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY:
			setArbitrationPolicy(ARBITRATION_POLICY_EDEFAULT);
			return;
		case RBACorePackage.ALLOCATABLE__VISIBILITY:
			setVisibility((Expression) null);
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
		case RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY:
			return arbitrationPolicy != ARBITRATION_POLICY_EDEFAULT;
		case RBACorePackage.ALLOCATABLE__VISIBILITY:
			return visibility != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE:
			return collectLeafAllocatable();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (arbitrationPolicy: ");
		result.append(arbitrationPolicy);
		result.append(')');
		return result.toString();
	}

} // AllocatableImpl
