package org.example.structuralPattern.component;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 4:41 下午
 */
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        employers = null;
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
