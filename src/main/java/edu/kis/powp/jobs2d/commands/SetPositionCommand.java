package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int x;
    private int y;
    private final Job2dDriver driver;

    SetPositionCommand(Job2dDriver dr) {
        this.driver = dr;
    }

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }

    public int getX() {
        return x;
    }

    public SetPositionCommand setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public SetPositionCommand setY(int y) {
        this.y = y;
        return this;
    }
}
