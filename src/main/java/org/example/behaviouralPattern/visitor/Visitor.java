package org.example.behaviouralPattern.visitor;

import java.util.Collection;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:03
 */
public interface Visitor {

    void visitFloat(FloatElement floatElement);

    void visitString(StringElement stringElement);

    void visitCollection(Collection collection);
}
