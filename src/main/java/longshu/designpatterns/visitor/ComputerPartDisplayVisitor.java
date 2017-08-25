package longshu.designpatterns.visitor;

// ConcreteVisitor
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying " + computer.getPart());
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying " + mouse.getPart());
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying " + keyboard.getPart());
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying " + monitor.getPart());
	}
}