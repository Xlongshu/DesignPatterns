package longshu.designpatterns.interpreter;

// TerminalExpression 十位数解释器
public class ExpressionShi extends AbstractExpression {

	@Override
	public String getPostfix() {
		return "十";
	}

	@Override
	public int multiplier() {
		return 10;
	}
}