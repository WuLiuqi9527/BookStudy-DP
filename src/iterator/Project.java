package iterator;

public class Project implements IProject {

    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        String info = "";

        info = info+ "项目名称是：" + this.name;
        info = info + "\t项目人数: "+ this.num;
        info = info+ "\t 项目费用："+ this.cost;

        return info;
    }
}
