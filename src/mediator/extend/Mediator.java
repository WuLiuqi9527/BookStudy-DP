package mediator.extend;

/**
 * 中介者 Mediator 有定义了多个 Private 方法，其目标是处理各个对象之间的依赖关系，
 * 即是说把原有一个对象要依赖多个对象的情况移到中介者的 Private 方法中实现，
 * 在实际项目中，一般的做法是中介者按照职责进行划分，每个中介者处理一个或多个类似的关联请求
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            //采购电脑
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            //销售电脑
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            //折价销售
            this.offSell();
        } else if (str.equals("stock.clear")) {
            //清仓处理
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            //销售情况良好
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        } else {
            //销售情况不好 折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            //库存数量不够销售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        //要求清仓销售
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
