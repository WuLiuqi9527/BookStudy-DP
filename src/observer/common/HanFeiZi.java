package observer.common;

public class HanFeiZi implements IHanFeiZi {
    private boolean isHaveBreakfast = false;
    private boolean isHaveFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.isHaveBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.isHaveFun = true;
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean isHaveBreakfast) {
        this.isHaveBreakfast = isHaveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean isHaveFun) {
        this.isHaveFun = isHaveFun;
    }
}
