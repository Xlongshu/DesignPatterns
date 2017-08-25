package longshu.designpatterns.facade;

// Facade
public class Computer {
	private CPU cpu = new CPU();
	private Memory memory = new Memory();
	private Disk disk = new Disk();

	public void startup() {
		cpu.on();
		memory.on();
		disk.on();
		System.out.println("Computer startup ...");
	}

	public void shutdown() {
		cpu.off();
		memory.off();
		disk.off();
		System.out.println("Computer shutdown ...");
	}
}