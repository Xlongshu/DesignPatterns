package longshu.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

// AbstractExpression
public abstract class AbstractExpression implements Expression {
	protected static List<String> table;

	public AbstractExpression() {
		if (null == table) {
			initTable();
		}
	}

	public void initTable() {
		table = new ArrayList<String>();
		table.add("一");
		table.add("二");
		table.add("三");
		table.add("四");
		table.add("五");
		table.add("六");
		table.add("七");
		table.add("八");
		table.add("九");
	}

	public void interpret(Context context) {
		String statement = context.getStatement();
		System.out.println(statement);
		if (null == statement || statement.isEmpty())
			return;

		for (int i = 0; i < table.size(); i++) {
			String tail = table.get(i) + this.getPostfix();
			// 从低位往高位分析,即从右往左
			if (statement.endsWith(tail)) {
				int newData = context.getData() + (i + 1) * this.multiplier();
				context.setData(newData);
				context.setStatement(statement.substring(0, statement.length() - tail.length()));
			}

			if (statement.endsWith("零")) {
				context.setStatement(statement.substring(0, statement.length() - "零".length()));
			}
		}
	}

	// 表达式的后缀是以什么表示的 十,百,千...
	public abstract String getPostfix();

	// 表达式的数量级
	public abstract int multiplier();
}