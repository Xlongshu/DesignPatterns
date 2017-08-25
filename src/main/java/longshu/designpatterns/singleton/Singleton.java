package longshu.designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private Singleton() {
    }

    public void otherMethod() {
    }

    /*
    private static Singleton instance;
    // 懒汉模式(线程安全),效率低
    public static synchronized Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
    */

    /*
    private static volatile Singleton instance;
    // 懒汉模式(双重校验锁DCL,线程安全)
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    */

    // 静态内部类单例模式,懒加载线程安全
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /*--------------------------------------------------*/

    // 如果你序列化一个单例类的对象，接下来复原多个那个对象，那你就会有多个单例类的实例
    /**
     * {@see java.io.Serializable}
     */
    private Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve " + this.hashCode());
        return getInstance();
    }

    private Object writeReplace() throws ObjectStreamException {
        System.out.println("writeReplace " + this.hashCode());
        return getInstance();
    }

    // 如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。假定不是远端存取，
    // 例如一些servlet容器对每个servlet使用完全不同的类装载器，这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
    public Class<?> getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null)
            classLoader = Singleton.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }

}
