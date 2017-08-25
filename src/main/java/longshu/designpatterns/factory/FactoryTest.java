package longshu.designpatterns.factory;

import longshu.designpatterns.Sender;
import longshu.designpatterns.factory.Abstract.AbstractFactory;
import longshu.designpatterns.factory.Abstract.AbstractMailSender;
import longshu.designpatterns.factory.Abstract.AbstractSmsSender;
import longshu.designpatterns.factory.Abstract.DelaySenderFactory;
import longshu.designpatterns.factory.Abstract.NormalSenderFactory;
import longshu.designpatterns.factory.Abstract.SimpleAndAbstractFactory;
import longshu.designpatterns.factory.method.MailSenderFactory;
import longshu.designpatterns.factory.method.SenderFactory;
import longshu.designpatterns.factory.method.SmsSenderFactory;
import longshu.designpatterns.factory.simple.SendSimpleFactory;

//测试
public class FactoryTest {

	public static void main(String[] args) {
		SimpleFactory();
		FactoryMethod();
		AbstractFactory();
		SimpleAndAbstractFactory();
	}

	// 简单工厂模式测试
	public static void SimpleFactory() {
		Sender sender = SendSimpleFactory.getSender("sms");
		sender.send("SimpleFactory");

		SendSimpleFactory.getSender("mail").send("SimpleFactory");
	}

	// 工厂方法模式测试
	public static void FactoryMethod() {
		SenderFactory senderFactory = new MailSenderFactory();
		Sender sender = senderFactory.getSender();
		sender.send("MailSenderFactory");

		new SmsSenderFactory().getSender().send("SmsSenderFactory");
	}

	// 抽象工厂模式测试
	public static void AbstractFactory() {
		// normal产品族
		AbstractFactory normalSenderFactory = new NormalSenderFactory();
		AbstractMailSender normalMailSender = normalSenderFactory.getMailSender(null);
		normalMailSender.send("NormalSenderFactory");
		AbstractSmsSender normalSmsSender = normalSenderFactory.getSmsSender(null);
		normalSmsSender.send("NormalSenderFactory");
		// delay产品族
		AbstractFactory delaySenderFactory = new DelaySenderFactory();
		delaySenderFactory.getMailSender(null).send("DelaySenderFactory");
		delaySenderFactory.getSmsSender(null).send("DelaySenderFactory");
	}
	
	// 简单工厂配合抽象工厂测试
	public static void SimpleAndAbstractFactory() {
		SimpleAndAbstractFactory simpleAndAbstractFactory = new SimpleAndAbstractFactory();
		// normal产品族
		AbstractMailSender normalMailSender = simpleAndAbstractFactory.getMailSender("normal");
		normalMailSender.send("SimpleAndAbstractFactory");
		AbstractSmsSender normalSmsSender = simpleAndAbstractFactory.getSmsSender("normal");
		normalSmsSender.send("NormalSenderFactory");
		// delay产品族
		simpleAndAbstractFactory.getMailSender("delay").send("SimpleAndAbstractFactory");
		simpleAndAbstractFactory.getSmsSender("delay").send("SimpleAndAbstractFactory");
	}

}
