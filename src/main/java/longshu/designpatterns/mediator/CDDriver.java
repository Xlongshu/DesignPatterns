package longshu.designpatterns.mediator;

// ConcreteMediator
public class CDDriver extends Colleague {

	public CDDriver(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		mediator.work(this);
	}

	public void readSound() {
		System.out.println("CDDriver readSound.");
	}
}