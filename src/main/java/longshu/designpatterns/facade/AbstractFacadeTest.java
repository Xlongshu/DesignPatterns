package longshu.designpatterns.facade;

public class AbstractFacadeTest {

	public static void main(String[] args) {
		AbstractComputer lenovo = new Lenovo();
		lenovo.startup();
		System.out.println("run ...");
		lenovo.shutdown();
		System.out.println("...");
		AbstractComputer asus = new ASUS();
		asus.startup();
		System.out.println("run ...");
		asus.shutdown();
	}

}