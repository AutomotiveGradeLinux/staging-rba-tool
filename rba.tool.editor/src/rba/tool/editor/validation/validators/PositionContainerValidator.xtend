package rba.tool.editor.validation.validators

import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.Area
import rba.view.Display
import rba.view.PositionContainer
import rba.view.RBAViewPackage
import rba.view.Size
import rba.view.SizeIdentifier
import rba.view.SizeReference
import rba.view.impl.DisplayImpl

class PositionContainerValidator extends AbstractRBAModelValidator {

	private String POSITION_CONTAINER_COORDINATE_CHECK = Messages.POSITION_CONTAINER_COORDINATE_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkPositionContainer(PositionContainer positionContainer) {
		var display = getDisplay(positionContainer)
		var displaySizeIden = display.size as SizeIdentifier
		var displaySize = getSize(displaySizeIden)
		var displayWidth = displaySize.width
		var displayHeight = displaySize.height

		var Set<Area> areaList = new HashSet
		if (positionContainer.area !== null) {
			areaList.add(positionContainer.area);
		}
		for (Area area : areaList) {
			for (sizeIdentifier : area.size) {
				var areaSize = getSize(sizeIdentifier)
				var areaWidth = areaSize.width
				var areaHeight = areaSize.height

				// warning displays total of position container start point and size exceeds display's size
				if (positionContainer.x + areaWidth > displayWidth || positionContainer.y + areaHeight > displayHeight) {
					warning(POSITION_CONTAINER_COORDINATE_CHECK, RBAViewPackage.Literals.POSITION_CONTAINER__X)
					return;
				}
			}

		}
	}

//get Display from position container
	def Display getDisplay(PositionContainer positionContainer) {
		var parent = positionContainer.eContainer
		while (parent !== null) {
			if (parent instanceof DisplayImpl) {
				return parent as Display;
			}
			parent = parent.eContainer
		}
	}

	// get Size from SizeIdentifier
	def Size getSize(SizeIdentifier size) {
		if (size instanceof Size) {
			return size as Size
		} else if (size instanceof SizeReference) {
			var sizeRef = size as SizeReference
			return sizeRef.size as Size
		}
	}
}
