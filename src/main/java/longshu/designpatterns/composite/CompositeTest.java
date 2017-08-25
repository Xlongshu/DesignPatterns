package longshu.designpatterns.composite;

// 测试
public class CompositeTest {

	public static void main(String[] args) {
		Company alphabet = new Alphabet("Alphabet");
		Company google = new Google("Google");
		google.add(new Android("Android"));
		google.add(new YouTube("YouTube"));
		alphabet.add(google);

		alphabet.show();
	}
}