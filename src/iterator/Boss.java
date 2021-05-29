package iterator;

import java.util.ArrayList;

/**
 * 迭代器模式【Iterator Pattern】
 * <p>
 * java.util.Iterable 接口只有一个方法：iterator()，
 * 也就说通过 iterator()这个方法去遍历聚集类中的所有方法或属性，
 * 基本上现在所有的高级的语言都有 Iterator 这个接口或者实现，Java 已经把迭代器给我们准备了，
 * 我们再去写迭代器，是不是“六指儿抓痒，多一道子”？所以呀，这个迭代器模式也有点没落了，
 * 基本上很少有项目再独立写迭代器了，直接使用 List 或者 Map 就可以完整的解决问题
 */
public class Boss {

    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<>();

        projectList.add(new Project("星球大战项目", 10, 100000));
        projectList.add(new Project("扭转时空项目", 100, 10000000));
        projectList.add(new Project("超人改造项目", 10000, 1000000000));
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 1000000));
        }

        for (IProject p : projectList) {
            System.out.println(p.getProjectInfo());
        }
    }
}
