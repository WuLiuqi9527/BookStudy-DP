package composite.extend;

/**
 * 定义一个公司的人员的抽象类
 *
 * 树的遍历问题，从上到下遍历没有问题，但是我要是从下往上遍历呢？
 * 比如在人力资源这颗树上，我从中抽取一个用户，要找到它的上级有哪些，下级有哪些，怎么处理？
 * -> 只要增加两个方法就可以了，一个是设置父节点是谁，一个是查找父节点是谁 (getter-setter)
 */
public abstract class Corp {
    private String name;
    private String position;
    private int salary;

    private Corp parent;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public Corp getParent() {
        return this.parent;
    }
}
