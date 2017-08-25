package longshu.designpatterns.mediator;

// 测试
public class MediatorTest {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();

		CDDriver cdDriver = new CDDriver(mediator);
		SoundCard soundCard = new SoundCard(mediator);
		
		mediator.setCdDriver(cdDriver);
		mediator.setSoundCard(soundCard);

		cdDriver.work();
		soundCard.work();
	}
}