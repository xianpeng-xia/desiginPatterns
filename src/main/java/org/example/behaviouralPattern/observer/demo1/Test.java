package org.example.behaviouralPattern.observer.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:24 下午
 *
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 *
 * 观察者模式依赖于以下类：
 * 1 Subject（主题）：主题通常是由类实现的可观察的接口。应通知的观察者使用attach方法注册。当它们不再需要被告知变更时，使用detach方法取消注册。
 * 2 ConcreteSubject（具体主题）：具体主题是一个实现主题接口的类。它处理观察者列表并更新它们的变化。
 * 3 Observer（观察者）：观察者是一个由对象实现的接口，应该根据主题中的更改来进行更新。每个观察者都应该实现update方法，该方法通知它们新的状态变化。
 */
public class Test {

    public static void main(String[] args) {
        Policeman tianHePoliceman = new TianHePoliceman();
        Policeman huangPuPoliceman = new HuangPuPoliceman();

        Citizen citizen = new HuangPuCitizen(huangPuPoliceman);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("===============");

        citizen = new TianHeCitizen(tianHePoliceman);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
    }
}
