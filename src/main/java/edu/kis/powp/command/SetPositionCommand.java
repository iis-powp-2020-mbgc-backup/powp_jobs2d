package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x;
    private int y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y, Job2dDriver driver) {
        this.x = x;
        this.y = y;
        this.job2dDriver = driver;
    }

    @Override
    public void execute() {
        if (this.job2dDriver != null) {
            job2dDriver.setPosition(this.x, this.y);
        }
    }
}