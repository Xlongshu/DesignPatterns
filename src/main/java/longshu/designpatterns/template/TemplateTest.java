package longshu.designpatterns.template;

// 测试
public class TemplateTest {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();

		game = new Football();
		game.play();
	}
}