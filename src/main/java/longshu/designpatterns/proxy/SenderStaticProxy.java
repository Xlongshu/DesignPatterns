package longshu.designpatterns.proxy;

import longshu.designpatterns.Sender;

// 聚合的形式实现静态代理
public class SenderStaticProxy implements Sender {
	private Sender target;

	public SenderStaticProxy(Sender target) {
		this.target = target;
	}

	@Override
	public void send(String msg) {
		System.out.println("发送中...");
		target.send(msg);
		System.out.println("发送完成...");
	}
}