package longshu.designpatterns;

public class MailSender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println("MailSender send : " + msg);
    }
}