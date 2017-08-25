package longshu.designpatterns.adapte;

// Adapter 适配器类，继承了被适配类，同时实现标准接口。(类适配器)
public class AdapterPS2ToUSB extends AdapteePS2Port implements TargetUSBPort {
	@Override
	public void onUSB() {
		System.out.println("类适配器 转换...");
		this.onPS2();
	}
}