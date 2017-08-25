package longshu.designpatterns.adapte;

// Client
public class ClientPC {
	public static void main(String[] args) {
		// 类适配器
		TargetUSBPort adapter = new AdapterPS2ToUSB();
		adapter.onUSB();
		// 对象适配器
		PS2Port adaptee = new AdapteePS2Port();
		TargetUSBPort adapter2 = new AdapterPS2ToUSB2(adaptee);
		adapter2.onUSB();
	}
}