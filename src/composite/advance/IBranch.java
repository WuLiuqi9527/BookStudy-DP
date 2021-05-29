package composite.advance;

import java.util.ArrayList;

/**
 * 树枝节点，也就是各个部门经理和组长的角色
 */
public interface IBranch {

    void addSubordinate(ICorp corp);

    ArrayList<ICorp> getSubordinate();
}
