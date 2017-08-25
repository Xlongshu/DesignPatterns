package longshu.designpatterns.observer;

public class OctalObserver implements Observer {
	private NumberSubject subject;

	public OctalObserver(NumberSubject subject) {
		this.subject = subject;
		subject.add(this);
	}

	@Override
	public void update() {
		System.out.println("Octal:" + Integer.toOctalString(subject.getNum()));
	}
}