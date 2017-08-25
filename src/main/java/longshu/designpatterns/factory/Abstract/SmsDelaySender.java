package longshu.designpatterns.factory.Abstract;

public class SmsDelaySender extends AbstractSmsSender implements DelaySender {
	@Override
	public void send(String msg) {
		delay(500);
		System.out.println("SmsDelaySender  send : " + msg);
	}

	@Override
	public void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}
}