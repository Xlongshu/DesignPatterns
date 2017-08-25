package longshu.designpatterns.strategy;

// ConcreteStrategy
public class OperationAdd implements Operation {
	@Override
	public int doOperation(int x, int y) {
		return x + y;
	}
}