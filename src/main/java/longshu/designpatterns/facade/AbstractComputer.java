package longshu.designpatterns.facade;

// Abstract Facade
public abstract class AbstractComputer {
	protected CPU cpu;
	protected Memory memory;
	protected Disk disk;

	public abstract void startup();

	public abstract void shutdown();
}