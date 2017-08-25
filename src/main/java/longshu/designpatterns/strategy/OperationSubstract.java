package longshu.designpatterns.strategy;

public class OperationSubstract implements Operation {
	@Override
	public int doOperation(int x, int y) {
		return x - y;
	}
}