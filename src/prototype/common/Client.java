package prototype.common;

import java.util.Random;

/**
 * 把 sendMail 修改为多线程，但是你只把 sendMail 修改为多线程还是有问题的呀，
 * 你看哦，产生第一封邮件对象，放到线程 1 中运行，还没有发送出去；
 * 线程 2 呢也也启动了，直接就把邮件对象 mail的收件人地址和称谓修改掉了，线程不安全了
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            mail.setAppellation(getRandString(5) + " 先生（女士）");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            //然后发送邮件
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t....发送成功！");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
