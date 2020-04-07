package edu.kis.powp.command;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    Job2dDriver job2dDriver;
    private int x;
    private int y;

    public SetPositionCommand(Job2dDriver job2dDriver, int x, int y) {
        this.job2dDriver = job2dDriver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        job2dDriver.setPosition(x, y);
    }
}
