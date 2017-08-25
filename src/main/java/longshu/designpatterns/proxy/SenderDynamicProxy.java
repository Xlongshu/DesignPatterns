package longshu.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import longshu.designpatterns.Sender;

// JDK通过实现某些结构动态产生类和对象
public class SenderDynamicProxy implements InvocationHandler {
	private Sender target;

	public SenderDynamicProxy(Sender target) {
		this.target = target;
	}
	
	public Sender getProxy() {
		// 动态创建一个实现了target实现了的接口(Sender)的对象
		return (Sender) Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),
				this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method:" + method);
		System.out.println("args:" + Arrays.toString(args));

		long start = System.currentTimeMillis();
		Object result = method.invoke(target, args);
		long end = System.currentTimeMillis();
		System.out.println("运行时长=" + (end - start));
		return result;
	}
}