package longshu.designpatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// Prototype Class
public class Cookie implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	protected String type = "饼干";
	protected Date createTime = new Date();

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "[type=" + type + "createTime=" + createTime.getTime() + "] " + hashCode();
	}

	// 浅复制
	@Override
	public Cookie clone() {
		try {
			return (Cookie) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 深复制
	public Cookie deepClone() {
		try {
			// 写入当前对象的二进制流
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			// 读出二进制流产生的新对象
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (Cookie) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}