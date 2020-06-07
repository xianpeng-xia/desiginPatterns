package org.example.behaviouralPattern.command.demo;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:41 下午
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
