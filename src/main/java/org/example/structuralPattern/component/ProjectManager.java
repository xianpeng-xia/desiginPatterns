package org.example.structuralPattern.component;

import java.util.ArrayList;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 4:46 下午
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
