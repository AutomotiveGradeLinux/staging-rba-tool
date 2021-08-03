/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.impl.AllocatableImpl;
import rba.view.Area;
import rba.view.RBAViewPackage;
import rba.view.SizeIdentifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Area</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.AreaImpl#getZorder <em>Zorder</em>}</li>
 *   <li>{@link rba.view.impl.AreaImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends AllocatableImpl implements Area {
	/**
	 * The cached value of the '{@link #getZorder() <em>Zorder</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getZorder()
	 * @generated
	 * @ordered
	 */
	protected Expression zorder;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected EList<SizeIdentifier> size;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getZorder() {
		return zorder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZorder(Expression newZorder, NotificationChain msgs) {
		Expression oldZorder = zorder;
		zorder = newZorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RBAViewPackage.AREA__ZORDER,
					oldZorder, newZorder);
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
	public void setZorder(Expression newZorder) {
		if (newZorder != zorder) {
			NotificationChain msgs = null;
			if (zorder != null)
				msgs = ((InternalEObject) zorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.AREA__ZORDER, null, msgs);
			if (newZorder != null)
				msgs = ((InternalEObject) newZorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.AREA__ZORDER, null, msgs);
			msgs = basicSetZorder(newZorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.AREA__ZORDER, newZorder, newZorder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SizeIdentifier> getSize() {
		if (size == null) {
			size = new EObjectContainmentEList<SizeIdentifier>(SizeIdentifier.class, this, RBAViewPackage.AREA__SIZE);
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		return ExpressionType.AREA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBAViewPackage.AREA__ZORDER:
			return basicSetZorder(null, msgs);
		case RBAViewPackage.AREA__SIZE:
			return ((InternalEList<?>) getSize()).basicRemove(otherEnd, msgs);
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
		case RBAViewPackage.AREA__ZORDER:
			return getZorder();
		case RBAViewPackage.AREA__SIZE:
			return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RBAViewPackage.AREA__ZORDER:
			setZorder((Expression) newValue);
			return;
		case RBAViewPackage.AREA__SIZE:
			getSize().clear();
			getSize().addAll((Collection<? extends SizeIdentifier>) newValue);
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
		case RBAViewPackage.AREA__ZORDER:
			setZorder((Expression) null);
			return;
		case RBAViewPackage.AREA__SIZE:
			getSize().clear();
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
		case RBAViewPackage.AREA__ZORDER:
			return zorder != null;
		case RBAViewPackage.AREA__SIZE:
			return size != null && !size.isEmpty();
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
		case RBAViewPackage.AREA___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AreaImpl
