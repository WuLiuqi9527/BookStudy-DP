package abstractfactory;

public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YellowMaleHuman("abstractfactory.yellowHuman.YellowMaleHuman"),
    YellowFemaleHuman("abstractfactory.yellowHuman.YellowFemaleHuman"),
    WhiteFemaleHuman("abstractfactory.whiteHuman.WhiteFemaleHuman"),
    WhiteMaleHuman("abstractfactory.whiteHuman.WhiteMaleHuman"),
    BlackFemaleHuman("abstractfactory.blackHuman.BlackFemaleHuman"),
    BlackMaleHuman("abstractfactory.blackHuman.BlackMaleHuman");

    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
