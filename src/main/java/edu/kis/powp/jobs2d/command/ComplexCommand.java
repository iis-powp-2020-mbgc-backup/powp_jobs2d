package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> driverCommands;

    public ComplexCommand(ArrayList<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    @Override public void execute() {
        for (DriverCommand driverCommand : driverCommands) {
            driverCommand.execute();
        }
    }
}
