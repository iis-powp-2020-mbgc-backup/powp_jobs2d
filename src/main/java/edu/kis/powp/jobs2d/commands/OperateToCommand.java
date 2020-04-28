package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x;
    private int y;
    private final Job2dDriver driver;

    OperateToCommand(Job2dDriver dr) {
        this.driver = dr;
    }

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }

    public int getX() {
        return x;
    }

    public OperateToCommand setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public OperateToCommand setY(int y) {
        this.y = y;
        return this;
    }
}
