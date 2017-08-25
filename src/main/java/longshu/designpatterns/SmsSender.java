package longshu.designpatterns;

public class SmsSender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println("SmsSender  send : " + msg);
    }
}