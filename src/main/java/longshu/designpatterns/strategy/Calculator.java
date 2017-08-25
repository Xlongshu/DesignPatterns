package longshu.designpatterns.strategy;

// Context
public class Calculator {
	private Operation operation;

	public Calculator(Operation operation) {
		this.operation = operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public int executeOperation(int x, int y) {
		return operation.doOperation(x, y);
	}
}