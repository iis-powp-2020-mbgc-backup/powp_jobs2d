package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x, y;

    public SetPositionCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void executeCommand(Job2dDriver driver) {
        driver.setPosition(this.x, this.y);
    }

}