package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private final LinkedList<DriverCommand> commands;

    public ComplexCommand(LinkedList<DriverCommand> commands) {
        this.commands = commands;
    }

    public void execute(Job2dDriver driver) {
        for (DriverCommand command : commands) {
            command.execute(driver);
        }
    }
}