package extend2;

public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    int getTotalSalary();
}
