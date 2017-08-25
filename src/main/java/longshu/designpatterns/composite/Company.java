package longshu.designpatterns.composite;

// Component
public abstract class Company {
	protected String name = "";

	public Company(String name) {
		this.name = name;
	}

	public abstract void show();

	public abstract void add(Company company);

	public abstract void remove(Company company);

}