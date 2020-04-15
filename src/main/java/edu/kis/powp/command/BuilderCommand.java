package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class BuilderCommand
{
    List<DriverCommand> commands;

    public BuilderCommand()
    {
        this.commands = new ArrayList<>();
    }

    public BuilderCommand withCommand(DriverCommand command)
    {
        commands.add(command);
        return this;
    }

    public DriverCommand buildCommand()
    {
        return new ComplexCommand(commands);
    }
}
