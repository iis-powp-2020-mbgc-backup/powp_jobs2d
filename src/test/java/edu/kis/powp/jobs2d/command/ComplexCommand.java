package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand
{
    List<DriverCommand> commandsList;

    public ComplexCommand()
    {
        commandsList = new ArrayList<>();
    }

    public void addCommand(DriverCommand newCommand)
    {
        commandsList.add(newCommand);
    }

    public void executeCommand()
    {
        for(DriverCommand command:commandsList){
            command.executeCommand();
        }
    }
}