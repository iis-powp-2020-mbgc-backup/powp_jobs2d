package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commands;

    public ComplexCommand()
    {
        commands = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> commands)
    {
        this.commands = commands;
    }

    public void add(DriverCommand command)
    {
        commands.add(command);
    }

    @Override
    public void execute()
    {
        commands.forEach(DriverCommand::execute);
    }
}
