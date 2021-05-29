package observer.perfect;

import java.util.Observer;

/**
 * 观察者模式【Observer Pattern】
 * <p>
 * 观察者模式有一个变种叫做发布/订阅模型 (Publish/Subscribe)
 * 观察者可以实现消息的广播，一个消息可以触发多个事件
 * MQ (Message Queue)
 */
public class Client {

    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liusi);

        hanFeiZi.haveBreakfast();
    }
}
