package edu.kis.powp.jobs2d.drivers.command;

import java.util.LinkedList;
import java.util.List;

public class CommandListBuilder
{
    List<DriverCommand> commandsList;

    public CommandListBuilder()
    {
        commandsList= new LinkedList<>();
    }

    public void addCommand(DriverCommand command)
    {
        commandsList.add(command);
    }

    public DriverCommand getComplexCommand()
    {
        return new ComplexCommand(commandsList);
    }
}