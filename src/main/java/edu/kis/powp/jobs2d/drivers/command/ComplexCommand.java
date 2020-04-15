package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> commands;

    private ComplexCommand() {
    }

    public void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}