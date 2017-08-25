package longshu.designpatterns.factory.method;

import longshu.designpatterns.MailSender;
import longshu.designpatterns.Sender;

public class SmsSenderFactory implements SenderFactory{

	@Override
	public Sender getSender() {
		return new MailSender();
	}

}
