package org.example.behaviouralPattern.visitor;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:27
 */
public interface Visitable {

    void accept(Visitor visitor);
}
