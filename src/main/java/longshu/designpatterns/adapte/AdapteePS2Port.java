package longshu.designpatterns.adapte;

// Adaptee 具有特殊功能、但不符合我们现有的标准接口的类
public class AdapteePS2Port implements PS2Port {
	@Override
	public void onPS2() {
		System.out.println("PS2接口的键盘...");
	}
}