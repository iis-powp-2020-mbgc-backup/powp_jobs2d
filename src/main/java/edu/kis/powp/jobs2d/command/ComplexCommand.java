package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> driverCommands;

    ComplexCommand(ArrayList<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    @Override
    public void execute() {
        for (DriverCommand driverCommand : driverCommands) {
            driverCommand.execute();
        }
    }
}
