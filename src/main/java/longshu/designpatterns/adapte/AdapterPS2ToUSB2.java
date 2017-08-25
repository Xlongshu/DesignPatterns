package longshu.designpatterns.adapte;

// Adapter 适配器类，直接关联被适配类。(对象适配器)
public class AdapterPS2ToUSB2 implements TargetUSBPort {
	private PS2Port ps2Port;

	// 通过构造函数传入具体需要适配的被适配类对象
	public AdapterPS2ToUSB2(PS2Port ps2Port) {
		this.ps2Port = ps2Port;
	}

	@Override
	public void onUSB() {
		System.out.println("转换...");
		// 使用委托的方式完成特殊功能
		ps2Port.onPS2();
	}
}