package abstractfactory.yellowHuman;

public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男...");
    }
}
