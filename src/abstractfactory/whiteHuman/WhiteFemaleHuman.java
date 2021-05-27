package abstractfactory.whiteHuman;

import abstractfactory.yellowHuman.AbstractYellowHuman;

public class WhiteFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为女...");
    }
}
