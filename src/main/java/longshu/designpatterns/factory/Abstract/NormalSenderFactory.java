package longshu.designpatterns.factory.Abstract;

// 一个产品族具体实现
public class NormalSenderFactory extends AbstractFactory{
	@Override
	public AbstractMailSender getMailSender(String type) {
		return new MailNormalSender();
	}

	@Override
	public AbstractSmsSender getSmsSender(String type) {
		return new SmsNormalSender();
	}
}
