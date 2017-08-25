package longshu.designpatterns.template;

// AbstractClass
public abstract class Game {
	protected abstract void initialize();

	protected abstract void startPlay();

	protected abstract void endPlay();

	// template method
	public final void play() {
		initialize();// initialize the game
		startPlay();// start game
		endPlay();// end game
	}
}