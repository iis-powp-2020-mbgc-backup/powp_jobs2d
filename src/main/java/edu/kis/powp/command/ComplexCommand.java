package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> commands;

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(command -> command.execute());
    }
}
