package longshu.designpatterns.decorator;

import longshu.designpatterns.MailSender;
import longshu.designpatterns.Sender;
import longshu.designpatterns.SmsSender;

// 测试
public class DecoratorTest {

	public static void main(String[] args) {
		Sender sender = new MailSender();
		DecoratorSender decoratorSender = new DecoratorEncodeSender(sender);
		decoratorSender.send("邮箱信息...");

		new DecoratorEncodeSender(new SmsSender()).send("短信信息..");
		sender = new DecoratorEncodeSender(new SmsSender());
	}

}