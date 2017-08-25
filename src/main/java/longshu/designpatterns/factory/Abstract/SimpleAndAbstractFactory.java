package longshu.designpatterns.factory.Abstract;

public class SimpleAndAbstractFactory extends AbstractFactory {

	@Override
	public AbstractMailSender getMailSender(String type) {
		if (null == type)
			return null;
		AbstractMailSender mailSender = null;
		if ("normal".equalsIgnoreCase(type)) {
			mailSender = new MailNormalSender();
		}
		if ("delay".equalsIgnoreCase(type)) {
			mailSender = new MailDelaySender();
		}
		return mailSender;
	}

	@Override
	public AbstractSmsSender getSmsSender(String type) {
		if (null == type)
			return null;
		AbstractSmsSender smsSender = null;
		if ("normal".equalsIgnoreCase(type)) {
			smsSender = new SmsNormalSender();
		}
		if ("delay".equalsIgnoreCase(type)) {
			smsSender = new SmsDelaySender();
		}
		return smsSender;
	}

}
