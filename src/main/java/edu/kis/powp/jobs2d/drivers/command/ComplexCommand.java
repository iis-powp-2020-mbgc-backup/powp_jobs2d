package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private Job2dDriver job2dDriver;
    private ArrayList<DriverCommand> commandList;

    public ComplexCommand(Job2dDriver job2dDriver) {
        commandList = new ArrayList<>();
        this.job2dDriver = job2dDriver;
    }

    public void add(DriverCommand driverCommand) {
        commandList.add(driverCommand);
    }

    @Override
    public void execute() {
        commandList.forEach(c -> c.execute());
    }
}
