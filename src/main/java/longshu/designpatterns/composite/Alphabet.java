package longshu.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite 
public class Alphabet extends Company {
	private List<Company> children = new ArrayList<Company>();

	public Alphabet(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println(name);
		System.out.print("Children:");
		for (Company c : children) {
			c.show();
		}
	}

	@Override
	public void add(Company company) {
		children.add(company);
	}

	@Override
	public void remove(Company company) {
		children.remove(company);
	}
}