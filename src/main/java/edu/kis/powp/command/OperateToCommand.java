package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int y;
    private int x;
    private Job2dDriver driver;
    public void execute() {
        this.driver.operateTo(x, y);
    }
    public OperateToCommand(int y, int x, Job2dDriver driver) {
        this.y = y;
        this.x = x;
        this.driver = driver;
    }
}