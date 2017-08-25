package longshu.designpatterns.iterator;

public class NameContainer implements Iterable {
	String names[] = { "Robert", "John", "Julie", "Tom" };

	@Override
	public Iterator iterator() {
		return new NameIterator(this);
	}
}