package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    public void add(DriverCommand driverCommand) {
        commands.add(driverCommand);
    }

    public void remove(int id) {
        commands.remove(id);
    }

    @Override
    public void execute() {
        commands.forEach(command -> command.execute());
    }
}
