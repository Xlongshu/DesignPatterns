package longshu.designpatterns.facade;

public class FacadeTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		System.out.println("run ...");
		computer.shutdown();
	}

}