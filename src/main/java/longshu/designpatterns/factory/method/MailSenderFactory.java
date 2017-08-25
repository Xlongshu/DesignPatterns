package longshu.designpatterns.factory.method;

import longshu.designpatterns.Sender;
import longshu.designpatterns.SmsSender;


//具体工厂(每个具体工厂负责一个具体产品)
public class MailSenderFactory implements SenderFactory {

	@Override
	public Sender getSender() {
		return new SmsSender();
	}

}
