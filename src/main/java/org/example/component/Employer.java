package org.example.component;

import java.util.List;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 3:01 下午
 */
public abstract class Employer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List employers;

    public void printInfo() {
        System.out.println(name);
    }

    public List getEmployers() {
        return employers;
    }

}
