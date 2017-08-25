package longshu.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite 
public class Google extends Company {
	private List<Company> children = new ArrayList<Company>();

	public Google(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println(name);
		System.out.print("\t Children : ");
		for (Company c : children) {
			System.out.print(c.name + " ");
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