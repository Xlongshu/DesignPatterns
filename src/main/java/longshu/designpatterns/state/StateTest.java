package longshu.designpatterns.state;

// 测试
public class StateTest {

	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		context.setState(startState);
		
		context.request();
		
		context.setState(new StopState());
		context.request();
	}
}