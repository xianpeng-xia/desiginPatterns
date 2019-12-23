package org.example.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:50
 */
public class Test {

    public static void main(String[] args) {

        Visitor visitor = new ConcreateVisitor();
        StringElement se = new StringElement("abc");
        se.accept(visitor);

        FloatElement fe = new FloatElement(new Float(1.5f));
        fe.accept(visitor);

        System.out.println("===========");

        List result = new ArrayList();
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new FloatElement(1.5f));
        result.add(new FloatElement(1.5f));
        result.add(new FloatElement(1.5f));
        visitor.visitCollection(result);

    }
}
