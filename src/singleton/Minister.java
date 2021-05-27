package singleton;

/**
 * 忽略警告 -> 不应该通过类实例访问静态成员
 */
@SuppressWarnings("all")
public class Minister {

    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();

        Emperor emperor3 = Emperor.getInstance();
        emperor2.emperorInfo();

        //三天见的皇帝都是同一个人，荣幸吧！
    }
}
