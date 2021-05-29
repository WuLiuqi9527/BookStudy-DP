package decorator;

/**
 * Decorator 抽象类的目的很简单，就是要让子类来对封装 SchoolReport 的子类
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
