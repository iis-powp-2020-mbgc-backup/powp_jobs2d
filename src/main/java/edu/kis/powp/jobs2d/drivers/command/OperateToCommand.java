package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int y;
    private int x;
    private Job2dDriver driver;

    OperateToCommand(int y, int x, Job2dDriver driver) {
        this.y = y;
        this.x = x;
        this.driver = driver;
    }

    @Override
    public void execute() {
        if (this.driver != null) {
            driver.operateTo(this.x, this.y);
        }
    }
}
