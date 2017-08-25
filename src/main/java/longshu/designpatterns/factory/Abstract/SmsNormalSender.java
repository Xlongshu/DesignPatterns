package longshu.designpatterns.factory.Abstract;

public class SmsNormalSender extends AbstractSmsSender {
	@Override
	public void send(String msg) {
		System.out.println("SmsNormalSender  send : " + msg);
	}
}