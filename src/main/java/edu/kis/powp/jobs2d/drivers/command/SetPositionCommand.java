package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int y;
    private int x;
    private Job2dDriver jobDriver = null;

    public SetPositionCommand(Job2dDriver driver, int x, int y) {
        this.jobDriver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        jobDriver.setPosition(this.x, this.y);
    }
}
