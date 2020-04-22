package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class CommandGenerator implements Job2dDriver {
    private ComplexCommand commands = new ComplexCommand();
    private Job2dDriver job2dDriver = null;

    public CommandGenerator(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }

    public ComplexCommand get() {
        return commands;
    }

    @Override
    public void operateTo(int x, int y) {
        commands.add(new OperateToCommand(x, y, job2dDriver));
    }

    @Override
    public void setPosition(int x, int y) {
        commands.add(new SetPositionCommand(x, y, job2dDriver));
    }

}
