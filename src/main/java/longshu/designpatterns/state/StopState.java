package longshu.designpatterns.state;

public class StopState implements State{
	@Override
	public void handle() {
		System.out.println("Player is in stop state");
	}
}