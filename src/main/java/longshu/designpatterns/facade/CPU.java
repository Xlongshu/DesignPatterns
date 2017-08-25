package longshu.designpatterns.facade;

// SubSystem
public class CPU {
	public void on() {
		System.out.println("CPU on ...");
	}

	public void off() {
		System.out.println("CPU off ...");
	}
}