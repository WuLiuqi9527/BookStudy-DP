package composite.perfect;

import java.util.ArrayList;

/**
 * 组合模式【Composite Pattern】
 * <p>
 * 是组合模式（也叫合成模式），有时又叫做部分－整体模式（Part-Whole），
 * 主要是用来描述整体与部分的关系，用的最多的地方就是树形结构
 * 组合模式有两种模式，透明模式和安全模式
 * 透明模式是把用来组合使用的方法放到抽象类中，比如 add(),remove()以及 getChildren 等方法
 * （顺便说一下，getChildren 一般返回的结果为 Iterable的实现类，很多，大家可以看 JDK 的帮助），
 * 不管叶子对象还是树枝对象都有相同的结构，通过判断是 getChildren 的返回值确认是叶子节点还是树枝节点，
 * 如果处理不当，这个会在运行期出现问题的，不是很建议的方式；
 * 安全模式就不同了，它是把树枝节点和树叶节点彻底分开，树枝节点单独拥有用来组合的方法，这种方法比较安全
 * <p>
 * 组合模式的优点有哪些呢？第一个优点只要是树形结构，就要考虑使用组合模式，
 * 这个一定记住，只要是要体现局部和整体的关系的时候，而且这种关系还可能比较深，考虑一下组合模式吧
 */
public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {

        Branch root = new Branch("王大麻子", "总经理", 100000);
        //把三个部门经理产生出来
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部经理", 30000);

        //再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);

        //把所有的小兵都产生出来
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEO秘书", 8000);
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副经理", 20000);

        //开始组装
        //CEO下有三个部门经理和一个秘书
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        //研发部经理
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);

        //看看开发两个开发小组下有什么
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);

        //再看销售部下的人员情况
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        //最后一个财务
        financeDep.addSubordinate(j);

        return root;
    }

    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) {
                //是员工就直接获得信息
                info = info + s.getInfo() + "\n";
            } else {
                //是个小头目
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}
