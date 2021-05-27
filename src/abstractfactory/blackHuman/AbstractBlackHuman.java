package abstractfactory.blackHuman;

import abstractfactory.Human;

/**
 * 其实，你说抽象类放这里有什么意义吗？就是不允许你 new 出来一个抽象的对象呗，使用非抽象类完全就可以代替
 */
public abstract class AbstractBlackHuman implements Human {

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }

    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }

    @Override
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
