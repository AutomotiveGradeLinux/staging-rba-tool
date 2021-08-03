package rba.tool.core.sort;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

abstract public class EObjectDecorator implements EObject {
    private EObject object;

    protected EObjectDecorator(EObject o) {
        object = o;
    }

    @Override
    public EList<Adapter> eAdapters() {
        return object.eAdapters();
    }

    @Override
    public boolean eDeliver() {
        return object.eDeliver();
    }

    @Override
    public void eSetDeliver(boolean deliver) {
        object.eSetDeliver(deliver);
    }

    @Override
    public void eNotify(Notification notification) {
        object.eNotify(notification);
    }

    @Override
    public EClass eClass() {
        return object.eClass();
    }

    @Override
    public Resource eResource() {
        return object.eResource();
    }

    @Override
    public EObject eContainer() {
        return object.eContainer();
    }

    @Override
    public EStructuralFeature eContainingFeature() {
        return object.eContainingFeature();
    }

    @Override
    public EReference eContainmentFeature() {
        return object.eContainmentFeature();
    }

    @Override
    public EList<EObject> eContents() {
        return object.eContents();
    }

    @Override
    public TreeIterator<EObject> eAllContents() {
        return object.eAllContents();
    }

    @Override
    public boolean eIsProxy() {
        return object.eIsProxy();
    }

    @Override
    public EList<EObject> eCrossReferences() {
        return object.eCrossReferences();
    }

    @Override
    public Object eGet(EStructuralFeature feature) {
        return object.eGet(feature);
    }

    @Override
    public Object eGet(EStructuralFeature feature, boolean resolve) {
        return object.eGet(feature, resolve);
    }

    @Override
    public void eSet(EStructuralFeature feature, Object newValue) {
        object.eSet(feature, newValue);
    }

    @Override
    public boolean eIsSet(EStructuralFeature feature) {
        return object.eIsSet(feature);
    }

    @Override
    public void eUnset(EStructuralFeature feature) {
        object.eUnset(feature);
    }

    @Override
    public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
        return object.eInvoke(operation, arguments);
    }

}
