package builder;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    // A类 Benz 车
    public BenzModel getABenzModel() {
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();

        //这只 ABenzModel 的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");

        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // B类 Benz 车
    public BenzModel getBBenzModel() {
        this.sequence.clear();

        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");

        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // C类 BMW 车
    public BMWModel getCBMWModel() {
        this.sequence.clear();

        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");

        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    // D类 BMW 车
    public BMWModel getDBMWModel() {
        this.sequence.clear();

        this.sequence.add("start");

        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCarModel();
    }

    /*
     * 这里还可以有很多方法，你可以先停止，然后再启动，或者一直停着不动，静态的嘛
     * 导演类嘛，按照什么顺序是导演说了算
     */
}
