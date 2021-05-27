package singleton;

/**
 * 通用单例模式
 * 直接 new 一个对象传递给类的成员变量 singletonpattern，
 * 你要的时候 getInstance（）直接返回给你，解决问题！
 */
public class SingletonPatterns {

    private static final SingletonPatterns singletonPatterns = new SingletonPatterns();

    private SingletonPatterns() {
    }

    public SingletonPatterns getInstance() {
        return singletonPatterns;
    }
}
