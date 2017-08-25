package longshu.designpatterns.interpreter;

// TerminalExpression 千位数解释器
public class ExpressionQian extends AbstractExpression {

	@Override
	public String getPostfix() {
		return "千";
	}

	@Override
	public int multiplier() {
		return 1000;
	}
}