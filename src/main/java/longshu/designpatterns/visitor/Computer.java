package longshu.designpatterns.visitor;

// ObjectStructure
public class Computer extends ComputerPart {
	private ComputerPart[] parts;

	public Computer(String part) {
		super(part);
		this.parts = new ComputerPart[] { new Mouse("Mouse"), new Keyboard("Keyboard"), new Monitor("Monitor") };
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}