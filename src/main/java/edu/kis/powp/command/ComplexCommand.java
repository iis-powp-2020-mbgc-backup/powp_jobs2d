package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public void setCommands(List<DriverCommand> commands) {
        this.commands = commands;
    }

    public List<DriverCommand> getCommands() {
        return commands;
    }

    public void addCommand(DriverCommand command) {
        commands.add(command);
    }

    public void removeCommand(DriverCommand command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}
