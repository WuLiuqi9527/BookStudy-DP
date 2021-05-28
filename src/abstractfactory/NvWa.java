package abstractfactory;

import abstractfactory.humanFactory.FemaleHumanFactory;
import abstractfactory.humanFactory.MaleHumanFactory;

/**
 * 抽象工厂模式【Abstract Factory Pattern】
 */
public class NvWa {

    public static void main(String[] args) {

        HumanFactory maleHumanFactory = new MaleHumanFactory();

        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
    }
}
