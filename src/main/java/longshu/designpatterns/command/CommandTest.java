package longshu.designpatterns.command;

public class CommandTest {

	public static void main(String[] args) {
		Light light = new Light();

		Command onCommand = new LightOnCommand(light);
		Command offCommand = new LightOffCommand(light);
		
		Switch lightSwitch = new Switch(onCommand, offCommand);

		lightSwitch.on();

		lightSwitch.off();
	}
}