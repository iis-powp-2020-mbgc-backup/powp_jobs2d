package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    int x;
    int y;
    Job2dDriver driver;
    SetPositionCommand(int x, int y, Job2dDriver driver){
        this.x=x;
        this.y=y;
        this.driver = driver;
    }

    public void execute(){
        driver.setPosition(x,y);
    }

}
