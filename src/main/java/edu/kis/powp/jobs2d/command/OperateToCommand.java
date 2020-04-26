package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    int x;
    int y;
    Job2dDriver driver;
    OperateToCommand(int x, int y,Job2dDriver driver){
        this.x=x;
        this.y=y;
        this.driver=driver;
    }

    public void execute(){
        driver.operateTo(x,y);
    }
}
