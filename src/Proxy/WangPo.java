package Proxy;

public class WangPo implements KindWomen{
    private KindWomen kindWomen;

    public WangPo() {
        // 默认的话，王婆是潘金莲的代理
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        //王婆也可以是 KindWomen 的任何一个女人的代理，只要你是这一类型
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        //自己老了，干不了，可以让年轻的代替
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        //自己老了，干不了，可以让年轻的代替
        this.kindWomen.happyWithMan();
    }
}
