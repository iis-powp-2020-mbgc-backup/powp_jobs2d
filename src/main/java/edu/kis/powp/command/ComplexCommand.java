package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commands;

    public ComplexCommand(List list) {
        this.commands = list;
    }
    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand driverCommand) {
        this.commands.add(driverCommand);
    }

    @Override
    public void execute() {
        for (DriverCommand command : this.commands) {
            command.execute();
        }
    }
}