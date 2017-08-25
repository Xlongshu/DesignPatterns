package longshu.designpatterns.facade;

public class Lenovo extends AbstractComputer {

	public Lenovo() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	@Override
	public void startup() {
		cpu.on();
		memory.on();
		disk.on();
		System.out.println("Lenovo startup");
	}
	@Override
	public void shutdown() {
		cpu.off();
		memory.off();
		disk.off();
		System.out.println("Lenovo shutdown");
	}
}