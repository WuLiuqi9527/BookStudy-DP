package abstractfactory.blackHuman;

import abstractfactory.yellowHuman.AbstractYellowHuman;

public class BlackFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }
}
