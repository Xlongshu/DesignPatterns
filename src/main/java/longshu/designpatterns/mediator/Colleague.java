package longshu.designpatterns.mediator;

// Colleague 同事类
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();
}