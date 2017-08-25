package longshu.designpatterns.strategy;

public class OperationMultiply implements Operation {
	@Override
	public int doOperation(int x, int y) {
		return x * y;
	}
}