package bridge.implementor;

public abstract class Corp {
    private Product product;

    // 构造函数，其目的是要继承的子类都必须重写自己的有参构造函数，把产品类传递进来
    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
