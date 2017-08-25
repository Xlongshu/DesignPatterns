package longshu.designpatterns.visitor;

public class Monitor extends ComputerPart {
	
	public Monitor(String part) {
		super(part);
	}

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}
}