package chainofresponsibility.common;

import java.util.ArrayList;
import java.util.Random;

/**
 * 本例有以下几个问题：
 * 1、失去面向对象的意义。对女儿提出的请示，应该在父亲类中做出决定，父亲这个类应该是知道女儿的请求应该自己处理，
 * 而不是在 Client 类中进行组装出来，也就是说原本应该是父亲这个类做的事情抛给了其他类进行处理。
 * 2、迪米特法则相违背。我们在 Client 类中写了 if...else... 的判断条件，你看这个条件体内都是一个接口 IHandler 的三个实现类，
 * 谁能处理那个请求，怎么处理，直接在实现类中定义好不就结了吗？你的类我知道的越少越好，别让我猜测你类中的逻辑。
 * 3、耦合过重。我们要根据 Women 的 type 来决定使用 IHandler 的那个实现类来处理请求，
 * 我问你，如果 IHanlder 的实现类继续扩展怎么办？修改 Client 类？与开闭原则违背！
 * 4、异常情况没有考虑。妻子只能向丈夫请示吗？如果妻子向自己的父亲请示了，父亲应该做何处理？我们的程序上可没有体现出来。
 */
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            } else {
            }
        }
    }
}
