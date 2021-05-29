package decorator;

/**
 * 装饰模式【Decorator Pattern】
 * 扩展性非常好 开闭原则：对修改关闭，对扩展开放
 * <p>
 * 记住在装饰模式中，必然有一个被提取出来最核心、最原始、最基本的接口或抽象类
 * 装饰模式是对继承的有力补充 继承可不是万能的，继承可以解决实际的问题，
 * 但是在项目中你要考虑诸如易维护、易扩展、易复用等，
 * 而且在一些情况下（比如上面那个成绩单例子）你要是用继承就会增加很多了类，而且灵活性非常的差，那当然维护也不容易了，
 * 也就是说装饰模式可以替代继承，解决我们类膨胀的问题，你要知道继承是静态的给类增加功能，
 * 而装饰模式则是动态的给增加功能，你看上面的那个例子，
 * 我不想要 SortDecorator 这层的封装也很简单呀，直接在 Father 中去掉就可以了，如果你用继承就必须修改程序
 */
public class Father {

    public static void main(String[] args) {

        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("老三");

        System.out.println("------------粉饰太平------------");

        // 原始类
        sr = new FouthGradeSchoolReport();
        // 添加 HighScore 装饰
        sr = new HighScoreDecorator(sr);
        // 添加 Sort 装饰
        sr = new SortDecorator(sr);

        sr.report();
        sr.sign("老三");
    }
}
