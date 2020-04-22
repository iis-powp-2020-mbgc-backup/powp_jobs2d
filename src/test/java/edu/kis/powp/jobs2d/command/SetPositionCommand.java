package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    Job2dDriver driver;
    int x, y;

    public SetPositionCommand(Job2dDriver driver, int x, int y){
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void executeCommand() {
        driver.setPosition(x, y);
    }

}