package chainofresponsibility.advance;

import java.util.ArrayList;
import java.util.Random;

/**
 * 责任链模式【Chain of Responsibility Pattern】
 * <p>
 * 业务调用类 Client 也不用去做判断到底是需要谁去处理，而且 Handler 抽象类的子类以后可以继续增加下去，
 * 只是我们这个传递链增加而已，调用类可以不用了解变化过程，甚至是谁在处理这个请求都不用知道。这就是责任链模式。
 * <p>
 * 责任链模式屏蔽了请求的处理过程，你发起一个请求到底是谁处理的，这个你不用关心，只要你把请求抛给责任链的第一个处理者，
 * 最终会返回一个处理结果（当然也可以不做任何处理），作为请求者可以不用知道到底是需要谁来处理的，这是责任链模式的核心。
 * 责任链有一个缺点是大家在开发的时候要注意：调试不是很方便，特别是链条比较长，环节比较多的时候，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂
 * <p>
 * 观察者模式也可以实现请求的传递，比如一个事件发生了，通知了观察者，同时观察者又作为一个被观察者，通知了另外一个观察者，
 * 这也形成了一个事件广播链，这和我们今天讲的责任链是有区别的：
 * 1、受众数量不同。观察者广播链式可以 1：N 的方式广播，而责任链则要求是的 1:1 的传递，必然有一个且只有一个类完成请求的处理；
 * 2、请求内容不同。观察者广播链中的信息可以在传播中改变，但是责任链中的请求是不可改变的；
 * 3、处理逻辑不通。观察者广播链主要用于触发联动动作，而责任链则是对一个类型的请求按照既定的规则进行处理。
 */
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
