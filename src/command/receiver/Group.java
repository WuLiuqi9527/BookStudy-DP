package command.receiver;

/**
 * Command 抽象类：客户发给我们的命令，定义三个工作组的成员变量，供子类使用；
 * 定义一个抽象方法 execute，由子类来实现
 */
public abstract class Group {
    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();
}
