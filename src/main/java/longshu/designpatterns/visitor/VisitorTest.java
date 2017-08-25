package longshu.designpatterns.visitor;

// 测试
public class VisitorTest {

	public static void main(String[] args) {
		ComputerPart computer = new Computer("Computer");
		ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

		computer.accept(visitor);
	}
}