package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commandsList;

    public ComplexCommand()
    {
        commandsList = new ArrayList<>();
    }

    public void addCommand(DriverCommand newCommand)
    {
        commandsList.add(newCommand);
    }

    @Override
    public void executeCommand(Job2dDriver driver)
    {
        for(DriverCommand command:commandsList){
            command.executeCommand(driver);
        }
    }
}