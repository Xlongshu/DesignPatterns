package longshu.designpatterns.factory.Abstract;

public class MailNormalSender extends AbstractMailSender {
	@Override
	public void send(String msg) {
		System.out.println("MailNormalSender  send : " + msg);
	}
}