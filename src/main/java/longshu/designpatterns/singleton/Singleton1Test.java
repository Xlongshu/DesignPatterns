package longshu.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton1Test extends Object {

    public static void main(String[] args) throws Exception {
        System.out.println(Singleton1.INSTANCE.hashCode());
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("obj2"));
        outputStream.writeObject(Singleton1.INSTANCE);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("obj2"));
        System.out.println(inputStream.readObject().hashCode());
        outputStream.close();
        inputStream.close();
    }

}
