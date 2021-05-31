package state.advance;

/**
 * 状态模式封装的非常好，状态的变更引起了行为的变更，从外部看起来就好像这个对象对应的类发生了改变一样
 * <p>优点
 * 避免了过多的 swith…case 或者 if..else 语句的使用，避免了程序的复杂性；
 * 其次是很好的使用体现了开闭原则和单一职责原则，每个状态都是一个子类，你要增加状态就增加子类，你要修改状态，你只修改一个子类就可以了；
 * 最后一个好处就是封装性非常好，这也是状态模式的基本要求，状态变换放置到了类的内部来实现，外部的调用不用知道类内部如何实现状态和行为的变换
 * <p>优点
 * 子类会太多，也就是类膨胀，你想一个事物有七八、十来个状态也不稀奇，如果完全使用状态模式就会有太多的子类，不好管理
 * <p>
 * 状态模式使用于当某个对象在它的状态发生改变时，它的行为也随着发生比较大的变化，
 * 也就是说行为是受状态约束的情况下可以使用状态模式，而且状态模式使用时对象的状态最好不要超过五个，防止你写子类写疯掉
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
