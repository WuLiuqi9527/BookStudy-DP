package bridge;

/**
 * 桥梁模式【Bridge Pattern】
 * <p>
 * 说到桥梁模式，那就多扯几句，大家对类的继承有什么看法吗？继承的优点有很多，
 * 可以把公共的方法或属性抽取，父类封装共性，子类实现特性，这是继承的基本功能，缺点有没有？有，强关联关系
 * -> 桥梁模式描述了类间弱关联关系，还说上面的那个例子，
 * Father 类完全可以把可能会变化的方法放出去，Son 子类要有这个方法很简单，桥梁搭过去，获得这个方法，
 * GrandSon 也一样，即使你 Son 子类不想使用这个方法了，也没关系，对 GrandSon 不产生影响，他不是从你 Son 中继承来的方法
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("-------房地产公司是这个样子运行的-------");
        HouseCrop houseCrop = new HouseCrop();
        houseCrop.makeMoney();

        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();

        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}
