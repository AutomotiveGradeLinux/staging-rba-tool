/**
 */
package rba.view.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rba.view.Area;
import rba.view.BasePoint;
import rba.view.Offset;
import rba.view.PositionContainer;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Position Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.PositionContainerImpl#getX <em>X</em>}</li>
 *   <li>{@link rba.view.impl.PositionContainerImpl#getY <em>Y</em>}</li>
 *   <li>{@link rba.view.impl.PositionContainerImpl#getBasePoint <em>Base Point</em>}</li>
 *   <li>{@link rba.view.impl.PositionContainerImpl#getArea <em>Area</em>}</li>
 *   <li>{@link rba.view.impl.PositionContainerImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionContainerImpl extends MinimalEObjectImpl.Container implements PositionContainer {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

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
	 * The cached value of the '{@link #getArea() <em>Area</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected Area area;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected EList<Offset> offset;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.POSITION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.POSITION_CONTAINER__X, oldX, x,
					!oldXESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX() {
		int oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RBAViewPackage.POSITION_CONTAINER__X, oldX,
					X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.POSITION_CONTAINER__Y, oldY, y,
					!oldYESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY() {
		int oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RBAViewPackage.POSITION_CONTAINER__Y, oldY,
					Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.POSITION_CONTAINER__BASE_POINT,
					oldBasePoint, basePoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Area getArea() {
		if (area != null && area.eIsProxy()) {
			InternalEObject oldArea = (InternalEObject) area;
			area = (Area) eResolveProxy(oldArea);
			if (area != oldArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBAViewPackage.POSITION_CONTAINER__AREA,
							oldArea, area));
			}
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Area basicGetArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(Area newArea) {
		Area oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.POSITION_CONTAINER__AREA, oldArea,
					area));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offset> getOffset() {
		if (offset == null) {
			offset = new EObjectContainmentEList<Offset>(Offset.class, this, RBAViewPackage.POSITION_CONTAINER__OFFSET);
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBAViewPackage.POSITION_CONTAINER__OFFSET:
			return ((InternalEList<?>) getOffset()).basicRemove(otherEnd, msgs);
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
		case RBAViewPackage.POSITION_CONTAINER__X:
			return getX();
		case RBAViewPackage.POSITION_CONTAINER__Y:
			return getY();
		case RBAViewPackage.POSITION_CONTAINER__BASE_POINT:
			return getBasePoint();
		case RBAViewPackage.POSITION_CONTAINER__AREA:
			if (resolve)
				return getArea();
			return basicGetArea();
		case RBAViewPackage.POSITION_CONTAINER__OFFSET:
			return getOffset();
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
		case RBAViewPackage.POSITION_CONTAINER__X:
			setX((Integer) newValue);
			return;
		case RBAViewPackage.POSITION_CONTAINER__Y:
			setY((Integer) newValue);
			return;
		case RBAViewPackage.POSITION_CONTAINER__BASE_POINT:
			setBasePoint((BasePoint) newValue);
			return;
		case RBAViewPackage.POSITION_CONTAINER__AREA:
			setArea((Area) newValue);
			return;
		case RBAViewPackage.POSITION_CONTAINER__OFFSET:
			getOffset().clear();
			getOffset().addAll((Collection<? extends Offset>) newValue);
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
		case RBAViewPackage.POSITION_CONTAINER__X:
			unsetX();
			return;
		case RBAViewPackage.POSITION_CONTAINER__Y:
			unsetY();
			return;
		case RBAViewPackage.POSITION_CONTAINER__BASE_POINT:
			setBasePoint(BASE_POINT_EDEFAULT);
			return;
		case RBAViewPackage.POSITION_CONTAINER__AREA:
			setArea((Area) null);
			return;
		case RBAViewPackage.POSITION_CONTAINER__OFFSET:
			getOffset().clear();
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
		case RBAViewPackage.POSITION_CONTAINER__X:
			return isSetX();
		case RBAViewPackage.POSITION_CONTAINER__Y:
			return isSetY();
		case RBAViewPackage.POSITION_CONTAINER__BASE_POINT:
			return basePoint != BASE_POINT_EDEFAULT;
		case RBAViewPackage.POSITION_CONTAINER__AREA:
			return area != null;
		case RBAViewPackage.POSITION_CONTAINER__OFFSET:
			return offset != null && !offset.isEmpty();
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
		result.append(" (x: ");
		if (xESet)
			result.append(x);
		else
			result.append("<unset>");
		result.append(", y: ");
		if (yESet)
			result.append(y);
		else
			result.append("<unset>");
		result.append(", basePoint: ");
		result.append(basePoint);
		result.append(')');
		return result.toString();
	}

} // PositionContainerImpl
