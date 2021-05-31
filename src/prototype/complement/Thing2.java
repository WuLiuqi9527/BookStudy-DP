package prototype.complement;

import java.util.ArrayList;

public class Thing2 implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing2 clone() {
        Thing2 thing = null;
        try {
            // 浅拷贝
            // thing = (Thing2) super.clone();
            // 深拷贝
            thing = (Thing2) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public static void main(String[] args) {
        Thing2 thing = new Thing2();
        thing.setValue("张三");

        Thing2 cloneThing = thing.clone();
        cloneThing.setValue("李四");

        System.out.println(thing.getValue());
    }

    /**
     * -> [张三, 李四]
     * 怎么会有李四呢？是因为 Java 做了一个偷懒的拷贝动作，Object 类提供的方法 clone 只是拷贝 [本对象]，
     * 其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝，
     * 确实是非常浅，两个对象共享了一个私有变量，你改我改大家都能改，是一个种非常不安全的方式，在实际项目中使用还是比较少的。
     * 你可能会比较奇怪，为什么在 Mail 那个类中就可以使用 String 类型，
     * 而不会产生由浅拷贝带来的问题呢？内部的数组和引用对象才不拷贝，其他的原始类型比如 int,long,String 等都会被拷贝的
     * (Java 就希望你把 String 认为是基本类型，String 是没有 clone 方法的)
     */
}
