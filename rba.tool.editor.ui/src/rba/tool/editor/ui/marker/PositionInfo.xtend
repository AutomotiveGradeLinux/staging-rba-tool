package rba.tool.editor.ui.marker

class PositionInfo {
	private int beforeStartLine
	private int beforeOffset
	private int beforeCharCount
	private int beforeEndLine
	private int afterStartLine
	private int afterOffset
	private int afterCharCount
	private int afterExpendedLine

	def void setBeforeStartLine(int start) {
		this.beforeStartLine = start
	}

	def void setBeforeOffset(int offset) {
		this.beforeOffset = offset
	}

	def void setBeforeCharCount(int charCount) {
		this.beforeCharCount = charCount
	}

	def void setBeforeEndLine(int end) {
		this.beforeEndLine = end
	}

	def void setAfterStartLine(int start) {
		this.afterStartLine = start
	}

	def void setAfterOffset(int offset) {
		this.afterOffset = offset
	}

	def void setAfterCharCount(int charCount) {
		this.afterCharCount = charCount
	}

	def void setAfterExpendedLine(int expendLine) {
		this.afterExpendedLine = expendLine
	}

	def int getBeforeStartLine() {
		return this.beforeStartLine
	}

	def int getBeforeOffset() {
		return this.beforeOffset
	}

	def int getBeforeCharCount() {
		return this.beforeCharCount
	}

	def int getBeforeEndLine() {
		return this.beforeEndLine
	}

	def int getAfterStartLine() {
		return this.afterStartLine
	}

	def int getAfterOffset() {
		return this.afterOffset
	}

	def int getAfterCharCount() {
		return this.afterCharCount
	}

	def int getAfterExpendedLine() {
		return this.afterExpendedLine
	}
}
