package longshu.designpatterns.command;

// Invoker
public class Switch {
	private Command onCommand;
	private Command offCommand;

	public Switch() {
	}

	public Switch(Command onCommand, Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}

	public void on() {
		onCommand.execute();
	}

	public void off() {
		offCommand.execute();
	}

	public void setOnCommand(Command onCommand) {
		this.onCommand = onCommand;
	}

	public void setOffCommand(Command offCommand) {
		this.offCommand = offCommand;
	}
}