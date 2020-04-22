package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int X;
    private int Y;

    public OperateToCommand(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override public void execute(Job2dDriver job2dDriver) {
        job2dDriver.operateTo(X, Y);
    }
}
