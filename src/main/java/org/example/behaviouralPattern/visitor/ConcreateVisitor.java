package org.example.behaviouralPattern.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:46
 */
public class ConcreateVisitor implements Visitor {

    @Override
    public void visitFloat(FloatElement floatElement) {
        System.out.println(floatElement.getFe());
    }

    @Override
    public void visitString(StringElement stringElement) {
        System.out.println(stringElement.getSe());
    }

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof Visitable) {
                ((Visitable) object).accept(this);
            }
        }
    }
}
