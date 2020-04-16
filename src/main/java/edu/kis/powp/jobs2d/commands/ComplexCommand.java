package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> commands;

    public ComplexCommand() {
    }

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
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