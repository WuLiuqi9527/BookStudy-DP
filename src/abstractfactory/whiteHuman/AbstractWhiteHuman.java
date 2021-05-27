package abstractfactory.whiteHuman;

import abstractfactory.Human;

/**
 * 其实，你说抽象类放这里有什么意义吗？就是不允许你 new 出来一个抽象的对象呗，使用非抽象类完全就可以代替
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void cry() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void laugh() {
        System.out.println("白色人类会大笑，侵略的笑声");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}
