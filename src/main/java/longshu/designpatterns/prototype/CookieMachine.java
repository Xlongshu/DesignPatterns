package longshu.designpatterns.prototype;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

// Client
public class CookieMachine {
	private Cookie cookie;// cookie必须是可复制的

	public CookieMachine(Cookie cookie) {
		this.cookie = cookie;
	}

	public Cookie makeCookie() {
		// return cookie.clone();
		return cookie.deepClone();
	}

	public static void main(String args[]) {
		List<Cookie> cookies = new LinkedList<Cookie>();
		Cookie prototype = new SweetCookie();
		CookieMachine cm = new CookieMachine(prototype); // 设置原型
		for (int i = 0; i < 5; i++) {
			sleep();
			Cookie cookieNew = cm.makeCookie();
			cookieNew.setCreateTime(new Date());// 设置新时间
			// 通过复制原型返回多个cookie
			cookies.add(cookieNew);
		}
		System.out.println(cookies);
	}

	static void sleep() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
	}
}