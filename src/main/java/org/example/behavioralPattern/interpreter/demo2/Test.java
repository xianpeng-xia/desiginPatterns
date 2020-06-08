package org.example.behavioralPattern.interpreter.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 10:45 下午
 *
 * 解释器模式定义语法的表示以及该语法的对应解释。
 * 解释器模式由以下类组成：
 * 1 Context（环境）：Context用于封装解释器的全局信息，所有具体的解释器均需访问Context。
 * 2 AbstractExpression（抽象表达式）：一个抽象类或接口，声明执行的解释方法，由所有具体的解释器实现。
 * 3 TerminalExpression（终结符表达式）：一种解释器类，实现与语法的终结符相关的操作。终结符表达式必须始终被实现和实例化，因为它表示表达式的结尾。
 * 4 NonTerminalExpression（非终结符表达式）：这是实现语法的不同规则或符号的类。对于每一个语法都应该创建一个类。
 *
 * 在实践当中，解释器模式用来解释正则表达式。
 */
public class Test {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
