package longshu.designpatterns.visitor;

// ConcreteElement
public class Keyboard extends ComputerPart {
	
	public Keyboard(String part) {
		super(part);
	}

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}
}