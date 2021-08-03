/**
 */
package rba.core.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rba.core.ExpressionType;
import rba.core.LambdaExpression;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;

/**
 * This is the item provider adapter for a {@link rba.core.LambdaExpression} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * @generated
 */
public class LambdaExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RBACorePackage.Literals.LAMBDA_EXPRESSION__X);
			childrenFeatures.add(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LambdaExpression.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LambdaExpression"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ExpressionType labelValue = ((LambdaExpression) object).getType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_LambdaExpression_type")
				: getString("_UI_LambdaExpression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LambdaExpression.class)) {
		case RBACorePackage.LAMBDA_EXPRESSION__X:
		case RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__X,
				RBACoreFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsTypeOf()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createObjectReference()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createPreviousModifier()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createMuchGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createLowerThanOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createEqualToOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createComparisonAnd()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createAndOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createOrOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createNotOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsEqualToOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsLowerThanOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsGreaterThanEqualOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsLowerThanEqualOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createPlusOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createImpliesOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsActive()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createGetAllocatables()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createHasBeenDisplayed()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createActiveState()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createObjectCompare()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createThatOfOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createMaxValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createMinValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createNoneValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createStandardValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIntegerValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createLoserTypeExpression()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createArbitrationPolicyExpression()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createSizeOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createExistsOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createForAllOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createMaxOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createMinOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createSelectOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createSetOfOperator()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsOn()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createAllocatedContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createContentValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createGetContentsList()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createActiveContents()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createGetProperty()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createStateValue()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createHasComeLaterThan()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createHasComeEarlierThan()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createObjectCompareNot()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsAllocatedTo()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsChanged()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createIsTranslatedTo()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT,
				RBACoreFactory.eINSTANCE.createNullExpression()));
	}

}
