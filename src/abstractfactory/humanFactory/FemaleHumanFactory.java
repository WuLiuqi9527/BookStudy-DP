package abstractfactory.humanFactory;

import abstractfactory.Human;
import abstractfactory.HumanEnum;

public class FemaleHumanFactory extends AbstractHumanFactory{

    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }
}
