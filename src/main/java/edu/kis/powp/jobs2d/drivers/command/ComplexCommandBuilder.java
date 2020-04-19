package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandBuilder {
    List<DriverCommand> commandList;

    public ComplexCommandBuilder() {
        this.commandList = new ArrayList<>();
    }

    public ComplexCommandBuilder addCommand(DriverCommand command)
    {
        commandList.add(command);
        return this;
    }

    public ComplexCommand getComplexCommand()
    {
        return new ComplexCommand(commandList);
    }
}
