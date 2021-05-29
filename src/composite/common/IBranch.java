package composite.common;

import java.util.ArrayList;

/**
 * 树枝节点，也就是各个部门经理和组长的角色
 */
public interface IBranch {

    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    ArrayList getSubordinateInfo();
}
