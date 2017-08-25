package longshu.designpatterns.observer;

public class HexObserver implements Observer {
	private NumberSubject subject;

	public HexObserver(NumberSubject subject) {
		this.subject = subject;
		subject.add(this);
	}

	@Override
	public void update() {
		System.out.println("Hex:" + Integer.toHexString(subject.getNum()).toUpperCase());
	}
}