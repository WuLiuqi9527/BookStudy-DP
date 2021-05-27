package abstractfactory.humanFactory;

import abstractfactory.Human;
import abstractfactory.HumanEnum;
import abstractfactory.HumanFactory;

public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        if (!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                //因为使用了enum，这个种异常情况不会产生了，除非你的 enum 有问题
                e.printStackTrace();
            }
        }
        return human;
    }
}
