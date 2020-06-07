package org.example.behaviouralPattern.command.demo;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:42 下午
 */
public class Test {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command cmd = new CommandImpl(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(cmd);
        invoker.execute();

    }
}
