package org.example.behaviouralPattern.command.demo;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:39 下午
 */
public class CommandImpl extends Command {

    public CommandImpl(Receiver receive) {
        super(receive);
    }

    @Override
    public void execute() {
        receive.reveive();
    }
}
