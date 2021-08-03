package rba.tool.editor.validation.validators

import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.AlignedLayout
import rba.view.Area
import rba.view.CompositeArea
import rba.view.Display
import rba.view.FixedPositionLayout
import rba.view.PositionContainer
import rba.view.RBAViewPackage
import rba.view.Size
import rba.view.SizeIdentifier
import rba.view.SizeReference

class DisplayValidator extends AbstractRBAModelValidator {

	private String DISPLAY_AREA_SIZE_CHECK = Messages.DISPLAY_AREA_SIZE_CHECK

	private String DISPLAY_ROOT_CHECK = Messages.DISPLAY_ROOT_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkDisplay(Display display) {
		if (display.root === null) {
			error(String.format(DISPLAY_ROOT_CHECK, display.name), RBAViewPackage.Literals.DISPLAY__ROOT);
			return;
		}
		var size = display.size as SizeIdentifier
		var displaySize = getSize(size);
		var displayWidth = displaySize.width
		var displayHeight = displaySize.height

		if (display.root !== null && display.root.eContainer !== null) {
			var Set<Area> areaList = new HashSet
			getAreas(display.root, areaList)
			for (a : areaList) {
				var area = a as Area
				for (sizeIdentifier : area.size) {
					var areaSize = getSize(sizeIdentifier)
					var areaWidth = areaSize.width
					var areaHeight = areaSize.height

					if (areaWidth > displayWidth || areaHeight > displayHeight) {
						warning(String.format(DISPLAY_AREA_SIZE_CHECK, display.name), RBAViewPackage.Literals.DISPLAY__ROOT)
						return;
					}
				}
			}
		}
	}

	// get all areas from display
	def void getAreas(CompositeArea compositeArea, Set<Area> areaList) {
		if (compositeArea !== null) {
			var layout = compositeArea.layout
			if (layout instanceof AlignedLayout) {
				var aliginedLayout = layout as AlignedLayout
				for (subArea : aliginedLayout.subarea) {
					areaList.addAll(subArea);
				}
			} else if (layout instanceof FixedPositionLayout) {
				var fixedPositionLayout = layout as FixedPositionLayout
				var positions = fixedPositionLayout.subAreaPosition
				for (position : positions) {
					if (position instanceof PositionContainer) {
						var pos = position as PositionContainer
						areaList.add(pos.area);
					}
				}
			}
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
