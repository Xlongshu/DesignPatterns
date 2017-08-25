package longshu.designpatterns.mediator;

public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		mediator.work(this);
	}

	public void playSound() {
		System.out.println("SoundCard playSound.");
	}
}