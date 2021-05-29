package composite.common;

import java.util.ArrayList;

/**
 * 定义一个根节点，就为总经理服务
 */
public interface IRoot {

    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    ArrayList getSubordinateInfo();
}
