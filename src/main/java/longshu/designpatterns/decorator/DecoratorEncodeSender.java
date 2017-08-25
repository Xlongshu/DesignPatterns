package longshu.designpatterns.decorator;

import longshu.designpatterns.Sender;

// 具体实现Decorator接口或者继承抽象类的类
public class DecoratorEncodeSender extends DecoratorSender {

	public DecoratorEncodeSender(Sender sender) {
		super(sender);
	}

	@Override
	public void send(String msg) {
		super.send(encode(msg));
	}
	// 为sender对象发送的msg特殊编码
	private String encode(String msg) {
		System.out.println("编码处理...");
		return "###" + msg + "$$$";
	}
}