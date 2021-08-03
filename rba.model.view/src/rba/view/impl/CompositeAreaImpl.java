/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rba.core.ExpressionType;

import rba.core.impl.PackagableElementImpl;
import rba.view.Area;
import rba.view.CompositeArea;
import rba.view.LayoutManager;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Composite Area</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.CompositeAreaImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeAreaImpl extends PackagableElementImpl implements CompositeArea {
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected LayoutManager layout;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.COMPOSITE_AREA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutManager getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(LayoutManager newLayout, NotificationChain msgs) {
		LayoutManager oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBAViewPackage.COMPOSITE_AREA__LAYOUT, oldLayout, newLayout);
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
	public void setLayout(LayoutManager newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject) layout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.COMPOSITE_AREA__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject) newLayout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.COMPOSITE_AREA__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.COMPOSITE_AREA__LAYOUT, newLayout,
					newLayout));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> collectLeafArea() {
		java.util.Set<Area> areas = new java.util.HashSet<Area>();
		if (layout != null) {
			areas.addAll(layout.collectLeafArea());
		}

		return new org.eclipse.emf.common.util.BasicEList<Area>(areas);
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
		case RBAViewPackage.COMPOSITE_AREA__LAYOUT:
			return basicSetLayout(null, msgs);
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
		case RBAViewPackage.COMPOSITE_AREA__LAYOUT:
			return getLayout();
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
		case RBAViewPackage.COMPOSITE_AREA__LAYOUT:
			setLayout((LayoutManager) newValue);
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
		case RBAViewPackage.COMPOSITE_AREA__LAYOUT:
			setLayout((LayoutManager) null);
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
		case RBAViewPackage.COMPOSITE_AREA__LAYOUT:
			return layout != null;
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
		case RBAViewPackage.COMPOSITE_AREA___COLLECT_LEAF_AREA:
			return collectLeafArea();
		case RBAViewPackage.COMPOSITE_AREA___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // CompositeAreaImpl
