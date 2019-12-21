package org.example.component;

import java.util.List;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 4:49 下午
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
