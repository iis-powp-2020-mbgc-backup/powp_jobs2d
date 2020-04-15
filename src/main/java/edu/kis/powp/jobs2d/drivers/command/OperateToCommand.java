package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private final int y;
    private final int x;
    private Job2dDriver jobDriver = null;

    public OperateToCommand(Job2dDriver driver, int x, int y) {
        this.jobDriver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
            this.jobDriver.operateTo(this.x, this.y);
    }
}