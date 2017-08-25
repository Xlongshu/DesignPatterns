package longshu.designpatterns.visitor;

// Element
public abstract class ComputerPart {
	protected String part;

	public ComputerPart(String part) {
		this.part = part;
	}

	public abstract void accept(ComputerPartVisitor visitor);

	public String getPart() {
		return part;
	}
}