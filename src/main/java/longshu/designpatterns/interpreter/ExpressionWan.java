package longshu.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

// NonterminalExpression 万位数解释器
public class ExpressionWan extends AbstractExpression {
	private static List<Expression> expressions = new ArrayList<Expression>();

	public ExpressionWan() {
		if (expressions.isEmpty()) {
			expressions.add(new ExpressionGe());
			expressions.add(new ExpressionShi());
			expressions.add(new ExpressionBai());
			expressions.add(new ExpressionQian());
		}
	}

	@Override
	public void interpret(Context context) {
		String statement = context.getStatement();
		if (null == statement || statement.isEmpty())
			return;

		if (statement.endsWith(this.getPostfix())) {
			context.setStatement(statement.substring(0, statement.length() - getPostfix().length()));
			int data = context.getData();
			context.setData(0);// 置零
			for (Expression expression : expressions) {
				expression.interpret(context);
			}
			context.setData(data + this.multiplier() * context.getData());
		}
	}

	@Override
	public String getPostfix() {
		return "万";
	}

	@Override
	public int multiplier() {
		return 10000;
	}
}