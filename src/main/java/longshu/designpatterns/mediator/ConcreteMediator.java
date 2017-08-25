package longshu.designpatterns.mediator;

public class ConcreteMediator implements Mediator {
	private CDDriver cdDriver;
	private SoundCard soundCard;

	@Override
	public void work(Colleague colleague) {
		if (cdDriver == colleague) {
			cdDriver.readSound();
		} else if (soundCard == colleague) {
			soundCard.playSound();
		}
	}

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
}