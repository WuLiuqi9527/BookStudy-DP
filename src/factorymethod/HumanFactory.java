package factorymethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 1、增加了 createHuman() 后，是不是这个工厂的扩展性更好了？
 *   你看你要再加一个人类，只要你继续实现 Human 接口成了，然后啥都不用修改就可以生产了
 * 2、工厂方法模式还有一个非常重要的应用，就是 延迟初始化 (Lazy initialization) ，什么是延迟始化呢？
 *   一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了
 *   在类初始化很消耗资源的情况比较实用，比如你要连接硬件，
 *   或者是为了初始化一个类需要准备比较多条件（参数），通过这种方式可以很好的减少项目的复杂程度
 */
public class HumanFactory {

    private static HashMap<String, Human> humans = new HashMap<>();

    public static Human createHuman(Class c) {
        Human human = null;

        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到！");
        }
        return human;
    }

    public static Human createHuman() {
        Human human = null;
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));

        return human;
    }
}
