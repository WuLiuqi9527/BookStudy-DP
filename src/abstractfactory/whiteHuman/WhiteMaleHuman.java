package abstractfactory.whiteHuman;

import abstractfactory.yellowHuman.AbstractYellowHuman;

public class WhiteMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为男...");
    }
}
