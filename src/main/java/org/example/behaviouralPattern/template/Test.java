package org.example.behaviouralPattern.template;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 14:24
 *
 * 使用模板方法模式的目的是避免编写重复的代码，以便开发人员可以专注于核心逻辑。
 *
 * 模板方法模式实现的最好方式是使用抽象类。
 * 抽象类可以提供给我们所知道的实现区域，默认实现和为实现而保持开放的区域即为抽象
 */
public class Test {

    public static void main(String[] args) {
        Template template = new TemplateConcreate();
        template.update();
    }
}
