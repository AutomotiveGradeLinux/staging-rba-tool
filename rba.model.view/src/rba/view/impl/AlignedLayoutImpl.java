/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import rba.view.AlignedLayout;
import rba.view.Area;
import rba.view.BasePoint;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Aligned Layout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.AlignedLayoutImpl#getSubarea <em>Subarea</em>}</li>
 *   <li>{@link rba.view.impl.AlignedLayoutImpl#getBasePoint <em>Base Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlignedLayoutImpl extends LayoutManagerImpl implements AlignedLayout {
	/**
	 * The cached value of the '{@link #getSubarea() <em>Subarea</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSubarea()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> subarea;

	/**
	 * The default value of the '{@link #getBasePoint() <em>Base Point</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBasePoint()
	 * @generated
	 * @ordered
	 */
	protected static final BasePoint BASE_POINT_EDEFAULT = BasePoint.LEFT_TOP;

	/**
	 * The cached value of the '{@link #getBasePoint() <em>Base Point</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBasePoint()
	 * @generated
	 * @ordered
	 */
	protected BasePoint basePoint = BASE_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignedLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.ALIGNED_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getSubarea() {
		if (subarea == null) {
			subarea = new EObjectResolvingEList<Area>(Area.class, this, RBAViewPackage.ALIGNED_LAYOUT__SUBAREA);
		}
		return subarea;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BasePoint getBasePoint() {
		return basePoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePoint(BasePoint newBasePoint) {
		BasePoint oldBasePoint = basePoint;
		basePoint = newBasePoint == null ? BASE_POINT_EDEFAULT : newBasePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.ALIGNED_LAYOUT__BASE_POINT,
					oldBasePoint, basePoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Area> collectLeafArea() {
		java.util.Set<Area> areas = new java.util.HashSet<Area>();
		for (Area area : getSubarea()) {
			areas.addAll(area.collectLeafAllocatable().stream().map(allocatable -> (Area) allocatable)
					.collect(java.util.stream.Collectors.toList()));
		}
		return new org.eclipse.emf.common.util.BasicEList<Area>(areas);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBAViewPackage.ALIGNED_LAYOUT__SUBAREA:
			return getSubarea();
		case RBAViewPackage.ALIGNED_LAYOUT__BASE_POINT:
			return getBasePoint();
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
		case RBAViewPackage.ALIGNED_LAYOUT__SUBAREA:
			getSubarea().clear();
			getSubarea().addAll((Collection<? extends Area>) newValue);
			return;
		case RBAViewPackage.ALIGNED_LAYOUT__BASE_POINT:
			setBasePoint((BasePoint) newValue);
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
		case RBAViewPackage.ALIGNED_LAYOUT__SUBAREA:
			getSubarea().clear();
			return;
		case RBAViewPackage.ALIGNED_LAYOUT__BASE_POINT:
			setBasePoint(BASE_POINT_EDEFAULT);
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
		case RBAViewPackage.ALIGNED_LAYOUT__SUBAREA:
			return subarea != null && !subarea.isEmpty();
		case RBAViewPackage.ALIGNED_LAYOUT__BASE_POINT:
			return basePoint != BASE_POINT_EDEFAULT;
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
		case RBAViewPackage.ALIGNED_LAYOUT___COLLECT_LEAF_AREA:
			return collectLeafArea();
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
		result.append(" (basePoint: ");
		result.append(basePoint);
		result.append(')');
		return result.toString();
	}

} // AlignedLayoutImpl
