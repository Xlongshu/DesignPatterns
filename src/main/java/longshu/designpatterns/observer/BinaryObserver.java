package longshu.designpatterns.observer;

public class BinaryObserver implements Observer {
	private NumberSubject subject;

	public BinaryObserver(NumberSubject subject) {
		this.subject = subject;
		subject.add(this);
	}

	@Override
	public void update() {
		System.out.println("Binary:" + Integer.toBinaryString(subject.getNum()));
	}
}