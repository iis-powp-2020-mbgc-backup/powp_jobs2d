package edu.kis.powp.jobs2d.drivers.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int x;
    private int y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver target) {
        target.setPosition(x, y);
    }
}
