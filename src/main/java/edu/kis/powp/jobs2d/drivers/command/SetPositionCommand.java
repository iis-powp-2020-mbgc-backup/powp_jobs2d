package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int y;
    private int x;
    private Job2dDriver driver;

    public SetPositionCommand(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    @Override
    public void execute() {
        if (this.driver != null) {
            driver.setPosition(this.x, this.y);
        }
    }
}
