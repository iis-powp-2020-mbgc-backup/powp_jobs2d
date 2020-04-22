package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int X;
    private int Y;
    private Job2dDriver job2dDriver;

    public OperateToCommand(int X, int Y, Job2dDriver job2dDriver) {
        this.X = X;
        this.Y = Y;
        this.job2dDriver = job2dDriver;
    }

    @Override public void execute() {
        job2dDriver.operateTo(X, Y);
    }
}
