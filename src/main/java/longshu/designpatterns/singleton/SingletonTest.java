package longshu.designpatterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest implements Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new SingletonTest()).start();
        }

        try {
            File obj = new File("obj");
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(obj));
            outputStream.writeObject(Singleton.getInstance());
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(obj));
            System.out.println(inputStream.readObject().hashCode());

            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // System.out.println(Thread.currentThread().getName() + " : " +
        // Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}
