package abstractfactory.yellowHuman;

import abstractfactory.Human;

/**
 * 其实，你说抽象类放这里有什么意义吗？就是不允许你 new 出来一个抽象的对象呗，使用非抽象类完全就可以代替
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void cry() {
        System.out.println("黄色人类会哭");
    }

    @Override
    public void laugh() {
        System.out.println("黄色人类会大笑，幸福呀！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类会大笑，幸福呀！");
    }
}
