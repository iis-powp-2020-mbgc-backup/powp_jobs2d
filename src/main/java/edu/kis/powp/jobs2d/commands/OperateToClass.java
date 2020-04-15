package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToClass implements DriverCommand {
    private int x, y;

    public OperateToClass(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(x, y);
    }
}
