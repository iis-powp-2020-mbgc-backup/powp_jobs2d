package edu.kis.powp.jobs2d.drivers.command;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> listOfCommands;

    public ComplexCommand(List<DriverCommand> listOfCommands)
    {
        this.listOfCommands = listOfCommands;
    }

    @Override
    public void execute() {
        for (DriverCommand driverCommand : listOfCommands)
        {
            driverCommand.execute();
        }
    }
}