package observer.advance2;

public class Client {

    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liusi);

        hanFeiZi.haveBreakfast();
    }
}
