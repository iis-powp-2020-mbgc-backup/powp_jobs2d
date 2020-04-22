package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int X, Y;

    public SetPositionCommand(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override public void execute(Job2dDriver job2dDriver) {
        job2dDriver.setPosition(X, Y);
    }

}
