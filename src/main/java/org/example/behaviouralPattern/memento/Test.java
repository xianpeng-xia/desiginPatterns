package org.example.behaviouralPattern.memento;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:52 下午
 * 备忘录模式依赖于以下类：
 * 1 Originator（发起者）：发起者是我们需要记住状态的对象，以便在某个时刻恢复它。
 * 2 Caretaker（管理者）：这是负责触发发起者的变化或触发发起者返回先前状态的动作的类。
 * 3 Memento（备忘录）：这是负责存储发起者内部状态的类。备忘录提供了两种设置和获取状态的方法，但这些方法应该对管理者隐藏。
 *
 * 适用情况
 * 只要需要执行回滚操作，就会使用备忘录模式。
 * 它可用于各种原子事务，如果其中一个操作失败，则必须将对象恢复到初始状态。
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("开会中");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.saveState());
        originator.showState();

        originator.setState("睡觉中");
        originator.showState();

        originator.restoreState(caretaker.getMemento());
        originator.showState();
    }
}
