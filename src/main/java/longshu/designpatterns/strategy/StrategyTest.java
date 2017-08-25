package longshu.designpatterns.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(new OperationAdd());
		System.out.println(calculator.executeOperation(1000, 24));
		
		calculator.setOperation(new OperationMultiply());
		System.out.println(calculator.executeOperation(1000, 24));
	}

}