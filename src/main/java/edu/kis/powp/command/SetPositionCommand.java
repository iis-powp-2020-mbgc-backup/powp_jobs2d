package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SetPositionCommand implements DriverCommand {

    private final int x;
    private final int y;
    private final Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y, DriverManager driverManager) {
        this.x = x;
        this.y = y;
        this.job2dDriver = driverManager.getCurrentDriver();
    }

    @Override
    public void execute() {
        if (this.job2dDriver != null) {
            job2dDriver.setPosition(this.x, this.y);
        }
    }
}