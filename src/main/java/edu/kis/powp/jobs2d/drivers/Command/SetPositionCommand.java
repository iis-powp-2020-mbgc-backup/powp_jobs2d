package edu.kis.powp.jobs2d.drivers.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    int startX, startY;


    public SetPositionCommand(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {

        job2dDriver.setPosition(startX, startY);

    }

}
