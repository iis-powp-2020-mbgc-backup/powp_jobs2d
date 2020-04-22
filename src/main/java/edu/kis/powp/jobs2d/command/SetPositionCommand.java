package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x, y;
    private Job2dDriver job2dDriver = null;

    public SetPositionCommand(int x, int y, Job2dDriver job2dDriver){
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute() {
        job2dDriver.setPosition(x, y);
    }
}
