package composite.common;

import java.util.ArrayList;

/**
 * 你有没有发觉有问题 ? getInfo 每个接口都有为什么不能抽象出来 ? Root 类和 Branch 类有什么差别 ？
 * 为什么要定义成两个接口两个类 ? 如果我要加一个任职期限，你是不是每个类都需要修改 ?
 * 如果我要后序遍历（从员工找到他的上级领导）能做吗 ?
 */
public class Client {

    public static void main(String[] args) {
        IRoot ceo = new Root("王大麻子", "总经理", 100000);

        IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部经理", 30000);

        IBranch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);

        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 4000);
        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);

        // 该产生的人都产生出来了，然后我们怎么组装这棵树
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        ceo.add(k);

        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        developDep.add(zhengLaoLiu);

        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);

        salesDep.add(h);
        salesDep.add(i);

        financeDep.add(j);

        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordinateInfo());
    }

    //遍历所有的树枝节点，打印出信息
    private static void getAllSubordinateInfo(ArrayList subordinateList) {
        int length = subordinateList.size();
        for (int m = 0; m < length; m++) {
            Object s = subordinateList.get(m);
            //是个叶子节点，也就是员工
            if (s instanceof Leaf) {
                ILeaf employee = (ILeaf) s;
                System.out.println(((Leaf) s).getInfo());
            } else {
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                //再递归调用
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
