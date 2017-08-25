package longshu.designpatterns.factory.simple;

import longshu.designpatterns.MailSender;
import longshu.designpatterns.Sender;
import longshu.designpatterns.SmsSender;

/**
 * 简单工厂模式(静态工厂)
 * 含有一定的商业逻辑和判断逻辑，根据逻辑不同，产生具体的工厂产品,对于客户端去除了对具体产品的依赖
 * 对产品来说它是符合开闭原则的——对扩展开放,对修改关闭;
 * 但是每增加一个产品,都要在工厂类中增加相应的商业逻辑和判 断逻辑,这显自然是违背开闭原则
 */
public class SendSimpleFactory {

	public static Sender getSender(String type) {
		if (null == type)
			return null;
		if ("mail".equalsIgnoreCase(type)) {
			return new MailSender();
		}
		if ("sms".equalsIgnoreCase(type)) {
			return new SmsSender();
		}
		return null;
	}

}
