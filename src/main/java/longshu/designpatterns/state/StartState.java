package longshu.designpatterns.state;

public class StartState implements State{
	@Override
	public void handle() {
		System.out.println("Player is in start state");
	}
}