package longshu.designpatterns.proxy;

import longshu.designpatterns.MailSender;
import longshu.designpatterns.Sender;

//测试
public class ProxyTest {

	public static void main(String[] args) {
		Sender target = new MailSender();

		staticProxy(target);
		dynamicProxy(target);
		cglibProxy(target);
	}

	// 静态代理测试
	static void staticProxy(Sender target) {
		Sender staticProxy = new SenderStaticProxy(target);

		staticProxy.send("SenderStaticProxy...");
	}

	// JDK动态代理
	static void dynamicProxy(Sender target) {
		Sender dynamicProxy = new SenderDynamicProxy(target).getProxy();
		System.out.println("dynamicProxy:" + dynamicProxy.getClass());
		dynamicProxy.send("SenderDynamicProxy...");
	}

	static void cglibProxy(Sender target) {
		Sender cglibProxy = SenderCglibProxy.getProxy(target);
		System.out.println("cglibProxy:" + cglibProxy.getClass());
		cglibProxy.send("SenderCglibProxy...");
	}
}