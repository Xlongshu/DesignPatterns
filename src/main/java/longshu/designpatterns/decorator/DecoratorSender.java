package longshu.designpatterns.decorator;

import longshu.designpatterns.Sender;

// Decorator接口或者抽象类
public abstract class DecoratorSender implements Sender {
	protected Sender sender;

	public DecoratorSender(Sender sender) {
		this.sender = sender;
	}

	@Override
	public void send(String msg) {
		sender.send(msg);
	}
	
}