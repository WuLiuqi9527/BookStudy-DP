package builder;

import java.util.ArrayList;

/**
 * setSequence 方法是允许客户自己设置一个顺序，是要先跑起来在有引擎声音还是先有引擎声音再
 * 跑起来，还是说那个喇叭就不要响，对于一个具体的模型永远都固定的，
 * 那这个事由牛叉告诉我们，有 1W 件事这样的，1W 件事那样的顺序，目前的设计都能满足这个要求
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);

            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
