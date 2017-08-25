package longshu.designpatterns.visitor;

public class Mouse extends ComputerPart {
	
	public Mouse(String part) {
		super(part);
	}

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}
}