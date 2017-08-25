package longshu.designpatterns.interpreter;

public class Context {
	private int data;
	private String statement;

	public Context(String statement) {
		this.statement = statement;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}
}