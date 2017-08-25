package longshu.designpatterns.iterator;

public class NameIterator implements Iterator {
	private NameContainer nameContainer;
	private int index;

	public NameIterator(NameContainer nameContainer) {
		this.nameContainer = nameContainer;
	}

	@Override
	public boolean hasNext() {
		if (index < nameContainer.names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			return nameContainer.names[index++];
		}
		return null;
	}
}