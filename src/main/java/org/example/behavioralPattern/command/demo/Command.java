package org.example.behavioralPattern.command.demo;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:36 下午
 */
public abstract class Command {

    protected Receiver receive;

    public Command(Receiver receive) {
        this.receive = receive;
    }

    public abstract void execute();
}
