package org.example.behavioralPattern.template;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 14:22
 */
public abstract class Template {

    public abstract void print();

    public void update() {
        System.out.println("开始打印");
        for (int i = 0; i < 10; i++) {
            print();
        }
    }
}
