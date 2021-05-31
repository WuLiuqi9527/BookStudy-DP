package prototype.complement;

public class Thing1 implements Cloneable {

    public Thing1() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing1 clone() {
        Thing1 thing = null;
        try {
            thing = (Thing1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public static void main(String[] args) {
        Thing1 thing = new Thing1();
        Thing1 cloneThing = thing.clone();
    }

    /**
     * -> 构造函数被执行了...
     * 对象拷贝时，类的构造函数是不会被执行的
     * 对象拷贝时确实构造函数没有被执行，这个从原理来讲也是可以讲得通的，
     * Object 类的 clone 方法的原理是从内存中（具体的说就是堆内存）以二进制流的方式进行拷贝，重新分配一个内存块，
     * 那构造函数没有被执行也是非常正常的了
     */
}
