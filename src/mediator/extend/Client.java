package mediator.extend;

/**
 * 中介者模式的优点就是减少类间的依赖，把原有的一对多的依赖变成了一对一的依赖，
 * 同事类只依赖中介者，减少了依赖，当然也同时减低了类间的耦合。
 * 它的缺点呢就是中介者会膨胀的很大，而且逻辑会很复杂，
 * 因为所有的原本 N 个对象直接的相互依赖关系转换为中介者和同事类的依赖关系，同事类越多，中介者的逻辑就复杂
 * <p>
 * 在面向对象的编程中，对象和对象之间必然会有依赖关系
 * 中介者模式适用于多个对象之间紧密耦合，耦合的标准可以这样来衡量：在类图中出现了蜘蛛网状结构，
 * 在这种情况下一定要考虑使用中介者模式，有利于把蜘蛛网梳理为一个星型结构，使原本复杂混乱关系变得清晰简单
 * <p>
 * 举栗子：机场调度中心, MVC 框架, C/S 结构, 中介服务
 */
public class Client {

    public static void main(String[] args) {

        AbstractMediator mediator = new Mediator();
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        System.out.println("\n------销售人员销售电脑--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
