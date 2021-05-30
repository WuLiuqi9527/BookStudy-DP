package extend2;

public class Visitor implements IVisitor {

    private final static int MANAGER_COEFFICIENT = 5;
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    private int commonTotalSalary = 0;
    private int managerTotalSalary = 0;

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        //计算普通员工的薪水总和
        this.calCommonSlary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        //计算部门经理的工资总和
        this.calManagerSalary(manager.getSalary());
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男")
                + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";

        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }

    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary
                * MANAGER_COEFFICIENT;
    }

    private void calCommonSlary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary +
                salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}
