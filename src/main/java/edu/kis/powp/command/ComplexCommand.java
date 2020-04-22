package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> listCommand = null;

    public ComplexCommand(List<DriverCommand> listCommand) {
        this.listCommand = listCommand;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for (DriverCommand driverCommand : listCommand) {
            driverCommand.execute(job2dDriver);
        }
    }
}
