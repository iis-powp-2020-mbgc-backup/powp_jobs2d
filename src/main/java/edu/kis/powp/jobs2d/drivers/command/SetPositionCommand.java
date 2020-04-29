package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int y;
    private int x;
    private Job2dDriver Driver;

    SetPositionCommand(int y, int x, Job2dDriver Driver) {
        this.y = y;
        this.x = x;
        this.Driver = Driver;
    }

    @Override
    public void execute() {
        if (this.Driver != null) {
            Driver.setPosition(this.x, this.y);
        }
    }
}
