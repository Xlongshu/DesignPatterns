package longshu.designpatterns.interpreter;

// TerminalExpression 百位数解释器
public class ExpressionBai extends AbstractExpression {

	@Override
	public String getPostfix() {
		return "百";
	}

	@Override
	public int multiplier() {
		return 100;
	}
}