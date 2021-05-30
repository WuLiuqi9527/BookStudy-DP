package visitor.extend;

public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    int getTotalSalary();
}
