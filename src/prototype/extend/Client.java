package prototype.extend;

import java.util.Random;

/**
 * 原型模式【Prototype Pattern】
 * <p>
 * 把对象拷贝一份，产生一个新的对象，和原有对象一样，然后再修改细节的数据，如设置称谓，设置收件人地址等等。
 * 这种不通过 new 关键字来产生一个对象，而是通过 对象拷贝 来实现的模式就叫做原型模式
 * <p>注意事项
 * 1、对象拷贝时，类的构造函数是不会被执行的
 * 2、浅拷贝和深拷贝问题
 * 3、Clone 与 final 两对冤家
 * <p>
 * 原型模式适合在什么场景使用？
 * 一是类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等；
 * 二是通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式；
 * 三是一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
 * 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone的方法创建一个对象，然后由工厂方法提供给调用者
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {

            Mail cloneMail = mail.clone();

            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            //然后发送邮件
            sendMail(cloneMail);
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
