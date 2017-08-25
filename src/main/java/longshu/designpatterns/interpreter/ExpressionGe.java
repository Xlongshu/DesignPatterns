package longshu.designpatterns.interpreter;

// TerminalExpression 个位数解释器
public class ExpressionGe extends AbstractExpression {

	@Override
	public String getPostfix() {
		return "";
	}

	@Override
	public int multiplier() {
		return 1;
	}
}