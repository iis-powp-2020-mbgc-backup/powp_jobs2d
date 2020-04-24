package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    int x;
    int y;

    OperateToCommand(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void execute(Job2dDriver driver){
        driver.operateTo(x,y);
    }
}
