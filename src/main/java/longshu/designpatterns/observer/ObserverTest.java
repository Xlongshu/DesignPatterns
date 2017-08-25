package longshu.designpatterns.observer;

// 测试
public class ObserverTest {
	public static void main(String[] args) {
		NumberSubject subject = new NumberSubject();

		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexObserver(subject);
		
		subject.setNum(10);
		subject.setNum(1024);
	}
}