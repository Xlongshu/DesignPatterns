package longshu.designpatterns.factory.method;

import longshu.designpatterns.Sender;

// 工厂方法的核心,定义一个创建对象的接口,让子类来决定实例化哪一个类,使实例化延迟到子类。
public interface SenderFactory {
	public Sender getSender();
}
