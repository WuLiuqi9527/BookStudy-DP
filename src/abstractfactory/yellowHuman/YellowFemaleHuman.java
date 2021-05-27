package abstractfactory.yellowHuman;

public class YellowFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
