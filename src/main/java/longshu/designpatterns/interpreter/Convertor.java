package longshu.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

// 将中文数字串由低位向高位方向不断转化
public class Convertor {
	private static List<Expression> expressions = new ArrayList<Expression>();

	public Convertor() {
		if (expressions.isEmpty()) {
			expressions.add(new ExpressionGe());
			expressions.add(new ExpressionShi());
			expressions.add(new ExpressionBai());
			expressions.add(new ExpressionQian());
			expressions.add(new ExpressionWan());
		}
	}

	public int convert(String chineseNum) {
		Context context = new Context(chineseNum);
		for (Expression expression : expressions) {
			expression.interpret(context);
		}
		return context.getData();
	}
}