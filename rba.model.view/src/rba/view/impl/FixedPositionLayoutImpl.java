/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rba.view.Area;
import rba.view.FixedPositionLayout;
import rba.view.PositionContainer;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fixed Position Layout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.FixedPositionLayoutImpl#getSubAreaPosition <em>Sub Area Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedPositionLayoutImpl extends LayoutManagerImpl implements FixedPositionLayout {
	/**
	 * The cached value of the '{@link #getSubAreaPosition() <em>Sub Area Position</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubAreaPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionContainer> subAreaPosition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPositionLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.FIXED_POSITION_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionContainer> getSubAreaPosition() {
		if (subAreaPosition == null) {
			subAreaPosition = new EObjectContainmentEList<PositionContainer>(PositionContainer.class, this,
					RBAViewPackage.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION);
		}
		return subAreaPosition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> collectLeafArea() {
		java.util.Set<Area> areas = new java.util.HashSet<Area>();
		for (PositionContainer pc : getSubAreaPosition()) {
			areas.addAll(pc.getArea().collectLeafAllocatable().stream().map(allocatable -> (Area) allocatable)
					.collect(java.util.stream.Collectors.toList()));
		}
		return new org.eclipse.emf.common.util.BasicEList<Area>(areas);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBAViewPackage.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION:
			return ((InternalEList<?>) getSubAreaPosition()).basicRemove(otherEnd, msgs);
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
		case RBAViewPackage.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION:
			return getSubAreaPosition();
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
		case RBAViewPackage.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION:
			getSubAreaPosition().clear();
			getSubAreaPosition().addAll((Collection<? extends PositionContainer>) newValue);
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
		case RBAViewPackage.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION:
			getSubAreaPosition().clear();
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
		case RBAViewPackage.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION:
			return subAreaPosition != null && !subAreaPosition.isEmpty();
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
		case RBAViewPackage.FIXED_POSITION_LAYOUT___COLLECT_LEAF_AREA:
			return collectLeafArea();
		}
		return super.eInvoke(operationID, arguments);
	}

} // FixedPositionLayoutImpl
