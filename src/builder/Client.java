package builder;

import java.util.ArrayList;

/**
 * 建造者模式【Builder Pattern】
 * <p>
 * 建造者模式使用的场景，一是产品类非常的复杂，或者产品类中的调用顺序不同产生了不同的效能，
 * 这个时候使用建造者模式是非常合适，
 * 我曾在一个银行交易类项目中遇到了这个问题，一个产品的定价计算模型有 N 多种，每个模型有固定的计算步骤，计算非常复杂，项目中就使用了建造者模式；
 * 二是 “ 在对象创建过程中会使用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到”，
 * 这个是我没有遇到过的，创建过程中不易得到？那为什么在设计阶段不修正这个问题，创建的时候都不易得到耶
 * <p>
 * 建造者模式最主要功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了；
 * 而工厂方法则重点是创建，你要什么对象我创造一个对象出来，组装顺序则不是他关心的
 */
public class Client {

    public static void main(String[] args) {

        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();

        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 10; i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 10; i++) {
            director.getCBMWModel().run();
        }
        for (int i = 0; i < 10; i++) {
            director.getDBMWModel().run();
        }
    }
}
