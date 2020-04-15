package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> cascadeOfCommands = new ArrayList<>();

    public void execute(Job2dDriver driver) {
        for (DriverCommand command : cascadeOfCommands) {
            command.execute(driver);
        }
    }

    public void addCommand(DriverCommand driver) {
        cascadeOfCommands.add(driver);
    }
}
