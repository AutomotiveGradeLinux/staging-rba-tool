/**
 */
package rba.view.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rba.core.impl.PackagableElementImpl;
import rba.view.CompositeArea;
import rba.view.Display;
import rba.view.RBAViewPackage;
import rba.view.SizeIdentifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Display</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.DisplayImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link rba.view.impl.DisplayImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends PackagableElementImpl implements Display {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected CompositeArea root;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected SizeIdentifier size;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.DISPLAY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeArea getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(CompositeArea newRoot, NotificationChain msgs) {
		CompositeArea oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RBAViewPackage.DISPLAY__ROOT,
					oldRoot, newRoot);
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
	public void setRoot(CompositeArea newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject) root).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.DISPLAY__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject) newRoot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.DISPLAY__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.DISPLAY__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SizeIdentifier getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(SizeIdentifier newSize, NotificationChain msgs) {
		SizeIdentifier oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RBAViewPackage.DISPLAY__SIZE,
					oldSize, newSize);
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
	public void setSize(SizeIdentifier newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject) size).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.DISPLAY__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject) newSize).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBAViewPackage.DISPLAY__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.DISPLAY__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBAViewPackage.DISPLAY__ROOT:
			return basicSetRoot(null, msgs);
		case RBAViewPackage.DISPLAY__SIZE:
			return basicSetSize(null, msgs);
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
		case RBAViewPackage.DISPLAY__ROOT:
			return getRoot();
		case RBAViewPackage.DISPLAY__SIZE:
			return getSize();
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
		case RBAViewPackage.DISPLAY__ROOT:
			setRoot((CompositeArea) newValue);
			return;
		case RBAViewPackage.DISPLAY__SIZE:
			setSize((SizeIdentifier) newValue);
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
		case RBAViewPackage.DISPLAY__ROOT:
			setRoot((CompositeArea) null);
			return;
		case RBAViewPackage.DISPLAY__SIZE:
			setSize((SizeIdentifier) null);
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
		case RBAViewPackage.DISPLAY__ROOT:
			return root != null;
		case RBAViewPackage.DISPLAY__SIZE:
			return size != null;
		}
		return super.eIsSet(featureID);
	}

} // DisplayImpl
