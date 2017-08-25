package longshu.designpatterns.iterator;

// 测试
public class IteratorTest {

	public static void main(String[] args) {
		Iterable iterable = new NameContainer();

		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}