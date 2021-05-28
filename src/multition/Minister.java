package multition;

/**
 * 多例模式【Multition Pattern】
 */
@SuppressWarnings("all")
public class Minister {

    public static void main(String[] args) {
        int ministerNum = 10;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
