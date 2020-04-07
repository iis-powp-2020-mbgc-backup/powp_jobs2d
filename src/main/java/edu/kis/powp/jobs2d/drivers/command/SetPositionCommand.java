package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private final int y;
    private final int x;
    private Job2dDriver currentDriver = null;

    public void setDriver(Job2dDriver driver) {
        currentDriver = driver;
    }

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        if (currentDriver != null)
            currentDriver.setPosition(x, y);
    }

}
