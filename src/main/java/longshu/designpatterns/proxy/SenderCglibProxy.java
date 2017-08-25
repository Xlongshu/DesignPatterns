package longshu.designpatterns.proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

// cglib通过继承的方式动态代理
public class SenderCglibProxy implements MethodInterceptor {

	@SuppressWarnings("unchecked")
	public static <T> T getProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new SenderCglibProxy());
		return (T) enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("method:" + method);
		System.out.println("args:" + Arrays.toString(args));

		long start = System.currentTimeMillis();
		Object result = proxy.invokeSuper(obj, args);
		long end = System.currentTimeMillis();
		System.out.println("运行时长=" + (end - start));
		return result;
	}
}