package org.example.structuralPattern.component;

import java.util.List;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 4:49 下午
 *
 * 组合模式包含以下要素：
 * 1 Client：客户端代码。
 * 2 Component：抽象节点。
 * 3 Leaf：叶子节点。
 * 4 Composite：复合节点，该节点包括复合节点的子节点或者叶子节点的子节点。
 */
public class Test {

    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("p1");
        Employer programmer2 = new Programmer("p2");

        pm.add(pa);
        pm.add(programmer1);
        pm.add(programmer2);

        pm.delete(programmer2);

        List<Employer> employers = pm.getEmployers();
        for (Employer employer : employers) {
            System.out.println(employer.getName());
        }
    }
}
