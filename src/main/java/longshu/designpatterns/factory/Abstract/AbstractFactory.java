package longshu.designpatterns.factory.Abstract;

// 定义抽象工厂
public abstract class AbstractFactory {
	public abstract AbstractMailSender getMailSender(String type);

	public abstract AbstractSmsSender getSmsSender(String type);
}
