package longshu.designpatterns.command;

// Receiver
public class Light {
	public void on() {
		System.out.println("The light is on");
	}

	public void off() {
		System.out.println("The light is off");
	}
}