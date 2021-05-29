package decorator;

/**
 * 通过继承情况确实出现了问题 -> 类爆炸，类的数量激增
 * 并且在面向对象的设计中，如果超过 2 层继承，你就应该想想是不是出设计问题了，是不是应该重新找一条道了，
 * 这是经验值，不是什么绝对的，继承层次越多你以后的维护成本越多
 */
public class FouthGradeSchoolReport extends SchoolReport{

    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
