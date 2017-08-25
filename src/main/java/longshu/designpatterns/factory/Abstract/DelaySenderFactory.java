package longshu.designpatterns.factory.Abstract;

public class DelaySenderFactory extends AbstractFactory{
	@Override
	public AbstractMailSender getMailSender(String type) {
		return new MailDelaySender();
	}

	@Override
	public AbstractSmsSender getSmsSender(String type) {
		return new SmsDelaySender();
	}
}
