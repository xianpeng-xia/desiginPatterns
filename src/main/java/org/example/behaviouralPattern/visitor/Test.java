package org.example.behaviouralPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:50
 *
 * 访问者模式将操作与其操作的对象结构分开，允许添加新操作而不更改结构类
 * 访问者模式在单个类中定义了一组操作：它为每个类型的对象定义一个方法，该方法来自它必须操作的结构。只需创建另一个访问者即可添加一组新操作
 *
 * 访问者模式基于以下类：
 * 1 Element（元素）：表示对象结构的基类。结构中的所有类都是它派生的，它们必须实现accept（visitor：Visitor）方法。
 * 2 ConcreteElementA（具体元素A）和ConcreteElementB（具体元素B）：这是我们想要添加在Visitor类中实现的外部操作的具体类。
 * 3（Visitor）访问者：这是基本的Visitor类，它声明了与每个ConcreteElementA相对应的方法。方法的名称相同，但每种方法都按其接受的类型区分。我们可以采用这种解决方案，因为在Java中可以使用名称相同而实际不一样的方法，但如果有需要，我们可以声明具有不同名称的方法。
 * 4 ConcreteVisitor（具体访问者）：这是访问者的实现。当需要一组单独的操作时，只需创建另一个访问者。
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
