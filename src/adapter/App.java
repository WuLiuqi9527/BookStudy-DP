package adapter;

/**
 * 适配器模式【Adapter Pattern】
 * <p>
 * 你笔记本上的那个拖在外面的黑盒子就是个适配器，一般你在中国能用，在日本也能用，
 * 虽然两个国家的的电源电压不同，中国是 220V，日本是 110V，
 * 但是这个适配器能够把这些不同的电压转换为你需要的 36V 电压，保证你的笔记本能够正常运行，
 * 那我们在设计模式中引入这个适配器模式是不是也是这个意思呢？
 * 是的，一样的作用，两个不同接口，有不同的实现，但是某一天突然上帝命令你把 B 接口转换为 A 接口，怎么办？
 * 继承，能解决，但是比较傻，而且还违背了 OCP 原则，怎么办？好在我们还有适配器模式
 * <p>
 * 适配器模式不适合在系统设计阶段采用，没有一个系统分析师会在做详设的时候考虑使用适配器模式，
 * 这个模式使用的主要场景是扩展应用中，就像我们上面的那个例子一样，系统扩展了，不符合原有设计的时候才考虑通过适配器模式减少代码修改带来的风险
 */
public class App {

    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();

        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

        youngGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
