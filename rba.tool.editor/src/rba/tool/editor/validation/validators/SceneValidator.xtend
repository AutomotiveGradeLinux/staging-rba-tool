package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.core.Scene
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class SceneValidator extends AbstractRBAModelValidator {

	private String SCENE_GLOBAL = Messages.SCENE_GLOBAL;
	private String SCENE_PROPERTY_NEGATIVE = Messages.SCENE_PROPERTY_NEGATIVE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkSceneProperty(Scene scene) {

		if (scene.properties.size > 0 && scene.global == false) {
			error(SCENE_GLOBAL, RBACorePackage.Literals.SCENE__PROPERTIES);
			return;
		}
		val properties = scene.properties
		for (var int i = 0; i < properties.size; i++) {
			var property = properties.get(i)
			if (property instanceof rba.core.impl.IntegerPropertyImpl) {
				var value = property.getValue()
				if (value instanceof rba.core.impl.IntegerValueImpl) {
					if (value.getValue() < 0) {
						error(SCENE_PROPERTY_NEGATIVE, RBACorePackage.Literals.SCENE__PROPERTIES, i);
						return;
					}
				}
			}
		}
	}
}
